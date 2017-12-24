package Activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;

import com.lamos.componenttest.R;
import com.lamos.componenttest.SimpleActivity;

/**
 * Created by lamos on 12/24/2017.
 */

public class ThirdActivity extends SimpleActivity {
    public static Intent newInstance(Context context, String s){
        Intent intent = new Intent(context, ThirdActivity.class);
        intent.putExtra("title",s);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent();
        intent.putExtra("flag","Back From ThirdActivity");
        setResult(Activity.RESULT_OK, intent);

        Button startFragment = (Button)findViewById(R.id.button1);
        startFragment.setVisibility(0);
        startFragment.setText("Start Fragment");
        startFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                Fragment fragment = MainFragment.newInstance("This is MainFragment");
                fragmentManager.beginTransaction()
                        .add(R.id.fragment_container, fragment)
                        .commit();
            }
        });
    }
}
