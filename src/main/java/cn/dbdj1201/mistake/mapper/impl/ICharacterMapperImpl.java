package cn.dbdj1201.mistake.mapper.impl;

import cn.dbdj1201.mistake.domain.Character;
import cn.dbdj1201.mistake.mapper.ICharacterMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-03 17:32
 **/
@Repository("mapper1")
public class ICharacterMapperImpl implements ICharacterMapper {
    @Override
    public List<Character> findAll() {
        return null;
    }

    @Override
    public List<Character> findCharacterBy(int nid) {
        return null;
    }

    @Override
    public void test() {
        System.out.println("test char");
    }
}
