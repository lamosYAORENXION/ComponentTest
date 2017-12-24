package Service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by lamos on 12/24/2017.
 */

public class MainService extends Service {
    private testBinder mBinder;
    
    class testBinder extends IBinder{
        public void method1(){
            Toast.makeText(MainService.this, "This is Method 1.", Toast.LENGTH_SHORT).show();
        }
        
        public void method2(){
            Toast.makeText(MainService.this, "This is Method 2", Toast.LENGTH_SHORT).show();
        }
    }
    
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        mBinder = new testBinder();
        return mBinder;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Thread.sleep(1000);
        Toast.makeText(this, "This is Service",Toast.LENGTH_SHORT).show();
        return 1;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service is Destroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
