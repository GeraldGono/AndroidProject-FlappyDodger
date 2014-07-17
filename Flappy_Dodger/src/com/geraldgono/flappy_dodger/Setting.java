package com.geraldgono.flappy_dodger;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Setting extends Activity {

	CheckBox chk1;
	int volume;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);
		chk1 = (CheckBox) findViewById(R.id.checkBox1);

		SharedPreferences pref = getApplicationContext().getSharedPreferences(
				"higher", MODE_PRIVATE);
		volume = pref.getInt("volume", 0);

		if (volume == 1) {
			chk1.setChecked(true);
		}
	}

	public void volume(View v) {
		chk1 = (CheckBox) v;
		SharedPreferences pref = getApplicationContext().getSharedPreferences(
				"higher", MODE_PRIVATE);
		Editor editor = pref.edit();
		if (chk1.isChecked()) {
			editor.putInt("volume", 1);
			editor.commit();
			Toast.makeText(this, "volume on", Toast.LENGTH_SHORT).show();
		} else {
			editor.putInt("volume", 0);
			editor.commit();
		}
	}

	public void main(View v) {
		finish();

	}

}
