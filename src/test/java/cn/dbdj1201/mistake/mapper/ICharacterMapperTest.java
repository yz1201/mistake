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
 * @datetime 2020-03-02 17:53
 **/
public class ICharacterMapperTest {
    private InputStream cfgXmlIn;
    private SqlSession sqlSession;
    private ICharacterMapper mapper;

    @Before
    public void setUp() throws Exception {
        cfgXmlIn = this.getClass().getClassLoader().getResourceAsStream("SqlMapConfig.xml");
        sqlSession = new SqlSessionFactoryBuilder().build(cfgXmlIn).openSession(true); //自动提交事务
        mapper = sqlSession.getMapper(ICharacterMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findAll() {
        mapper.findAll().forEach(System.out::println);
    }
}