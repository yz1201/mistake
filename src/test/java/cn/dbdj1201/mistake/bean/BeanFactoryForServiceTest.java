package cn.dbdj1201.mistake.bean;

import cn.dbdj1201.mistake.service.INovelistService;
import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author tyz1201
 * @datetime 2020-03-05 9:12
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class BeanFactoryForServiceTest {

    @Resource(name = "proxyNovelistService")
    private INovelistService service;

    @Test
    public void getiNovelistService() {
        service.borrow("曹雪芹","罗贯中",100000);
    }
}