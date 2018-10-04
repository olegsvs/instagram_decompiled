package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.Profile;
import android.text.TextUtils;
import android.util.Patterns;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.StringWriter;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3AS */
public final class AnonymousClass3AS {
    /* renamed from: B */
    public static Map m18803B(Context context) {
        Map linkedHashMap = new LinkedHashMap();
        AnonymousClass3AS.m18807F(context, linkedHashMap);
        AnonymousClass3AS.m18809H(context, linkedHashMap);
        AnonymousClass3AS.m18808G(context, linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: C */
    public static String m18804C(Map map) {
        Writer stringWriter = new StringWriter();
        try {
            JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            createGenerator.writeStartArray();
            for (AnonymousClass3AO B : map.values()) {
                AnonymousClass3AT.m18813B(createGenerator, B, true);
            }
            createGenerator.writeEndArray();
            createGenerator.close();
            return stringWriter.toString();
        } catch (Throwable e) {
            throw new RuntimeException("Error creating json string", e);
        }
    }

    /* renamed from: D */
    public static String m18805D(Context context) {
        context = AnonymousClass3AS.m18806E(context);
        try {
            Writer stringWriter = new StringWriter();
            JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            AnonymousClass3AT.m18813B(createGenerator, context, true);
            createGenerator.close();
            return stringWriter.toString();
        } catch (Context context2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error creating json string: ");
            stringBuilder.append(context2);
            AnonymousClass0Gn.C("Serializing Me Profile Contact", stringBuilder.toString());
            return null;
        }
    }

    /* renamed from: E */
    public static AnonymousClass3AO m18806E(Context context) {
        AnonymousClass3AO anonymousClass3AO = new AnonymousClass3AO();
        ContentResolver contentResolver = context.getContentResolver();
        Uri withAppendedPath = Uri.withAppendedPath(Profile.CONTENT_URI, "data");
        r9 = new String[5];
        String str = "data1";
        r9[3] = str;
        r9[4] = str;
        Cursor query = contentResolver.query(withAppendedPath, r9, "mimetype = ? OR mimetype in (?, ?)", new String[]{"vnd.android.cursor.item/name", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2"}, "is_primary DESC");
        if (query == null) {
            return anonymousClass3AO;
        }
        try {
            int columnIndex = query.getColumnIndex("mimetype");
            int columnIndex2 = query.getColumnIndex("data2");
            int columnIndex3 = query.getColumnIndex("data3");
            int columnIndex4 = query.getColumnIndex(str);
            int columnIndex5 = query.getColumnIndex(str);
            while (query.moveToNext()) {
                CharSequence string;
                String string2 = query.getString(columnIndex);
                CharSequence charSequence = null;
                if ("vnd.android.cursor.item/name".equals(string2)) {
                    string = query.getString(columnIndex2);
                    if (AnonymousClass3AS.m18812K(string)) {
                        charSequence = string;
                        string = null;
                    } else if (!AnonymousClass3AS.m18811J(string)) {
                        string = null;
                    }
                    str = query.getString(columnIndex3);
                    if (AnonymousClass3AS.m18812K(str)) {
                        charSequence = str;
                    } else if (AnonymousClass3AS.m18811J(str)) {
                        string = str;
                    }
                } else if ("vnd.android.cursor.item/phone_v2".equals(string2)) {
                    str = query.getString(columnIndex4);
                    if (!AnonymousClass3AS.m18812K(str)) {
                        str = null;
                    }
                    string = null;
                    charSequence = str;
                } else {
                    if ("vnd.android.cursor.item/email_v2".equals(string2)) {
                        string = query.getString(columnIndex5);
                        if (AnonymousClass3AS.m18811J(string)) {
                        }
                    }
                    string = null;
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    anonymousClass3AO.f38558E.add(charSequence);
                } else if (!TextUtils.isEmpty(string)) {
                    anonymousClass3AO.f38555B.add(string);
                }
            }
            return anonymousClass3AO;
        } finally {
            query.close();
        }
    }

    /* renamed from: F */
    private static void m18807F(Context context, Map map) {
        Throwable th;
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(Email.CONTENT_URI, AnonymousClass3AP.f38559B, null, null, "contact_id");
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        int i = cursor.getInt(0);
                        AnonymousClass3AS.m18810I(map, i).f38555B.add(cursor.getString(1));
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: G */
    private static void m18808G(Context context, Map map) {
        Throwable th;
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(Data.CONTENT_URI, AnonymousClass3AQ.f38560B, "mimetype = ? AND data1 IS NOT NULL", new String[]{"vnd.android.cursor.item/name"}, "contact_id");
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        AnonymousClass3AO I = AnonymousClass3AS.m18810I(map, cursor.getInt(0));
                        I.f38556C = cursor.getString(1);
                        I.f38557D = cursor.getString(2);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: H */
    private static void m18809H(Context context, Map map) {
        Throwable th;
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(Phone.CONTENT_URI, AnonymousClass3AR.f38561B, null, null, "contact_id");
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        int i = cursor.getInt(0);
                        AnonymousClass3AS.m18810I(map, i).f38558E.add(cursor.getString(1));
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: I */
    private static AnonymousClass3AO m18810I(Map map, int i) {
        if (map.containsKey(Integer.valueOf(i))) {
            return (AnonymousClass3AO) map.get(Integer.valueOf(i));
        }
        AnonymousClass3AO anonymousClass3AO = new AnonymousClass3AO();
        map.put(Integer.valueOf(i), anonymousClass3AO);
        return anonymousClass3AO;
    }

    /* renamed from: J */
    private static boolean m18811J(String str) {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                return Patterns.EMAIL_ADDRESS.matcher(str).matches();
            }
        }
        return false;
    }

    /* renamed from: K */
    private static boolean m18812K(String str) {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                return Patterns.PHONE.matcher(str).matches();
            }
        }
        return false;
    }
}
