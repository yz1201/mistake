package cn.dbdj1201.mistake.domain;

/**
 * @author tyz1201
 * @datetime 2020-03-02 7:51
 **/
public class NovelNovelist extends Novel {
    private String novelistName;
    private String address;

    public NovelNovelist() {
    }

    public String getNovelistName() {
        return novelistName;
    }

    public void setNovelistName(String novelistName) {
        this.novelistName = novelistName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "NovelNovelist{" +
                "novelistName='" + novelistName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
