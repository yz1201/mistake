package cn.dbdj1201.mistake.service;

/**
 * @author tyz1201
 * @datetime 2020-03-05 10:35
 * 模拟账户服务
 **/
public interface IAccountService {

    /**
     * 模拟保存账户
     */
    void saveAccount();

    /**
     * 模拟修改账户
     * @param i
     */
    void udateAccount(int i);

    /**
     * 模拟删除账户
     * @return
     */
    int deleteAccount();
}
