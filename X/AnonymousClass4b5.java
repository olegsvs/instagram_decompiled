package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* renamed from: X.4b5 */
public final class AnonymousClass4b5 extends AnonymousClass0Ie implements AnonymousClass0IS, AnonymousClass0bt {
    /* renamed from: B */
    private DirectPrivateStoryRecipientController f55590B;

    public final boolean bW() {
        return true;
    }

    public final String getModuleName() {
        return "direct_story_audience_picker";
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        this.f55590B.A(anonymousClass0eT);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f55590B.C(i, i2, intent);
    }

    public final boolean onBackPressed() {
        return this.f55590B.D();
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1951596126);
        super.onCreate(bundle);
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = new DirectPrivateStoryRecipientController(this, true, true, null);
        this.f55590B = directPrivateStoryRecipientController;
        directPrivateStoryRecipientController.E();
        AnonymousClass0cQ.G(this, -825577025, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -77714834);
        View inflate = layoutInflater.inflate(C0164R.layout.direct_private_story_recipient_fragment_layout, viewGroup, false);
        AnonymousClass0cQ.G(this, 1913991505, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 286998224);
        super.onDestroy();
        this.f55590B = null;
        AnonymousClass0cQ.G(this, 1033734922, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1660712408);
        super.onDestroyView();
        this.f55590B.F();
        AnonymousClass0cQ.G(this, 731140063, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 516034368);
        super.onPause();
        this.f55590B.H();
        AnonymousClass0cQ.G(this, -1432336406, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, -2101735711);
        super.onStart();
        this.f55590B.I();
        AnonymousClass0cQ.G(this, 1475321192, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, 2017906453);
        super.onStop();
        this.f55590B.f65155J.C();
        AnonymousClass0cQ.G(this, -1828154546, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f55590B.J(view, (FrameLayout) view.findViewById(C0164R.id.recipients_list));
    }
}
