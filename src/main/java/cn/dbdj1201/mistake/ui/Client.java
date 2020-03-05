package cn.dbdj1201.mistake.ui;

import cn.dbdj1201.mistake.bean.BeanFactory;
import cn.dbdj1201.mistake.domain.Novel;
import cn.dbdj1201.mistake.domain.Novelist;
import cn.dbdj1201.mistake.mapper.ICharacterMapper;
import cn.dbdj1201.mistake.mapper.impl.ICharacterMapperImpl;
import cn.dbdj1201.mistake.service.IAccountService;
import cn.dbdj1201.mistake.service.ICharacterService;
import cn.dbdj1201.mistake.service.INovelistService;
import config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tyz1201
 * @datetime 2020-03-03 17:22
 * 模拟View层，调用业务层
 **/
public class Client {
    /**
     * spring管理对象
     *
     * @param args
     */
    public static void main(String[] args) {

//        ICharacterService service = (ICharacterService) BeanFactory.newInstance("charService");
//        service.test();
//        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        INovelistService service = (INovelistService) ac.getBean("");
//        ICharacterMapper mapper = ac.getBean("charMapper", ICharacterMapper.class);
//        System.out.println(service);
//        System.out.println(mapper);
//        Novelist novelist = new Novelist();
//        novelist.setNname("t2");
//        novelist.setLifetime("t2");
//        novelist.setAddress("t2");
//        novelist.setNovel("t2");
//        service.saveOne(novelist);
//        service.findAll().forEach(System.out::println);

        IAccountService service = (IAccountService) ac.getBean("accountService");

        service.saveAccount();
//        service.deleteAccount();
//        service.udateAccount(2312);
    }
}
