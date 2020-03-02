package cn.dbdj1201.mistake.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-02 17:37
 **/
public class Character implements Serializable {
    private Integer id;
    private String name;
    private String info;

    private List<Novel> novels; //出现过的小说集合，多对多实现。

    public Character() {
    }

    public List<Novel> getNovels() {
        return novels;
    }

    public void setNovels(List<Novel> novels) {
        this.novels = novels;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Character{" +
                "cid=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
