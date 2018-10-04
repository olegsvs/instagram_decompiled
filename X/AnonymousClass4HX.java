package X;

import android.support.v7.widget.RecyclerView;
import com.instagram.common.gallery.GalleryItem;
import com.instagram.creation.base.MediaSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.4HX */
public final class AnonymousClass4HX implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5ST f52354B;
    /* renamed from: C */
    public final /* synthetic */ int f52355C;
    /* renamed from: D */
    public final /* synthetic */ List f52356D;

    public AnonymousClass4HX(AnonymousClass5ST anonymousClass5ST, int i, List list) {
        this.f52354B = anonymousClass5ST;
        this.f52355C = i;
        this.f52356D = list;
    }

    public final void run() {
        AnonymousClass3B8 anonymousClass3B8 = (AnonymousClass3B8) this.f52354B.f63924b.f38679N.get(Integer.valueOf(this.f52355C));
        AnonymousClass5ST anonymousClass5ST = this.f52354B;
        List<String> list = this.f52356D;
        List arrayList = new ArrayList();
        for (MediaSession B : anonymousClass5ST.f63902F.m18972I()) {
            arrayList.add(PendingMediaStore.C().A(B.m18991B()).f3837y);
        }
        List<String> arrayList2 = new ArrayList();
        for (String str : list) {
            Object obj;
            AnonymousClass4J1 anonymousClass4J1;
            Object obj2;
            if (anonymousClass5ST.f63902F.m18980Q()) {
                if (!arrayList.contains(str)) {
                    obj = null;
                    anonymousClass4J1 = anonymousClass5ST.f63918V;
                    if (!AnonymousClass4J1.m23800B(anonymousClass4J1.f52577C, str)) {
                        if (AnonymousClass4J1.m23800B(anonymousClass4J1.f52585K, str)) {
                            obj2 = null;
                            if (!(obj2 == null || r3 == null)) {
                                arrayList2.add(str);
                            }
                        }
                    }
                    obj2 = 1;
                    arrayList2.add(str);
                }
            }
            obj = 1;
            anonymousClass4J1 = anonymousClass5ST.f63918V;
            if (AnonymousClass4J1.m23800B(anonymousClass4J1.f52577C, str)) {
                if (AnonymousClass4J1.m23800B(anonymousClass4J1.f52585K, str)) {
                    obj2 = null;
                    arrayList2.add(str);
                }
            }
            obj2 = 1;
            arrayList2.add(str);
        }
        boolean z = false;
        if (anonymousClass3B8 != null && !arrayList2.isEmpty()) {
            this.f52354B.f63924b.m18875E(this.f52355C);
            AnonymousClass4J1 anonymousClass4J12 = this.f52354B.f63918V;
            arrayList = new ArrayList();
            Map D = AnonymousClass4J1.m23802D(anonymousClass4J12.f52585K);
            Map D2 = AnonymousClass4J1.m23802D(anonymousClass4J12.f52577C);
            for (String str2 : arrayList2) {
                obj2 = null;
                if (D.containsKey(str2)) {
                    obj2 = (GalleryItem) D.get(str2);
                } else if (D2.containsKey(str2)) {
                    obj2 = (GalleryItem) D2.get(str2);
                }
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
            RecyclerView recyclerView = this.f52354B.f63917U;
            recyclerView.setAdapter(recyclerView.getAdapter());
            if (this.f52354B.f63918V.f52586L || arrayList.size() > 1) {
                z = true;
            }
            AnonymousClass5ST.setMultiSelectEnabled(this.f52354B, z);
            this.f52354B.f63918V.m23814T(arrayList);
            AnonymousClass5ST.K(this.f52354B);
            if (this.f52354B.f52317B != null) {
                this.f52354B.f52317B.mActionBar.setSelectedFolder(anonymousClass3B8);
            }
        } else if (this.f52354B.f63918V.m23810P() == null) {
            this.f52354B.m23744F(-1, 0);
        } else {
            AnonymousClass5ST.K(this.f52354B);
            this.f52354B.f63924b.m18875E(-1);
            this.f52354B.f63918V.TRA(this.f52354B.f63918V.m23810P(), true, false);
        }
        AnonymousClass5ST.V(this.f52354B);
    }
}
