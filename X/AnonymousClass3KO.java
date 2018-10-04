package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3KO */
public final class AnonymousClass3KO {
    /* renamed from: B */
    public static List m19414B(Context context) {
        context = AccountManager.get(context).getAccounts();
        List arrayList = new ArrayList();
        for (Account account : context) {
            if (AnonymousClass0IE.L(account.name) && !arrayList.contains(account.name)) {
                if ("com.google".equalsIgnoreCase(account.type)) {
                    arrayList.add(0, account.name);
                } else {
                    arrayList.add(account.name);
                }
            }
        }
        return arrayList;
    }
}
