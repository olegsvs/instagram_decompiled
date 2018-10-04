package com.facebook.audiofiltercore;

public interface AudioOutput {
    void flush();

    void write(short[] sArr, int i);
}
