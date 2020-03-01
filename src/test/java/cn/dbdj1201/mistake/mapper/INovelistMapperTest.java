package cn.dbdj1201.mistake.mapper;

import cn.dbdj1201.mistake.domain.Novelist;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author tyz1201
 * @datetime 2020-03-01 15:44
 **/
public class INovelistMapperTest {
    private InputStream cfgXmlIn;
    private SqlSession sqlSession;
    private INovelistMapper novelistMapper;

    @Before
    public void init() {
        cfgXmlIn = this.getClass().getClassLoader().getResourceAsStream("SqlMapConfig.xml");
        sqlSession = new SqlSessionFactoryBuilder().build(cfgXmlIn).openSession();
        novelistMapper = sqlSession.getMapper(INovelistMapper.class);
    }

    @After
    public void destroy() {
        sqlSession.commit();
        sqlSession.close();
        try {
            cfgXmlIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findAll() {
        novelistMapper.findAll().forEach(System.out::println);
    }


    @Test
    public void saveNovelist() {
        Novelist novelist = new Novelist();
        novelist.setNname("test3");
        novelist.setLifetime("4141-04-01");
        novelist.setNovel("Jokes");
        novelist.setAddress("home");
        novelistMapper.saveNovelist(novelist);
    }

    @Test
    public void updateNovelist() {
        Novelist novelist = new Novelist();
        novelist.setNname("root");
        novelist.setNovel("Jokes");
        novelistMapper.updateNovelist(novelist);
    }

    @Test
    public void deleteNovelist() {
        Novelist novelist = new Novelist();
        novelist.setNname("root");
        novelist.setNovel("jokes");
        novelistMapper.deleteNovelist(novelist);
    }

    @Test
    public void findById() {
    }

    @Test
    public void findByName() {
        String name = "%test%";
        novelistMapper.findByName(name).forEach(System.out::println);
    }

    @Test
    public void findTotal() {
        System.out.println(novelistMapper.findTotal());
    }
}