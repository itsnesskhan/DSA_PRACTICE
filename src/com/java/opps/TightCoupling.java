package com.java.opps;

interface DataSaver {
    void saveData(String data);
}

class Database2 implements DataSaver {
    public void saveData(String data) {
        // Code to save data to a database
    }
}

public class TightCoupling {
    private DataSaver dataSaver;

    public TightCoupling(DataSaver dataSaver) {
        this.dataSaver = dataSaver;
    }

    public void processData(String data) {
        // Processing data
        dataSaver.saveData(data);
    }

    public static void main(String[] args) {
        DataSaver database = new Database2();
        TightCoupling app = new TightCoupling(database);
        app.processData("Some data to save");
    }
}

