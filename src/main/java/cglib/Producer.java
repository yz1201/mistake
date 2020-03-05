package cglib;

/**
 * @author tyz1201
 * @datetime 2020-03-05 8:13
 **/
public class Producer {
    public void sale(float money) {
        System.out.println("this product costs " + money);
    }

    public void afterService(float money) {
        System.out.println("after service is not easy, right? " + money);
    }
}
