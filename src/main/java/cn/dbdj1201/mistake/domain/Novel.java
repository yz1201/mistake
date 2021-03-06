package cn.dbdj1201.mistake.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-02 7:50
 * 一对多实体类，多的一方，外键指向一，实体类包含Novelist
 **/
public class Novel implements Serializable {
    private Integer id;
    private String novelName;
    private Integer nid;

    private Novelist novelist; //mybatis中，一对一实现，被谁写的。

    private List<Character> characters; //出现的主要人物，多对多实现

    public Novel() {
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNovelName() {
        return novelName;
    }

    public void setNovelName(String novelName) {
        this.novelName = novelName;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Novelist getNovelist() {
        return novelist;
    }

    public void setNovelist(Novelist novelist) {
        this.novelist = novelist;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "id=" + id +
                ", novelName='" + novelName + '\'' +
                ", nid=" + nid +
                '}';
    }
}
