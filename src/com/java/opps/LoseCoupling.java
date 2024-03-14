package com.java.opps;

class Database {
    public void saveData(String data) {
        // Code to save data to a database
    }
}

public class LoseCoupling {
    private Database database;

    public LoseCoupling() {
        this.database = new Database();
    }

    public void processData(String data) {
        // Processing data
        database.saveData(data);
    }

    public static void main(String[] args) {
        LoseCoupling app = new LoseCoupling();
        app.processData("Some data to save");
    }
}
