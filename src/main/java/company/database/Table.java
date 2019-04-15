package company.database;

import javafx.scene.control.Tab;

import java.util.ArrayList;
import java.util.List;

public class Table {
    protected String name;
    protected List<String> columns;
    protected List<Record> records;

    {
        records= new ArrayList<Record>();
    }


    public Table (String name, List<String> columns){
        this.name=name;
        this.columns=columns;
    }

    public void insert(Record record){
        records.add(record);
    }
}
