package com.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class HerbDialog extends Activity implements View.OnClickListener {
	
	private static final String TAG = HerbDialog.class.getSimpleName();
	private ImageButton img_btn;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        img_btn = (ImageButton)findViewById(R.id.choice);
        img_btn.setBackgroundResource(R.drawable.ic_launcher);
        
//        Button btn2 = (Button)findViewById(R.id.h_btn2);
//        btn2.setOnClickListener(new View.OnClickListener() {
//			public void onClick(View arg0) {
//				Intent herb = new Intent(HerbDialog.this, Dia2.class);
//				startActivityForResult(herb, 20);
//			}
//		});
        img_btn = (ImageButton)findViewById(R.id.choice);
        img_btn.setOnClickListener(this);
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
		        img_btn.setBackgroundResource(potKind);
//				Log.e(TAG, "["+potKind+"]");
			}
		} else {
			Log.e(TAG, "[취소했어~");
		}
	}
	
}