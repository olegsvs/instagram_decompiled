package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C0164R;
import com.facebook.browser.lite.BrowserLiteActivity;
import com.facebook.browser.lite.BrowserLiteBottomSheetActivity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.inappbrowser.view.BrowserActivity;
import com.instagram.inappbrowser.view.MinimalBrowserActivity;
import com.instagram.watchandbrowse.WatchAndBrowseActivity;
import java.lang.ref.WeakReference;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0he */
public final class AnonymousClass0he {
    /* renamed from: B */
    public final AnonymousClass0vu f8453B = new AnonymousClass0vu();
    /* renamed from: C */
    public ArrayList f8454C;
    /* renamed from: D */
    public boolean f8455D;
    /* renamed from: E */
    public boolean f8456E;
    /* renamed from: F */
    public boolean f8457F;
    /* renamed from: G */
    public boolean f8458G;
    /* renamed from: H */
    public boolean f8459H = true;
    /* renamed from: I */
    public String f8460I = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: J */
    public String f8461J;
    /* renamed from: K */
    public boolean f8462K;
    /* renamed from: L */
    public AnonymousClass0gl f8463L;
    /* renamed from: M */
    public int f8464M;
    /* renamed from: N */
    public Bundle f8465N;
    /* renamed from: O */
    private WeakReference f8466O;
    /* renamed from: P */
    private boolean f8467P;
    /* renamed from: Q */
    private boolean f8468Q;
    /* renamed from: R */
    private final AnonymousClass0Cn f8469R;
    /* renamed from: S */
    private String f8470S;
    /* renamed from: T */
    private AnonymousClass0hf f8471T;

    public AnonymousClass0he(Activity activity, AnonymousClass0Cn anonymousClass0Cn, String str, AnonymousClass0hf anonymousClass0hf) {
        this.f8469R = anonymousClass0Cn;
        this.f8466O = new WeakReference(activity);
        this.f8470S = str;
        this.f8471T = anonymousClass0hf;
    }

    /* renamed from: A */
    public final AnonymousClass0he m6775A(String str) {
        this.f8453B.f12167C = str;
        return this;
    }

    /* renamed from: B */
    public final AnonymousClass0he m6776B(String str) {
        this.f8453B.f12173I = str;
        return this;
    }

