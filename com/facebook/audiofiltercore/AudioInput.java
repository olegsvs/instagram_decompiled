package com.facebook.audiofiltercore;

public interface AudioInput {
    void close();

    int read(short[] sArr, int i);
}
