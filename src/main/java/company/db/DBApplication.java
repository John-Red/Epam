package company.db;


import company.db.data.QueryResult;
import company.db.dbstate.DBState;
import company.db.dbstate.DBStateInit;
import company.db.dbstate.DBStateRunning;
import company.db.dbstate.DBStateStop;

public enum DBApplication {
    INSTANCE;

    public static final String DATA_ENCRYPTION_LEVEL = "LOW";
    private DBState currentState;
    public DBState stateInit = new DBStateInit();
    public DBState stateRun = new DBStateRunning();
    public DBState stateStop = new DBStateStop();

    public void start() {
        changeState(stateInit);
    }

    public void stop() {
        currentState.onStop();
    }

    public QueryResult query(String query) {
        return null;
    }

    public void changeState(DBState state) {
        if (currentState != null) {
            if (currentState.equals(state)) {
                return;
            } else {
                currentState.exit();
            }
        }
        currentState = state;
        currentState.enter();
    }

}
