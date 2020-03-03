package cn.dbdj1201.mistake.bean;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Properties;

/**
 * @author tyz1201
 * @datetime 2020-03-03 17:26
 * Bean:可重用组件--》若一个Service可以被多个Servlet复用，那这个Service可称为Bean
 * JavaBean：java写出来的可重用组件就是JavaBean
 * 这个工厂就可以新建service 跟 dao对象
 * 要干的活就是配置文件+反射新建对象。
 * 配置文件可以是xml形式，也可以是properties文件。
 **/
public class BeanFactory {

    private static Properties pros;

    static {
        pros = new Properties();
        try {
            pros.load(Objects.requireNonNull(BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object newInstance(String beanName) {
        Object bean = null;
        try {
            bean = Class.forName(pros.getProperty(beanName)).getConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return bean;
    }
}
