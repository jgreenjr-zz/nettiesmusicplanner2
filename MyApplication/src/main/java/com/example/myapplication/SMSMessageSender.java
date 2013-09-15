package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;

/**
 * Created by greenja01 on 9/11/13.
 */
public class SMSMessageSender implements MessageSender {
    Context _Context = null;
    String phoneNumber  = "";

    public SMSMessageSender(Context context, String phoneNumber) {
        _Context = context;
        this.phoneNumber = phoneNumber;
    }


    public void SendMessage(String message){
        Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse("sms:"+phoneNumber) );
        intent.putExtra( "sms_body", message );
        _Context.startActivity(intent);

    }
}
