package cn.dbdj1201.mistake.service.impl;

import cn.dbdj1201.mistake.domain.Novelist;
import cn.dbdj1201.mistake.mapper.INovelistMapper;
import cn.dbdj1201.mistake.service.INovelistService;
import cn.dbdj1201.mistake.utils.TransactionManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-04 2:46
 **/
@Service("novelistService")
public class INovelistServiceImpl implements INovelistService {

    @Resource(name = "novelistDao")
    private INovelistMapper mapper;

    @Resource(name = "txManager")
    private TransactionManager txManager;

    public void setNovelistMapper(INovelistMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Novelist> findAll() {
        return mapper.findAll();
    }

    @Override
    public void saveOne(Novelist novelist) {
        mapper.save(novelist);
    }

    @Override
    public void borrow(String src, String dest, int money) {
        try {
            txManager.beginTransaction();
            Novelist srcNovelist = mapper.findByName(src);
            Novelist destNovelist = mapper.findByName(dest);
            if (money > srcNovelist.getMoney()) {
                System.out.println("确实没了，不太行，少给整点？");
            } else {
                System.out.println(src + ": " + "ok ok, i will help you");
                srcNovelist.setMoney(srcNovelist.getMoney() - money);
                destNovelist.setMoney(destNovelist.getMoney() + money);
                mapper.updateNovelistMoney(srcNovelist);
                int test = 1 / 0;
                mapper.updateNovelistMoney(destNovelist);
                txManager.commit();
                System.out.println("over, yeah~");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("rollback");
            txManager.rollback();
        } finally {
            txManager.release();
        }
    }

}
