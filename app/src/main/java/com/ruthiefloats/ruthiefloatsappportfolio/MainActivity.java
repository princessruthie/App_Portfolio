package com.ruthiefloats.ruthiefloatsappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPickApp(View view) {
        String message;
        switch (view.getId()) {
            case R.id.popMovies:
                message = getResources().getString(R.string.popular_movies);
                break;
            case R.id.stockHawk:
                message = getResources().getString(R.string.stock_hawk);
                break;
            case R.id.buildBigger:
                message = getResources().getString(R.string.build_it_bigger);
                break;
            case R.id.makeMaterial:
                message = getResources().getString(R.string.make_your_app_material);
                break;
            case R.id.goUbiquitous:
                message = getResources().getString(R.string.go_ubiquitous);
                break;
            case R.id.capstone:
                message = getResources().getString(R.string.capstone);
                break;
            default:
                message = "";
                break;
        }
        quickToast(message);
    }

    private void quickToast(String appName) {
        String message = getResources().getString(R.string.start_toast) +
                appName +
                getResources().getString(R.string.end_toast);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}