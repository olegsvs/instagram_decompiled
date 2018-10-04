package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.2zI */
public final class AnonymousClass2zI implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Ci f36646B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0x5 f36647C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Cm f36648D;

    public AnonymousClass2zI(AnonymousClass0x5 anonymousClass0x5, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci) {
        this.f36647C = anonymousClass0x5;
        this.f36648D = anonymousClass0Cm;
        this.f36646B = anonymousClass0Ci;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        AnonymousClass0x5 anonymousClass0x5 = this.f36647C;
        Object obj = this.f36648D;
        Object obj2 = this.f36646B;
        synchronized (anonymousClass0x5.f12471C) {
            anonymousClass0x5.f12471C.put(obj2.getId(), AnonymousClass2zD.OVER_AGE.m18132A());
        }
        String id = obj2.getId();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(obj);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        AnonymousClass0GA H = anonymousClass0Pt.L("friendships/%s/%s/follow/", new Object[]{AnonymousClass2zD.OVER_AGE.m18132A(), id}).D(MemoryDumpUploadJob.EXTRA_USER_ID, id).M(AnonymousClass3lU.class).N().H();
        H.f2849B = new AnonymousClass3lS(anonymousClass0x5.f12470B, obj, obj2, AnonymousClass2zD.OVER_AGE.m18132A(), null, AnonymousClass0x5.B());
        anonymousClass0x5.f12472D.schedule(H);
    }
}