    /* renamed from: B */
    public static void m6772B(AnonymousClass0he anonymousClass0he, AnonymousClass0IL anonymousClass0IL, int i) {
        if (anonymousClass0he.f8466O.get() == null) {
            return;
        }
        if (anonymousClass0he.f8468Q || !AnonymousClass1Xk.m11794B().f19863B) {
            AnonymousClass1Xk.m11794B().f19863B = true;
            int i2 = anonymousClass0he.f8465N != null ? 1 : 0;
            boolean z = anonymousClass0he.f8459H && !anonymousClass0he.f8456E;
            anonymousClass0he.f8459H = z;
            Activity activity = (Activity) anonymousClass0he.f8466O.get();
            Intent data = new Intent(activity, anonymousClass0he.m6774D()).setData(Uri.parse(anonymousClass0he.f8470S));
            Intent intent = new Intent("android.intent.action.VIEW");
            ArrayList arrayList = null;
            intent.putExtra("BrowserLiteIntent.EXTRA_THEME", "THEME_INSTAGRAM_WATCHBROWSE");
            intent.putExtra("extra_hide_system_status_bar", anonymousClass0he.f8462K);
            intent.putExtra("BrowserLiteIntent.EXTRA_LOCALE", AnonymousClass0EH.m1375E());
            ArrayList arrayList2 = new ArrayList();
            Bundle bundle = new Bundle();
            bundle.putString("KEY_LABEL", "MENU_OPEN_WITH");
            bundle.putInt("KEY_ICON_RES", 0);
            bundle.putString("action", null);
            arrayList2.add(bundle);
            String string = activity.getResources().getString(C0164R.string.in_app_browser_menu_item_copy_link);
            String str = "COPY_LINK";
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            bundle = new Bundle();
            bundle.putString("KEY_LABEL", string);
            bundle.putInt("KEY_ICON_RES", -1);
            bundle.putString("action", str);
            arrayList2.add(bundle);
            string = activity.getResources().getString(C0164R.string.in_app_browser_menu_item_share_link);
            str = "SHARE_VIA";
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            bundle = new Bundle();
            bundle.putString("KEY_LABEL", string);
            bundle.putInt("KEY_ICON_RES", -1);
            bundle.putString("action", str);
            arrayList2.add(bundle);
            intent.putExtra("BrowserLiteIntent.EXTRA_UA", anonymousClass0he.m6773C());
            intent.putExtra("BrowserLiteIntent.EXTRA_REFERER", "http://instagram.com/");
            intent.putExtra("BrowserLiteIntent.EXTRA_SHOW_TITLE", i2 ^ 1);
            intent.putExtra("BrowserLiteIntent.EXTRA_SHOW_CLOSE_BUTTON", i2 ^ 1);
            intent.putExtra("BrowserLiteIntent.EXTRA_SHOW_MENU_ITEM", i2 ^ true);
            intent.putExtra("BrowserLiteIntent.EXTRA_PLAY_STORE_URL_OVERRIDE_DISABLED", anonymousClass0he.f8455D);
            String str2 = anonymousClass0he.f8461J;
            if (str2 == null) {
                str2 = anonymousClass0he.f8470S;
            }
            intent.putExtra("BrowserLiteIntent.OPEN_WITH_URL", str2);
            anonymousClass0he.f8453B.f12172H = anonymousClass0he.f8471T.toString();
            AnonymousClass2Cz anonymousClass2Cz = new AnonymousClass2Cz(anonymousClass0he.f8453B);
            anonymousClass2Cz.f27516K = anonymousClass0he.f8463L;
            anonymousClass2Cz.f27514I = System.currentTimeMillis();
            AnonymousClass2D0.f27522C = anonymousClass2Cz;
            AnonymousClass2D0.f27521B = new AnonymousClass2Cy(anonymousClass0he.f8470S, anonymousClass0he.f8471T, anonymousClass0he.f8453B.f12167C, anonymousClass0he.f8453B.f12173I);
            ArrayList arrayList3 = anonymousClass0he.f8454C;
            if (arrayList3 != null) {
                int size = arrayList3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    str2 = (String) anonymousClass0he.f8454C.get(i3);
                    List parse = HttpCookie.parse(str2);
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(str2);
                    string = ((HttpCookie) parse.get(0)).getDomain();
                    if (!(arrayList4 == null || arrayList4.isEmpty())) {
                        bundle = new Bundle();
                        bundle.putString("KEY_URL", string);
                        bundle.putStringArrayList("KEY_STRING_ARRAY", arrayList4);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(bundle);
                    }
                }
            }
            List emptyList;
            if (anonymousClass0he.f8469R.xX()) {
                CookieManager E = AnonymousClass0G7.m1738E(AnonymousClass0FL.m1559B(anonymousClass0he.f8469R));
                if (E == null) {
                    emptyList = Collections.emptyList();
                } else {
                    emptyList = AnonymousClass0Cf.m975E(E);
                }
            } else {
                emptyList = Collections.emptyList();
            }
            if (!r1.isEmpty()) {
                ArrayList arrayList5 = new ArrayList(r1.size());
                for (HttpCookie httpCookie : r1) {
                    String str3;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(httpCookie.getName());
                    stringBuilder.append("=");
                    stringBuilder.append(httpCookie.getValue());
                    if (httpCookie.getPath() == null) {
                        str3 = JsonProperty.USE_DEFAULT_NAME;
                    } else {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("; Path=");
                        stringBuilder2.append(httpCookie.getPath());
                        str3 = stringBuilder2.toString();
                    }
                    stringBuilder.append(str3);
                    arrayList5.add(stringBuilder.toString());
                }
                String str4 = ".www.instagram.com";
                if (!(arrayList5 == null || arrayList5.isEmpty())) {
                    bundle = new Bundle();
                    bundle.putString("KEY_URL", str4);
                    bundle.putStringArrayList("KEY_STRING_ARRAY", arrayList5);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bundle);
                }
            }
            if (anonymousClass0he.f8459H && !anonymousClass0he.f8458G) {
                intent.putExtra("BrowserLiteIntent.EXTRA_ANIMATION", new int[]{C0164R.anim.bottom_in, C0164R.anim.noop, C0164R.anim.noop, C0164R.anim.bottom_out});
                AnonymousClass1L5.m10808B(activity).overridePendingTransition(C0164R.anim.bottom_in, C0164R.anim.noop);
            }
            if (anonymousClass0he.f8458G) {
                intent.putExtra("BrowserLiteIntent.EXTRA_LE_DESIGN_EXPERIMENT_STYLE", 1);
                intent.putExtra("BrowserLiteIntent.EXTRA_ANIMATION", new int[]{C0164R.anim.bottom_in, C0164R.anim.noop, C0164R.anim.noop, C0164R.anim.noop});
                AnonymousClass1L5.m10808B(activity).overridePendingTransition(C0164R.anim.bottom_in, C0164R.anim.noop);
            }
            if (arrayList2 != null) {
                intent.putParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS", arrayList2);
            }
            if (arrayList != null) {
                intent.putParcelableArrayListExtra("BrowserLiteIntent.EXTRA_COOKIES", arrayList);
            }
            data.putExtras(intent);
            data.putExtra("com.instagram.watchandmore.CONFIG_BUNDLE", anonymousClass0he.f8465N);
            if (anonymousClass0he.f8468Q) {
                data.addFlags(335544320);
            }
            if (anonymousClass0he.f8456E) {
                data.putExtra("BrowserActivity.EXTRA_TOP_PADDING", anonymousClass0he.f8464M);
                data.putExtra("BrowserActivity.EXTRA_ENABLE_GESTURE", anonymousClass0he.f8457F);
            }
            if (anonymousClass0he.f8463L != null) {
                AnonymousClass0Iz.f2854L.m2410M(activity, null, anonymousClass0he.f8463L);
            } else {
                AnonymousClass0Iz.f2854L.m2406I(activity);
            }
            if (anonymousClass0IL != null) {
                AnonymousClass0IW.m2246L(data, i, anonymousClass0IL);
            } else {
                AnonymousClass0IW.m2243I(data, activity);
            }
        }
    }

    /* renamed from: C */
    public final AnonymousClass0he m6777C(String str) {
        this.f8453B.f12171G = str;
        return this;
    }

    /* renamed from: C */
    private String m6773C() {
        if (TextUtils.isEmpty(this.f8460I)) {
            return AnonymousClass0IE.m2137E(" %s", AnonymousClass0Nl.m3422B());
        }
        return AnonymousClass0IE.m2137E(" %s %s", AnonymousClass0Nl.m3422B(), this.f8460I);
    }

    /* renamed from: D */
    private Class m6774D() {
        if ((this.f8465N != null ? 1 : null) != null) {
            return WatchAndBrowseActivity.class;
        }
        if (this.f8458G) {
            return BrowserLiteBottomSheetActivity.class;
        }
        if (this.f8467P) {
            return MinimalBrowserActivity.class;
        }
        return this.f8456E ? BrowserActivity.class : BrowserLiteActivity.class;
    }

    /* renamed from: D */
    public final void m6778D() {
        AnonymousClass0he.m6772B(this, null, 0);
    }

    /* renamed from: E */
    public final AnonymousClass0he m6779E(String str) {
        this.f8453B.f12168D = str;
        return this;
    }
}
