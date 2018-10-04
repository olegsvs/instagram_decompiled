package X;

import java.io.File;

/* renamed from: X.2j3 */
public final class AnonymousClass2j3 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3rt f32965B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1rT f32966C;
    /* renamed from: D */
    public final /* synthetic */ File f32967D;

    public AnonymousClass2j3(AnonymousClass3rt anonymousClass3rt, File file, AnonymousClass1rT anonymousClass1rT) {
        this.f32965B = anonymousClass3rt;
        this.f32967D = file;
        this.f32966C = anonymousClass1rT;
    }

    public final void run() {
        AnonymousClass3rt anonymousClass3rt = this.f32965B;
        File file = this.f32967D;
        AnonymousClass1rT anonymousClass1rT = this.f32966C;
        if (anonymousClass3rt.f45528T == AnonymousClass2jF.RECORDING) {
            AnonymousClass3rt.m20971B(anonymousClass3rt);
            throw new IllegalStateException("Recording video has already started");
        } else if (anonymousClass3rt.f45528T != AnonymousClass2jF.PREPARED) {
            AnonymousClass2jE anonymousClass2jE = anonymousClass3rt.f45531W;
            if (anonymousClass2jE != null) {
                AnonymousClass3rt.m20982M(anonymousClass3rt, anonymousClass2jE, null, anonymousClass3rt.f45525Q, new AnonymousClass2it(anonymousClass3rt, file, anonymousClass1rT), false);
                return;
            }
            AnonymousClass3rt.m20971B(anonymousClass3rt);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Prepare has never been called before calling start. Current state: ");
            stringBuilder.append(anonymousClass3rt.f45528T);
            throw new IllegalStateException(stringBuilder.toString());
        } else {
            AnonymousClass3rt.m20983N(anonymousClass3rt, file, anonymousClass1rT);
        }
    }
}
