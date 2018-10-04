package X;

import com.facebook.video.heroplayer.service.HeroService;
import java.util.List;

/* renamed from: X.2pV */
public final class AnonymousClass2pV implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2pi f34510B;

    public AnonymousClass2pV(HeroService heroService, AnonymousClass2pi anonymousClass2pi) {
        this.f34510B = anonymousClass2pi;
    }

    public final void run() {
        AnonymousClass2pi anonymousClass2pi = this.f34510B;
        if (anonymousClass2pi != null) {
            anonymousClass2pi.f34616B.evictAll();
            anonymousClass2pi.f34617C.evictAll();
        }
        List<AnonymousClass2pe> list = AnonymousClass2pf.f34615B;
        synchronized (list) {
            for (AnonymousClass2pe anonymousClass2pe : list) {
                anonymousClass2pe.f34613C.release();
                anonymousClass2pe.f34614D.quit();
                if (anonymousClass2pe.f34612B != null) {
                    anonymousClass2pe.f34612B.release();
                }
            }
            list.clear();
        }
        AnonymousClass2qS.f34816D.m17444B();
    }
}
