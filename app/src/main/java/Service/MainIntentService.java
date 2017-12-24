package Service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by lamos on 12/24/2017.
 */

public class MainIntentService extends IntentService {
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Toast.makeText(this, "This is IntentService", Toast.LENGTH_SHORT).show();
    }
}
