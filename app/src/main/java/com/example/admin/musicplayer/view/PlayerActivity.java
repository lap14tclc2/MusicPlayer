package com.example.admin.musicplayer.view;

import android.graphics.Color;
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
import com.example.admin.musicplayer.controller.SongManager;
import com.example.admin.musicplayer.model.SongModel;

import java.util.ArrayList;

public class PlayerActivity extends AppCompatActivity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener,
        MediaPlayer.OnCompletionListener{
    public static final int SELECT_SONG_REQUEST = 0;
    private Toolbar toolBar;
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
    private ImageView backwardButton;
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
        toolBar = (Toolbar) findViewById(R.id.title_tb);
        toolBar.setTitle("Mp3 Player");
        toolBar.setTitleTextColor(Color.BLACK);
        toolBar.setNavigationIcon(R.drawable.icon_app);
        setSupportActionBar(toolBar);
        //get all song from sd card

        SongManager songManager = new SongManager();
        arrSongs = songManager.getPlayList();

        //Media player is used to play music
        mediaPlayer = new MediaPlayer();

        // map views to player_activity_xml
        playButton=(ImageView) findViewById(R.id.btn_play);
        nextButton=(ImageView) findViewById(R.id.btn_next_song);
        previousButton=(ImageView) findViewById(R.id.btn_back_song);
        forwardButton=(ImageView) findViewById(R.id.btn_forward);
        backwardButton=(ImageView) findViewById(R.id.btn_rewind);
        songProgressBar=(SeekBar) findViewById(R.id.progress_seekbar);
        currentDurationTextView=(TextView) findViewById(R.id.tv_current_time);
        totalDurationTextView=(TextView) findViewById(R.id.tv_total_time);
        // call event listener of each view
        playButton.setOnClickListener(this);
        forwardButton.setOnClickListener(this);
        backwardButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
        previousButton.setOnClickListener(this);
        
        songProgressBar.setOnSeekBarChangeListener(this);// bat su kien de user biet bai hat dang tua den dau
        mediaPlayer.setOnCompletionListener(this);// su kien de biet khi nao mediaplayer choi xong 1 bai nhac
        
        playSong(currentSongIndex);


    }

    private void playSong(int currentSongIndex) {
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
