package cn.dbdj1201.mistake.mapper;

import cn.dbdj1201.mistake.domain.Character;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-02 17:41
 **/
public interface ICharacterMapper {

    /**
     * @return
     */
    @Select("select * from tab_character")
    @Results(id = "characterMap", value = {
            @Result(id = true, property = "id", column = "cid"),
            @Result(property = "name", column = "name"),
            @Result(property = "info", column = "info"),
            @Result(property = "novels", column = "id", many = @Many(select = "cn.dbdj1201.mistake.mapper.INovelMapper.findNovelBy",
                    fetchType = FetchType.EAGER))
    })
    List<Character> findAll();

    @Select("select t1.* from tab_character t1 where t1.cid in  (select cid from novel_character where nid = #{nid})")
    List<Character> findCharacterBy(int nid);
}
