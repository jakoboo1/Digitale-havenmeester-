package com.bp3.wvarneteam05.models;

import com.bp3.wvarneteam05.Main;
import com.bp3.wvarneteam05.views.Completion;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PaymentModel {

private String status;


    public PaymentModel(Double price , BankAccount paymentAccount,Date date) {

    }

    public void finish(Booking booking){
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        Main.setScene(new Completion(booking).getCompletionScene());
    }

    public void cancel(){

    }
}
