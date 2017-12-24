package Activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.lamos.componenttest.R;
import com.lamos.componenttest.SimpleActivity;

/**
 * Created by lamos on 12/24/2017.
 */

public class SecondActivity extends SimpleActivity {
    private static final String TAG = "SecondActivity";
    
    public static Intent newinstance(Context context,String s){
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra("title", s);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button startOtherActivity = (Button)findViewById(R.id.button1);
        startOtherActivity.setVisibility(0);
        startOtherActivity.setText("ThirdActivity");
        startOtherActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = ThirdActivity.newInstance(SecondActivity.this, "This is ThirdActivity");
                startActivityForResult(intent,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == Activity.RESULT_OK){
            switch (requestCode){
                case 0:
                    String s = data.getStringExtra("flag");
                    Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: start");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: start");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: start");
    }
}
