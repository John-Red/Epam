package company.db.dbstate;


import company.db.DBApplication;
import company.db.data.Table;
import company.db.data.TableMetaData;
import company.db.misc.DBConstants;
import company.db.misc.DataHandler;
import company.db.misc.Utils;
import company.server.DBServer;

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
        DBApplication.INSTANCE.changeState(DBApplication.INSTANCE.stateRun);}
        catch (Exception e){
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
            }
        });
    }

    @Override
    public void onStop() {
        //check if everything is ok
        DBApplication.INSTANCE.changeState(DBApplication.INSTANCE.stateStop);
    }
}
