package cn.dbdj1201.mistake.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-01 15:35
 * 一对多实体类，一的一方，被指向，实体类包含List<Novel>
 **/
public class Novelist implements Serializable {
    private Integer nid;
    private String nname;
    private String lifetime;
    private String novel;       //symbol work
    private String address;
    private Integer money;

    private List<Novel> novels;

    public Novelist() {
    }

    public List<Novel> getNovels() {
        return novels;
    }

    public void setNovels(List<Novel> novels) {
        this.novels = novels;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public String getLifetime() {
        return lifetime;
    }

    public void setLifetime(String lifetime) {
        this.lifetime = lifetime;
    }

    public String getNovel() {
        return novel;
    }

    public void setNovel(String novel) {
        this.novel = novel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Novelist{" +
                "nid=" + nid +
                ", nname='" + nname + '\'' +
                ", lifetime='" + lifetime + '\'' +
                ", novel='" + novel + '\'' +
                ", address='" + address + '\'' +
                ", money=" + money +
                '}';
    }
}
