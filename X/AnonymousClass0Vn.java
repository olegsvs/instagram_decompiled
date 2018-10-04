package X;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.RemoteException;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Vn */
public final class AnonymousClass0Vn {
    /* renamed from: B */
    public static Map m4902B(Context context, String str) {
        Cursor query;
        Throwable e;
        Throwable th;
        AnonymousClass0Sy.m4433B();
        String str2 = str;
        String str3 = null;
        if (AnonymousClass0EF.m1357H(context.getPackageManager(), str2)) {
            ContentProviderClient acquireContentProviderClient;
            Builder scheme = new Builder().scheme("content");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(".contentprovider.users.loggedinusers");
            Uri build = scheme.authority(stringBuilder.toString()).build();
            try {
                acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(build);
            } catch (Throwable e2) {
                AnonymousClass0Gn.m1878E("IgLoggedInUsers", "The signature of the Direct app does not match the IG app.", e2);
                acquireContentProviderClient = null;
            }
            if (acquireContentProviderClient != null) {
                try {
                    query = acquireContentProviderClient.query(build, null, null, null, null);
                    try {
                        Map hashMap = new HashMap();
                        if (query != null) {
                            int columnIndexOrThrow = query.getColumnIndexOrThrow(MemoryDumpUploadJob.EXTRA_USER_ID);
                            int columnIndex = query.getColumnIndex("session_id");
                            int columnIndex2 = query.getColumnIndex("username");
                            int columnIndex3 = query.getColumnIndex("profile_pic_url");
                            int columnIndex4 = query.getColumnIndex("is_active_user");
                            while (query.moveToNext()) {
                                String string = query.getString(columnIndexOrThrow);
                                if (string != null) {
                                    String str4;
                                    String str5;
                                    if (columnIndex == -1) {
                                        str4 = str3;
                                    } else {
                                        str4 = query.getString(columnIndex);
                                    }
                                    if (columnIndex2 == -1) {
                                        str5 = str3;
                                    } else {
                                        str5 = query.getString(columnIndex2);
                                    }
                                    if (columnIndex3 != -1) {
                                        str3 = query.getString(columnIndex3);
                                    }
                                    context = (columnIndex4 == -1 || !Boolean.valueOf(query.getString(columnIndex4)).booleanValue()) ? null : true;
                                    hashMap.put(string, new AnonymousClass3C1(string, str4, str5, str3, context));
                                }
                                str3 = null;
                            }
                        }
                        acquireContentProviderClient.release();
                        if (query != null) {
                            query.close();
                        }
                        return hashMap;
                    } catch (RemoteException e3) {
                        e = e3;
                        try {
                            AnonymousClass0Gn.m1885L("IgLoggedInUsers", e);
                            acquireContentProviderClient.release();
                            if (query != null) {
                                query.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            acquireContentProviderClient.release();
                            if (query != null) {
                                query.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        acquireContentProviderClient.release();
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                } catch (RemoteException e4) {
                    e = e4;
                    query = null;
                    AnonymousClass0Gn.m1885L("IgLoggedInUsers", e);
                    acquireContentProviderClient.release();
                    if (query != null) {
                        query.close();
                    }
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    query = null;
                    acquireContentProviderClient.release();
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
        }
        return null;
    }
}
