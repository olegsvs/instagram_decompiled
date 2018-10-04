package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.1di */
public final class AnonymousClass1di extends AnonymousClass1df {
    /* renamed from: B */
    public final boolean mo2655B(AnonymousClass1Nl anonymousClass1Nl, DataInput dataInput) {
        AnonymousClass1Np anonymousClass1Np = (AnonymousClass1Np) anonymousClass1Nl;
        anonymousClass1Np.f17832G = dataInput.readLong();
        anonymousClass1Np.f17827B = dataInput.readLong();
        anonymousClass1Np.f17830E = dataInput.readLong();
        anonymousClass1Np.f17828C = dataInput.readLong();
        return true;
    }

    /* renamed from: D */
    public final void mo2656D(AnonymousClass1Nl anonymousClass1Nl, DataOutput dataOutput) {
        AnonymousClass1Np anonymousClass1Np = (AnonymousClass1Np) anonymousClass1Nl;
        dataOutput.writeLong(anonymousClass1Np.f17832G);
        dataOutput.writeLong(anonymousClass1Np.f17827B);
        dataOutput.writeLong(anonymousClass1Np.f17830E);
        dataOutput.writeLong(anonymousClass1Np.f17828C);
    }
}
