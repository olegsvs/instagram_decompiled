package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.arlink.model.ArLinkCandidate;
import com.instagram.arlink.model.ArLinkTextBox;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.31E */
public final class AnonymousClass31E extends View {
    /* renamed from: B */
    public int f36977B;
    /* renamed from: C */
    public final Set f36978C = new HashSet();
    /* renamed from: D */
    public final Object f36979D = new Object();
    /* renamed from: E */
    public String f36980E;
    /* renamed from: F */
    public int f36981F;
    /* renamed from: G */
    public int f36982G;
    /* renamed from: H */
    public int f36983H;
    /* renamed from: I */
    public Paint f36984I;
    /* renamed from: J */
    public final Point f36985J = new Point();
    /* renamed from: K */
    public Paint f36986K;
    /* renamed from: L */
    public float f36987L;
    /* renamed from: M */
    public Paint f36988M;
    /* renamed from: N */
    private final Rect f36989N = new Rect();
    /* renamed from: O */
    private final List f36990O = new ArrayList();
    /* renamed from: P */
    private float f36991P = 1.0f;
    /* renamed from: Q */
    private final RectF f36992Q = new RectF();
    /* renamed from: R */
    private final RectF f36993R = new RectF();
    /* renamed from: S */
    private float f36994S = 1.0f;

    public AnonymousClass31E(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f36984I = paint;
        paint.setColor(-1);
        this.f36984I.setStyle(Style.STROKE);
        this.f36984I.setStrokeWidth(4.0f);
        this.f36987L = AnonymousClass0Nm.C(getContext(), 60);
        Resources resources = getResources();
        float applyDimension = TypedValue.applyDimension(0, (float) resources.getDimensionPixelSize(C0164R.dimen.font_medium_large), resources.getDisplayMetrics());
        paint = new Paint();
        this.f36988M = paint;
        paint.setColor(-1);
        this.f36988M.setTextSize(applyDimension);
        this.f36988M.setTextAlign(Align.RIGHT);
        Paint paint2 = new Paint();
        this.f36986K = paint2;
        paint2.setColor(1308622847);
        this.f36986K.setStyle(Style.FILL);
    }

    /* renamed from: B */
    public static RectF m18215B(AnonymousClass31E anonymousClass31E, RectF rectF, Point point) {
        anonymousClass31E.f36993R.set(((float) anonymousClass31E.getWidth()) - ((rectF.centerY() + (((float) point.y) / 2.0f)) * anonymousClass31E.f36991P), (rectF.centerX() - (((float) point.x) / 2.0f)) * anonymousClass31E.f36994S, ((float) anonymousClass31E.getWidth()) - ((rectF.centerY() - (((float) point.y) / 2.0f)) * anonymousClass31E.f36991P), (rectF.centerX() + (((float) point.x) / 2.0f)) * anonymousClass31E.f36994S);
        return anonymousClass31E.f36993R;
    }

