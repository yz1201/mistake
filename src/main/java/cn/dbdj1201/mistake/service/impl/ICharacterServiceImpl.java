package cn.dbdj1201.mistake.service.impl;

import cn.dbdj1201.mistake.bean.BeanFactory;
import cn.dbdj1201.mistake.mapper.ICharacterMapper;
import cn.dbdj1201.mistake.service.ICharacterService;

/**
 * @author tyz1201
 * @datetime 2020-03-03 17:19
 **/
public class ICharacterServiceImpl implements ICharacterService {
//    private ICharacterMapper mapper;

    @Override
    public void test() {
        ICharacterMapper mapper = (ICharacterMapper) BeanFactory.newInstance("charDao");
        mapper.test();
    }
}
