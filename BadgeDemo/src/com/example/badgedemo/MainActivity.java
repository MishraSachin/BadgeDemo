package com.example.badgedemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	
	Button b1;
	BadgeView badge8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        b1 = (Button)findViewById(R.id.increment);
        
        badge8 = new BadgeView(this, b1);
        badge8.setText("0");
        
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (badge8.isShown()) {
					badge8.increment(1);
				} else {
					badge8.show();
				}
				
			}
		});
    }

    
}
