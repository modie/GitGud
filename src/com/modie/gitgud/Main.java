package com.modie.gitgud;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;

public class Main extends Activity {
	
	Button btnPlay,btnLevel,btnTest,btnTodo,btnExit ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		btnPlay = (Button)findViewById(R.id.btnPlay);
		btnLevel = (Button)findViewById(R.id.btnLevelCreator);
		btnTest = (Button)findViewById(R.id.btnTests);
		btnTodo = (Button)findViewById(R.id.btnTodo);
		btnExit = (Button)findViewById(R.id.btnExit);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
