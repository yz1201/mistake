package cn.dbdj1201.mistake_new.dao.impl;

import cn.dbdj1201.mistake_new.dao.IAccountDao;
import cn.dbdj1201.mistake_new.domain.Account;
import config.SpringConfiguration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author tyz1201
 * @datetime 2020-03-05 15:14
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class IAccountDaoImplTest {

    @Autowired
    private IAccountDao accountDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findAll() {
        accountDao.findAll().forEach(System.out::println);
    }

    @Test
    public void findById() {
    }

    @Test
    public void findByName() {
    }

    @Test
    public void saveAccount() {
    }

    @Test
    public void deleteAccount() {
    }

    @Test
    public void updateAccount() {
        Account account = accountDao.findById(5);
        System.out.println(account);
        account.setMoney(12368.23f);
        account.setName("ha ha");
        accountDao.updateAccount(account);
    }
}