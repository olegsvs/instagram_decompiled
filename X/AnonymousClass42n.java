package X;

/* renamed from: X.42n */
public abstract class AnonymousClass42n extends AnonymousClass3oY implements AnonymousClass0OP {
    /* renamed from: B */
    public boolean f48842B;
    /* renamed from: C */
    private boolean f48843C;
    /* renamed from: D */
    private final AnonymousClass3q3 f48844D = new AnonymousClass3q3();

    /* renamed from: N */
    public void mo5327N() {
    }

    public final int yK() {
        return 0;
    }

    public AnonymousClass42n(AnonymousClass3oW anonymousClass3oW) {
        super(anonymousClass3oW);
    }

    /* renamed from: H */
    public final void mo5091H(Exception exception) {
        this.f48844D.m20871A(exception);
    }

    /* renamed from: M */
    public final boolean m22272M() {
        return this.f48842B && !this.f48843C;
    }

    public final void cancel() {
        AnonymousClass0Dc.P("AbstractFinalRenderController", "Cancelling final render");
        this.f48843C = true;
        this.f44808B.m20752A();
        mo5327N();
    }

    public final boolean tW() {
        return this.f48843C;
    }

    public final Exception wL() {
        return this.f48844D.f45122B;
    }

    public final void yWA() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r2 = r2.f44808B;
        r1 = r2.f44789D;
        monitor-enter(r1);
    L_0x0005:
        r0 = r2.f44791F;	 Catch:{ all -> 0x0011 }
        if (r0 != 0) goto L_0x000f;	 Catch:{ all -> 0x0011 }
    L_0x0009:
        r0 = r2.f44789D;	 Catch:{ InterruptedException -> 0x0005 }
        r0.wait();	 Catch:{ InterruptedException -> 0x0005 }
        goto L_0x0005;	 Catch:{ InterruptedException -> 0x0005 }
    L_0x000f:
        monitor-exit(r1);	 Catch:{ all -> 0x0011 }
        return;	 Catch:{ all -> 0x0011 }
    L_0x0011:
        r0 = move-exception;	 Catch:{ all -> 0x0011 }
        monitor-exit(r1);	 Catch:{ all -> 0x0011 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.42n.yWA():void");
    }
}
