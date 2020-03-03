package cn.dbdj1201.mistake.service.impl;

import cn.dbdj1201.mistake.domain.Novelist;
import cn.dbdj1201.mistake.mapper.INovelistMapper;
import cn.dbdj1201.mistake.service.INovelistService;
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
    private INovelistMapper novelistMapper;


    public void setNovelistMapper(INovelistMapper novelistMapper) {
        this.novelistMapper = novelistMapper;
    }

    @Override
    public List<Novelist> findAll() {
        return novelistMapper.findAll();
    }

    @Override
    public void saveOne(Novelist novelist) {
        novelistMapper.save(novelist);
    }

}
