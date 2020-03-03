package cn.dbdj1201.mistake.ui;

import cn.dbdj1201.mistake.bean.BeanFactory;
import cn.dbdj1201.mistake.service.ICharacterService;

/**
 * @author tyz1201
 * @datetime 2020-03-03 17:22
 * 模拟View层，调用业务层
 **/
public class Client {
    public static void main(String[] args) {
        ICharacterService service = (ICharacterService) BeanFactory.newInstance("charService");
        service.test();
    }
}
