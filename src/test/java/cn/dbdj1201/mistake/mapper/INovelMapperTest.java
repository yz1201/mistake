package cn.dbdj1201.mistake.mapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * @author tyz1201
 * @datetime 2020-03-02 8:02
 **/
public class INovelMapperTest {
    private InputStream cfgXmlIn;
    private SqlSession sqlSession;
    private INovelMapper novelMapper;

    @Before
    public void setUp() throws Exception {
        cfgXmlIn = this.getClass().getClassLoader().getResourceAsStream("SqlMapConfig.xml");
        sqlSession = new SqlSessionFactoryBuilder().build(cfgXmlIn).openSession(true); //自动提交事务
        novelMapper = sqlSession.getMapper(INovelMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findAll() {
//        novelMapper.findAll().forEach(System.out::println);
    }
}