package cn.dbdj1201.mistake.mapper;

import cn.dbdj1201.mistake.domain.Novel;
import cn.dbdj1201.mistake.domain.NovelNovelist;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-02 7:57
 * novel表配置
 **/
public interface INovelMapper {

//    @Select("select * from novel")
    List<Novel> findAll();

//    @Select()

    List<NovelNovelist> findAllNovelNovelist();

}
