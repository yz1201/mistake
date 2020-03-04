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
     * 查询所有
     *
     * @return
     */
    List<Novelist> findAll();

    /**
     * 保存信息
     *
     * @param novelist
     */
    void saveOne(Novelist novelist);

    /**
     * 借钱业务
     *
     * @param src   被借方
     * @param dest  借方
     * @param money 涉及金额
     */
    void borrow(String src, String dest, int money);
}
