package Service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.lamos.componenttest.R;
import com.lamos.componenttest.SimpleActivity;

/**
 * Created by lamos on 12/24/2017.
 */

public class ServiceActivity extends SimpleActivity {
    public static Intent newInstance(Context context ,String s){
        Intent intent = new Intent(context, ServiceActivity.class);
        intent.putExtra("title", s);
        return intent;
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setButton(R.id.button1, "start service", new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        setButton(R.id.button2, "start bindservice", new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        setButton(R.id.button3, "start intentservice", new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
