package cn.dbdj1201.mistake_new.service.impl;

import cn.dbdj1201.mistake_new.service.IAccountService;
import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author tyz1201
 * @datetime 2020-03-05 21:39
 **/
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:beans_tx_anno.xml")
@ContextConfiguration(classes = SpringConfiguration.class)
public class IAccountServiceImplTest {

    @Autowired
    private IAccountService accountService;

    @Test
    public void borrow() {
        accountService.borrow("test1", "test2", 20f);
    }
}