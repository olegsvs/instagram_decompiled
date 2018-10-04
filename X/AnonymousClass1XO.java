package X;

import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.android.internal.util.Predicate;
import com.instagram.model.fbfriend.FbFriend;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1XO */
public final class AnonymousClass1XO extends Filter {
    /* renamed from: B */
    private final AnonymousClass3Zy f19736B;
    /* renamed from: C */
    private final List f19737C;
    /* renamed from: D */
    private final Predicate f19738D;
    /* renamed from: E */
    private final AnonymousClass0ZO f19739E;
    /* renamed from: F */
    private final Predicate f19740F;
    /* renamed from: G */
    private final AnonymousClass1BN f19741G;

    public AnonymousClass1XO(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3Zy anonymousClass3Zy, List list, List list2) {
        this.f19741G = AnonymousClass1BN.m9801C(anonymousClass0Cm);
        AnonymousClass0JH anonymousClass0JH = AnonymousClass0JH.f2904C;
        if (anonymousClass0JH != null) {
            this.f19739E = anonymousClass0JH.mo550A(anonymousClass0Cm);
        } else {
            this.f19739E = null;
        }
        this.f19737C = Collections.singletonList(anonymousClass0Cm.m1037B());
        this.f19736B = anonymousClass3Zy;
        this.f19740F = new AnonymousClass3Zz(this, list);
        this.f19738D = new AnonymousClass3a0(this, list2);
    }

    public final FilterResults performFiltering(CharSequence charSequence) {
        Collection emptyList;
        Collection emptyList2;
        Object G = AnonymousClass0IE.m2139G(charSequence);
        if (TextUtils.isEmpty(G)) {
            emptyList = Collections.emptyList();
            emptyList2 = Collections.emptyList();
        } else {
            Collection hashSet = new HashSet();
            this.f19741G.m9810B("autocomplete_user_list", G, hashSet, this.f19740F);
            AnonymousClass3ng.B(G, hashSet, this.f19737C, this.f19740F);
            emptyList = new ArrayList(hashSet);
            this.f19741G.m9812D("autocomplete_user_list", emptyList, null);
            if (this.f19739E != null) {
                emptyList2 = new ArrayList();
                AnonymousClass0ZO anonymousClass0ZO = this.f19739E;
                Predicate predicate = this.f19738D;
                synchronized (anonymousClass0ZO) {
                    anonymousClass0ZO.m5365A();
                    if (!TextUtils.isEmpty(G)) {
                        AnonymousClass0Wq anonymousClass0Wq = anonymousClass0ZO.f6332G;
                        if (!G.isEmpty()) {
                            int C = AnonymousClass0Wq.m5161C(G);
                            if (anonymousClass0Wq.m5166E(C) != null) {
                                for (FbFriend fbFriend : anonymousClass0Wq.m5166E(C)) {
                                    Object obj = fbFriend.f9869C;
                                    if (!TextUtils.isEmpty(obj) && AnonymousClass0IE.m2149Q(obj, G)) {
                                        if (predicate == null || predicate.apply(fbFriend)) {
                                            emptyList2.add(fbFriend);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                emptyList2 = Collections.emptyList();
            }
        }
        List arrayList = new ArrayList(emptyList.size() + emptyList2.size());
        arrayList.addAll(emptyList);
        arrayList.addAll(emptyList2);
        FilterResults filterResults = new FilterResults();
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    public final void publishResults(CharSequence charSequence, FilterResults filterResults) {
        charSequence = this.f19736B;
        List list = (List) filterResults.values;
        charSequence.f42374D.clear();
        charSequence.f42372B.clear();
        if (list != null) {
            for (Object next : list) {
                if (next instanceof AnonymousClass0Ci) {
                    charSequence.f42374D.add((AnonymousClass0Ci) next);
                } else if (next instanceof FbFriend) {
                    charSequence.f42372B.add((FbFriend) next);
                }
            }
        }
        charSequence.f42373C = false;
        charSequence.H();
    }
}
