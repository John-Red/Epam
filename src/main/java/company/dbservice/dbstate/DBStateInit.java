package company.dbservice.dbstate;

import company.dbservice.DBApplication;
import company.dbservice.misc.DBConstants;
import company.dbservice.misc.Utils;
import company.dbservice.misc.DataHandler;
import company.dbservice.data.Table;
import company.dbservice.data.TableMetaData;
import company.dbservice.server.DBServer;

public class DBStateInit extends DBState {


    public DBStateInit(String name) {
        super(name);
    }

    @Override
    public void enter() {
        System.out.println("Entering DBInit state");
        initTables();
        try {
            DBServer.INSTANCE.start();
            DBApplication.INSTANCE.changeState(DBApplication.INSTANCE.stateRun);
        } catch (Exception e) {
            e.printStackTrace();
            DBApplication.INSTANCE.changeState(DBApplication.INSTANCE.stateStop);
        }
    }

    private void initTables() {
        Utils.readDir(DBConstants.TABLE_DIR, new DataHandler() {
            @Override
            public void handleFile(String filePath) {
                TableMetaData metaData = TableMetaData.loadFromFile(filePath);
                Table table = new Table(metaData);
                table.load();
                DBApplication.INSTANCE.addTable(metaData.getTableName(), table);
            }
        });
    }

    @Override
    public void onStop() {
        //check if everything is ok
        DBApplication.INSTANCE.changeState(DBApplication.INSTANCE.stateStop);
    }
}
