package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.52M */
public final class AnonymousClass52M implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass52P f59441B;

    public AnonymousClass52M(AnonymousClass52P anonymousClass52P) {
        this.f59441B = anonymousClass52P;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1030495874);
        AnonymousClass0IL anonymousClass0IL = this.f59441B;
        ((ClipboardManager) anonymousClass0IL.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("backup_codes", anonymousClass0IL.f59445C.getText()));
        AnonymousClass1TN.C(anonymousClass0IL.getContext(), anonymousClass0IL.getString(C0164R.string.two_fac_copy_code_success), 0).show();
        AnonymousClass0cQ.L(this, 628963999, M);
    }
}
