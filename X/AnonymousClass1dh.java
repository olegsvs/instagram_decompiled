package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.1dh */
public final class AnonymousClass1dh extends AnonymousClass1df {
    /* renamed from: B */
    public final boolean mo2655B(AnonymousClass1Nl anonymousClass1Nl, DataInput dataInput) {
        AnonymousClass1Nn anonymousClass1Nn = (AnonymousClass1Nn) anonymousClass1Nl;
        anonymousClass1Nn.f17826E = dataInput.readDouble();
        anonymousClass1Nn.f17825D = dataInput.readDouble();
        anonymousClass1Nn.f17824C = dataInput.readDouble();
        anonymousClass1Nn.f17823B = dataInput.readDouble();
        return true;
    }

    /* renamed from: D */
    public final void mo2656D(AnonymousClass1Nl anonymousClass1Nl, DataOutput dataOutput) {
        AnonymousClass1Nn anonymousClass1Nn = (AnonymousClass1Nn) anonymousClass1Nl;
        dataOutput.writeDouble(anonymousClass1Nn.f17826E);
        dataOutput.writeDouble(anonymousClass1Nn.f17825D);
        dataOutput.writeDouble(anonymousClass1Nn.f17824C);
        dataOutput.writeDouble(anonymousClass1Nn.f17823B);
    }
}
