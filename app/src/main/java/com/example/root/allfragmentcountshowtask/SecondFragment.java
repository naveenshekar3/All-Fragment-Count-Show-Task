package com.example.root.allfragmentcountshowtask;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {


    private TextView count2_tv;
    private Button count2_btn;
    int count2;
    private MainActivity mMainActivity;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_second, container, false);

        mMainActivity=(MainActivity)getActivity();

        count2_tv=(TextView)view.findViewById(R.id.count2_tv);
        count2_btn=(Button)view.findViewById(R.id.count2_btn);

        count2_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                count2++;
                count2_tv.setText(String.valueOf(count2));
                mMainActivity.countUpdate2(count2_tv.getText().toString());
            }
        });

        return view;
    }

    public void countUpdate1(int mcount) {
        count2_tv.setText(String.valueOf(mcount));

    }

    public void countUpdate3(int mcount) {
        count2_tv.setText(String.valueOf(mcount));
    }
}
