package org.example.hello;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Hello extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        System.out.println("Hello World!");
        System.err.println("Hello World!");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello, menu);
        return true;
    }
    
}
