package config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author tyz1201
 * @datetime 2020-03-04 3:42
 * spring新注解Configuration
 **/
@ComponentScan("cn.dbdj1201.mistake")
@Import(JdbcConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {

}
