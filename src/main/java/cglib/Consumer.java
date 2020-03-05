package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @author tyz1201
 * @datetime 2020-03-05 8:17
 **/
public class Consumer {
    public static void main(String[] args) {
        Producer producer = new Producer();
        Producer proProxy = (Producer) Enhancer.create(Producer.class, (MethodInterceptor) (obj, method, args1, proxy) -> {
            Object value = null;
            if (method.getName().equals("sale")) {
                float money = (float) args1[0];
                value = method.invoke(producer, money * 0.8f);
            }
            return value;
        });
        proProxy.sale(10000f);
    }
}
