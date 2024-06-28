package com.techlabs.credentials.solution.model;
public class Database {
    private static Database databaseManager;

    private Database() {
        
    }

    public static Database getDatabaseManager() {
        if (databaseManager == null) {
         
                    databaseManager = new Database();  
                }
       
        return databaseManager;
    }

    public String getConnectionMessage() {
        return "Database Connection Successful";
    }
}

