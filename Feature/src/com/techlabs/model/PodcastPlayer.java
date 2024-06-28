package com.techlabs.model;

public class PodcastPlayer extends MediaPlayer {
    @Override
    public void supportedFiles() {
        System.out.println("PodcastPlayer supports: mp3, aac");
    }

    @Override
    public void start() {
        System.out.println("PodcastPlayer starting...");
    }

    @Override
    public void stop() {
        System.out.println("PodcastPlayer stopping...");
    }
}
