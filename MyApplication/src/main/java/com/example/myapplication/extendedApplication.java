package com.example.myapplication;

import android.app.Application;
import android.content.Context;

/**
 * Created by greenja01 on 9/11/13.
 */
public class extendedApplication extends Application{

        private static Context context;

        public void onCreate(){
            super.onCreate();
            extendedApplication.context = getApplicationContext();
        }

        public static Context getAppContext() {
            return extendedApplication.context;
        }


}
