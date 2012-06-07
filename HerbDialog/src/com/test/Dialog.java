package com.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dialog extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hub);

		Button potButton = (Button) findViewById(R.id.back);
		potButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				finish();
			}
		});
		
		Button pot1 = (Button) findViewById(R.id.pot1);
		pot1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				int potKind = 1;
				Intent intent = new Intent();
				intent.putExtra("potKind", potKind);
				setResult(RESULT_OK, intent);
				finish();
			}
		});

		Button pot2 = (Button) findViewById(R.id.pot2);
		pot2.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				int potKind = 2;
				Intent intent = new Intent();
				intent.putExtra("potKind", potKind);
				setResult(RESULT_OK, intent);
				finish();
			}
		});

		Button pot3 = (Button) findViewById(R.id.pot3);
		pot3.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				int potKind = 3;
				Intent intent = new Intent();
				intent.putExtra("potKind", potKind);
				setResult(RESULT_OK, intent);
				finish();
			}
		});

		
		
		
//		Button potButton = (Button) findViewById(R.id.back);
//		potButton.setOnClickListener(new View.OnClickListener() {
//
//			public void onClick(View v) {
//				int potKind = 1;
//				Intent intent = new Intent();
//				intent.putExtra("potKind", potKind);
//				setResult(RESULT_CANCELED, intent);
//				finish();
//			}
//		});

	}

}
