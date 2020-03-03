package cn.dbdj1201.mistake.bean;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

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
    private static Map<String, Object> beans = new HashMap<>();

    static {
        pros = new Properties();
        try {
            pros.load(Objects.requireNonNull(BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties")));
            Enumeration<Object> keys = pros.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                String beanPath = pros.getProperty(key);
                beans.put(key, Class.forName(beanPath).getConstructor().newInstance());
            }
        } catch (IOException | ClassNotFoundException | InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static Object newInstance(String beanName) {
        return beans.get(beanName);
    }
}
