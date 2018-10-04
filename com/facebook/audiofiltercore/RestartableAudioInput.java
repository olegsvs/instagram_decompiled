package com.facebook.audiofiltercore;

public interface RestartableAudioInput extends AudioInput {
    double getTimeElapsed();

    void restart();
}
