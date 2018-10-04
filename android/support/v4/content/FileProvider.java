package android.support.v4.content;

import X.AnonymousClass1ls;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.HashMap;

public class FileProvider extends ContentProvider {
    /* renamed from: C */
    private static final String[] f1687C = new String[]{"_display_name", "_size"};
    /* renamed from: D */
    public static final File f1688D = new File("/");
    /* renamed from: E */
    private static HashMap f1689E = new HashMap();
    /* renamed from: B */
    private AnonymousClass1ls f1690B;

    public final boolean onCreate() {
        return true;
    }

    /* renamed from: B */
    public static Uri m934B(Context context, String str, File file) {
        return m935C(context, str).oT(file);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: C */
    private static X.AnonymousClass1ls m935C(android.content.Context r11, java.lang.String r12) {
        /*
        r10 = f1689E;
        monitor-enter(r10);
        r0 = f1689E;	 Catch:{ all -> 0x00db }
        r7 = r0.get(r12);	 Catch:{ all -> 0x00db }
        r7 = (X.AnonymousClass1ls) r7;	 Catch:{ all -> 0x00db }
        if (r7 != 0) goto L_0x00d9;
    L_0x000d:
        r7 = new X.0CZ;	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r7.<init>(r12);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r1 = r11.getPackageManager();	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r0 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r2 = r1.resolveContentProvider(r12, r0);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r1 = r11.getPackageManager();	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r0 = "android.support.FILE_PROVIDER_PATHS";
        r8 = r2.loadXmlMetaData(r1, r0);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        if (r8 == 0) goto L_0x00de;
    L_0x0028:
        r1 = r8.next();	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r2 = 1;
        if (r1 == r2) goto L_0x00c1;
    L_0x002f:
        r0 = 2;
        if (r1 != r0) goto L_0x0028;
    L_0x0032:
        r1 = r8.getName();	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r0 = "name";
        r6 = 0;
        r5 = r8.getAttributeValue(r6, r0);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r0 = "path";
        r9 = r8.getAttributeValue(r6, r0);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r0 = "root-path";
        r0 = r0.equals(r1);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r3 = 0;
        if (r0 == 0) goto L_0x004f;
    L_0x004c:
        r6 = f1688D;	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        goto L_0x0099;
    L_0x004f:
        r0 = "files-path";
        r0 = r0.equals(r1);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        if (r0 == 0) goto L_0x005c;
    L_0x0057:
        r6 = r11.getFilesDir();	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        goto L_0x0099;
    L_0x005c:
        r0 = "cache-path";
        r0 = r0.equals(r1);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        if (r0 == 0) goto L_0x0069;
    L_0x0064:
        r6 = r11.getCacheDir();	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        goto L_0x0099;
    L_0x0069:
        r0 = "external-path";
        r0 = r0.equals(r1);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        if (r0 == 0) goto L_0x0076;
    L_0x0071:
        r6 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        goto L_0x0099;
    L_0x0076:
        r0 = "external-files-path";
        r0 = r0.equals(r1);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        if (r0 == 0) goto L_0x0088;
    L_0x007e:
        r1 = X.AnonymousClass0Ca.m941G(r11, r6);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r0 = r1.length;	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        if (r0 <= 0) goto L_0x0099;
    L_0x0085:
        r6 = r1[r3];	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        goto L_0x0099;
    L_0x0088:
        r0 = "external-cache-path";
        r0 = r0.equals(r1);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        if (r0 == 0) goto L_0x0099;
    L_0x0090:
        r1 = X.AnonymousClass0Ca.m940F(r11);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r0 = r1.length;	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        if (r0 <= 0) goto L_0x0099;
    L_0x0097:
        r6 = r1[r3];	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
    L_0x0099:
        if (r6 == 0) goto L_0x0028;
    L_0x009b:
        r4 = new java.lang.String[r2];	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r4[r3] = r9;	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r3 = r4.length;	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r2 = 0;
    L_0x00a1:
        if (r2 >= r3) goto L_0x00b0;
    L_0x00a3:
        r1 = r4[r2];	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        if (r1 == 0) goto L_0x00ad;
    L_0x00a7:
        r0 = new java.io.File;	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r0.<init>(r6, r1);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r6 = r0;
    L_0x00ad:
        r2 = r2 + 1;
        goto L_0x00a1;
    L_0x00b0:
        r0 = android.text.TextUtils.isEmpty(r5);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        if (r0 != 0) goto L_0x00fe;
    L_0x00b6:
        r1 = r6.getCanonicalFile();	 Catch:{ IOException -> 0x00e6 }
        r0 = r7.f1691B;	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r0.put(r5, r1);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        goto L_0x0028;
    L_0x00c1:
        r0 = f1689E;	 Catch:{ all -> 0x00db }
        r0.put(r12, r7);	 Catch:{ all -> 0x00db }
        goto L_0x00d9;
    L_0x00c7:
        r1 = move-exception;
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x00db }
        r0 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data";
        r2.<init>(r0, r1);	 Catch:{ all -> 0x00db }
    L_0x00cf:
        throw r2;	 Catch:{ all -> 0x00db }
    L_0x00d0:
        r1 = move-exception;
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x00db }
        r0 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data";
        r2.<init>(r0, r1);	 Catch:{ all -> 0x00db }
        goto L_0x00cf;
    L_0x00d9:
        monitor-exit(r10);	 Catch:{ all -> 0x00db }
        return r7;
    L_0x00db:
        r0 = move-exception;
        monitor-exit(r10);	 Catch:{ all -> 0x00db }
        throw r0;
    L_0x00de:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r0 = "Missing android.support.FILE_PROVIDER_PATHS meta-data";
        r1.<init>(r0);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
    L_0x00e5:
        throw r1;	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
    L_0x00e6:
        r3 = move-exception;
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r1.<init>();	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r0 = "Failed to resolve canonical path for ";
        r1.append(r0);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r1.append(r6);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r0 = r1.toString();	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r2.<init>(r0, r3);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        throw r2;	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
    L_0x00fe:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        r0 = "Name must not be empty";
        r1.<init>(r0);	 Catch:{ IOException -> 0x00d0, XmlPullParserException -> 0x00c7 }
        goto L_0x00e5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.FileProvider.C(android.content.Context, java.lang.String):X.1ls");
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.f1690B = m935C(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return this.f1690B.qL(uri).delete();
    }

    public final String getType(Uri uri) {
        uri = this.f1690B.qL(uri);
        int lastIndexOf = uri.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(uri.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File qL = this.f1690B.qL(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else {
            if (!"w".equals(str)) {
                if (!"wt".equals(str)) {
                    if ("wa".equals(str)) {
                        i = 704643072;
                    } else if ("rw".equals(str)) {
                        i = 939524096;
                    } else if ("rwt".equals(str)) {
                        i = 1006632960;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid mode: ");
                        stringBuilder.append(str);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            }
            i = 738197504;
        }
        return ParcelFileDescriptor.open(qL, i);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        uri = this.f1690B.qL(uri);
        if (strArr == null) {
            strArr = f1687C;
        }
        Object obj = new String[strArr.length];
        Object obj2 = new Object[strArr.length];
        int i = 0;
        for (Object obj3 : strArr) {
            int i2;
            if ("_display_name".equals(obj3)) {
                obj[i] = "_display_name";
                i2 = i + 1;
                obj2[i] = uri.getName();
            } else {
                String str3 = "_size";
                if (str3.equals(obj3)) {
                    obj[i] = str3;
                    i2 = i + 1;
                    obj2[i] = Long.valueOf(uri.length());
                } else {
                }
            }
            i = i2;
        }
        Object obj4 = new String[i];
        System.arraycopy(obj, 0, obj4, 0, i);
        Object obj32 = new Object[i];
        System.arraycopy(obj2, 0, obj32, 0, i);
        Cursor matrixCursor = new MatrixCursor(obj4, 1);
        matrixCursor.addRow(obj32);
        return matrixCursor;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
