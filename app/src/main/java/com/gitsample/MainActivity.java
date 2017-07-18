package com.gitsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testUpload();
    }

    private void testUpload() {
        Log.i("test", "htest");
        Toast.makeText(this, "dfgdf", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "dgdf", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Iam in branch01", Toast.LENGTH_SHORT).show();
    }

}
