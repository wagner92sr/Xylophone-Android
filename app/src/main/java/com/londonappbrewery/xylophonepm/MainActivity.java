package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC,0);

        mCSoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c, 1);
        mDSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d, 1);
        mESoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e, 1);
        mFSoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f, 1);
        mGSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g, 1);
        mASoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a, 1);
        mBSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b, 1);


    }

    public void playRed(View v){
        mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,PRIORITY);
    }

    public void playOrange(View v){
        mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,PRIORITY);
    }

    public void playYellow(View v){
        mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,PRIORITY);
    }

    public void playGreen(View v){
        mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,PRIORITY);
    }

    public void playDarkGreen(View v){
        mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,PRIORITY);
    }

    public void playBlue(View v){
        mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,PRIORITY);
    }

    public void playPurple(View v){
        mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,PRIORITY);
    }

}
