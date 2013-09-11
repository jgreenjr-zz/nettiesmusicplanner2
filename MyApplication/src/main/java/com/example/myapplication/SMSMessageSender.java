package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;

/**
 * Created by greenja01 on 9/11/13.
 */
public class SMSMessageSender implements MessageSender {
    Activity activity = null;

    public SMSMessageSender() {
        activity = new Activity();
    }


    public void SendMessage(String message){
        Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse("sms:2062652405") );
        intent.putExtra( "sms_body", message );
        activity.startActivity(intent);

    }
}
