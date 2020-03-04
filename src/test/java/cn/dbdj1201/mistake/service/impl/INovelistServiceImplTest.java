package cn.dbdj1201.mistake.service.impl;

import cn.dbdj1201.mistake.service.INovelistService;
import config.SpringConfiguration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author tyz1201
 * @datetime 2020-03-04 15:59
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class INovelistServiceImplTest {

    @Autowired
    private INovelistService service;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setNovelistMapper() {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void saveOne() {
    }

    @Test
    public void borrow() {
        service.borrow("曹雪芹","罗贯中",1000);
    }
}