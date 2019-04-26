package company.db.dbstate;


import company.ApplicationConst;
import company.db.misc.Utils;

import java.util.ArrayList;
import java.util.List;

public class DBStateStop extends DBState {

    @Override
    public void enter() {
        System.out.println("Entering DBStop state");

        List<String> list = new ArrayList<>();
        list.add("test string one");
        list.add("test string two");
        Utils.writeListToFile(list, ApplicationConst.DATA_DIR + "/test.dat");
    }

    @Override
    public void onStop() {
        System.out.println("Already trying to stop...");
    }
}
