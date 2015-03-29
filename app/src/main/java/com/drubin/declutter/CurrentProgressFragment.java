package com.drubin.declutter;

import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by Deena Rubin on 3/21/2015.
 */
public class CurrentProgressFragment extends Fragment {


    ImageButton plus;
    ImageButton minus;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.current_progress_fragment, container, false);
        Log.e("log", "log");
        plus = (ImageButton)view.findViewById(R.id.plus_button);
        minus = (ImageButton)view.findViewById(R.id.minus_button);
        return view;
    }
}
