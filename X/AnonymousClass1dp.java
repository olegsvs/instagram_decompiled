package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.common.dextricks.DexStore;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: X.1dp */
public final class AnonymousClass1dp {
    /* renamed from: B */
    public final Context f20788B;

    public AnonymousClass1dp(Context context) {
        this.f20788B = context;
    }

    /* renamed from: B */
    public static void m12252B(AnonymousClass1dp anonymousClass1dp, String str, Set set) {
        StringBuilder stringBuilder;
        BufferedReader bufferedReader;
        String str2 = null;
        boolean z = false;
        AnonymousClass1dp anonymousClass1dp2 = anonymousClass1dp;
        AnonymousClass1FK anonymousClass1FK = new AnonymousClass1FK(anonymousClass1dp2.f20788B);
        String str3 = str;
        List arrayList = new ArrayList();
        AssetManager assets = anonymousClass1FK.f16012B.getAssets();
        String[] list = assets.list(str3);
        ArrayList arrayList2 = new ArrayList();
        Object obj = null;
        for (String str4 : list) {
            String readLine;
            if (DexStore.SECONDARY_DEX_MANIFEST.equals(str4)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str3);
                stringBuilder.append(File.separator);
                stringBuilder.append(str4);
                bufferedReader = new BufferedReader(new InputStreamReader(assets.open(stringBuilder.toString()), "UTF-8"));
                obj = null;
                while (true) {
                    try {
                        readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else if (!readLine.isEmpty()) {
                            if (readLine.startsWith(".requires ")) {
                                String substring = readLine.substring(".requires ".length());
                                if (substring.length() > 0 && !substring.equals(DexStore.MAIN_DEX_STORE_ID)) {
                                    arrayList.add(substring);
                                }
                            }
                            if (!readLine.startsWith(".")) {
                                String[] split = readLine.split(" ");
                                str2 = split[0];
                                obj = split[1];
                            }
                        }
                    } finally {
                        bufferedReader.close();
                    }
                }
            } else if ("libs.txt".equals(str4)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str3);
                stringBuilder.append(File.separator);
                stringBuilder.append(str4);
                InputStream open = assets.open(stringBuilder.toString());
                Collection arrayList3 = new ArrayList();
                bufferedReader = new BufferedReader(new InputStreamReader(open, "UTF-8"));
                while (true) {
                    try {
                        readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else if (!readLine.isEmpty()) {
                            String[] split2 = readLine.split(" ");
                            if (split2.length == 3 && split2[0].endsWith(".so") && split2[2] != null) {
                                arrayList3.add(split2[2]);
                            }
                        }
                    } finally {
                        bufferedReader.close();
                    }
                }
                arrayList2.addAll(arrayList3);
                z = true;
            } else {
                continue;
            }
        }
        if (obj != null) {
            arrayList2.add(0, obj);
        }
        AnonymousClass1Fe anonymousClass1Fe = new AnonymousClass1Fe(str3, String.valueOf(Math.abs(arrayList2.hashCode())), str2, arrayList, z);
        stringBuilder = new StringBuilder();
        stringBuilder.append(anonymousClass1Fe.f16047C);
        stringBuilder.append("_");
        stringBuilder.append(anonymousClass1Fe.f16046B);
        Set set2 = set;
        set2.add(stringBuilder.toString());
        for (String B : new ArrayList(anonymousClass1Fe.f16048D)) {
            AnonymousClass1dp.m12252B(anonymousClass1dp2, B, set2);
        }
    }
}
