package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import com.instagram.tagging.widget.TagHintsLayout;
import com.instagram.tagging.widget.TagsLayout;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.lang.ref.WeakReference;

/* renamed from: X.0vk */
public final class AnonymousClass0vk implements AnonymousClass0je {
    /* renamed from: B */
    public WeakReference f12129B;
    /* renamed from: C */
    public final AnonymousClass0vN f12130C = new AnonymousClass0vN(AnonymousClass0zg.FULLTEXT);
    /* renamed from: D */
    public final ViewStub f12131D;
    /* renamed from: E */
    public TagsLayout f12132E;
    /* renamed from: F */
    public TagHintsLayout f12133F;
    /* renamed from: G */
    public SlideInAndOutIconView f12134G;

    public AnonymousClass0vk(ViewStub viewStub, TagsLayout tagsLayout, TagHintsLayout tagHintsLayout) {
        this.f12131D = viewStub;
        this.f12132E = tagsLayout;
        this.f12133F = tagHintsLayout;
        this.f12132E.setTagType(AnonymousClass1A1.PRODUCT);
    }

    /* renamed from: B */
    public static void m8361B(View view, AnonymousClass0vN anonymousClass0vN) {
        if (view != null && view.getGlobalVisibleRect(new Rect())) {
            anonymousClass0vN.m8325A(null);
        }
    }

    /* renamed from: C */
    public static void m8362C(AnonymousClass0vk anonymousClass0vk) {
        if (anonymousClass0vk.f12134G == null) {
            anonymousClass0vk.f12134G = (SlideInAndOutIconView) anonymousClass0vk.f12131D.inflate();
            if (anonymousClass0vk.f12129B == null) {
                anonymousClass0vk.f12129B = new WeakReference(anonymousClass0vk.f12134G);
            }
            anonymousClass0vk.f12130C.f12064H = anonymousClass0vk.f12129B;
        }
    }

    /* renamed from: D */
    public static void m8363D(AnonymousClass0vk anonymousClass0vk, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, boolean z) {
        AnonymousClass0vk.m8362C(anonymousClass0vk);
        AnonymousClass0LH.m2927E(anonymousClass0vk.f12134G);
        anonymousClass0vk.f12132E.removeAllViews();
        anonymousClass0vk.f12132E.setTags(anonymousClass0P7.m3792v(), anonymousClass0P7, anonymousClass0m3.f9673H, z, null);
        if (z) {
            AnonymousClass0vk.m8361B(anonymousClass0vk.f12134G, anonymousClass0vk.f12130C);
        } else {
            anonymousClass0vk.f12134G.m8310B();
        }
        View view = anonymousClass0vk.f12134G;
        if (view != null && view.getVisibility() != 0) {
            view.clearAnimation();
            Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setDuration(200);
            alphaAnimation.setAnimationListener(new AnonymousClass1A3(view));
            view.startAnimation(alphaAnimation);
        }
    }

    public final void cr(AnonymousClass0m3 anonymousClass0m3, int i) {
        if (i != 2) {
            return;
        }
        if (anonymousClass0m3.f9708q) {
            TagHintsLayout tagHintsLayout = this.f12133F;
            tagHintsLayout.f12546B = new AnonymousClass1A4(tagHintsLayout);
            AnonymousClass0OR.m3626F(tagHintsLayout.f12547C, tagHintsLayout.f12546B, 3000, 319885844);
            return;
        }
        this.f12133F.m8536A();
    }
}
