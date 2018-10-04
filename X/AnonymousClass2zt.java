package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.imagebutton.IgImageButton;
import java.util.Set;

/* renamed from: X.2zt */
public final class AnonymousClass2zt extends AnonymousClass0TA {
    /* renamed from: B */
    public final Context f36740B;
    /* renamed from: C */
    public final AnonymousClass302 f36741C;
    /* renamed from: D */
    public final AnonymousClass2zx f36742D;
    /* renamed from: E */
    public final int f36743E;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass2zt(Context context, int i, AnonymousClass302 anonymousClass302, AnonymousClass2zx anonymousClass2zx) {
        this.f36740B = context;
        this.f36743E = i;
        this.f36741C = anonymousClass302;
        this.f36742D = anonymousClass2zx;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        int i3;
        Object obj3 = obj2;
        Object obj4 = obj;
        View view2 = view;
        int I = AnonymousClass0cQ.I(this, -1718819599);
        if (view == null) {
            Context context = r13.f36740B;
            i2 = r13.f36743E;
            int C = AnonymousClass307.m18155C(context);
            int B = AnonymousClass307.m18154B(context, i2);
            float H = AnonymousClass0Nm.H(AnonymousClass0Nm.G(context));
            view2 = new LinearLayout(context);
            AnonymousClass306 anonymousClass306 = new AnonymousClass306(view2, i2);
            int i4 = 0;
            while (i4 < i2) {
                MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) LayoutInflater.from(context).inflate(C0164R.layout.layout_archive_reel_item, view2, false);
                mediaFrameLayout.setAspectRatio(H);
                IgImageButton igImageButton = (IgImageButton) mediaFrameLayout.findViewById(C0164R.id.day_cover_image);
                igImageButton.setAspect(H);
                igImageButton.setEnableTouchOverlay(false);
                AnonymousClass304 anonymousClass304 = new AnonymousClass304(mediaFrameLayout, igImageButton, mediaFrameLayout.findViewById(C0164R.id.calendar_header), (TextView) mediaFrameLayout.findViewById(C0164R.id.month_text), (TextView) mediaFrameLayout.findViewById(C0164R.id.day_text), mediaFrameLayout.findViewById(C0164R.id.selected_item_overlay), (CheckBox) mediaFrameLayout.findViewById(C0164R.id.media_toggle));
                mediaFrameLayout.setTag(anonymousClass304);
                anonymousClass306.f36773C[i4] = anonymousClass304;
                LayoutParams layoutParams = new LinearLayout.LayoutParams(B, -2);
                layoutParams.rightMargin = i4 == i2 + -1 ? 0 : C;
                view2.addView(anonymousClass304.f36763E, layoutParams);
                i4++;
            }
            view2.setTag(anonymousClass306);
        }
        AnonymousClass2zV anonymousClass2zV = (AnonymousClass2zV) obj4;
        AnonymousClass1Vy anonymousClass1Vy = (AnonymousClass1Vy) obj3;
        int I2 = AnonymousClass0cQ.I(r13, 366434710);
        Set anonymousClass1mS = new AnonymousClass1mS();
        AnonymousClass2zx anonymousClass2zx = r13.f36742D;
        if (anonymousClass2zx != null) {
            anonymousClass1mS = anonymousClass2zx.bR();
        }
        AnonymousClass306 anonymousClass3062 = (AnonymousClass306) view2.getTag();
        AnonymousClass2MJ anonymousClass2MJ = anonymousClass2zV.f36680B;
        i = anonymousClass2zV.f36681C;
        AnonymousClass302 anonymousClass302 = r13.f36741C;
        boolean C2 = anonymousClass1Vy.C();
        View view3 = anonymousClass3062.f36772B;
        if (anonymousClass1Vy.f19895C) {
            i3 = 0;
        } else {
            i3 = anonymousClass3062.f36772B.getResources().getDimensionPixelSize(C0164R.dimen.photo_grid_spacing);
        }
        AnonymousClass0Nm.a(view3, i3);
        for (int i5 = 0; i5 < anonymousClass3062.f36773C.length; i5++) {
            AnonymousClass304 anonymousClass3042 = anonymousClass3062.f36773C[i5];
            if (i5 < anonymousClass2MJ.m15208C()) {
                boolean z;
                AnonymousClass2zi anonymousClass2zi = (AnonymousClass2zi) anonymousClass2MJ.m15206A(i5);
                switch (anonymousClass2zi.f36706I.ordinal()) {
                    case 0:
                        AnonymousClass305.m18153C(anonymousClass3042);
                        anonymousClass3042.f36763E.setVisibility(4);
                        continue;
                    case 1:
                        AnonymousClass305.m18153C(anonymousClass3042);
                        z = false;
                        anonymousClass3042.f36763E.setVisibility(0);
                        anonymousClass3042.f36763E.setBackgroundColor(anonymousClass3042.f36767I);
                        if (C2) {
                            anonymousClass3042.f36765G.setVisibility(0);
                            anonymousClass3042.f36765G.setChecked(false);
                        }
                        if (anonymousClass2zi.f36705H == 0) {
                            z = true;
                            break;
                        }
                        break;
                    case 2:
                        int i6 = anonymousClass1Vy.f19896D;
                        boolean contains = anonymousClass1mS.contains(anonymousClass2zi.f36700C);
                        AnonymousClass302 anonymousClass3022 = anonymousClass302;
                        obj = i5;
                        AnonymousClass305.m18153C(anonymousClass3042);
                        z = false;
                        anonymousClass3042.f36763E.setVisibility(0);
                        anonymousClass3042.f36761C.setVisibility(0);
                        anonymousClass3042.f36761C.setUrl(anonymousClass2zi.f36701D.HA());
                        anonymousClass3042.f36768J = new AnonymousClass3wo(anonymousClass3022, anonymousClass2zi, i, anonymousClass3042, i6, obj);
                        i2 = 8;
                        if (C2) {
                            anonymousClass3042.f36765G.setVisibility(0);
                            anonymousClass3042.f36765G.setChecked(contains);
                            View view4 = anonymousClass3042.f36769K;
                            if (contains) {
                                i2 = 0;
                            }
                            view4.setVisibility(i2);
                        } else {
                            anonymousClass3042.f36765G.setVisibility(8);
                            anonymousClass3042.f36769K.setVisibility(8);
                        }
                        if (anonymousClass2zi.f36705H == 0) {
                            z = true;
                            break;
                        }
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("unexpected view model type: ");
                        stringBuilder.append(anonymousClass2zi.f36706I);
                        throw new IllegalStateException(stringBuilder.toString());
                }
                AnonymousClass305.m18152B(anonymousClass3042, z, anonymousClass2zi.f36699B);
            } else {
                AnonymousClass305.m18153C(anonymousClass3042);
            }
        }
        AnonymousClass0cQ.H(r13, -1324343526, I2);
        AnonymousClass0cQ.H(r13, 1716020882, I);
        return view2;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass2zV anonymousClass2zV = (AnonymousClass2zV) obj;
        AnonymousClass1Vy anonymousClass1Vy = (AnonymousClass1Vy) obj2;
        anonymousClass0p9.A(0);
    }
}
