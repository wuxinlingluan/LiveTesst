package com.github.livetesst.activity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.github.livetesst.R;

import static com.ksyun.media.streamer.publisher.RtmpPubWrapper.p;


public class Fragment3 extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstancetate) {
	View view= inflater.inflate(R.layout.fragment3, null);
		Button bt= (Button) view.findViewById(R.id.bt);
		bt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(getActivity(),LiveActivity.class));
			}
		});
		return view;
	}

}