package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import com.facebook.C0164R;
import com.facebook.forker.Process;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.4Jl */
public abstract class AnonymousClass4Jl {
    /* renamed from: B */
    public static Drawable m23841B(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass27l anonymousClass27l, AnonymousClass4Jj anonymousClass4Jj) {
        Resources resources = context.getResources();
        int J;
        switch (AnonymousClass4Ji.f52716B[anonymousClass27l.f26359E.ordinal()]) {
            case 1:
                return AnonymousClass27c.m14502B(context, anonymousClass27l, anonymousClass4Jj.LL());
            case 2:
            case 3:
            case 4:
            case 5:
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
            case 9:
            case 10:
                return null;
            case 6:
                List arrayList = new ArrayList();
                for (AnonymousClass4Tv anonymousClass4Tv : AnonymousClass4Tv.values()) {
                    arrayList.add(new AnonymousClass4U4(0, AnonymousClass4U5.m24329C(context, anonymousClass4Tv), AnonymousClass4U5.m24328B(context, anonymousClass4Tv)));
                }
                Drawable anonymousClass2VC = new AnonymousClass2VC(context, arrayList);
                anonymousClass2VC.f31024G = true;
                return anonymousClass2VC;
            case 8:
                J = AnonymousClass0Nm.J(context);
                AnonymousClass4NN anonymousClass4NN = AnonymousClass4NN.f53353E;
                return new AnonymousClass27R(resources, J, anonymousClass4NN.f53356D, anonymousClass4NN.f53355C);
            default:
                return AnonymousClass2VC.m16106B(context, anonymousClass0Cm, anonymousClass27l);
        }
    }

    /* renamed from: C */
    public static AnonymousClass4Jk m23842C(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass27l anonymousClass27l, Drawable drawable, AnonymousClass4Jj anonymousClass4Jj) {
        Drawable A;
        int i;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0164R.dimen.contextual_sticker_tray_text_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0164R.dimen.contextual_sticker_tray_padding);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(C0164R.dimen.contextual_sticker_corner_radius);
        int i2 = resources.getDisplayMetrics().widthPixels;
        AnonymousClass3GD anonymousClass3GD;
        switch (anonymousClass27l.f26359E.ordinal()) {
            case 0:
                A = AnonymousClass27c.m14502B(context, anonymousClass27l, anonymousClass4Jj.LL()).m16108A();
                i = C0164R.string.time_sticker_description;
                break;
            case 1:
                A = new AnonymousClass27e(resources, i2, dimensionPixelSize, dimensionPixelSize2, AnonymousClass27d.VIBRANT);
                i = C0164R.string.universal_location_sticker_description;
                break;
            case 3:
                A = AnonymousClass0Ca.E(context, C0164R.drawable.selfie_camera);
                i = C0164R.string.selfie_sticker_description;
                break;
            case 4:
                anonymousClass3GD = new AnonymousClass3GD(context);
                anonymousClass3GD.f39623C = AnonymousClass27E.f26114D;
                A = anonymousClass3GD.m19176C(C0164R.string.hashtag_sticker_default_text).m19174A();
                i = C0164R.string.hashtag_sticker_description;
                break;
            case 5:
                anonymousClass3GD = new AnonymousClass3GD(context);
                anonymousClass3GD.f39623C = AnonymousClass4Qf.f53964B;
                A = anonymousClass3GD.m19176C(C0164R.string.mention_sticker_tray_label).m19174A();
                i = C0164R.string.mention_sticker_tray_description;
                break;
            case 6:
                A = new AnonymousClass165(resources, i2, dimensionPixelSize, true, true);
                AnonymousClass4Jl.m23843D(A, anonymousClass4Jj.JY());
                i = C0164R.string.product_sticker_description;
                break;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                int J = AnonymousClass0Nm.J(context);
                AnonymousClass4NN anonymousClass4NN = AnonymousClass4NN.f53353E;
                A = new AnonymousClass27R(resources, J, anonymousClass4NN.f53356D, anonymousClass4NN.f53355C);
                i = C0164R.string.music_sticker_description;
                break;
            case 8:
                int[] iArr = new int[]{AnonymousClass0Ca.C(context, C0164R.color.music_sticker_tray_color_1), AnonymousClass0Ca.C(context, C0164R.color.music_sticker_tray_color_2), AnonymousClass0Ca.C(context, C0164R.color.music_sticker_tray_color_3)};
                anonymousClass3GD = new AnonymousClass3GD(context);
                anonymousClass3GD.f39623C = iArr;
                anonymousClass3GD = anonymousClass3GD.m19175B(C0164R.drawable.music_overlay_sticker_icon);
                anonymousClass3GD.f39625E = false;
                A = anonymousClass3GD.m19176C(C0164R.string.music_overlay_tray_sticker_default_text).m19174A();
                AnonymousClass4Jl.m23843D(A, anonymousClass4Jj.zX());
                i = C0164R.string.music_overlay_sticker_description;
                break;
            case 9:
                anonymousClass3GD = new AnonymousClass3GD(context);
                anonymousClass3GD.f39623C = AnonymousClass27E.f26113C;
                A = anonymousClass3GD.m19175B(C0164R.drawable.polling_sticker_icon).m19176C(C0164R.string.polling_sticker_default_text).m19174A();
                i = C0164R.string.polling_sticker_description;
                break;
            case 10:
                A = new AnonymousClass2GT(context);
                if (!A.f28287B) {
                    A.f28287B = true;
                    A.invalidateSelf();
                }
                i = C0164R.string.question_sticker_tray_description;
                break;
            case 12:
                A = new AnonymousClass2Ge(context);
                if (!A.f28389B) {
                    A.f28389B = true;
                    A.invalidateSelf();
                }
                i = C0164R.string.slider_sticker_description;
                break;
            case 14:
                A = new AnonymousClass27J(context, Math.round(((float) dimensionPixelSize) * 1.3f), Math.round(((float) dimensionPixelSize2) * 1.3f), dimensionPixelSize3);
                if (!A.f26158B) {
                    A.f26158B = true;
                    Choreographer.getInstance().postFrameCallbackDelayed(A, 700);
                }
                i = C0164R.string.gif_sticker_description;
                break;
            case 16:
                A = AnonymousClass0Ca.E(context, C0164R.drawable.gallery_sticker);
                i = C0164R.string.gallery_sticker_description;
                break;
            case Process.SIGCONT /*18*/:
                anonymousClass3GD = new AnonymousClass3GD(context);
                anonymousClass3GD.f39623C = AnonymousClass2Fr.m14863C(context);
                A = anonymousClass3GD.m19175B(C0164R.drawable.friends_sticker_icon).m19176C(C0164R.string.friends_sticker_default_text).m19174A();
                i = C0164R.string.friends_sticker_description;
                break;
            case Process.SIGTSTP /*20*/:
                anonymousClass3GD = new AnonymousClass3GD(context);
                anonymousClass3GD.f39623C = AnonymousClass27E.f26114D;
                A = anonymousClass3GD.m19175B(C0164R.drawable.ig_logo).m19176C(C0164R.string.internal_sticker_default_text).m19174A();
                i = C0164R.string.internal_sticker_description;
                break;
            default:
                A = AnonymousClass2VC.m16106B(context, anonymousClass0Cm, anonymousClass27l);
                i = C0164R.string.normal_sticker_description;
                break;
        }
        return new AnonymousClass4Jk(A, i);
    }

    /* renamed from: D */
    private static void m23843D(Drawable drawable, boolean z) {
        drawable.mutate().setAlpha(z ? 255 : 127);
    }
}
