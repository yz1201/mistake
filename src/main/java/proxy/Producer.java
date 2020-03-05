package proxy;

/**
 * @author tyz1201
 * @datetime 2020-03-05 8:13
 **/
public class Producer implements IProducer {
    @Override
    public void sale(float money) {
        System.out.println("this product costs " + money);
    }

    @Override
    public void afterService(float money) {
        System.out.println("after service is not easy, right? " + money);
    }
}
