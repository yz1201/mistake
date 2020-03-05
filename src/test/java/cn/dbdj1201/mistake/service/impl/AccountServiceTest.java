package cn.dbdj1201.mistake.service.impl;

import cn.dbdj1201.mistake.service.IAccountService;
import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author tyz1201
 * @datetime 2020-03-05 11:25
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {

    @Autowired
    private IAccountService service;

    @Test
    public void saveAccount() {
        service.saveAccount();
    }

    @Test
    public void udateAccount() {
    }

    @Test
    public void deleteAccount() {
    }
}