package com.example.weaponshop.models;

import com.example.weaponshop.models.tables.TableGuns;

public class DbManager {
    private static DbManager instance = null;

    public static DbManager getInstance() {
        if (instance == null) {
            instance = new DbManager();
        }
        return instance;
    }

    public TableGuns tableGuns;

    private DbManager(){
        String url = "jdbc:postgresql://localhost:55000/postgres?currentSchema=weapon_shop";
        String login = "postgres";
        String password = "";

        tableGuns = new TableGuns(url,login,password);
    }
}
