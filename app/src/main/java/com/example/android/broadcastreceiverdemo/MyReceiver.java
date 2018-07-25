package com.example.android.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
//    private static String Receiver = MyReceiver.

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //throw new UnsupportedOperationException("Not yet implemented");

        Log.i("Receiver 1", "2");

        Toast.makeText(context, "Broadcast Receiver1", Toast.LENGTH_SHORT).show();
    }
}
