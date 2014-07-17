package com.geraldgono.flappy_dodger;

import java.util.ArrayList;

import com.geraldgono.flappy_dodger.HighScore;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Scorelist extends BaseAdapter {

	private Context mContext;
	private ArrayList<HighScore> mList;

	public Scorelist(Context mContext, ArrayList<HighScore> mList) {
		super();
		this.mContext = mContext;
		this.mList = mList;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(HighScore,
	 * android.R.layout.activity_list_item, android.R.id.list, hscore);
	 */

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		HighScore entry = mList.get(position);
		if (convertView == null) {
			LayoutInflater inflater = LayoutInflater.from(mContext);
			convertView = inflater.inflate(R.layout.listscore, null);

		}

		TextView score = (TextView) convertView.findViewById(R.id.textView1);

		score.setText(entry.getScore());

		return convertView;
	}
}
