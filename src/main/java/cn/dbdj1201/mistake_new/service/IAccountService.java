package cn.dbdj1201.mistake_new.service;

/**
 * @author tyz1201
 * @datetime 2020-03-05 14:54
 * account事务类，业务层代码。
 **/
public interface IAccountService {

    /**
     * 借款业务
     *
     * @param from
     * @param to
     * @param money
     */
    void borrow(String from, String to, float money);

}
