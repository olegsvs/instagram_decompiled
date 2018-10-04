package X;

import android.util.SparseArray;
import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.1de */
public final class AnonymousClass1de extends AnonymousClass1df {
    /* renamed from: B */
    public final AnonymousClass0O8 f20782B = new AnonymousClass0O8();
    /* renamed from: C */
    private final SparseArray f20783C = new SparseArray();
    /* renamed from: D */
    private final SparseArray f20784D = new SparseArray();

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ boolean mo2655B(AnonymousClass1Nl anonymousClass1Nl, DataInput dataInput) {
        return m12233F((AnonymousClass1OE) anonymousClass1Nl, dataInput);
    }

    /* renamed from: D */
    public final /* bridge */ /* synthetic */ void mo2656D(AnonymousClass1Nl anonymousClass1Nl, DataOutput dataOutput) {
        AnonymousClass1OE anonymousClass1OE = (AnonymousClass1OE) anonymousClass1Nl;
        int size = this.f20782B.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (anonymousClass1OE.m11135D((Class) this.f20782B.m3529F(i2))) {
                i++;
            }
        }
        dataOutput.writeInt(i);
        for (int i3 = 0; i3 < size; i3++) {
            Class cls = (Class) this.f20782B.m3529F(i3);
            if (anonymousClass1OE.m11135D(cls)) {
                AnonymousClass1df anonymousClass1df = (AnonymousClass1df) this.f20782B.m3532I(i3);
                dataOutput.writeInt(anonymousClass1df.m12236C());
                anonymousClass1df.mo2656D(anonymousClass1OE.m11134C(cls), dataOutput);
            }
        }
    }

    /* renamed from: E */
    public final AnonymousClass1de m12232E(Class cls, AnonymousClass1df anonymousClass1df) {
        this.f20782B.put(cls, anonymousClass1df);
        this.f20784D.put(anonymousClass1df.m12236C(), anonymousClass1df);
        this.f20783C.put(anonymousClass1df.m12236C(), cls);
        return this;
    }

    /* renamed from: F */
    public final boolean m12233F(AnonymousClass1OE anonymousClass1OE, DataInput dataInput) {
        int i;
        AnonymousClass0O8 anonymousClass0O8 = anonymousClass1OE.f17884B;
        int size = anonymousClass1OE.f17884B.size();
        for (i = 0; i < size; i++) {
            anonymousClass1OE.m11137F((Class) anonymousClass0O8.m3529F(i), false);
        }
        int readInt = dataInput.readInt();
        int i2 = 0;
        while (i2 < readInt) {
            i = dataInput.readInt();
            AnonymousClass1df anonymousClass1df = (AnonymousClass1df) this.f20784D.get(i);
            Class cls = (Class) this.f20783C.get(i);
            if (anonymousClass1df != null) {
                if (cls != null) {
                    if (anonymousClass1df.mo2655B(anonymousClass1OE.m11134C(cls), dataInput)) {
                        anonymousClass1OE.m11137F(cls, true);
                        i2++;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
