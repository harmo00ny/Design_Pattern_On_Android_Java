package com.example.design_pattern_on_android_java;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.logging.Logger;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DesignPatternListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DesignPatternListFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public DesignPatternListFragment() {
        // Required empty public constructor
    }
    public static DesignPatternListFragment newInstance() {
        return new DesignPatternListFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_design_pattern_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button = view.findViewById(R.id.iterator_pattern_button);
        MainActivity mainActivity = (MainActivity) getContext();

        if (mainActivity != null) {
            button.setOnClickListener(v -> ((MainActivity) getContext()).changeFragment("Iterator"));
        }
    }
}