package tools.wpfang.broadcastreceiver01;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MySystemReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        switch(intent.getAction())
        {
            case Intent.ACTION_BATTERY_LOW:
                Toast.makeText(context,"Your Phone Battery is LOW",Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_POWER_CONNECTED:
                Toast.makeText(context,"Your Phone connect to POWER",Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context,"Your Phone Battery is disconnect to power",Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                Toast.makeText(context,"Your Phone Battery has changed airplane mode",Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
