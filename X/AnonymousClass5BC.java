package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.facebook.C0164R;
import com.instagram.modal.ModalActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5BC */
public final class AnonymousClass5BC extends AnonymousClass0oo {
    /* renamed from: B */
    public final ImageView f60906B;
    /* renamed from: C */
    public AnonymousClass2Fo f60907C;
    /* renamed from: D */
    public boolean f60908D;
    /* renamed from: E */
    public final ImageView f60909E;
    /* renamed from: F */
    private final AnonymousClass5Zx f60910F;

    public AnonymousClass5BC(View view, AnonymousClass5Zx anonymousClass5Zx) {
        super(view);
        this.f60910F = anonymousClass5Zx;
        this.f60906B = (ImageView) view.findViewById(C0164R.id.edit_button);
        this.f60909E = (ImageView) view.findViewById(C0164R.id.sticker);
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.f60909E);
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14385E = new AnonymousClass5BA(this);
        anonymousClass15z.f14389I = 0.97f;
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f60906B);
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14385E = new AnonymousClass5BB(this);
        anonymousClass15z.A();
    }

    /* renamed from: B */
    public static void m25925B(AnonymousClass5BC anonymousClass5BC) {
        if (!anonymousClass5BC.f60908D) {
            AnonymousClass5Zx anonymousClass5Zx = anonymousClass5BC.f60910F;
            new AnonymousClass0Sb(anonymousClass5Zx.f66448B).O(C0164R.string.delete, new AnonymousClass5B5(anonymousClass5Zx, anonymousClass5BC.f60907C)).L(C0164R.string.cancel, new AnonymousClass5B3(anonymousClass5Zx)).C().show();
        }
    }

    /* renamed from: C */
    public static boolean m25926C(AnonymousClass5BC anonymousClass5BC) {
        AnonymousClass2Fo anonymousClass2Fo = anonymousClass5BC.f60907C;
        if (anonymousClass2Fo == null) {
            return false;
        }
        AnonymousClass5Zx anonymousClass5Zx = anonymousClass5BC.f60910F;
        Bundle bundle = new Bundle();
        bundle.putString("friend_list_id", anonymousClass2Fo.f28147B);
        new AnonymousClass0Sn(ModalActivity.class, "friend_list_editor", bundle, anonymousClass5Zx.f66448B, anonymousClass5Zx.f66450D.f1759C).B(anonymousClass5Zx.f66448B);
        return true;
    }

    /* renamed from: D */
    public static boolean m25927D(AnonymousClass5BC anonymousClass5BC) {
        if (anonymousClass5BC.f60908D) {
            AnonymousClass5Zx anonymousClass5Zx = anonymousClass5BC.f60910F;
            new AnonymousClass0Sn(ModalActivity.class, "friend_list_editor", new Bundle(), anonymousClass5Zx.f66448B, anonymousClass5Zx.f66450D.f1759C).B(anonymousClass5Zx.f66448B);
            return true;
        }
        AnonymousClass2Fo anonymousClass2Fo = anonymousClass5BC.f60907C;
        if (anonymousClass2Fo == null) {
            return false;
        }
        AnonymousClass5Zx anonymousClass5Zx2 = anonymousClass5BC.f60910F;
        Context context = anonymousClass5Zx2.f66448B;
        boolean booleanValue = ((Boolean) AnonymousClass0CC.bM.H(anonymousClass5Zx2.f66450D)).booleanValue();
        List<AnonymousClass2bS> arrayList = new ArrayList();
        if (booleanValue) {
            AnonymousClass2bS.D(context, arrayList, anonymousClass2Fo);
        }
        arrayList.add(new AnonymousClass2bS(AnonymousClass2Fn.VIBRANT, context, AnonymousClass2Fr.E(context), anonymousClass2Fo));
        if (!booleanValue) {
            AnonymousClass2bS.D(context, arrayList, anonymousClass2Fo);
        }
        arrayList.add(new AnonymousClass2bS(AnonymousClass2Fn.SUBTLE, context, AnonymousClass2Fr.E(context), anonymousClass2Fo));
        arrayList.add(new AnonymousClass2bS(AnonymousClass2Fn.INVISIBLE, context, AnonymousClass2Fr.E(context), anonymousClass2Fo));
        List arrayList2 = new ArrayList();
        List arrayList3 = new ArrayList();
        for (AnonymousClass2bS anonymousClass2bS : arrayList) {
            arrayList2.add(anonymousClass2bS);
            switch (anonymousClass2bS.f31407H.ordinal()) {
                case 1:
                    arrayList3.add("friend_sticker_vibrant");
                    break;
                case 3:
                    arrayList3.add("friend_sticker_facepile");
                    break;
                case 4:
                    arrayList3.add("friend_sticker_subtle");
                    break;
                case 5:
                    arrayList3.add("friend_sticker_hidden");
                    break;
                default:
                    arrayList3.add("unknown");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("type: ");
                    stringBuilder.append(anonymousClass2bS.f31407H);
                    AnonymousClass0Gn.H("invalid friends sticker type", stringBuilder.toString());
                    break;
            }
        }
        Drawable anonymousClass2VC = new AnonymousClass2VC(anonymousClass5Zx2.f66448B, arrayList2);
        anonymousClass2VC.f31024G = true;
        anonymousClass2VC.G(new AnonymousClass5B9(anonymousClass2VC));
        anonymousClass5Zx2.f66449C.xm(anonymousClass2Fo, anonymousClass2VC, arrayList3);
        return true;
    }
}
