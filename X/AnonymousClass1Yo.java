package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import java.text.NumberFormat;

/* renamed from: X.1Yo */
public final class AnonymousClass1Yo extends RelativeLayout {
    /* renamed from: B */
    public AnonymousClass3MW f20097B;
    /* renamed from: C */
    public TextView f20098C;
    /* renamed from: D */
    public TextView f20099D;
    /* renamed from: E */
    public Paint f20100E;
    /* renamed from: F */
    public Paint f20101F;
    /* renamed from: G */
    private int f20102G;

    public AnonymousClass1Yo(Context context) {
        this(context, null);
    }

    public AnonymousClass1Yo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, C0164R.layout.result_row_view, this);
        Resources resources = context.getResources();
        Paint paint = new Paint();
        this.f20100E = paint;
        paint.setColor(AnonymousClass0Ca.m937C(context, C0164R.color.grey_1));
        this.f20100E.setStrokeWidth((float) resources.getDimensionPixelSize(C0164R.dimen.result_bar_width));
        paint = new Paint();
        this.f20101F = paint;
        paint.setColor(AnonymousClass0Ca.m937C(context, C0164R.color.result_bar_active_color));
        this.f20101F.setStrokeWidth((float) resources.getDimensionPixelSize(C0164R.dimen.result_bar_width));
        this.f20099D = (TextView) findViewById(C0164R.id.response);
        this.f20098C = (TextView) findViewById(C0164R.id.percent);
    }

    /* renamed from: B */
    private void m11856B() {
        this.f20098C.setText(getPercentageRounded());
        LayoutParams layoutParams = (LayoutParams) this.f20098C.getLayoutParams();
        layoutParams.addRule(8, this.f20099D.getId());
        this.f20098C.setLayoutParams(layoutParams);
    }

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas);
        canvas2.drawLine((float) getLeftBound(), (float) getPositionLineY(), (float) (getLeftBound() + getBarFullWidthPx()), (float) getPositionLineY(), this.f20100E);
        canvas2.drawLine((float) getLeftBound(), (float) getPositionLineY(), (float) (getLeftBound() + getResultBarEndPositionX()), (float) getPositionLineY(), this.f20101F);
    }

    private int getBarFullWidthPx() {
        return getWidth() - (getLeftBound() * 2);
    }

    private int getLeftBound() {
        return getResources().getDimensionPixelSize(C0164R.dimen.result_bar_horizontal_offset_padding);
    }

    private String getPercentageRounded() {
        return NumberFormat.getPercentInstance().format((double) (((float) getResponders()) / ((float) this.f20102G)));
    }

    private int getPositionLineY() {
        return this.f20099D.getBottom() + getResources().getDimensionPixelSize(C0164R.dimen.response_text_row_horizontal_offset);
    }

    private int getResponders() {
        return this.f20097B.f40457C;
    }

    private int getResultBarEndPositionX() {
        return Math.round((((float) getBarFullWidthPx()) * ((float) getResponders())) / ((float) this.f20102G));
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.m5864N(this, -144233644);
        super.onSizeChanged(i, i2, i3, i4);
        setMinimumHeight(i2 + getResources().getDimensionPixelSize(C0164R.dimen.result_bar_height));
        AnonymousClass0cQ.m5865O(this, 1542421653, N);
    }

    public void setAnswer(AnonymousClass3MW anonymousClass3MW) {
        this.f20097B = anonymousClass3MW;
        this.f20099D.setText(this.f20097B.f40458D);
    }

    public void setTotalQuestionResponders(int i) {
        this.f20102G = i;
        m11856B();
    }
}
