package cn.dbdj1201.mistake.mapper;

import cn.dbdj1201.mistake.domain.Novelist;
import cn.dbdj1201.mistake.domain.QueryVo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-01 15:44
 **/
public class INovelistMapperTest {
//    private InputStream cfgXmlIn;
//    private SqlSession sqlSession;
//    private INovelistMapper novelistMapper;
//
//    @Before
//    public void init() {
//        cfgXmlIn = this.getClass().getClassLoader().getResourceAsStream("SqlMapConfig.xml");
//        sqlSession = new SqlSessionFactoryBuilder().build(cfgXmlIn).openSession(true); //自动提交事务
//        novelistMapper = sqlSession.getMapper(INovelistMapper.class);
//    }
//
//    @After
//    public void destroy() {
//        sqlSession.commit();
//        sqlSession.close();
//        try {
//            cfgXmlIn.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
////
////    @Test
////    public void findAll() {
//////        novelistMapper.findAll().forEach(novelist ->
//////                novelist.getNovels().forEach(System.out::println)
//////        );
//////        novelistMapper.findAll().forEach(System.out::println);
////        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(cfgXmlIn);
////        SqlSession session1 = sqlSessionFactory.openSession();
////        List<Novelist> novelists1 = session1.getMapper(INovelistMapper.class).findAll();
////        System.out.print("test commit 1-01 - - >");
////        novelists1.forEach(System.out::println);
////        System.out.print("test commit 1-02 - - >");
////        List<Novelist> novelists2 = session1.getMapper(INovelistMapper.class).findAll();
////        novelists2.forEach(System.out::println);
//////        session1.commit();
////
////        SqlSession session2 = sqlSessionFactory.openSession();
////        List<Novelist> novelists3 = session1.getMapper(INovelistMapper.class).findAll();
////        System.out.print("test commit 2-01 - - >");
////        novelists3.forEach(System.out::println);
////
////        List<Novelist> novelists4 = session1.getMapper(INovelistMapper.class).findAll();
////        System.out.print("test commit 2-02 - - >");
////
////        novelists4.forEach(System.out::println);
////        session2.commit();
////    }
////
////    @Test
////    public void findById() {
////        System.out.println(novelistMapper.findById(5));
////    }
//
//    @Test
//    public void findAll() {
//        novelistMapper.findAll().forEach(novelist -> novelist.getNovels().forEach(System.out::println));
////        novelistMapper.findAll().forEach();
//    }
//
//
//    @Test
//    public void saveNovelist() {
//        Novelist novelist = new Novelist();
//        novelist.setNname("test4");
//        novelist.setLifetime("4141-04-01");
//        novelist.setNovel("Jokes");
//        novelist.setAddress("home");
//        novelistMapper.saveNovelist(novelist);
//    }
//
//    @Test
//    public void updateNovelist() {
//        Novelist novelist = new Novelist();
//        novelist.setNname("root");
//        novelist.setNovel("Jokes");
//        novelistMapper.updateNovelist(novelist);
//    }
//
//    @Test
//    public void deleteNovelist() {
//        Novelist novelist = new Novelist();
//        novelist.setNname("root");
//        novelist.setNovel("jokes");
//        novelistMapper.deleteNovelist(novelist);
//    }
//
//    @Test
//    public void findById() {
////        Novelist novelist = novelistMapper.findById(5);
////        System.out.println("5th novelist-->" + novelist);
//    }
//
//    @Test
//    public void findByName() {
//        String name = "%test%";
//        novelistMapper.findByName(name).forEach(System.out::println);
//    }
//
//    @Test
//    public void findTotal() {
//        System.out.println(novelistMapper.findTotal());
//    }
//
//    @Test
//    public void findNovelistByCondition() {
//        Novelist novelist = new Novelist();
//        novelist.setNname("test1");
//        novelistMapper.findNovelistByCondition(novelist).forEach(System.out::println);
//
//    }
//
//    @Test
//    public void findNovelistInIds() {
//        List<Integer> ids = new ArrayList<>();
//        ids.add(2);
//        ids.add(3);
//        ids.add(4);
//        QueryVo vo = new QueryVo();
//        vo.setIds(ids);
//        novelistMapper.findNovelistInIds(vo).forEach(System.out::println);
//        novelistMapper.findNovelistInIds(vo).forEach(System.out::println);
//        novelistMapper.findNovelistInIds(vo).forEach(System.out::println);
//        novelistMapper.findNovelistInIds(vo).forEach(System.out::println);
//    }


}