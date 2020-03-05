package cn.dbdj1201.mistake_new.service.impl;

import cn.dbdj1201.mistake_new.dao.IAccountDao;
import cn.dbdj1201.mistake_new.service.IAccountService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author tyz1201
 * @datetime 2020-03-05 14:55
 **/
@Service("accountService")
public class IAccountServiceImpl implements IAccountService {

    @Resource(name = "accountDao")
    private IAccountDao accountDao;

    @Override
    public void borrow(String from, String to, float money) {

    }
}
