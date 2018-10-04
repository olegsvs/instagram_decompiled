package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.business.activity.BusinessConversionActivity;

/* renamed from: X.53b */
public final class AnonymousClass53b implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass53e f59662B;

    public AnonymousClass53b(AnonymousClass53e anonymousClass53e) {
        this.f59662B = anonymousClass53e;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1979307745);
        AnonymousClass5ZG anonymousClass5ZG = this.f59662B.f59669C;
        anonymousClass5ZG.f66343D = anonymousClass5ZG.f66344E.B().i();
        Intent intent = new Intent(anonymousClass5ZG.f66341B.getContext(), BusinessConversionActivity.class);
        Bundle arguments = anonymousClass5ZG.f66341B.getArguments();
        arguments.putString("entry_point", "activity_feed");
        arguments.putInt("intro_entry_position", 0);
        arguments.putInt("business_account_flow", AnonymousClass34L.CONVERSION_FLOW.f37528B);
        intent.putExtras(arguments);
        AnonymousClass0IW.H(intent, 11, anonymousClass5ZG.f66341B);
        AnonymousClass0cQ.L(this, 1667047323, M);
    }
}
