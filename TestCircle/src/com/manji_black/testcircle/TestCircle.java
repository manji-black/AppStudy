package com.manji_black.testcircle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TestCircle extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_circle);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_test_circle, menu);
		return true;
	}

}
