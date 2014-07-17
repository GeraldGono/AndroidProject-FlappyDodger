package com.geraldgono.flappy_dodger;

import java.util.ArrayList;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HighScore extends Activity {

	public TextView t1;
	public int score, hscore;
	private ArrayList<HighScore> listscore = new ArrayList<HighScore>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_highscore);
		SharedPreferences pref = getApplicationContext().getSharedPreferences(
				"higher", MODE_PRIVATE);
		Editor editor = pref.edit();

		// l1 = (ListView) findViewById(R.id.list);

		score = pref.getInt("score", 0);
		hscore = pref.getInt("hscore", 0);

		if (score > hscore) {
			editor.putInt("hscore", score);
			editor.commit();
		}
		hscore = pref.getInt("hscore", 0);

		t1 = (TextView) findViewById(R.id.textView1);
		// t1.setText("Highscore :" + hscore);
	}

	public void main(View v) {
		finish();

	}

	public int getScore() {
		// TODO Auto-generated method stub
		return score;
	}
	
	

}
