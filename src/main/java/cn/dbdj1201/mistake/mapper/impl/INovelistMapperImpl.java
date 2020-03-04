package cn.dbdj1201.mistake.mapper.impl;

import cn.dbdj1201.mistake.domain.Novel;
import cn.dbdj1201.mistake.domain.Novelist;
import cn.dbdj1201.mistake.domain.QueryVo;
import cn.dbdj1201.mistake.mapper.INovelistMapper;
import cn.dbdj1201.mistake.utils.ConnectionUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * mapper实现类，不用代理。
 *
 * @author tyz1201
 * @datetime 2020-03-01 17:33
 **/
@Repository("novelistDao")
public class INovelistMapperImpl implements INovelistMapper {
//    private SqlSessionFactory factory;
//    private String statement = "cn.dbdj1201.mistake.mapper.INovelistMapper.";

//    public INovelistMapperImpl(SqlSessionFactory factory) {
//        this.factory = factory;
//    }

    //    public INovelistMapperImpl(SqlSessionFactory factory) {
//        this.factory = factory;
//    }
//

    @Resource(name = "runner")
    private QueryRunner runner;

    @Resource(name = "connUtils")
    private ConnectionUtils connUtils;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    @Override
    public List<Novelist> findAll() {
//        SqlSession session = factory.openSession();
//        List<Novelist> novelists = session.selectList(statement + "findAll");
//        session.close();
        List<Novelist> novelists = null;
        try {
            novelists = runner.query("select * from novelist", new BeanListHandler<>(Novelist.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return novelists;
    }

    @Override
    public void save(Novelist novelist) {
        try {
            runner.update("insert into novelist(nname, lifetime, novel, address) values(?, ?, ?, ?)",
                    novelist.getNname(), novelist.getLifetime(), novelist.getNovel(), novelist.getAddress());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Novelist findByName(String name) {
        List<Novelist> novelists = null;
        try {
            novelists = runner.query(connUtils.getThreadConnection(), "select * from novelist where nname = ? ", new BeanListHandler<>(Novelist.class), name);
            if (novelists == null || novelists.size() < 1) {
                return null;
            }
            if (novelists.size() > 1) {
                throw new RuntimeException("咋有俩一样的人？出问题了");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        assert novelists != null;
        return novelists.get(0);
    }

    @Override
    public void updateNovelistMoney(Novelist novelist) {
        try {
            int rows = runner.update(connUtils.getThreadConnection(), "update novelist set money = ? where nname = ?", novelist.getMoney(), novelist.getNname());
            System.out.println("rows: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    @Override
//    public Novelist findNovelistByNid(int nid) {
//        return null;
//    }
//
////    @Override
////    public Novelist findById(int id) {
////        SqlSession sqlSession = factory.openSession();
////        Novelist novelist = sqlSession.selectOne(statement + "findById", id);
////        sqlSession.close();
////        return novelist;
////    }
//
//    @Override
//    public List<Novelist> findByName(String name) {
//        SqlSession session = factory.openSession();
//        List<Novelist> novelists = session.selectList(statement + "findByName", "%" + name + "%");
//        session.close();
//        return novelists;
//    }
//
//    @Override
//    public void saveNovelist(Novelist novelist) {
//        SqlSession session = factory.openSession();
//        session.insert(statement + "saveNovelist", novelist);
//        session.commit();
//        session.close();
//    }
//
//    @Override
//    public void updateNovelist(Novelist novelist) {
//        SqlSession session = factory.openSession();
//        session.update(statement + "updateNovelist", novelist);
//        session.close();
//    }
//
//    @Override
//    public void deleteNovelist(Novelist novelist) {
//        SqlSession session = factory.openSession();
//        session.delete(statement + "deleteNovelist", novelist);
//        session.close();
//    }
//
//    @Override
//    public int findTotal() {
//        SqlSession session = factory.openSession();
//        int total = session.selectOne(statement + "findTotal");
//        session.close();
//        return total;
//    }
//
//    @Override
//    public List<Novelist> findNovelistByCondition(Novelist novelist) {
//        return null;
//    }
//
//    @Override
//    public List<Novelist> findNovelistInIds(QueryVo vo) {
//        return null;
//    }
}
