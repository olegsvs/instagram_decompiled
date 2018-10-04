package X;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Ff */
public final class AnonymousClass4Ff {
    /* renamed from: B */
    private final SharedPreferences f51996B;

    public AnonymousClass4Ff(AnonymousClass0Cm anonymousClass0Cm) {
        this.f51996B = AnonymousClass0Mu.B(anonymousClass0Cm, "NAME_COMMENT_EMOJIS_SHARED_PREF");
    }

    /* renamed from: A */
    public final List m23659A() {
        int i = this.f51996B.getInt("KEY_EMOJI_COUNT", -1);
        if (i <= 0) {
            return null;
        }
        List arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            SharedPreferences sharedPreferences = this.f51996B;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("emoji_");
            stringBuilder.append(i2);
            arrayList.add(sharedPreferences.getString(stringBuilder.toString(), null));
        }
        return arrayList;
    }

    /* renamed from: B */
    public final void m23660B(List list) {
        Editor edit = this.f51996B.edit();
        edit.putInt("KEY_EMOJI_COUNT", list.size());
        for (int i = 0; i < list.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("emoji_");
            stringBuilder.append(i);
            edit.putString(stringBuilder.toString(), ((AnonymousClass2Hj) list.get(i)).f28577D);
        }
        edit.apply();
    }
}
