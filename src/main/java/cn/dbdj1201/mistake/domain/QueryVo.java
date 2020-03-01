package cn.dbdj1201.mistake.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-01 23:49
 **/
public class QueryVo implements Serializable {
    private Novelist novelist;
    private List<Integer> ids;


    public QueryVo() {
    }

    public Novelist getNovelist() {
        return novelist;
    }

    public void setNovelist(Novelist novelist) {
        this.novelist = novelist;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "novelist=" + novelist +
                ", ids=" + ids +
                '}';
    }
}
