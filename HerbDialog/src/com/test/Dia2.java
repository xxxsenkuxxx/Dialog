package com.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dia2 extends Activity {

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dia2);
		
		Button potButton = (Button) findViewById(R.id.back2);
		potButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				int potKind = 2;
				Intent intent = new Intent();
				intent.putExtra("potKind", potKind);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
	}

}
