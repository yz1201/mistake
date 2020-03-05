package cn.dbdj1201.mistake.bean;

import cn.dbdj1201.mistake.service.INovelistService;
import cn.dbdj1201.mistake.utils.TransactionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Proxy;

/**
 * @author tyz1201
 * @datetime 2020-03-05 8:59
 **/
@Component("beanFactory")
public class BeanFactoryForService {

    @Resource(name = "novelistService")
    private INovelistService iNovelistService;

    @Resource(name = "txManager")
    private TransactionManager txManager;

    /**
     * 获取service代理对象
     * 增强方法，就是在方法添加对事务的支持，在这边做手脚方便。
     *
     * @return
     */
    @Bean("proxyNovelistService")
    public INovelistService getiNovelistService() {
        return (INovelistService) Proxy.newProxyInstance(iNovelistService.getClass().getClassLoader(), iNovelistService.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    Object value = null;
                    try {
                        txManager.beginTransaction();
                        value = method.invoke(iNovelistService, args);
                        txManager.commit();
                    } catch (Exception e) {
                        txManager.rollback();
//                        e.printStackTrace();
                    } finally {
                        txManager.release();
                    }
                    return value;
                });
    }

}