    /* renamed from: C */
    private void m18216C(Canvas canvas) {
        if (!TextUtils.isEmpty(this.f36980E)) {
            Paint paint = this.f36988M;
            String str = this.f36980E;
            paint.getTextBounds(str, 0, str.length(), this.f36989N);
            this.f36992Q.set(((float) (canvas.getWidth() - this.f36989N.width())) / 2.0f, this.f36987L, ((float) (canvas.getWidth() + this.f36989N.width())) / 2.0f, this.f36987L + ((float) this.f36989N.height()));
            this.f36992Q.inset(-20.0f, -20.0f);
            canvas.drawRoundRect(this.f36992Q, 10.0f, 10.0f, this.f36986K);
            canvas.drawText(this.f36980E, this.f36992Q.right - 20.0f, (this.f36992Q.top + ((float) this.f36989N.height())) + 20.0f, this.f36988M);
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        synchronized (this.f36979D) {
            for (ArLinkCandidate arLinkCandidate : this.f36978C) {
                float rotationDegree = arLinkCandidate.getRotationDegree();
                RectF iconRect = arLinkCandidate.getIconRect();
                double toRadians = Math.toRadians((double) rotationDegree);
                double width = (double) ((iconRect.width() + iconRect.height()) * 0.5f);
                double abs = Math.abs(Math.sin(toRadians)) + Math.abs(Math.cos(toRadians));
                Double.isNaN(width);
                width /= abs;
                Point point = this.f36985J;
                int i = (int) width;
                point.x = i;
                point.y = i;
                iconRect = AnonymousClass31E.m18215B(this, arLinkCandidate.getIconRect(), point);
                canvas.save();
                float f = -rotationDegree;
                canvas.rotate(f, iconRect.centerX(), iconRect.centerY());
                canvas.drawRoundRect(iconRect, 10.0f, 10.0f, this.f36984I);
                canvas.restore();
                for (ArLinkTextBox arLinkTextBox : arLinkCandidate.getTextBoxes()) {
                    iconRect = AnonymousClass31E.m18215B(this, arLinkTextBox.getTextRect(), arLinkTextBox.getSize());
                    canvas.save();
                    canvas.rotate(f, iconRect.centerX(), iconRect.centerY());
                    canvas.drawRoundRect(iconRect, 10.0f, 10.0f, this.f36984I);
                    canvas.restore();
                }
            }
            m18216C(canvas);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 1483202377);
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            int i5 = this.f36983H;
            if (i5 > 0) {
                int i6 = this.f36982G;
                if (i6 > 0) {
                    this.f36994S = ((float) i2) / ((float) i5);
                    this.f36991P = ((float) i) / ((float) i6);
                }
            }
        }
        AnonymousClass0cQ.O(this, -1934120236, N);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCandidates(java.util.List r7) {
        /*
        r6 = this;
        r3 = r6.f36979D;
        monitor-enter(r3);
        r0 = r6.f36990O;	 Catch:{ all -> 0x009f }
        r0.clear();	 Catch:{ all -> 0x009f }
        r2 = r7.iterator();	 Catch:{ all -> 0x009f }
    L_0x000c:
        r0 = r2.hasNext();	 Catch:{ all -> 0x009f }
        r5 = 1065017672; // 0x3f7ae148 float:0.98 double:5.26188644E-315;
        if (r0 == 0) goto L_0x0033;
    L_0x0015:
        r1 = r2.next();	 Catch:{ all -> 0x009f }
        r1 = (com.instagram.arlink.model.ArLinkCandidate) r1;	 Catch:{ all -> 0x009f }
        r0 = r1.getConfidenceScore();	 Catch:{ all -> 0x009f }
        r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
        if (r0 <= 0) goto L_0x000c;
    L_0x0023:
        r0 = r1.getTextBoxes();	 Catch:{ all -> 0x009f }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x009f }
        if (r0 != 0) goto L_0x000c;
    L_0x002d:
        r0 = r6.f36990O;	 Catch:{ all -> 0x009f }
        r0.add(r1);	 Catch:{ all -> 0x009f }
        goto L_0x000c;
    L_0x0033:
        r0 = r6.f36990O;	 Catch:{ all -> 0x009f }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x009f }
        r4 = 0;
        if (r0 == 0) goto L_0x0045;
    L_0x003c:
        r1 = r6.f36977B;	 Catch:{ all -> 0x009f }
        r0 = r1 + 1;
        r6.f36977B = r0;	 Catch:{ all -> 0x009f }
        r0 = 3;
        if (r1 <= r0) goto L_0x004c;
    L_0x0045:
        r6.f36977B = r4;	 Catch:{ all -> 0x009f }
        r0 = r6.f36978C;	 Catch:{ all -> 0x009f }
        r0.clear();	 Catch:{ all -> 0x009f }
    L_0x004c:
        r1 = r6.f36978C;	 Catch:{ all -> 0x009f }
        r0 = r6.f36990O;	 Catch:{ all -> 0x009f }
        r1.addAll(r0);	 Catch:{ all -> 0x009f }
        r0 = r6.f36980E;	 Catch:{ all -> 0x009f }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x009f }
        if (r0 == 0) goto L_0x008c;
    L_0x005b:
        r0 = r6.f36990O;	 Catch:{ all -> 0x009f }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x009f }
        if (r0 == 0) goto L_0x008c;
    L_0x0063:
        r0 = r7.isEmpty();	 Catch:{ all -> 0x009f }
        if (r0 != 0) goto L_0x008c;
    L_0x0069:
        r0 = r7.get(r4);	 Catch:{ all -> 0x009f }
        r0 = (com.instagram.arlink.model.ArLinkCandidate) r0;	 Catch:{ all -> 0x009f }
        r2 = r0.getConfidenceScore();	 Catch:{ all -> 0x009f }
        r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r0 >= 0) goto L_0x008c;
    L_0x0077:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009f }
        r1.<init>();	 Catch:{ all -> 0x009f }
        r0 = "Low detection score: ";
        r1.append(r0);	 Catch:{ all -> 0x009f }
        r1.append(r2);	 Catch:{ all -> 0x009f }
        r0 = r1.toString();	 Catch:{ all -> 0x009f }
        r6.f36980E = r0;	 Catch:{ all -> 0x009f }
        r6.f36981F = r4;	 Catch:{ all -> 0x009f }
    L_0x008c:
        r1 = r6.f36981F;	 Catch:{ all -> 0x009f }
        r0 = r1 + 1;
        r6.f36981F = r0;	 Catch:{ all -> 0x009f }
        r0 = 5;
        if (r1 <= r0) goto L_0x009a;
    L_0x0095:
        r6.f36981F = r4;	 Catch:{ all -> 0x009f }
        r0 = 0;
        r6.f36980E = r0;	 Catch:{ all -> 0x009f }
    L_0x009a:
        monitor-exit(r3);	 Catch:{ all -> 0x009f }
        r6.postInvalidate();
        return;
    L_0x009f:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x009f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.31E.setCandidates(java.util.List):void");
    }

    public void setMessage(String str) {
        synchronized (this.f36979D) {
            this.f36980E = str;
            this.f36981F = 0;
        }
        postInvalidate();
    }
}
