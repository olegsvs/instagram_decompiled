package X;

import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.0fl */
public final class AnonymousClass0fl implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0fg f7985B;

    public AnonymousClass0fl(AnonymousClass0fg anonymousClass0fg) {
        this.f7985B = anonymousClass0fg;
    }

    public final void run() {
        Closeable createParser;
        Throwable th;
        String str;
        if (this.f7985B.f7978C != null) {
            File B = AnonymousClass0fg.m6544B(this.f7985B.f7978C);
            if (B.exists()) {
                try {
                    AnonymousClass0fg anonymousClass0fg = this.f7985B;
                    try {
                        createParser = AnonymousClass0Lm.f3274B.createParser(B);
                        try {
                            createParser.nextToken();
                            AnonymousClass0fs parseFromJson = AnonymousClass0fi.parseFromJson(createParser);
                            AnonymousClass0Du.m1315C(createParser);
                            boolean z = parseFromJson != null;
                            if (z) {
                                Collection arrayList = new ArrayList();
                                for (AnonymousClass0fH anonymousClass0fH : parseFromJson.m6571I()) {
                                    if (AnonymousClass3OX.B(anonymousClass0fH)) {
                                        arrayList.add(anonymousClass0fH);
                                    }
                                }
                                parseFromJson.m6571I().removeAll(arrayList);
                            }
                            AnonymousClass0Sy.m4437F(new AnonymousClass3U2(anonymousClass0fg, z, parseFromJson));
                        } catch (Throwable th2) {
                            th = th2;
                            AnonymousClass0Du.m1315C(createParser);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        AnonymousClass0Du.m1315C(createParser);
                        throw th;
                    }
                } catch (Throwable e) {
                    str = "MainFeedCacheController";
                    AnonymousClass0Dc.m1246I(str, e, "Error reading from cached file.", new Object[0]);
                    AnonymousClass0Gn.m1878E(str, e.getMessage(), e);
                } catch (Throwable e2) {
                    str = "MainFeedCacheController";
                    AnonymousClass0Dc.m1246I(str, e2, "User ID does not exist in the user object.", new Object[0]);
                    AnonymousClass0Gn.m1878E(str, e2.getMessage(), e2);
                }
            }
        }
    }
}
