package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyBroad:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
when(intent?.action){
    Intent.ACTION_BOOT_COMPLETED->{
        Toast.makeText(context,"Boot Completed",Toast.LENGTH_LONG).show()
        Log.d("tag","Boot Completed")
    }
    Intent.ACTION_TIME_TICK->{
        Toast.makeText(context,"Time changes",Toast.LENGTH_LONG).show()
        Log.d("tag","Boot Completed")
    }
}
    }
}