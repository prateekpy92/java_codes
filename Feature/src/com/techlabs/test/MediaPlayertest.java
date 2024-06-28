package com.techlabs.test;

import com.techlabs.model.AudioPlayer;
import com.techlabs.model.MediaPlayer;
import com.techlabs.model.PodcastPlayer;
import com.techlabs.model.VideoPlayer;

public class MediaPlayertest {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = (MediaPlayer) new AudioPlayer();
        mediaPlayer.supportedFiles();
        mediaPlayer.start();
        mediaPlayer.stop();

        mediaPlayer = (MediaPlayer) new VideoPlayer();
        mediaPlayer.supportedFiles();
        mediaPlayer.start();
        mediaPlayer.stop();

        mediaPlayer = new PodcastPlayer();
        mediaPlayer.supportedFiles();
        mediaPlayer.start();
        mediaPlayer.stop();
    }
}
