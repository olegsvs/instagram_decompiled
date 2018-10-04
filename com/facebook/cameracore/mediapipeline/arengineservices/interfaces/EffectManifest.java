package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.AnonymousClass2hr;

public class EffectManifest {
    public final AnonymousClass2hr specifiedCameraFacing;
    public final boolean supportsLandscape;
    public final boolean supportsLongPressGesture;
    public final boolean supportsPanGesture;
    public final boolean supportsPinchGesture;
    public final boolean supportsPortrait;
    public final boolean supportsRawTouchGesture;
    public final boolean supportsRotateGesture;
    public final boolean supportsTapGesture;

    public EffectManifest(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i) {
        this.supportsPortrait = z;
        this.supportsLandscape = z2;
        this.supportsTapGesture = z3;
        this.supportsPanGesture = z4;
        this.supportsPinchGesture = z5;
        this.supportsRotateGesture = z6;
        this.supportsLongPressGesture = z7;
        this.supportsRawTouchGesture = z8;
        switch (i) {
            case 0:
                this.specifiedCameraFacing = AnonymousClass2hr.FRONT;
                return;
            case 1:
                this.specifiedCameraFacing = AnonymousClass2hr.BACK;
                return;
            default:
                this.specifiedCameraFacing = AnonymousClass2hr.UNSPECIFIED;
                return;
        }
    }
}
