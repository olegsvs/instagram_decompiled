package X;

import android.content.Context;
import android.util.JsonReader;
import android.util.JsonToken;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.09W */
public final class AnonymousClass09W {
    /* renamed from: B */
    private static boolean f1085B;

    /* renamed from: B */
    public static synchronized void m617B(Context context) {
        synchronized (AnonymousClass09W.class) {
            if (!f1085B) {
                if (AnonymousClass09J.m586B(context)) {
                    JsonReader jsonReader;
                    try {
                        int hashCode;
                        InputStream open = context.getAssets().open("app_modules.json");
                        AnonymousClass09S anonymousClass09S = new AnonymousClass09S();
                        jsonReader = new JsonReader(new InputStreamReader(open, "UTF-8"));
                        List<AnonymousClass09V> arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext() && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                            jsonReader.beginObject();
                            String str = null;
                            String str2 = null;
                            String str3 = null;
                            String str4 = null;
                            context = null;
                            while (jsonReader.hasNext()) {
                                String nextName = jsonReader.nextName();
                                Object obj = -1;
                                hashCode = nextName.hashCode();
                                if (hashCode != 3355) {
                                    if (hashCode != 3195150) {
                                        if (hashCode != 3373707) {
                                            if (hashCode != 3433509) {
                                                if (hashCode == 1109408053) {
                                                    if (nextName.equals("download_uri")) {
                                                        obj = 3;
                                                    }
                                                }
                                            } else if (nextName.equals("path")) {
                                                obj = 4;
                                            }
                                        } else if (nextName.equals("name")) {
                                            obj = 1;
                                        }
                                    } else if (nextName.equals("hash")) {
                                        obj = 2;
                                    }
                                } else if (nextName.equals("id")) {
                                    obj = null;
                                }
                                switch (obj) {
                                    case null:
                                        AnonymousClass09S.m613B(str3, nextName);
                                        str3 = jsonReader.nextString();
                                        break;
                                    case 1:
                                        AnonymousClass09S.m613B(str, nextName);
                                        str = jsonReader.nextString();
                                        break;
                                    case 2:
                                        AnonymousClass09S.m613B(str2, nextName);
                                        str2 = jsonReader.nextString();
                                        break;
                                    case 3:
                                        AnonymousClass09S.m613B(str4, nextName);
                                        str4 = jsonReader.nextString();
                                        break;
                                    case 4:
                                        AnonymousClass09S.m613B(context, nextName);
                                        context = jsonReader.nextString();
                                        break;
                                    default:
                                        StringBuilder stringBuilder = new StringBuilder();
                                        stringBuilder.append("Unexpected name: ");
                                        stringBuilder.append(nextName);
                                        throw new RuntimeException(stringBuilder.toString());
                                }
                            }
                            jsonReader.endObject();
                            arrayList.add(new AnonymousClass09V(str, str2, str3, str4, context));
                        }
                        jsonReader.endArray();
                        jsonReader.close();
                        for (AnonymousClass09V anonymousClass09V : arrayList) {
                            AnonymousClass09Q B = AnonymousClass09Q.m602B();
                            hashCode = AnonymousClass09N.m598B(anonymousClass09V.f1083E);
                            String str5 = anonymousClass09V.f1081C;
                            synchronized (B) {
                                if (AnonymousClass09N.m601E(hashCode)) {
                                    B.f1073C[hashCode] = str5;
                                    if (AnonymousClass0Dc.m1247J(3)) {
                                        AnonymousClass09N.m599C(hashCode);
                                    }
                                }
                            }
                        }
                        f1085B = true;
                    } catch (Throwable e) {
                        throw new IOException(String.format(Locale.US, "app_modules.json not found, assets = %s", new Object[]{Arrays.toString(r6.list(JsonProperty.USE_DEFAULT_NAME))}), e);
                    } catch (Throwable e2) {
                        AnonymousClass0Dc.m1260W("DownloadableAppModuleMetadataReader", e2, "Error loading downloadable module metadata", new Object[0]);
                    } catch (Throwable th) {
                        jsonReader.close();
                    }
                } else {
                    f1085B = true;
                }
            }
        }
        return;
    }
}
