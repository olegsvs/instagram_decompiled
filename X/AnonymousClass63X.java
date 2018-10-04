package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import com.facebook.C0164R;
import com.instagram.model.shopping.ProductTag;
import com.instagram.shopping.widget.RejectedProductTagDialog;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TagSerializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.63X */
public final class AnonymousClass63X implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ RejectedProductTagDialog f71331B;

    public AnonymousClass63X(RejectedProductTagDialog rejectedProductTagDialog) {
        this.f71331B = rejectedProductTagDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (RejectedProductTagDialog.B(this.f71331B).equals(this.f71331B.f5009H[i])) {
            AnonymousClass0GA H;
            if (this.f71331B.f5008G.eB) {
                RejectedProductTagDialog rejectedProductTagDialog = this.f71331B;
                AnonymousClass0Sl.D(rejectedProductTagDialog.f5010I, AnonymousClass0Sj.REJECTED, rejectedProductTagDialog.f5008G, rejectedProductTagDialog.f5006E);
                AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(rejectedProductTagDialog.f5011J);
                anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
                anonymousClass0Pt.f4229M = AnonymousClass0IE.E("commerce/story/%s/remove_product_sticker/", new Object[]{rejectedProductTagDialog.f5008G.EA()});
                AnonymousClass0Pt N = anonymousClass0Pt.M(AnonymousClass3cV.class).N();
                N.D("product_id", rejectedProductTagDialog.f5010I);
                H = N.H();
                H.f2849B = new AnonymousClass63Y(rejectedProductTagDialog);
                AnonymousClass0Ix.D(H);
                return;
            }
            RejectedProductTagDialog rejectedProductTagDialog2 = this.f71331B;
            Tag C = RejectedProductTagDialog.C(rejectedProductTagDialog2);
            if (C != null) {
                AnonymousClass0Sl.D(C.A(), C.f17742B.f4993O, rejectedProductTagDialog2.f5008G, rejectedProductTagDialog2.f5006E);
                AnonymousClass0Pt anonymousClass0Pt2 = new AnonymousClass0Pt(rejectedProductTagDialog2.f5011J);
                anonymousClass0Pt2.f4226J = AnonymousClass0Pu.f4247G;
                anonymousClass0Pt2.f4229M = AnonymousClass0IE.E("media/%s/edit_media/", new Object[]{rejectedProductTagDialog2.f5008G.getId()});
                AnonymousClass0Pt N2 = anonymousClass0Pt2.M(AnonymousClass3cV.class).D("device_id", AnonymousClass0Dt.B(rejectedProductTagDialog2.f5003B)).N();
                try {
                    if (rejectedProductTagDialog2.f5008G.kA()) {
                        String str = "children_product_tags";
                        Map hashMap = new HashMap();
                        dialogInterface = rejectedProductTagDialog2.f5008G.U();
                        for (String str2 : dialogInterface.keySet()) {
                            List<ProductTag> list = (List) dialogInterface.get(str2);
                            AnonymousClass0LH.E(list);
                            List arrayList = new ArrayList();
                            for (ProductTag productTag : list) {
                                if (productTag.A().equals(rejectedProductTagDialog2.f5010I)) {
                                    list.remove(productTag);
                                    arrayList.add(productTag);
                                    break;
                                }
                            }
                            hashMap.put(str2, TagSerializer.B(list, arrayList));
                        }
                        N2.G(str, new JSONObject(hashMap).toString());
                    } else {
                        List v = rejectedProductTagDialog2.f5008G.v();
                        AnonymousClass0LH.E(v);
                        List arrayList2 = new ArrayList();
                        arrayList2.add(C);
                        v.remove(C);
                        N2.D("product_tags", TagSerializer.B(v, arrayList2));
                    }
                } catch (Throwable e) {
                    AnonymousClass0Dc.G("com.instagram.shopping.widget.RejectedProductTagDialog", "Unable to parse product tag", e);
                }
                H = N2.H();
                H.f2849B = new AnonymousClass63Y(rejectedProductTagDialog2);
                AnonymousClass0Ix.D(H);
            }
        } else if (this.f71331B.f5003B.getString(C0164R.string.learn_more).equals(this.f71331B.f5009H[i])) {
            AnonymousClass0IW.T(Uri.parse("https://www.facebook.com/business/help/1944109912526524"), this.f71331B.f5003B);
        } else if (this.f71331B.f5003B.getString(C0164R.string.ok).equals(this.f71331B.f5009H[i])) {
            this.f71331B.f5005D.dismiss();
        }
    }
}
