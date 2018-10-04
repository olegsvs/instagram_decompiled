package X;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.instagram.ui.widget.drawing.common.Point2;

/* renamed from: X.2Kw */
public final class AnonymousClass2Kw {
    /* renamed from: B */
    public PointF f29191B = new Point2();
    /* renamed from: C */
    public long f29192C;

    public AnonymousClass2Kw(MotionEvent motionEvent) {
        this.f29191B.set(motionEvent.getX(), motionEvent.getY());
        this.f29192C = motionEvent.getEventTime();
        motionEvent.getPressure();
        motionEvent.getSize();
    }

    public AnonymousClass2Kw(MotionEvent motionEvent, int i) {
        this.f29191B.set(motionEvent.getHistoricalX(i), motionEvent.getHistoricalY(i));
        this.f29192C = motionEvent.getHistoricalEventTime(i);
        motionEvent.getHistoricalSize(i);
        motionEvent.getHistoricalPressure(i);
    }
}
