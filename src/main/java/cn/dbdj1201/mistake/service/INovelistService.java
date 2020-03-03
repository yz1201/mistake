package cn.dbdj1201.mistake.service;

import cn.dbdj1201.mistake.domain.Novel;
import cn.dbdj1201.mistake.domain.Novelist;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-04 2:44
 * 业务层，负责小说家部分业务
 **/
public interface INovelistService {

    /**
     * @return
     */
    List<Novelist> findAll();

    void saveOne(Novelist novelist);
}
