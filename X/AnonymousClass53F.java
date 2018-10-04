package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.53F */
public final class AnonymousClass53F extends BaseAdapter {
    /* renamed from: B */
    public List f59586B = new ArrayList();
    /* renamed from: C */
    public final AnonymousClass0Ci f59587C;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass53F(AnonymousClass0Ci anonymousClass0Ci) {
        this.f59587C = anonymousClass0Ci;
    }

    public final int getCount() {
        return this.f59586B.size();
    }

    public final Object getItem(int i) {
        if (getItemViewType(i) == 0) {
            return this.f59586B.get(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported view type: ");
        stringBuilder.append(getItemViewType(i));
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.spinner_dropdown_row, viewGroup, false);
            AnonymousClass53E anonymousClass53E = new AnonymousClass53E();
            anonymousClass53E.f59581E = (IgImageView) view.findViewById(C0164R.id.row_user_imageview);
            anonymousClass53E.f59585I = (TextView) view.findViewById(C0164R.id.row_user_textview);
            anonymousClass53E.f59580D = (ImageView) view.findViewById(C0164R.id.check);
            anonymousClass53E.f59579C = view.findViewById(C0164R.id.account_badge);
            anonymousClass53E.f59578B = (TextView) view.findViewById(C0164R.id.notification_count);
            anonymousClass53E.f59582F = view.findViewById(C0164R.id.login_button);
            anonymousClass53E.f59583G = (AdapterView) viewGroup;
            view.setTag(anonymousClass53E);
        }
        AnonymousClass53E anonymousClass53E2 = (AnonymousClass53E) view.getTag();
        anonymousClass53E2.f59584H = i;
        if (getItemViewType(i) == 0) {
            AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) getItem(i);
            boolean equals = anonymousClass0Ci.equals(this.f59587C);
            Object DQ = anonymousClass0Ci.DQ();
            if (TextUtils.isEmpty(DQ)) {
                anonymousClass53E2.f59581E.setImageDrawable(AnonymousClass0Ca.E(anonymousClass53E2.f59581E.getContext(), C0164R.drawable.profile_anonymous_user));
            } else {
                anonymousClass53E2.f59581E.setUrl(DQ);
            }
            anonymousClass53E2.f59585I.setText(anonymousClass0Ci.uT());
            anonymousClass53E2.f59585I.setActivated(equals);
            anonymousClass53E2.f59580D.setVisibility(equals ? 0 : 8);
            if (equals) {
                Context context = anonymousClass53E2.f59580D.getContext();
                Drawable mutate = AnonymousClass0Ca.E(context, C0164R.drawable.circle_check).mutate();
                mutate.setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(context, C0164R.color.blue_5)));
                anonymousClass53E2.f59580D.setImageDrawable(mutate);
            }
            int i2 = anonymousClass0Ci.f1715J;
            int i3 = i2;
            if (!equals && i2 > 0) {
                anonymousClass53E2.f59579C.setVisibility(0);
                anonymousClass53E2.f59578B.setVisibility(0);
                anonymousClass53E2.f59578B.setText(Integer.toString(i3));
            } else {
                anonymousClass53E2.f59579C.setVisibility(8);
                anonymousClass53E2.f59578B.setVisibility(8);
            }
            anonymousClass53E2.f59582F.setVisibility(8);
            anonymousClass53E2.f59582F.setOnClickListener(new AnonymousClass53D(this, anonymousClass53E2));
            return view;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported view type: ");
        stringBuilder.append(getItemViewType(i));
        throw new IllegalStateException(stringBuilder.toString());
    }
}
