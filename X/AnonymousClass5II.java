package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Pattern;

/* renamed from: X.5II */
public final class AnonymousClass5II implements AnonymousClass3kY {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5IK f61840B;

    public AnonymousClass5II(AnonymousClass5IK anonymousClass5IK) {
        this.f61840B = anonymousClass5IK;
    }

    public final void searchTextChanged(String str) {
        this.f61840B.f61842B = str;
        if (str.isEmpty()) {
            AnonymousClass5IK.m26176C(this.f61840B);
            return;
        }
        Collection arrayList = new ArrayList();
        for (Object next : this.f61840B.f61843C) {
            if (Pattern.compile(Pattern.quote(str), 2).matcher(AnonymousClass5IK.m26175B(this.f61840B, next)).find()) {
                arrayList.add(next);
            }
        }
        this.f61840B.setItems(arrayList);
    }
}
