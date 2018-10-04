package X;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.2Sy */
public final class AnonymousClass2Sy implements AnonymousClass21B {
    /* renamed from: B */
    private /* synthetic */ AnonymousClass2Sx f30684B;

    public AnonymousClass2Sy(AnonymousClass2Sx anonymousClass2Sx) {
        this.f30684B = anonymousClass2Sx;
    }

    public final void Gh(AnonymousClass21F anonymousClass21F) {
        this.f30684B.f30675K.lock();
        try {
            if (this.f30684B.f30671G) {
                if (anonymousClass21F.mo3139G()) {
                    this.f30684B.f30672H = new AnonymousClass0O7(this.f30684B.f30666B.size());
                    for (AnonymousClass2Sw anonymousClass2Sw : this.f30684B.f30666B.values()) {
                        this.f30684B.f30672H.put(anonymousClass2Sw.f24963D, ConnectionResult.f15965F);
                    }
                } else {
                    AnonymousClass2Sx anonymousClass2Sx;
                    ConnectionResult F;
                    if (anonymousClass21F.mo3137E() instanceof AnonymousClass1z1) {
                        AnonymousClass1z1 anonymousClass1z1 = (AnonymousClass1z1) anonymousClass21F.mo3137E();
                        if (this.f30684B.f30670F) {
                            this.f30684B.f30672H = new AnonymousClass0O7(this.f30684B.f30666B.size());
                            for (AnonymousClass2Sw anonymousClass2Sw2 : this.f30684B.f30666B.values()) {
                                Map map;
                                AnonymousClass1zz anonymousClass1zz = anonymousClass2Sw2.f24963D;
                                Object A = anonymousClass1z1.m14020A(anonymousClass2Sw2);
                                if (AnonymousClass2Sx.m15854B(this.f30684B, anonymousClass2Sw2, A)) {
                                    map = this.f30684B.f30672H;
                                    A = new ConnectionResult(16);
                                } else {
                                    map = this.f30684B.f30672H;
                                }
                                map.put(anonymousClass1zz, A);
                            }
                        } else {
                            this.f30684B.f30672H = anonymousClass1z1.f24993B;
                        }
                        anonymousClass2Sx = this.f30684B;
                        F = AnonymousClass2Sx.m15858F(this.f30684B);
                    } else {
                        Log.e("ConnectionlessGAC", "Unexpected availability exception", anonymousClass21F.mo3137E());
                        this.f30684B.f30672H = Collections.emptyMap();
                        anonymousClass2Sx = this.f30684B;
                        F = new ConnectionResult(8);
                    }
                    anonymousClass2Sx.f30674J = F;
                }
                if (this.f30684B.f30673I != null) {
                    this.f30684B.f30672H.putAll(this.f30684B.f30673I);
                    this.f30684B.f30674J = AnonymousClass2Sx.m15858F(this.f30684B);
                }
                if (this.f30684B.f30674J == null) {
                    AnonymousClass2Sx.m15856D(this.f30684B);
                    AnonymousClass2Sx.m15857E(this.f30684B);
                } else {
                    this.f30684B.f30671G = false;
                    this.f30684B.f30668D.xXA(this.f30684B.f30674J);
                }
                this.f30684B.f30669E.signalAll();
            }
            this.f30684B.f30675K.unlock();
        } catch (Throwable th) {
            this.f30684B.f30675K.unlock();
        }
    }
}
