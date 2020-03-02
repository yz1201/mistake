package cn.dbdj1201.mistake.mapper;

import cn.dbdj1201.mistake.domain.Novel;
import cn.dbdj1201.mistake.domain.NovelNovelist;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-02 7:57
 * novel表配置
 **/
public interface INovelMapper {

    @Select("select * from novel")
    @Results(id = "novelMap", value = {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "novelName", column = "novelName"),
            @Result(property = "nid", column = "nid"),
            @Result(property = "novelist", column = "nid", one = @One(select = "cn.dbdj1201.mistake.mapper.INovelistMapper.findNovelistByNid",
                    fetchType = FetchType.EAGER)),
            @Result(property = "characters", column = "id", many = @Many(select = "cn.dbdj1201.mistake.mapper.ICharacterMapper.findCharacterBy",
                    fetchType = FetchType.LAZY))
    })
    List<Novel> findAll();

//    @Select()

    List<NovelNovelist> findAllNovelNovelist();

    /**
     * @param id
     * @return
     */
    @Select("select * from novel where id = #{nid}")
    Novel findNovelByNid(int id);

    @Select("select * from novel n where n.id in (select n2.nid from novel_character n2 where n2.cid = #{cid})")
    List<Novel> findNovelBy(int cid);

}
