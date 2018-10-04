package X;

import com.facebook.cameracore.assets.model.ARRequestAsset;
import java.io.File;

/* renamed from: X.2gY */
public final class AnonymousClass2gY implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ ARRequestAsset f32394B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2hQ f32395C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass3rI f32396D;
    /* renamed from: E */
    public final /* synthetic */ File f32397E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass3r9 f32398F;

    public AnonymousClass2gY(AnonymousClass3rA anonymousClass3rA, AnonymousClass3r9 anonymousClass3r9, AnonymousClass3rI anonymousClass3rI, ARRequestAsset aRRequestAsset, File file, AnonymousClass2hQ anonymousClass2hQ) {
        this.f32398F = anonymousClass3r9;
        this.f32396D = anonymousClass3rI;
        this.f32394B = aRRequestAsset;
        this.f32397E = file;
        this.f32395C = anonymousClass2hQ;
    }

    public final void run() {
        if (this.f32398F.zD()) {
            this.f32396D.m20929A(this.f32394B, this.f32397E, this.f32395C);
        }
    }
}
