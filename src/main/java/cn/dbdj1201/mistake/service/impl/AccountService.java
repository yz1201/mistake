package cn.dbdj1201.mistake.service.impl;

import cn.dbdj1201.mistake.service.IAccountService;
import org.springframework.stereotype.Component;

/**
 * @author tyz1201
 * @datetime 2020-03-05 10:38
 **/
@Component("aService")
public class AccountService implements IAccountService {

    @Override
    public void saveAccount() {
        System.out.println("保存");
//        int i = 1 / 0;
    }

    @Override
    public void udateAccount(int i) {
        System.out.println("更新：" + i);

    }

    @Override
    public int deleteAccount() {
        System.out.println("delete");
        return 0;
    }
}
