package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4x4 */
public final class AnonymousClass4x4 extends BaseAdapter {
    /* renamed from: B */
    public final AnonymousClass5YY f58766B;
    /* renamed from: C */
    private List f58767C = new ArrayList();

    public final long getItemId(int i) {
        return (long) i;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public AnonymousClass4x4(Context context, AnonymousClass5YY anonymousClass5YY) {
        Resources resources = context.getResources();
        this.f58766B = anonymousClass5YY;
        this.f58767C.add(new AnonymousClass4x7(resources.getString(C0164R.string.igtv_creator_nux_page1_title), resources.getString(C0164R.string.igtv_creator_nux_page1_description), C0164R.drawable.igtv_login_white));
        this.f58767C.add(new AnonymousClass4x7(resources.getString(C0164R.string.igtv_creator_nux_page2_title), resources.getString(C0164R.string.igtv_creator_nux_page2_description), C0164R.drawable.time_mobile));
        this.f58767C.add(new AnonymousClass4x7(resources.getString(C0164R.string.igtv_creator_nux_page3_title), resources.getString(C0164R.string.igtv_creator_nux_page3_description), C0164R.drawable.phone_mobile));
    }

    public final int getCount() {
        return this.f58767C.size();
    }

    public final Object getItem(int i) {
        return this.f58767C.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass4x8 anonymousClass4x8;
        Context context = viewGroup.getContext();
        boolean z = false;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(C0164R.layout.creator_nux_page, viewGroup, false);
            anonymousClass4x8 = new AnonymousClass4x8(view);
            anonymousClass4x8.f58781F.setTypeface(AnonymousClass0nA.E());
            AnonymousClass15z anonymousClass15z = new AnonymousClass15z(anonymousClass4x8.f58777B);
            anonymousClass15z.f14393M = true;
            anonymousClass15z.f14386F = true;
            anonymousClass15z.f14389I = 0.97f;
            anonymousClass15z.f14385E = new AnonymousClass4x3(this, anonymousClass4x8);
            anonymousClass15z.A();
            view.setTag(anonymousClass4x8);
        } else {
            anonymousClass4x8 = (AnonymousClass4x8) view.getTag();
        }
        AnonymousClass4x7 anonymousClass4x7 = (AnonymousClass4x7) this.f58767C.get(i);
        anonymousClass4x8.f58781F.setText(anonymousClass4x7.f58776D);
        anonymousClass4x8.f58778C.setText(anonymousClass4x7.f58774B);
        anonymousClass4x8.f58779D.setImageResource(anonymousClass4x7.f58775C);
        if (i == this.f58767C.size() - 1) {
            z = true;
        }
        anonymousClass4x8.f58780E = z;
        if (i == this.f58767C.size() - 1) {
            anonymousClass4x8.f58777B.setText(C0164R.string.igtv_creator_nux_create_channel);
        } else {
            anonymousClass4x8.f58777B.setText(C0164R.string.next);
        }
        return view;
    }
}
