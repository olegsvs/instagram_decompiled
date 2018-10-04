package com.facebook.cameracore.mediapipeline.dataproviders.doodling.interfaces;

import X.AnonymousClass1xy;
import X.AnonymousClass1xz;
import X.AnonymousClass1y0;
import X.AnonymousClass1y1;

public class ARDoodleData {
    public final AnonymousClass1y1 mDoodleData;
    private int mIteratorIndex;

    public ARDoodleData() {
        this.mDoodleData = new AnonymousClass1y1();
    }

    public ARDoodleData(AnonymousClass1y1 anonymousClass1y1) {
        this.mDoodleData = anonymousClass1y1;
    }

    /* renamed from: B */
    private int m13527B() {
        return getCurrentLine().f24826D.size();
    }

    public void addPoints(float f, float f2, long j) {
        this.mDoodleData.f24830B.f24826D.add(new AnonymousClass1y0(f, f2, j));
    }

    public int getCurrentBrushColor() {
        return getCurrentLine().f24825C;
    }

    public float getCurrentBrushSize() {
        return getCurrentLine().f24827E;
    }

    public int getCurrentBrushType() {
        return getCurrentLine().f24824B.m13930A();
    }

    private AnonymousClass1xz getCurrentLine() {
        return (AnonymousClass1xz) this.mDoodleData.f24831C.get(this.mIteratorIndex);
    }

    public float[] getPoints() {
        float[] fArr = new float[(m13527B() * 2)];
        int i = 0;
        for (AnonymousClass1y0 anonymousClass1y0 : getCurrentLine().f24826D) {
            fArr[i] = anonymousClass1y0.f24828B;
            fArr[i + 1] = anonymousClass1y0.f24829C;
            i += 2;
        }
        return fArr;
    }

    public float getScreenHeight() {
        return this.mDoodleData.f24833E;
    }

    public float getScreenWidth() {
        return this.mDoodleData.f24834F;
    }

    public void newStroke(int i, int i2, float f) {
        AnonymousClass1y1 anonymousClass1y1 = this.mDoodleData;
        anonymousClass1y1.f24830B = new AnonymousClass1xz(AnonymousClass1xy.m13929B(i), i2, f);
        anonymousClass1y1.f24831C.add(anonymousClass1y1.f24830B);
    }

    public boolean next() {
        this.mIteratorIndex++;
        if (this.mDoodleData.f24831C.size() <= this.mIteratorIndex) {
            return false;
        }
        return true;
    }

    public void startIterator() {
        this.mIteratorIndex = 0;
    }
}
