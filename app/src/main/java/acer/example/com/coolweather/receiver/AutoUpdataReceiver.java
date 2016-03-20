package acer.example.com.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import acer.example.com.coolweather.service.AutoUpdataService;

/**
 * Created by acer on 2016/3/20.
 */
public class AutoUpdataReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdataService.class);
        context.startService(i);
    }
}
