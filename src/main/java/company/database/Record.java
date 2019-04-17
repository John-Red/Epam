package company.database;

import java.util.List;

public class Record {

    // Record in one line of database.
    // 12; Alexey; javaCourse
    List<String> values;

    public Record(List<String> values) {
        this.values = values;
    }
}
