package com.example.myapplication;

import android.widget.Toast;

/**
 * Created by greenja01 on 9/11/13.
 */
public class PopupMessageSender implements MessageSender{
    public void SendMessage(String message){
        extendedApplication.getAppContext();

        Toast.makeText(extendedApplication.getAppContext(), message, Toast.LENGTH_LONG).show();
    }

}
