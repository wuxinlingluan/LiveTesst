package com.github.livetesst.activity.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.livetesst.R;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;
import static com.ksyun.media.streamer.logstats.StatsConstant.AUDIO_BITRATE;
import static com.ksyun.media.streamer.logstats.StatsConstant.FRAME_RATE;
import static com.ksyun.media.streamer.logstats.StatsConstant.VIDEO_BITRATE;

public class CameraActivity extends AppCompatActivity {

    public final static String URL = "url";
    public final static String FRAME_RATE = "framerate";
    public final static String VIDEO_BITRATE = "video_bitrate";
    public final static String AUDIO_BITRATE = "audio_bitrate";
    public final static String VIDEO_RESOLUTION = "video_resolution";
    public final static String LANDSCAPE = "landscape";
    public final static String ENCDODE_METHOD = "encode_method";
    public final static String START_ATUO = "start_auto";
    public static final String SHOW_DEBUGINFO = "show_debuginfo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
    }

    public static void startActivity(Context context, int fromType,
                                     String rtmpUrl, int frameRate,
                                     int videoBitrate, int audioBitrate,
                                     int videoResolution, boolean isLandscape,
                                     int encodeMethod, boolean startAuto,
                                     boolean showDebugInfo) {
        Intent intent = new Intent(context, CameraActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("type", fromType);
        intent.putExtra(URL, rtmpUrl);
        intent.putExtra(FRAME_RATE, frameRate);
        intent.putExtra(VIDEO_BITRATE, videoBitrate);
        intent.putExtra(AUDIO_BITRATE, audioBitrate);
        intent.putExtra(VIDEO_RESOLUTION, videoResolution);
        intent.putExtra(LANDSCAPE, isLandscape);
        intent.putExtra(ENCDODE_METHOD, encodeMethod);
        intent.putExtra(START_ATUO, startAuto);
        intent.putExtra(SHOW_DEBUGINFO, showDebugInfo);
        context.startActivity(intent);

    }

}
