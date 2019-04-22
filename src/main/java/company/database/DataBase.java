package company.database;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataBase {

    private Object tableLook = new Object();

    Map<String, Table> tables;

    public  List<Record> select() {

        synchronized (tableLook) {
            System.out.println("Starting selecting records...");
            try {
                Thread.sleep(500);
                System.out.println("Finished selecting!");
            } catch (InterruptedException e) {

            }
        }

        return null;
    }

    public void update() {
        System.out.println("Starting updating database...");
        synchronized (tableLook) {
            try {
                Thread.sleep(10000);
                System.out.println("Finished updating database!");
            } catch (InterruptedException e) {

            }
        }
    }

    public static List<String> readDataFile(String fieldName) {
        FileInputStream fis = null;
        List<String> result = new ArrayList<String>();
        BufferedReader br;
        try {
            fis = new FileInputStream(fieldName);
            br = new BufferedReader(new InputStreamReader(fis));
           String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        } catch (FileNotFoundException fnfe) {

        } catch (IOException ioex) {

        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public void delete() {

    }

    public void insert(Record record, Table table) {

    }
}