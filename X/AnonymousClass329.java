package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.329 */
public abstract class AnonymousClass329 {
    /* renamed from: B */
    public static void m18243B(AnonymousClass328 anonymousClass328, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass31x anonymousClass31x, int i, String str, boolean z, AnonymousClass327 anonymousClass327) {
        int i2 = 0;
        anonymousClass328.f37183F.setPressed(false);
        anonymousClass328.f37180C.setUrl(anonymousClass0Ci.DQ());
        anonymousClass328.f37186I.setText(anonymousClass0Ci.uT());
        anonymousClass328.f37182E.setText(anonymousClass0Ci.f1757z);
        AnonymousClass327 anonymousClass3272 = anonymousClass327;
        AnonymousClass32E fR = anonymousClass327.fR();
        if (fR != null) {
            anonymousClass328.m18242A(fR.m18249C(anonymousClass0Ci));
            if (anonymousClass328.f37185H != null) {
                fR.m18250D(anonymousClass328.f37185H);
                anonymousClass328.f37185H = null;
            }
            if (z) {
                AnonymousClass32D anonymousClass1Ze = new AnonymousClass1Ze(anonymousClass328, anonymousClass0Ci);
                anonymousClass328.f37185H = anonymousClass1Ze;
                fR.f37194C.add(new WeakReference(anonymousClass1Ze));
            }
        }
        anonymousClass328.f37184G.setVisibility(fR.m18249C(anonymousClass0Ci) ? 0 : 8);
        TextView textView = anonymousClass328.f37179B;
        if (fR.m18249C(anonymousClass0Ci)) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        anonymousClass328.f37183F.setOnClickListener(new AnonymousClass325(anonymousClass327, anonymousClass0Ci));
        OnClickListener anonymousClass326 = new AnonymousClass326(anonymousClass3272, anonymousClass328, anonymousClass0Ci, anonymousClass31x, i, str);
        anonymousClass328.f37179B.setOnClickListener(anonymousClass326);
        anonymousClass328.f37184G.setOnClickListener(anonymousClass326);
    }

    /* renamed from: C */
    public static View m18244C(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(C0164R.layout.close_friends_list_item, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C0164R.id.add);
        textView.setTypeface(AnonymousClass0nA.E());
        AnonymousClass328 anonymousClass328 = new AnonymousClass328(inflate, (IgImageView) inflate.findViewById(C0164R.id.avatar), (ImageView) inflate.findViewById(C0164R.id.avatar_badge), (TextView) inflate.findViewById(C0164R.id.username), (TextView) inflate.findViewById(C0164R.id.user_fullname), inflate.findViewById(C0164R.id.remove), textView);
        anonymousClass328.f37181D.setImageDrawable(AnonymousClass31T.m18234B(context, C0164R.drawable.close_friends_star_small, 2));
        inflate.setTag(anonymousClass328);
        return inflate;
    }
}
