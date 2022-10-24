package com.bp3.wvarneteam05;

import com.bp3.wvarneteam05.models.IDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB implements IDB {
    private Connection con;

    public DB() {
        String host = "bp3.adainforma.tk";
        String database = "bp3_wvarne_t05";
        String username = "wvarne_t05";
        String password = "Axo5p7%9";

        try {
            con = DriverManager.getConnection(String.format("jdbc:mysql://%s/%s", host, database), username, password);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public Connection getCon() {
        return con;
    }
}
