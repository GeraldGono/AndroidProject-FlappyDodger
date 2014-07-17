package com.geraldgono.flappy_dodger;

import java.util.ArrayList;

import com.geraldgono.flappy_dodger.Scorelist;
import com.geraldgono.flappy_dodger.HighScore;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class Score extends Activity {
	
	private ListView list;
	private ArrayList<HighScore> listScores = new ArrayList<HighScore>();
	private Scorelist adapter;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listscore);
		
		list = (ListView) findViewById(R.id.listView1);
		
		listScores.add()
		
	}

}
