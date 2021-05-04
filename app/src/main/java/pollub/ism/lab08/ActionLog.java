package pollub.ism.lab08;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ActionLog {

    @PrimaryKey(autoGenerate = true)
    public long id;

    public String nazwaProduktu;

    public String date;

    public int newQuantity;

    public int oldQuantity;
}
