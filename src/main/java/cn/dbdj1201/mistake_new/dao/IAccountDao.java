package cn.dbdj1201.mistake_new.dao;

import cn.dbdj1201.mistake_new.domain.Account;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-05 14:55
 **/
public interface IAccountDao {

    /**
     * 查询数据库中account表
     *
     * @return
     */
    List<Account> findAll();

    /**
     * @param id
     * @return
     */
    Account findById(int id);

    /**
     *
     * @param id
     * @return
     */
    Account findById0(int id);

    /**
     * 根据姓名查询账户
     *
     * @param name
     * @return
     */
    Account findByName(String name);

    /**
     * 保存账户
     *
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 删除账户
     *
     * @param id
     */
    void deleteAccount(int id);

    /**
     * 修改账户
     *
     * @param account
     */
    void updateAccount(Account account);
}
