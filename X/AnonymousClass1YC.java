package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C0164R;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.model.fbfriend.FbFriendTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.ProductTag;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.tagging.activity.MediaTaggingInfo;
import com.instagram.tagging.activity.TagActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1YC */
public final class AnonymousClass1YC {
    /* renamed from: B */
    public static float m11819B(MediaTaggingInfo mediaTaggingInfo) {
        if (mediaTaggingInfo.f43450E) {
            return mediaTaggingInfo.f43448C;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(Uri.parse(mediaTaggingInfo.f43453H).getPath(), options);
        return ((float) options.outWidth) / ((float) options.outHeight);
    }

    /* renamed from: C */
    public static String m11820C(int i, Resources resources) {
        if (i == 0) {
            return resources.getString(C0164R.string.people_tagging_add_people);
        }
        return resources.getQuantityString(C0164R.plurals.x_people, i, new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: D */
    public static ArrayList m11821D(String str, String str2, float f, int i, AnonymousClass0ON anonymousClass0ON, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        MediaTaggingInfo mediaTaggingInfo = new MediaTaggingInfo(str, str2, anonymousClass0ON, arrayList, arrayList2, arrayList3);
        if (f > 0.0f) {
            mediaTaggingInfo.f43448C = f;
            mediaTaggingInfo.f43450E = true;
        }
        mediaTaggingInfo.f43447B = i;
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(mediaTaggingInfo);
        return arrayList4;
    }

    /* renamed from: E */
    public static Intent m11822E(Context context, String str, ArrayList arrayList, int i, int i2) {
        Bundle K = AnonymousClass1YC.m11828K(str, AnonymousClass1A1.PEOPLE, arrayList, i, i2);
        Intent intent = new Intent(context, TagActivity.class);
        intent.putExtras(K);
        return intent;
    }

    /* renamed from: F */
    public static Intent m11823F(Context context, String str, String str2, float f, String str3, AnonymousClass0ON anonymousClass0ON, ArrayList arrayList) {
        return AnonymousClass1YC.m11824G(context, str, AnonymousClass1YC.m11821D(str2, str3, f, 0, anonymousClass0ON, null, null, arrayList), 5);
    }

    /* renamed from: G */
    public static Intent m11824G(Context context, String str, ArrayList arrayList, int i) {
        Bundle K = AnonymousClass1YC.m11828K(str, AnonymousClass1A1.PRODUCT, arrayList, i, 0);
        Intent intent = new Intent(context, TagActivity.class);
        intent.putExtras(K);
        return intent;
    }

    /* renamed from: H */
    public static int m11825H(CreationSession creationSession) {
        List arrayList = new ArrayList();
        for (MediaSession B : creationSession.I()) {
            AnonymousClass0OA A = PendingMediaStore.m3537C().m3539A(B.B());
            if (A != null) {
                ArrayList arrayList2 = A.HC;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ProductTag productTag = (ProductTag) arrayList2.get(i);
                    if (!arrayList.contains(productTag.m9781A())) {
                        arrayList.add(productTag.m9781A());
                    }
                }
            }
        }
        return arrayList.size();
    }

    /* renamed from: I */
    public static List m11826I(CreationSession creationSession) {
        List arrayList = new ArrayList();
        for (MediaSession B : creationSession.I()) {
            int i;
            AnonymousClass0OA A = PendingMediaStore.m3537C().m3539A(B.B());
            ArrayList arrayList2 = A.yB;
            int size = arrayList2.size();
            for (i = 0; i < size; i++) {
                PeopleTag peopleTag = (PeopleTag) arrayList2.get(i);
                if (!arrayList.contains(peopleTag.m9780E())) {
                    arrayList.add(peopleTag.m9780E());
                }
            }
            ArrayList arrayList3 = A.f3834v;
            i = arrayList3.size();
            for (int i2 = 0; i2 < i; i2++) {
                FbFriendTag fbFriendTag = (FbFriendTag) arrayList3.get(i2);
                if (!arrayList.contains(fbFriendTag.E())) {
                    arrayList.add(fbFriendTag.E());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: J */
    public static List m11827J(List list) {
        List arrayList = new ArrayList();
        for (PeopleTag peopleTag : list) {
            if (AnonymousClass0Cg.f1704B.m978B(peopleTag.m9781A()) == null) {
                AnonymousClass0Ci anonymousClass0Ci = new AnonymousClass0Ci();
                anonymousClass0Ci.NB = peopleTag.f15362B.getId();
                anonymousClass0Ci.RC = peopleTag.m9780E();
                anonymousClass0Ci.f1757z = peopleTag.f15362B.f15364B;
                anonymousClass0Ci.vB = peopleTag.f15362B.f15365C;
                arrayList.add(anonymousClass0Ci);
            } else {
                arrayList.add(AnonymousClass0Cg.f1704B.m978B(peopleTag.m9781A()));
            }
        }
        return arrayList;
    }

    /* renamed from: K */
    private static Bundle m11828K(String str, AnonymousClass1A1 anonymousClass1A1, ArrayList arrayList, int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", str);
        bundle.putSerializable("tag_type", anonymousClass1A1);
        bundle.putParcelableArrayList("media_tagging_info_list", arrayList);
        bundle.putInt("max_tags_remaining", i);
        bundle.putInt("initial_page", i2);
        return bundle;
    }
}
