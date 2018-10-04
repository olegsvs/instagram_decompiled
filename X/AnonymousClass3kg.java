package X;

import android.database.DataSetObserver;

/* renamed from: X.3kg */
public final class AnonymousClass3kg extends DataSetObserver {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3kj f44053B;

    public AnonymousClass3kg(AnonymousClass3kj anonymousClass3kj) {
        this.f44053B = anonymousClass3kj;
    }

    public final void onChanged() {
        super.onChanged();
        if (this.f44053B.f44073O != AnonymousClass3ki.IDLE) {
            this.f44053B.f44066H = true;
        }
    }

    public final void onInvalidated() {
        super.onInvalidated();
        if (this.f44053B.f44073O != AnonymousClass3ki.IDLE) {
            this.f44053B.f44066H = true;
        }
    }
}
