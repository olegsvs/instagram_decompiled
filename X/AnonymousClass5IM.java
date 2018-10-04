package X;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.5IM */
public final class AnonymousClass5IM implements OnCheckedChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5IV f61850B;

    public AnonymousClass5IM(AnonymousClass5IV anonymousClass5IV) {
        this.f61850B = anonymousClass5IV;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (i == 0) {
            AnonymousClass0Cm anonymousClass0Cm = this.f61850B.f61863G;
            String str = JsonProperty.USE_DEFAULT_NAME;
            AnonymousClass2H3.E(anonymousClass0Cm, new AnonymousClass2HM(str, str, str));
        } else if (i > 0) {
            int i2 = i - 1;
            if (i2 < this.f61850B.f61860D.size()) {
                AnonymousClass2H3.E(this.f61850B.f61863G, (AnonymousClass2HM) this.f61850B.f61860D.get(i2));
            }
        }
    }
}
