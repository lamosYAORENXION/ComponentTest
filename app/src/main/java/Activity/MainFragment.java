package Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lamos.componenttest.R;

/**
 * Created by lamos on 12/24/2017.
 */

public class MainFragment extends Fragment {
    private static final String TAG = "MainFragment";

    public static MainFragment newInstance(String s){
        Bundle arg = new Bundle();
        arg.putString("title", s);

        MainFragment fragment = new MainFragment();
        fragment.setArguments(arg);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach: start");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: start");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: start");

        View view = inflater.inflate(R.layout.activity_simple, container, false);
        String AppTitle = getArguments().getString("title");
        TextView title = (TextView)view.findViewById(R.id.title);
        title.setText(AppTitle);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated: start");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: start");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: start");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: start");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: start");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView: start");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: start");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach: start");
    }
}
