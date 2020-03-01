package cn.dbdj1201.mistake.mapper;

import cn.dbdj1201.mistake.domain.Novelist;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-01 15:41
 **/
public interface INovelistMapper {

    /**
     * 查询all novelist表
     *
     * @return
     */
    @Select("select * from novelist")
    List<Novelist> findAll();
}
