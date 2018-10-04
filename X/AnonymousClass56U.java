package X;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;
import java.util.ArrayList;

/* renamed from: X.56U */
public final class AnonymousClass56U implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass56X f60143B;

    public AnonymousClass56U(AnonymousClass56X anonymousClass56X) {
        this.f60143B = anonymousClass56X;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 612395290);
        AnonymousClass56X.m25733B(this.f60143B, AnonymousClass0Fr.RegisterAvatarClicked).R();
        AnonymousClass32N anonymousClass32N = this.f60143B.f60146B;
        Context context = this.f60143B.getContext();
        boolean z = this.f60143B.f60153I != null;
        OnCancelListener anonymousClass56T = new AnonymousClass56T(this);
        anonymousClass32N.f37226D = z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(context.getString(C0164R.string.import_from_facebook));
        arrayList.add(context.getString(C0164R.string.take_picture));
        arrayList.add(context.getString(C0164R.string.choose_from_library));
        if (anonymousClass32N.f37226D) {
            arrayList.add(context.getString(C0164R.string.remove_photo));
        }
        CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
        anonymousClass32N.f37228F = charSequenceArr;
        arrayList.toArray(charSequenceArr);
        CharSequence[] charSequenceArr2 = anonymousClass32N.f37228F;
        AnonymousClass0Sb F = new AnonymousClass0Sb(anonymousClass32N.f37224B.getActivity()).Q(z ? C0164R.string.change_profile_photo_dialog_title : C0164R.string.set_a_profile_picture).G(charSequenceArr2, new AnonymousClass32H(anonymousClass32N, context, charSequenceArr2)).F(true);
        F.f4940D.setOnCancelListener(anonymousClass56T);
        F.C().show();
        AnonymousClass0cQ.L(this, 802974774, M);
    }
}
