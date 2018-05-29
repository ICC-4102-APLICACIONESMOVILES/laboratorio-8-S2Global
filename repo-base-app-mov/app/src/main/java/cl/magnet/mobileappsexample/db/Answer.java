package cl.magnet.mobileappsexample.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Answer {

    @PrimaryKey
    private int uid;

    @ColumnInfo(name = "info")
    private String info;

    public Answer(int uid, String info, String date) {
        this.uid = uid;
        this.info = info;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return info;
    }

    public void setName(String name) {
        this.info = info;
    }
}
