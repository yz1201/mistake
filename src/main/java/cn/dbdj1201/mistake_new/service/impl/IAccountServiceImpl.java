package cn.dbdj1201.mistake_new.service.impl;

import cn.dbdj1201.mistake_new.dao.IAccountDao;
import cn.dbdj1201.mistake_new.domain.Account;
import cn.dbdj1201.mistake_new.service.IAccountService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author tyz1201
 * @datetime 2020-03-05 14:55
 **/
@Service("accountService")
@Transactional
public class IAccountServiceImpl implements IAccountService {

    @Resource(name = "accountDao")
    private IAccountDao accountDao;
//    public void setAccountDao(IAccountDao accountDao) {
//        this.accountDao = accountDao;
//    }

    /**
     * @param from
     * @param to
     * @param money
     */
    @Override
    public void borrow(String from, String to, float money) {
        Account fromAccount = accountDao.findByName(from);
        Account toAccount = accountDao.findByName(to);

        if (fromAccount.getMoney() < money) {
            System.out.println("好兄弟，对不住，溜了溜了。");
        } else {
            fromAccount.setMoney(fromAccount.getMoney() - money);
            toAccount.setMoney(toAccount.getMoney() + money);

            accountDao.updateAccount(fromAccount);
            int five = 5 / 0;
            accountDao.updateAccount(toAccount);
        }
    }
}
