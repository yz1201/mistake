package cn.dbdj1201.mistake.mapper;

import cn.dbdj1201.mistake.domain.Novelist;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

/**
 * @author tyz1201
 * @datetime 2020-03-01 15:44
 **/
public class INovelistMapperTest {

    @Test
    public void findAll() {
        INovelistMapper mapper = (INovelistMapper) new SqlSessionFactoryBuilder()
                .build(this.getClass().getClassLoader().getResourceAsStream("SqlMapConfig.xml"))
                .openSession().getMapper(Novelist.class);

        mapper.findAll().forEach(System.out::println);
    }
}