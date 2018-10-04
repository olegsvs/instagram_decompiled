package android.support.constraint;

import X.AnonymousClass1kc;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class Guideline extends View {
    public final void draw(Canvas canvas) {
    }

    public void setVisibility(int i) {
    }

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        AnonymousClass1kc anonymousClass1kc = (AnonymousClass1kc) getLayoutParams();
        anonymousClass1kc.f22149V = i;
        setLayoutParams(anonymousClass1kc);
    }

    public void setGuidelineEnd(int i) {
        AnonymousClass1kc anonymousClass1kc = (AnonymousClass1kc) getLayoutParams();
        anonymousClass1kc.f22150W = i;
        setLayoutParams(anonymousClass1kc);
    }

    public void setGuidelinePercent(float f) {
        AnonymousClass1kc anonymousClass1kc = (AnonymousClass1kc) getLayoutParams();
        anonymousClass1kc.f22151X = f;
        setLayoutParams(anonymousClass1kc);
    }
}
