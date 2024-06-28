package com.techlabs.model;

public class AudioPlayer extends MediaPlayer {
    @Override
    public void supportedFiles() {
        System.out.println("AudioPlayer supports: mp3, wav");
    }

    @Override
    public void start() {
        System.out.println("AudioPlayer starting...");
    }

    @Override
    public void stop() {
        System.out.println("AudioPlayer stopping...");
    }
}
