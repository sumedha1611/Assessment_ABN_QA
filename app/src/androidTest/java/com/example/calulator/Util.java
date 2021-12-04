//This is a utility class where we can keep common functionalities of application
// Author - Sumedha Singh
package com.example.calulator;

import android.util.Log;

public class Util {
    // Enable or Disable Log Output
    static boolean logEnabled = true;
    public static void logTest(String log){
        if (logEnabled) {
            Log.v("Espresso Test", log);
        }
    }
}