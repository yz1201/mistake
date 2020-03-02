package cn.dbdj1201.mistake.mapper;

import cn.dbdj1201.mistake.domain.Character;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-02 17:41
 **/
public interface ICharacterMapper {

    /**
     *
     * @return
     */
    List<Character> findAll();
}
