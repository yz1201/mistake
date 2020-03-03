package cn.dbdj1201.mistake.service.impl;

import cn.dbdj1201.mistake.mapper.ICharacterMapper;
import cn.dbdj1201.mistake.service.ICharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Properties;

/**
 * @author tyz1201
 * @datetime 2020-03-03 17:19
 **/
@Service("charService")
public class ICharacterServiceImpl implements ICharacterService {
    //    @Autowired
//    @Qualifier("charMapper")
    @Resource
    private ICharacterMapper mapper;

    @Value("ha ha")
    private String testDI;
    @Value("")
    private List<String> testL;
    private Properties properties;


    public void setTestL(List<String> testL) {
        this.testL = testL;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public ICharacterServiceImpl() {
    }

//    public ICharacterServiceImpl(String testDI) {
//        this.testDI = testDI;
//    }
//
//    public ICharacterServiceImpl(ICharacterMapper mapper, String testDI) {
//        this.mapper = mapper;
//        this.testDI = testDI;
//    }
//
//    public void setMapper(ICharacterMapper mapper) {
//        this.mapper = mapper;
//    }

    public void setTestDI(String testDI) {
        this.testDI = testDI;
    }

    @Override
    public void test() {
//        ICharacterMapper mapper = (ICharacterMapper) BeanFactory.newInstance("charDao");
        mapper.test();
        System.out.println("testDI==>" + testDI);
        System.out.println("testDI==>" + testL);
        System.out.println("testDI==>" + properties);
    }
}
