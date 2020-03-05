package config;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author tyz1201
 * @datetime 2020-03-04 3:42
 * spring新注解Configuration
 **/
@ComponentScan("cn.dbdj1201")
@Import(JdbcConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class SpringConfiguration {


    @Bean("txManager1")
    public PlatformTransactionManager getTxManager(DataSource dataSource) {
        DataSourceTransactionManager manager = new DataSourceTransactionManager();
        manager.setDataSource(dataSource);
        return manager;
    }
}
