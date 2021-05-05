package pollub.ism.lab08;

import androidx.room.*;

import java.util.List;

@Dao
public interface ActionLogDAO {

    @Insert
    public void insert(pollub.ism.lab08.ActionLog log);

    @Update
    void update(pollub.ism.lab08.ActionLog log);

    @Query("SELECT COUNT(*) FROM ActionLog")
    int size();

    @Query("SELECT * FROM ActionLog WHERE nazwaProduktu= :log")
    List<ActionLog> findActionLogsByName(String log);
}
