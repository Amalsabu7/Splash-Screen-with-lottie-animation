package com.amalsabu.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.amalsabu.splashscreen.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIMER=5000;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Animate in a axis
        binding.background.animate().translationY(-2500).setDuration(1000).setStartDelay(4000);
        binding.logoName.animate().translationY(2000).setDuration(1000).setStartDelay(4000);
        binding.lottieAnimation.animate().translationY(2000).setDuration(1000).setStartDelay(4000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(getApplicationContext(), UserDashboard.class));
                finish();

            }
        },SPLASH_TIMER);
    }
}