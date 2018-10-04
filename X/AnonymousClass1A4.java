package X;

import com.facebook.C0164R;
import com.instagram.tagging.widget.TagHintsLayout;

/* renamed from: X.1A4 */
public final class AnonymousClass1A4 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ TagHintsLayout f15222B;

    public AnonymousClass1A4(TagHintsLayout tagHintsLayout) {
        this.f15222B = tagHintsLayout;
    }

    public final void run() {
        TagHintsLayout tagHintsLayout = this.f15222B;
        tagHintsLayout.f12548D = TagHintsLayout.m8535C(tagHintsLayout, C0164R.animator.tag_hint_show_animation);
        this.f15222B.f12548D.addListener(new AnonymousClass1Zs(this));
        this.f15222B.f12548D.start();
    }
}
