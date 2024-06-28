package com.techlabs.credentials.solution.test;

import com.techlabs.credentials.solution.model.Database;

public class DatabaseTest {
    public static void main(String[] args) {
     
        Database dbManager = Database.getDatabaseManager();

     
        System.out.println(dbManager.getConnectionMessage());
    }
}

