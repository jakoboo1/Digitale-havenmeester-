package com.bp3.wvarneteam05.controllers;

import com.bp3.wvarneteam05.Main;
import com.bp3.wvarneteam05.models.Booking;
import com.bp3.wvarneteam05.models.IController;
import com.bp3.wvarneteam05.models.Member;

import java.sql.*;

public class BookingController implements IController {
    Connection con;

    public BookingController() {
        con = Main.getCon();
    }

    @Override
    public ResultSet list() {
        try {
            return con.createStatement().executeQuery("SELECT * FROM booking");
        } catch (SQLException e) {
            System.out.println(e);

            return null;
        }
    }

    public void add(Booking booking) {
        String query = "INSERT INTO booking (`id`, `name`, `address`, `city`, `phonenumber`, `email`, `member`, `startdate`, `enddate`, `berthnumber`, `berthharborid`) VALUES(NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try(PreparedStatement statement = con.prepareStatement(query)) {
            statement.setString(1, booking.getPerson().getName());
            statement.setString(2, booking.getPerson().getAddress());
            statement.setString(3, booking.getPerson().getResidence());
            statement.setString(4, booking.getPerson().getPhonenumber());
            statement.setString(5, booking.getPerson().getEmail());
            statement.setBoolean(6, booking.getPerson() instanceof Member);
            statement.setDate(7, Date.valueOf(booking.getStartdate()));
            statement.setDate(8, Date.valueOf(booking.getEnddate()));
            statement.setInt(9, booking.getBerth().getNumber());
            statement.setInt(10, booking.getBerth().getHarbor());

            statement.executeUpdate();
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
}
