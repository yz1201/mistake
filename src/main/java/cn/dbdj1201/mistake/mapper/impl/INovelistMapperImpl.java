package cn.dbdj1201.mistake.mapper.impl;

import cn.dbdj1201.mistake.domain.Novelist;
import cn.dbdj1201.mistake.domain.QueryVo;
import cn.dbdj1201.mistake.mapper.INovelistMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * mapper实现类，不用代理。
 *
 * @author tyz1201
 * @datetime 2020-03-01 17:33
 **/
public  class INovelistMapperImpl implements INovelistMapper {
    private SqlSessionFactory factory;
    private String statement = "cn.dbdj1201.mistake.mapper.INovelistMapper.";

    public INovelistMapperImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public List<Novelist> findAll() {
        SqlSession session = factory.openSession();
        List<Novelist> novelists = session.selectList(statement + "findAll");
        session.close();
        return novelists;
    }

    @Override
    public Novelist findById(int id) {
        SqlSession sqlSession = factory.openSession();
        Novelist novelist = sqlSession.selectOne(statement + "findById", id);
        sqlSession.close();
        return novelist;
    }

    @Override
    public List<Novelist> findByName(String name) {
        SqlSession session = factory.openSession();
        List<Novelist> novelists = session.selectList(statement + "findByName", "%" + name + "%");
        session.close();
        return novelists;
    }

    @Override
    public void saveNovelist(Novelist novelist) {
        SqlSession session = factory.openSession();
        session.insert(statement + "saveNovelist", novelist);
        session.commit();
        session.close();
    }

    @Override
    public void updateNovelist(Novelist novelist) {
        SqlSession session = factory.openSession();
        session.update(statement + "updateNovelist", novelist);
        session.close();
    }

    @Override
    public void deleteNovelist(Novelist novelist) {
        SqlSession session = factory.openSession();
        session.delete(statement + "deleteNovelist", novelist);
        session.close();
    }

    @Override
    public int findTotal() {
        SqlSession session = factory.openSession();
        int total = session.selectOne(statement + "findTotal");
        session.close();
        return total;
    }

    @Override
    public List<Novelist> findNovelistByCondition(Novelist novelist) {
        return null;
    }

    @Override
    public List<Novelist> findNovelistInIds(QueryVo vo) {
        return null;
    }
}
