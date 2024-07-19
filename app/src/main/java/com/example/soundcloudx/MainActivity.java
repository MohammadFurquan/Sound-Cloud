package com.example.soundcloudx;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


   MediaPlayer playSound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void soundButton(View view){


        ImageView screenImages = (ImageView)view;

        String tValue = screenImages.getTag().toString();

        int tvalueT = Integer.parseInt(tValue);

        soundPlay(tvalueT);


    }


    public void soundPlay(int tagValue){

        if(tagValue == 0){

            playSound = MediaPlayer.create(getApplicationContext(),R.raw.onee);

            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });
            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {

                    releaseAndStop();
                }
            });



        }else if(tagValue == 1){

            playSound = MediaPlayer.create(getApplicationContext(),R.raw.twoo);

            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });
            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {

                    releaseAndStop();
                }
            });


        }else if(tagValue == 2){

            playSound = MediaPlayer.create(getApplicationContext(),R.raw.threee);

            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });
            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {

                    releaseAndStop();
                }
            });


        }else if(tagValue == 3){

            playSound = MediaPlayer.create(getApplicationContext(),R.raw.fourr);

            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });
            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {

                    releaseAndStop();
                }
            });


        }else if(tagValue == 4){

            playSound = MediaPlayer.create(getApplicationContext(),R.raw.fivee);

            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });
            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {

                    releaseAndStop();
                }
            });



        }else if(tagValue == 5){

            playSound = MediaPlayer.create(getApplicationContext(),R.raw.sixx);

            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });
            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {

                    releaseAndStop();
                }
            });



        }else if (tagValue == 6){

            playSound = MediaPlayer.create(getApplicationContext(),R.raw.sevenn);

            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });
            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {

                    releaseAndStop();
                }
            });


        }else if(tagValue == 7){


            playSound = MediaPlayer.create(getApplicationContext(),R.raw.eightt);

            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });
            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {

                    releaseAndStop();
                }
            });


        }else{

            playSound = MediaPlayer.create(getApplicationContext(),R.raw.ninee);

            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });
            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {

                    releaseAndStop();
                }
            });





        }



    }

    @Override
    protected  void onStop() {
    releaseAndStop();

        super.onStop();
    }

    public void releaseAndStop(){

        if(playSound != null){

            playSound.stop();
            playSound.release();


        }

    }



}
