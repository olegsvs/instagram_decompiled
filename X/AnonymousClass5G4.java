package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.business.activity.BusinessConversionActivity;

/* renamed from: X.5G4 */
public final class AnonymousClass5G4 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5GA f61639B;

    public AnonymousClass5G4(AnonymousClass5GA anonymousClass5GA) {
        this.f61639B = anonymousClass5GA;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 2012813476);
        AnonymousClass0wt.B();
        Intent intent = new Intent(this.f61639B.f61647B, BusinessConversionActivity.class);
        Bundle arguments = this.f61639B.f61649D.getArguments();
        arguments.putString("entry_point", "setting");
        arguments.putInt("intro_entry_position", 0);
        arguments.putInt("business_account_flow", AnonymousClass34L.CONVERSION_FLOW.f37528B);
        intent.putExtras(arguments);
        AnonymousClass0IW.H(intent, 11, this.f61639B.f61649D);
        AnonymousClass0cQ.L(this, -812005366, M);
    }
}
