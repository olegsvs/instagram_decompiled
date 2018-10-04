package X;

/* renamed from: X.4vc */
public final class AnonymousClass4vc implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Z8 f58520B;

    public AnonymousClass4vc(AnonymousClass1Z8 anonymousClass1Z8) {
        this.f58520B = anonymousClass1Z8;
    }

    public final void run() {
        if (this.f58520B.f20136J != null) {
            int height = (int) ((this.f58520B.f20128B.f17206C * ((float) this.f58520B.f20137K.getHeight())) + 0.5f);
            AnonymousClass1QG anonymousClass1QG = this.f58520B.f20136J;
            anonymousClass1QG.f18347B = this.f58520B.f20134H.getBitmap(height, this.f58520B.f20137K.getHeight());
            anonymousClass1QG.invalidateSelf();
            this.f58520B.f20137K.invalidate();
        }
    }
}
