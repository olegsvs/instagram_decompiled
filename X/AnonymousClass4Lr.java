package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Lr */
public final class AnonymousClass4Lr implements OnTouchListener {
    /* renamed from: B */
    public Bitmap f53112B;
    /* renamed from: C */
    public ImageView f53113C;
    /* renamed from: D */
    public FrameLayout f53114D;
    /* renamed from: E */
    public final AnonymousClass0ct f53115E;
    /* renamed from: F */
    public final AnonymousClass2Ki f53116F;
    /* renamed from: G */
    public final ViewStub f53117G;
    /* renamed from: H */
    public final EyedropperColorPickerTool f53118H;
    /* renamed from: I */
    public boolean f53119I;
    /* renamed from: J */
    public final List f53120J = new ArrayList();
    /* renamed from: K */
    public float f53121K;
    /* renamed from: L */
    public float f53122L;
    /* renamed from: M */
    public final MultiListenerTextureView f53123M;
    /* renamed from: N */
    public final InteractiveDrawableContainer f53124N;
    /* renamed from: O */
    public final MultiListenerTextureView f53125O;
    /* renamed from: P */
    public View f53126P;
    /* renamed from: Q */
    private int f53127Q = -1;
    /* renamed from: R */
    private final AnonymousClass1md f53128R;

    public AnonymousClass4Lr(View view, InteractiveDrawableContainer interactiveDrawableContainer, AnonymousClass0ct anonymousClass0ct) {
        Resources resources = view.getResources();
        Context context = view.getContext();
        this.f53126P = view;
        this.f53117G = (ViewStub) view.findViewById(C0164R.id.eyedropper_color_picker_stub);
        this.f53118H = (EyedropperColorPickerTool) view.findViewById(C0164R.id.eyedropper_color_picker_tool);
        this.f53123M = (MultiListenerTextureView) view.findViewById(C0164R.id.camera_photo_texture_view);
        this.f53125O = (MultiListenerTextureView) view.findViewById(C0164R.id.camera_video_preview);
        this.f53124N = interactiveDrawableContainer;
        this.f53115E = anonymousClass0ct;
        AnonymousClass1md anonymousClass1md = new AnonymousClass1md(context, new AnonymousClass4Lp(this));
        this.f53128R = anonymousClass1md;
        anonymousClass1md.f22620B.qOA(false);
        this.f53116F = new AnonymousClass2Ki(resources);
        this.f53118H.setOnClickListener(new AnonymousClass4Ln(this));
    }

    /* renamed from: A */
    public final void m23967A(AnonymousClass4Lq anonymousClass4Lq) {
        if (!this.f53120J.contains(anonymousClass4Lq)) {
            this.f53120J.add(anonymousClass4Lq);
        }
    }

    /* renamed from: B */
    public static float m23961B(AnonymousClass4Lr anonymousClass4Lr) {
        float x = anonymousClass4Lr.f53113C.getX();
        AnonymousClass2Ki anonymousClass2Ki = anonymousClass4Lr.f53116F;
        return x + ((float) (((anonymousClass2Ki.f29079L / 2) + anonymousClass2Ki.f29076I) + anonymousClass2Ki.f29070C));
    }

    /* renamed from: B */
    public final void m23968B() {
        if (m23969C()) {
            m23966G();
            for (int i = 0; i < this.f53120J.size(); i++) {
                ((AnonymousClass4Lq) this.f53120J.get(i)).El();
            }
        }
    }

    /* renamed from: C */
    public static float m23962C(AnonymousClass4Lr anonymousClass4Lr) {
        float y = anonymousClass4Lr.f53113C.getY();
        AnonymousClass2Ki anonymousClass2Ki = anonymousClass4Lr.f53116F;
        return y + (((float) anonymousClass2Ki.f29072E) - anonymousClass2Ki.f29069B);
    }

    /* renamed from: C */
    public final boolean m23969C() {
        FrameLayout frameLayout = this.f53114D;
        return frameLayout != null && frameLayout.getVisibility() == 0;
    }

    /* renamed from: D */
    public static void m23963D(AnonymousClass4Lr anonymousClass4Lr, float f) {
        anonymousClass4Lr.f53121K = Math.max((float) ((-anonymousClass4Lr.f53114D.getWidth()) / 2), Math.min(f, (float) (anonymousClass4Lr.f53114D.getWidth() / 2)));
        anonymousClass4Lr.f53113C.setTranslationX(anonymousClass4Lr.f53121K);
        anonymousClass4Lr.f53113C.setTranslationY(anonymousClass4Lr.f53122L);
    }

    /* renamed from: E */
    public static void m23964E(AnonymousClass4Lr anonymousClass4Lr, float f) {
        float f2 = (float) ((-anonymousClass4Lr.f53114D.getHeight()) / 2);
        AnonymousClass2Ki anonymousClass2Ki = anonymousClass4Lr.f53116F;
        f2 = (f2 - (((float) anonymousClass2Ki.f29072E) - anonymousClass2Ki.f29069B)) + ((float) (anonymousClass4Lr.f53116F.getIntrinsicHeight() / 2));
        float height = (float) (anonymousClass4Lr.f53114D.getHeight() / 2);
        anonymousClass2Ki = anonymousClass4Lr.f53116F;
        anonymousClass4Lr.f53122L = Math.max(f2, Math.min(f, (height - (((float) anonymousClass2Ki.f29072E) - anonymousClass2Ki.f29069B)) + ((float) (anonymousClass4Lr.f53116F.getIntrinsicHeight() / 2))));
        anonymousClass4Lr.f53113C.setTranslationX(anonymousClass4Lr.f53121K);
        anonymousClass4Lr.f53113C.setTranslationY(anonymousClass4Lr.f53122L);
    }

    /* renamed from: F */
    public static void m23965F(AnonymousClass4Lr anonymousClass4Lr) {
        anonymousClass4Lr.f53127Q = anonymousClass4Lr.f53112B.getPixel((int) Math.max(0.0f, Math.min(AnonymousClass4Lr.m23961B(anonymousClass4Lr), (float) (anonymousClass4Lr.f53112B.getWidth() - 1))), (int) Math.max(0.0f, Math.min(AnonymousClass4Lr.m23962C(anonymousClass4Lr), (float) (anonymousClass4Lr.f53112B.getHeight() - 1))));
        AnonymousClass2Ki anonymousClass2Ki = anonymousClass4Lr.f53116F;
        anonymousClass2Ki.f29071D.setColor(anonymousClass4Lr.f53127Q);
        anonymousClass2Ki.invalidateSelf();
        anonymousClass4Lr.f53118H.setColor(anonymousClass4Lr.f53127Q);
        for (int i = 0; i < anonymousClass4Lr.f53120J.size(); i++) {
            ((AnonymousClass4Lq) anonymousClass4Lr.f53120J.get(i)).Il(anonymousClass4Lr.f53127Q);
        }
    }

    /* renamed from: G */
    private void m23966G() {
        if (m23969C()) {
            AnonymousClass14H.E(true, new View[]{this.f53114D});
            this.f53118H.f29090E.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int B = AnonymousClass1mg.m13022B(motionEvent);
        if (B == 1 || B == 3) {
            for (int i = 0; i < this.f53120J.size(); i++) {
                ((AnonymousClass4Lq) this.f53120J.get(i)).Fl(this.f53127Q);
            }
            m23966G();
        }
        this.f53128R.f22620B.zDA(motionEvent);
        return true;
    }
}
