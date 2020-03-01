package cn.dbdj1201.mistake.mapper;

import cn.dbdj1201.mistake.domain.Novelist;
import org.apache.ibatis.annotations.*;

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

    /**
     * 根据id查询记录
     *
     * @param id
     * @return
     */
    @Select("select * from novelist where nid = #{id}")
    Novelist findById(int id);


    @Select("select * from novelist where nname like #{name} ")
    List<Novelist> findByName(String name);


    /**
     * 保存用户
     *
     * @param novelist
     */
    @Insert("insert into novelist(nname, lifetime, novel, address) values(#{nname},#{lifetime},#{novel},#{address})")
    void saveNovelist(Novelist novelist);


    /**
     * 修改
     *
     * @param novelist
     */
    @Update("update novelist set nname = #{nname} where novel like #{novel} ")
    void updateNovelist(Novelist novelist);

    /**
     * 删除
     *
     * @param novelist
     */
    @Delete("delete from novelist where nname = #{nname} and novel = #{novel}")
    void deleteNovelist(Novelist novelist);

    /**
     * 提供总记录数
     * @return
     */
    @Select("select count(*) from novelist")
    int findTotal();

}
