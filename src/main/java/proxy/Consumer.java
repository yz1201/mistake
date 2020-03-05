package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author tyz1201
 * @datetime 2020-03-05 8:17
 **/
public class Consumer {
    public static void main(String[] args) {
        Producer producer = new Producer();
        IProducer producer1 = (IProducer) Proxy.newProxyInstance(Producer.class.getClassLoader(), Producer.class.getInterfaces(),
                (proxy, method, args1) -> {
                    Object value = null;
                    if (method.getName().equals("sale")) {
                        float money = (float) args1[0];
                        value = method.invoke(producer, money * 0.8f);
                    }
                    return value;
                });
        producer1.sale(10000);
    }
}
