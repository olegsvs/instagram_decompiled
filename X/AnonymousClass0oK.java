package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.business.activity.BusinessConversionActivity;

/* renamed from: X.0oK */
public final class AnonymousClass0oK implements AnonymousClass0oF {
    /* renamed from: B */
    private final AnonymousClass0IL f10286B;

    public AnonymousClass0oK(AnonymousClass0IL anonymousClass0IL, AnonymousClass0Cm anonymousClass0Cm) {
        this.f10286B = anonymousClass0IL;
    }

    public final void iU(Uri uri, Bundle bundle) {
        AnonymousClass0wt.m8447B();
        Intent intent = new Intent(this.f10286B.getContext(), BusinessConversionActivity.class);
        Bundle arguments = this.f10286B.getArguments();
        arguments.putString("entry_point", "megaphone");
        arguments.putInt("intro_entry_position", 0);
        intent.putExtras(arguments);
        AnonymousClass0IW.m2242H(intent, 11, this.f10286B);
    }
}
