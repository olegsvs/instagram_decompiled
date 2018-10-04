package X;

import android.graphics.Rect;
import android.view.View;
import android.widget.Adapter;
import android.widget.ListView;
import java.util.UUID;

/* renamed from: X.4pF */
public final class AnonymousClass4pF {
    /* renamed from: B */
    public final Adapter f57660B;
    /* renamed from: C */
    public final AnonymousClass0EE f57661C;
    /* renamed from: D */
    public String f57662D;
    /* renamed from: E */
    public final AnonymousClass0fQ f57663E;
    /* renamed from: F */
    public long f57664F;
    /* renamed from: G */
    public String f57665G;
    /* renamed from: H */
    public int f57666H;
    /* renamed from: I */
    public String f57667I;
    /* renamed from: J */
    public boolean f57668J;
    /* renamed from: K */
    public boolean f57669K;
    /* renamed from: L */
    public ListView f57670L;
    /* renamed from: M */
    public final Rect f57671M;
    /* renamed from: N */
    private final AnonymousClass0iE f57672N;

    public AnonymousClass4pF(AnonymousClass0EE anonymousClass0EE, AnonymousClass0Rq anonymousClass0Rq, AnonymousClass0iE anonymousClass0iE) {
        this(anonymousClass0EE, anonymousClass0Rq, anonymousClass0iE, new AnonymousClass0fS(), new Rect());
    }

    public AnonymousClass4pF(AnonymousClass0EE anonymousClass0EE, Adapter adapter, AnonymousClass0iE anonymousClass0iE, AnonymousClass0fQ anonymousClass0fQ, Rect rect) {
        this.f57669K = true;
        this.f57661C = anonymousClass0EE;
        this.f57660B = adapter;
        this.f57672N = anonymousClass0iE;
        this.f57663E = anonymousClass0fQ;
        this.f57671M = rect;
        this.f57662D = UUID.randomUUID().toString();
    }

    /* renamed from: A */
    public final void m25161A(String str) {
        this.f57667I = str;
        this.f57664F = this.f57663E.now();
        this.f57668J = false;
        if (!this.f57669K) {
            this.f57662D = UUID.randomUUID().toString();
        }
        this.f57669K = false;
        if (this.f57670L != null) {
            m25160C();
            AnonymousClass0EE anonymousClass0EE = this.f57661C;
            String str2 = this.f57662D;
            String str3 = this.f57667I;
            AnonymousClass0NN.B("chaining_feed_session_start", anonymousClass0EE).F("chaining_session_id", str2).F("parent_m_pk", str3).F("m_pk", this.f57665G).R();
        }
    }

    /* renamed from: B */
    private int m25159B(int i) {
        Object item = this.f57660B.getItem(i);
        if (item instanceof AnonymousClass0P7) {
            return this.f57672N.RO((AnonymousClass0P7) item).f9717z;
        }
        return -1;
    }

    /* renamed from: B */
    public final void m25162B() {
        ListView listView = this.f57670L;
        if (listView != null) {
            if (listView.getLastVisiblePosition() >= 0) {
                m25160C();
                AnonymousClass0EE anonymousClass0EE = this.f57661C;
                String str = this.f57662D;
                String str2 = this.f57667I;
                String str3 = this.f57665G;
                long now = this.f57663E.now() - this.f57664F;
                AnonymousClass0NN.B("chaining_feed_session_summary", anonymousClass0EE).F("chaining_session_id", str).F("parent_m_pk", str2).F("m_pk", str3).B("chaining_position", m25159B(this.f57666H)).C("time_spent", now).R();
            }
        }
    }

    /* renamed from: C */
    private void m25160C() {
        int firstVisiblePosition = this.f57670L.getFirstVisiblePosition();
        int lastVisiblePosition = this.f57670L.getLastVisiblePosition() - firstVisiblePosition;
        int i = firstVisiblePosition;
        float f = 0.0f;
        for (int i2 = 0; i2 <= lastVisiblePosition; i2++) {
            View childAt = this.f57670L.getChildAt(i2);
            if (childAt != null && ((childAt.getTag() instanceof AnonymousClass0q0) || (childAt.getTag() instanceof AnonymousClass0q2))) {
                childAt.getGlobalVisibleRect(this.f57671M);
                float height = ((float) this.f57671M.height()) / ((float) childAt.getHeight());
                if (height > f) {
                    i = i2 + firstVisiblePosition;
                    f = height;
                }
            }
        }
        Object item = this.f57660B.getItem(i);
        String NO = item instanceof AnonymousClass0P7 ? ((AnonymousClass0P7) item).NO() : null;
        if (NO != null) {
            this.f57665G = NO;
            this.f57666H = i;
        } else if (this.f57665G == null) {
            this.f57665G = this.f57667I;
            this.f57666H = 0;
        }
    }

    /* renamed from: D */
    public final void m25163D() {
        if (!this.f57668J) {
            ListView listView = this.f57670L;
            if (listView != null) {
                int lastVisiblePosition = listView.getLastVisiblePosition() - 1;
                Object item = this.f57660B.getItem(lastVisiblePosition);
                if (item instanceof AnonymousClass0P7) {
                    AnonymousClass0EE anonymousClass0EE = this.f57661C;
                    String str = this.f57662D;
                    String str2 = this.f57667I;
                    AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) item;
                    String NO = anonymousClass0P7.NO();
                    int A = anonymousClass0P7.TO().A();
                    AnonymousClass0NN.B("explore_chain_end", anonymousClass0EE).F("chaining_session_id", str).F("parent_m_pk", str2).F("m_pk", NO).B("m_t", A).B("chaining_position", m25159B(lastVisiblePosition)).R();
                    this.f57668J = true;
                }
            }
        }
    }
}
