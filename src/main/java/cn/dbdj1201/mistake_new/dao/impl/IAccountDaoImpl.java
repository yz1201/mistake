package cn.dbdj1201.mistake_new.dao.impl;

import cn.dbdj1201.mistake.utils.ConnectionUtils;
import cn.dbdj1201.mistake_new.dao.IAccountDao;
import cn.dbdj1201.mistake_new.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-05 14:55
 **/
@Repository("accountDao")
public class IAccountDaoImpl implements IAccountDao {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public List<Account> findAll() {
        return jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<>(Account.class));
    }


    @Override
    public Account findById(int id) {
        Account account;
        try {
            account = jdbcTemplate.queryForObject("select * from account where id = ?",
                    new BeanPropertyRowMapper<>(Account.class), id);

        } catch (DataAccessException e) {
            return null;
        }
        return account;
    }

    @Override
    public Account findById0(int id) {
        List<Account> accounts = jdbcTemplate.query("select * from account where id = ?", new BeanPropertyRowMapper<>(Account.class), id);
        return accounts.isEmpty() ? null : accounts.get(0);
    }

    @Override
    public Account findByName(String name) {
        Account account;
//        System.out.println(name);
        try {
            account = jdbcTemplate.queryForObject("select * from account where name = ?",
                    new BeanPropertyRowMapper<>(Account.class), name);

        } catch (DataAccessException e) {
            e.printStackTrace();
            System.out.println("wrong answer");
            return null;
        }
        return account;
    }

    @Override
    public void saveAccount(Account account) {
        jdbcTemplate.update("insert into account(name, money) values(?, ?)", account.getName(), account.getMoney());

    }

    @Override
    public void deleteAccount(int id) {
        jdbcTemplate.update("delete from account where id = ?", id);
    }

    @Override
    public void updateAccount(Account account) {
        jdbcTemplate.update("update account set name = ?, money = ? where id = ?", account.getName(), account.getMoney(), account.getId());
    }
}
