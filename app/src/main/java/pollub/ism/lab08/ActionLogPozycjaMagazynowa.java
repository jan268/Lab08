package pollub.ism.lab08;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class ActionLogPozycjaMagazynowa {

    @Embedded
    public PozycjaMagazynowa warzywniak;

    @Relation(
            parentColumn = "NAME",
            entityColumn = "nazwaProduktu"
    )
    public List<ActionLog> logs;
}
