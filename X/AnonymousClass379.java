package X;

import com.facebook.cameracore.assets.model.ARRequestAsset;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.379 */
public final class AnonymousClass379 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3xV f38001B;
    /* renamed from: C */
    public final /* synthetic */ ARRequestAsset f38002C;
    /* renamed from: D */
    public final /* synthetic */ AtomicBoolean f38003D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass3rG f38004E;

    public AnonymousClass379(AnonymousClass3xV anonymousClass3xV, ARRequestAsset aRRequestAsset, AnonymousClass3rG anonymousClass3rG, AtomicBoolean atomicBoolean) {
        this.f38001B = anonymousClass3xV;
        this.f38002C = aRRequestAsset;
        this.f38004E = anonymousClass3rG;
        this.f38003D = atomicBoolean;
    }

    public final void run() {
        AnonymousClass3xV.m21718B(this.f38001B, this.f38002C, this.f38004E, this.f38003D);
    }
}
