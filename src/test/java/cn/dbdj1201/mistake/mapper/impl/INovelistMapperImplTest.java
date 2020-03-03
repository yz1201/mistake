package cn.dbdj1201.mistake.mapper.impl;

import cn.dbdj1201.mistake.domain.Novelist;
import cn.dbdj1201.mistake.mapper.INovelistMapper;
import config.SpringConfiguration;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * @author tyz1201
 * @datetime 2020-03-01 17:39
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class INovelistMapperImplTest {
    @Autowired
    private INovelistMapper mapper;

    @Test
    public void findAll() {
        Novelist novelist = new Novelist();
        novelist.setNname("t3");
        novelist.setLifetime("t3");
        novelist.setAddress("t3");
        novelist.setNovel("t3");
        mapper.save(novelist);
        mapper.findAll().forEach(System.out::println);
    }

    @Test
    public void save() {
    }
//    private InputStream in;
//    private INovelistMapper mapper;
//
//    @Test
//    public void findAll() {
//    }
//
//    @Before
//    public void setUp() throws Exception {
//        in = this.getClass().getClassLoader().getResourceAsStream("SqlMapConfig.xml");
//        mapper = new INovelistMapperImpl(new SqlSessionFactoryBuilder().build(in));
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
//
//    @Test
//    public void findById() {
//        Novelist novelist = mapper.findById(5);
//        System.out.println(novelist);
//    }
//
//    @Test
//    public void findByName() {
//        System.out.println(mapper.findTotal());
//    }
//
//    @Test
//    public void saveNovelist() {
//        Novelist novelist = new Novelist();
//        novelist.setNname("test4");
//        novelist.setLifetime("4141-04-01");
//        novelist.setNovel("Jokes");
//        novelist.setAddress("home");
//        mapper.saveNovelist(novelist);
//    }
//
//    @Test
//    public void updateNovelist() {
//    }
//
//    @Test
//    public void deleteNovelist() {
//    }
//
//    @Test
//    public void findTotal() {
//    }
}