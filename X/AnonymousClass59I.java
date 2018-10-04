package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.tooltippopup.MaskingFrameLayout;
import java.util.List;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.59I */
public final class AnonymousClass59I {
    /* renamed from: B */
    public final AnonymousClass0QU f60573B;
    /* renamed from: C */
    private final Context f60574C;
    /* renamed from: D */
    private final View f60575D;
    /* renamed from: E */
    private AnonymousClass3kR f60576E;
    /* renamed from: F */
    private Bitmap f60577F;
    /* renamed from: G */
    private final Rect f60578G = new Rect();

    public AnonymousClass59I(Context context, View view, AnonymousClass0QU anonymousClass0QU) {
        this.f60574C = context;
        this.f60575D = view;
        this.f60573B = anonymousClass0QU;
    }

    /* renamed from: A */
    public final boolean m25854A(float f, float f2, float f3, List list) {
        int width = this.f60575D.getWidth();
        int height = this.f60575D.getHeight();
        if (list != null) {
            for (AnonymousClass0ZF anonymousClass0ZF : list) {
                if (anonymousClass0ZF.F() && AnonymousClass15n.B(anonymousClass0ZF, f, f2, width, height, f3)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: B */
    public final void m25855B(boolean z, boolean z2) {
        if (m25856C()) {
            if (z2) {
                this.f60576E.f43962O = null;
            }
            this.f60576E.A(z);
        }
    }

    /* renamed from: B */
    private static boolean m25851B(AnonymousClass0ZF anonymousClass0ZF) {
        switch (anonymousClass0ZF.f6315W.ordinal()) {
            case 1:
            case 2:
            case 3:
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
            case 8:
            case 10:
            case 11:
            case 12:
            case ParserMinimalBase.INT_CR /*13*/:
                return true;
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new UnsupportedOperationException("Unknown interactive type");
        }
    }

    /* renamed from: C */
    public final boolean m25856C() {
        AnonymousClass3kR anonymousClass3kR = this.f60576E;
        return anonymousClass3kR != null && anonymousClass3kR.isShowing();
    }

    /* renamed from: C */
    private static boolean m25852C(AnonymousClass0ZF anonymousClass0ZF) {
        if (AnonymousClass1RD.f18577B[anonymousClass0ZF.f6315W.ordinal()] == 1 && anonymousClass0ZF.f6306N.f28169H == null) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    private void m25853D(AnonymousClass0ZF anonymousClass0ZF, int i, int i2, int i3, TextureView textureView, IgProgressImageView igProgressImageView) {
        float H;
        int i4;
        View contentView;
        int i5;
        boolean z;
        int height;
        AnonymousClass3kR anonymousClass3kR;
        View view;
        AnonymousClass3kS anonymousClass3kS = new AnonymousClass3kS(this.f60575D, JsonProperty.USE_DEFAULT_NAME, AnonymousClass3kM.INSET, AnonymousClass3kM.CLIP, AnonymousClass3kM.INSET, AnonymousClass3kM.CLIP, AnonymousClass1ff.STORIES);
        anonymousClass3kS.f43981L = false;
        anonymousClass3kS.f43972C = false;
        anonymousClass3kS.f43983N = false;
        AnonymousClass0ZF anonymousClass0ZF2 = anonymousClass0ZF;
        switch (anonymousClass0ZF2.f6315W.ordinal()) {
            case 1:
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
            case 11:
                anonymousClass3kS.f43988S = AnonymousClass3kU.WITH_CIRCULAR_IMAGE_LEFT;
                break;
            case 2:
            case 3:
            case 8:
            case ParserMinimalBase.INT_CR /*13*/:
                Context context = r0.f60574C;
                View inflate = LayoutInflater.from(context).inflate(C0164R.layout.reel_tagging_title_subtitle_popup_bubble, null);
                ((TextView) inflate.findViewById(C0164R.id.tooltip_bold_text)).setText(anonymousClass0ZF2.E(context.getResources()));
                TextView textView = (TextView) inflate.findViewById(C0164R.id.tooltip_plain_text);
                if (TextUtils.isEmpty(anonymousClass0ZF2.f6294B)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(anonymousClass0ZF2.f6294B);
                    textView.setVisibility(0);
                }
                anonymousClass3kS.f43988S = AnonymousClass3kU.WITH_CUSTOM_VIEW;
                anonymousClass3kS.f43975F = inflate;
                break;
            case 10:
                anonymousClass3kS.f43988S = AnonymousClass3kU.WITH_SQUARE_IMAGE_LEFT;
                break;
            case 12:
                anonymousClass3kS.f43985P = anonymousClass0ZF2.E(r0.f60574C.getResources());
                break;
            default:
                throw new UnsupportedOperationException("Unsupported interactive type for popup bubble");
        }
        r0.f60576E = anonymousClass3kS.A();
        Bitmap bitmap = null;
        if (r0.f60573B.CX()) {
            Bitmap bitmap2 = r0.f60577F;
            TextureView textureView2 = textureView;
            if (bitmap2 == null) {
                r0.f60577F = Bitmap.createBitmap(textureView2.getWidth() / 10, textureView2.getHeight() / 10, Config.ARGB_8888);
            } else {
                bitmap2.eraseColor(0);
            }
            textureView2.getBitmap(r0.f60577F);
            bitmap = r0.f60577F;
        } else {
            Drawable drawable = igProgressImageView.getIgImageView().getDrawable();
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
                Matrix matrix = new Matrix();
                matrix.setScale(0.15f, 0.15f);
                H = AnonymousClass0Nm.H(r0.f60574C.getResources().getDisplayMetrics());
                float width = (((float) bitmap3.getWidth()) * 1.0f) / ((float) bitmap3.getHeight());
                int width2 = bitmap3.getWidth();
                int height2 = bitmap3.getHeight();
                if (H > width) {
                    height2 = (int) (((float) bitmap3.getWidth()) / H);
                } else if (H < width) {
                    width2 = (int) (((float) bitmap3.getHeight()) * H);
                }
                bitmap = Bitmap.createBitmap(bitmap3, (bitmap3.getWidth() - width2) / 2, (bitmap3.getHeight() - height2) / 2, width2, height2, matrix, false);
            }
        }
        if (bitmap != null) {
            BlurUtil.blurInPlace(bitmap, 20);
            H = (((float) AnonymousClass0Nm.J(r0.f60574C)) * 1.0f) / ((float) bitmap.getWidth());
            AnonymousClass3kB anonymousClass3kB = r0.f60576E.f43950C;
            MaskingFrameLayout maskingFrameLayout = anonymousClass3kB.f43924B;
            maskingFrameLayout.f43998B = bitmap;
            maskingFrameLayout.f43999C = H;
            maskingFrameLayout.invalidate();
            maskingFrameLayout = anonymousClass3kB.f43926D;
            maskingFrameLayout.f43998B = bitmap;
            maskingFrameLayout.f43999C = H;
            maskingFrameLayout.invalidate();
            maskingFrameLayout = anonymousClass3kB.f43928F;
            maskingFrameLayout.f43998B = bitmap;
            maskingFrameLayout.f43999C = H;
            maskingFrameLayout.invalidate();
        }
        View contentView2 = r0.f60576E.getContentView();
        int i6 = AnonymousClass1RD.f18577B[anonymousClass0ZF2.f6315W.ordinal()];
        if (i6 != 6) {
            switch (i6) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    break;
            }
        }
        IgImageView igImageView = (IgImageView) contentView2.findViewById(C0164R.id.reel_tagging_bubble_image);
        TextView textView2 = (TextView) contentView2.findViewById(C0164R.id.reel_tagging_bubble_title);
        textView2.setText(anonymousClass0ZF2.E(contentView2.getResources()));
        if (anonymousClass0ZF2.f6315W != AnonymousClass15c.PRODUCT || anonymousClass0ZF2.B().f4993O == AnonymousClass0Sj.APPROVED) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, C0164R.drawable.reel_tagging_chevron, 0);
        } else {
            ((TextView) contentView2.findViewById(C0164R.id.reel_tagging_bubble_subtitle)).setVisibility(0);
        }
        String str = null;
        if (anonymousClass0ZF2.f6315W != AnonymousClass15c.MENTION) {
            if (anonymousClass0ZF2.f6315W != AnonymousClass15c.MENTION_RESHARE) {
                if (anonymousClass0ZF2.f6315W == AnonymousClass15c.MUSIC_OVERLAY) {
                    str = anonymousClass0ZF2.f6306N.f28169H.DQ();
                    i4 = C0164R.string.music_overlay_artist_profile_description;
                } else {
                    i4 = C0164R.string.product_photo_description;
                    if (anonymousClass0ZF2.B().E() != null) {
                        str = anonymousClass0ZF2.B().E().E();
                    } else if (anonymousClass0ZF2.B().B() != null) {
                        str = anonymousClass0ZF2.B().B().E();
                    }
                }
                if (str == null) {
                    igImageView.setUrl(str);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Null image given to popup bubble of type ");
                    stringBuilder.append(anonymousClass0ZF2.f6315W.A());
                    AnonymousClass0Gn.C("ReelInteractiveController", stringBuilder.toString());
                }
                igImageView.setContentDescription(contentView2.getResources().getString(i4));
                igImageView.setVisibility(0);
                i6 = MeasureSpec.makeMeasureSpec(0, 0);
                contentView = r0.f60576E.getContentView();
                contentView.measure(i6, i6);
                r0.f60576E.f43962O = new AnonymousClass59H(r0, anonymousClass0ZF2);
                i5 = i3 / 4;
                z = i2 - i5 >= contentView.getMeasuredHeight();
                height = r0.f60575D.getHeight();
                if (z) {
                    i5 = -i5;
                }
                i6 = Math.min(height, Math.max(0, i2 + i5));
                anonymousClass3kR = r0.f60576E;
                view = r0.f60575D;
                anonymousClass3kR.B(view, z, i - (view.getWidth() / 2), i6 - (r0.f60575D.getHeight() / 2));
            }
        }
        str = anonymousClass0ZF2.f6317Y.DQ();
        i4 = C0164R.string.profile_photo_description;
        if (str == null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Null image given to popup bubble of type ");
            stringBuilder2.append(anonymousClass0ZF2.f6315W.A());
            AnonymousClass0Gn.C("ReelInteractiveController", stringBuilder2.toString());
        } else {
            igImageView.setUrl(str);
        }
        igImageView.setContentDescription(contentView2.getResources().getString(i4));
        igImageView.setVisibility(0);
        i6 = MeasureSpec.makeMeasureSpec(0, 0);
        contentView = r0.f60576E.getContentView();
        contentView.measure(i6, i6);
        r0.f60576E.f43962O = new AnonymousClass59H(r0, anonymousClass0ZF2);
        i5 = i3 / 4;
        if (i2 - i5 >= contentView.getMeasuredHeight()) {
        }
        height = r0.f60575D.getHeight();
        if (z) {
            i5 = -i5;
        }
        i6 = Math.min(height, Math.max(0, i2 + i5));
        anonymousClass3kR = r0.f60576E;
        view = r0.f60575D;
        anonymousClass3kR.B(view, z, i - (view.getWidth() / 2), i6 - (r0.f60575D.getHeight() / 2));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: D */
    public final boolean m25857D(X.AnonymousClass0ZF r4, int r5, int r6, int r7, android.view.TextureView r8, com.instagram.feed.widget.IgProgressImageView r9) {
        /*
        r3 = this;
        r2 = 0;
        r1 = 1;
        r3.m25855B(r2, r1);
        r0 = X.AnonymousClass59I.m25851B(r4);
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return r2;
    L_0x000c:
        r0 = X.AnonymousClass59I.m25852C(r4);
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r3.f60573B;
        r0.Bw(r4);
        return r1;
    L_0x0018:
        r0 = r3.f60573B;
        r0.Aw(r4);
        r0 = r4.f6315W;
        r0 = r0.ordinal();
        switch(r0) {
            case 1: goto L_0x0032;
            case 2: goto L_0x0032;
            case 3: goto L_0x0032;
            case 4: goto L_0x0035;
            case 5: goto L_0x0035;
            case 6: goto L_0x0035;
            case 7: goto L_0x0032;
            case 8: goto L_0x0032;
            case 10: goto L_0x0032;
            case 11: goto L_0x0032;
            case 12: goto L_0x002e;
            case 13: goto L_0x0032;
            default: goto L_0x0026;
        };
    L_0x0026:
        r1 = new java.lang.UnsupportedOperationException;
        r0 = "Unknown interactive type";
        r1.<init>(r0);
        throw r1;
    L_0x002e:
        r0 = r4.f6302J;
        if (r0 != 0) goto L_0x0035;
    L_0x0032:
        r3.m25853D(r4, r5, r6, r7, r8, r9);
    L_0x0035:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.59I.D(X.0ZF, int, int, int, android.view.TextureView, com.instagram.feed.widget.IgProgressImageView):boolean");
    }

    /* renamed from: E */
    public final boolean m25858E(float f, float f2, float f3, List list, TextureView textureView, IgProgressImageView igProgressImageView) {
        int width = this.f60575D.getWidth();
        int height = this.f60575D.getHeight();
        if (list != null) {
            for (AnonymousClass0ZF anonymousClass0ZF : list) {
                if (!anonymousClass0ZF.F()) {
                    float f4 = f3;
                    if (AnonymousClass15n.B(anonymousClass0ZF, f, f2, width, height, f4)) {
                        float[] C = AnonymousClass15n.C(anonymousClass0ZF, r11.f60578G, f4, width, height);
                        if (m25853D(anonymousClass0ZF, (int) C[0], (int) C[1], r11.f60578G.height(), textureView, igProgressImageView)) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }
}
