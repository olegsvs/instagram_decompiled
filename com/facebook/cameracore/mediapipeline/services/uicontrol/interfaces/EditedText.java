package com.facebook.cameracore.mediapipeline.services.uicontrol.interfaces;

public class EditedText {
    private final String mText;
    private final int[] mWrappedLineIndices;

    public String getText() {
        return this.mText;
    }

    public int[] getWrappedLineIndices() {
        return this.mWrappedLineIndices;
    }
}
