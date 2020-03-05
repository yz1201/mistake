package proxy;

/**
 * @author tyz1201
 * @datetime 2020-03-05 8:15
 **/
public interface IProducer {
    void sale(float money);

    void afterService(float money);
}
