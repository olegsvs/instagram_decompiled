package com.facebook.react.views.slider;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.facebook.common.dextricks.StartupQEsConfig;

public final class ReactSlider extends SeekBar {
    private static int DEFAULT_TOTAL_STEPS = 128;
    private double mMaxValue = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    private double mMinValue = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    private double mStep = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    private double mStepCalculated = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    private double mValue = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;

    public ReactSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private double getStepValue() {
        double d = this.mStep;
        return d > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED ? d : this.mStepCalculated;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.mMaxValue - this.mMinValue) / getStepValue());
    }

    public void setMaxValue(double d) {
        this.mMaxValue = d;
        updateAll();
    }

    public void setMinValue(double d) {
        this.mMinValue = d;
        updateAll();
    }

    public void setStep(double d) {
        this.mStep = d;
        updateAll();
    }

    public void setValue(double d) {
        this.mValue = d;
        updateValue();
    }

    public final double toRealProgress(int i) {
        if (i == getMax()) {
            return this.mMaxValue;
        }
        double d = (double) i;
        double stepValue = getStepValue();
        Double.isNaN(d);
        return (d * stepValue) + this.mMinValue;
    }

    private void updateAll() {
        if (this.mStep == StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            double d = this.mMaxValue - this.mMinValue;
            double d2 = (double) DEFAULT_TOTAL_STEPS;
            Double.isNaN(d2);
            this.mStepCalculated = d / d2;
        }
        setMax(getTotalSteps());
        updateValue();
    }

    private void updateValue() {
        double d = this.mValue;
        double d2 = this.mMinValue;
        d = (d - d2) / (this.mMaxValue - d2);
        double totalSteps = (double) getTotalSteps();
        Double.isNaN(totalSteps);
        setProgress((int) Math.round(d * totalSteps));
    }
}
