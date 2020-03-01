package cn.dbdj1201.mistake.domain;

import java.io.Serializable;

/**
 * @author tyz1201
 * @datetime 2020-03-01 15:35
 **/
public class Novelist implements Serializable {
    private Integer nid;
    private String nname;
    private String lifetime;
    private String novel;
    private String address;

    public Novelist() {
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

    @Override
    public String toString() {
        return "Novelist{" +
                "nid=" + nid +
                ", nname='" + nname + '\'' +
                ", lifetime='" + lifetime + '\'' +
                ", novel='" + novel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
