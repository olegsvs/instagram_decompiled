package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.1dm */
public final class AnonymousClass1dm extends AnonymousClass1df {
    /* renamed from: B */
    public final boolean mo2655B(AnonymousClass1Nl anonymousClass1Nl, DataInput dataInput) {
        AnonymousClass1Nx anonymousClass1Nx = (AnonymousClass1Nx) anonymousClass1Nl;
        anonymousClass1Nx.f17844B = dataInput.readFloat();
        anonymousClass1Nx.f17845C = dataInput.readLong();
        anonymousClass1Nx.f17846D = dataInput.readLong();
        return true;
    }

    /* renamed from: D */
    public final void mo2656D(AnonymousClass1Nl anonymousClass1Nl, DataOutput dataOutput) {
        AnonymousClass1Nx anonymousClass1Nx = (AnonymousClass1Nx) anonymousClass1Nl;
        dataOutput.writeFloat(anonymousClass1Nx.f17844B);
        dataOutput.writeLong(anonymousClass1Nx.f17845C);
        dataOutput.writeLong(anonymousClass1Nx.f17846D);
    }
}
