package com.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HerbDialog extends Activity implements View.OnClickListener {
	
	private static final String TAG = HerbDialog.class.getSimpleName();
	private TextView txt;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        txt = (TextView)findViewById(R.id.choice);
        txt.setText("Hello!");
        
//        Button btn2 = (Button)findViewById(R.id.h_btn2);
//        btn2.setOnClickListener(new View.OnClickListener() {
//			public void onClick(View arg0) {
//				Intent herb = new Intent(HerbDialog.this, Dia2.class);
//				startActivityForResult(herb, 20);
//			}
//		});
        Button btn = (Button)findViewById(R.id.choice);
        btn.setOnClickListener(this);
    }
    
    public void onClick(View v) {
		// TODO Auto-generated method stub
    	if (v.getId() == R.id.choice) {
    		Intent herb = new Intent(HerbDialog.this, Dialog.class);
			startActivityForResult(herb, 10);
    	}
	}

    
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		
		if (resultCode == RESULT_OK) {
			if (requestCode == 10) {
				int potKind = data.getIntExtra("potKind", 0);
		        txt.setText("" + potKind);
//				Log.e(TAG, "["+potKind+"]");
			}
		} else {
			Log.e(TAG, "[취소했어~");
		}
	}
	
}