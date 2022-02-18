package com.example.design_pattern_on_android_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import com.example.design_pattern_on_android_java.iterator.IteratorFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.container, DesignPatternListFragment.newInstance());
        transaction.commit();
    }

    public void changeFragment(String fragmentName) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if ("Iterator".equals(fragmentName)) {
            transaction.replace(R.id.container, IteratorFragment.newInstance());
            transaction.commit();
        }
    }
}