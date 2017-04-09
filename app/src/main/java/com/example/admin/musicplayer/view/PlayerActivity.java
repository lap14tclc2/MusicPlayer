package com.example.admin.musicplayer.view;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.admin.musicplayer.R;
import com.example.admin.musicplayer.model.SongModel;

import java.util.ArrayList;

public class PlayerActivity extends AppCompatActivity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener,
        MediaPlayer.OnCompletionListener{
    public static final int SELECT_SONG_REQUEST = 0;
    private Toolbar toolbar;
    private SongModel playingSong;
    public static ArrayList<SongModel> arrSongs = new ArrayList<>();
    private int seekForwardTime = 5000; // 5000 milliseconds
    private int seekBackwardTime=5000; // 5000 milliseconds
    private int currentSongIndex = 0;
    // Media Player
    private  MediaPlayer mediaPlayer;
    //Handler to update UI timer, progress bar etc....
    private Handler mHandler = new Handler();
    private ImageView playButton;
    private ImageView forwardButton;
    private ImageView nextButton;
    private ImageView previousButton;
    private SeekBar songProgressBar;
    private TextView currentDurationTextView;
    private TextView totalDurationTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        //get action bar
    }

    @Override
    public void onCompletion(MediaPlayer mp) {

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
