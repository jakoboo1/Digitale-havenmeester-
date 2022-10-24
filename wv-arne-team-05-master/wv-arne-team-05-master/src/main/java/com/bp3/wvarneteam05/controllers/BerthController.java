package com.bp3.wvarneteam05.controllers;

import com.bp3.wvarneteam05.Main;
import com.bp3.wvarneteam05.models.IController;

import java.sql.*;

public class BerthController implements IController {
    Connection con;

    public BerthController() {
        con = Main.getCon();
    }

    // Returns all Berth's from the database
    @Override
    public ResultSet list() {
        try {
            return con.createStatement().executeQuery("SELECT * FROM berth");
        } catch (SQLException e) {
            System.out.println(e);

            return null;
        }
    }

    // Returns a single Berth from the database
    public ResultSet get(int berthnumber, int harborId) {
        String query = "SELECT * FROM berth WHERE berthnumber=? AND harborid=? LIMIT 1";
        try {
            PreparedStatement stm = con.prepareStatement(query);
            stm.setInt(1, berthnumber);
            stm.setInt(2, harborId);

            return stm.executeQuery();
        } catch(SQLException e) {
            System.out.println(e);

            return null;
        }
    }

    // Returns all Berths from a specific Harbor that are not booked at a specific date
    public ResultSet getAvailableBerths(Date endDate, int harborId) {
        String query = "SELECT DISTINCT t1.* FROM berth t1 LEFT JOIN booking t2 ON t1.berthnumber = t2.berthnumber AND t1.harborid = t2.berthharborid WHERE ? NOT BETWEEN t2.startdate AND t2.enddate AND t1.harborid = ? OR t2.id IS NULL AND t1.harborid = ?;";
            try {
            PreparedStatement stm = con.prepareStatement(query);
            stm.setDate(1, endDate);
            stm.setInt(2, harborId);
            stm.setInt(3, harborId);

            return stm.executeQuery();
        } catch(SQLException e) {
            System.out.println(e);

            return null;
        }
    }
}
