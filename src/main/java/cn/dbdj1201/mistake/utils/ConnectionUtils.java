package cn.dbdj1201.mistake.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author tyz1201
 * @datetime 2020-03-04 16:15
 **/
@Component("connUtils")
public class ConnectionUtils {
    private ThreadLocal<Connection> t1 = new ThreadLocal<>();
    @Resource(name = "dataSource")
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getThreadConnection() {
        Connection conn = t1.get();
        if (conn == null) {
            try {
                conn = dataSource.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            t1.set(conn);
        }
        return conn;
    }

    public void removeConnection() {
        t1.remove();
    }
}
