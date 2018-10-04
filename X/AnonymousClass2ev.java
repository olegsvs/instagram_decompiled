package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.2ev */
public final class AnonymousClass2ev extends AnonymousClass2co implements AnonymousClass2Mx {
    /* renamed from: B */
    private static final String[] f32127B = new String[]{"image/jpeg", "image/png", "image/gif"};
    /* renamed from: C */
    public static final String[] f32128C = new String[]{"_id", "_data", "datetaken", "mini_thumb_magic", "orientation", DialogModule.KEY_TITLE, "mime_type", "date_modified"};

    public AnonymousClass2ev(ContentResolver contentResolver, Uri uri, int i, String str) {
        super(contentResolver, uri, i, str);
    }

    /* renamed from: B */
    public final Cursor mo3611B() {
        ContentResolver contentResolver = this.f31713D;
        Uri uri = this.f31711B;
        String[] strArr = f32128C;
        String str = this.f31712C == null ? "(mime_type in (?, ?, ?))" : "(mime_type in (?, ?, ?)) AND bucket_id = ?";
        String[] G = m16769G();
        String str2 = this.f31716G == 1 ? " ASC" : " DESC";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("case ifnull(datetaken,0) when 0 then date_modified*1000 else datetaken end");
        stringBuilder.append(str2);
        stringBuilder.append(", _id");
        stringBuilder.append(str2);
        return Media.query(contentResolver, uri, strArr, str, G, stringBuilder.toString());
    }

    /* renamed from: D */
    public final long mo3612D(Cursor cursor) {
        return cursor.getLong(0);
    }

    /* renamed from: F */
    public final AnonymousClass2cn mo3613F(Cursor cursor) {
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        long j2 = cursor.getLong(2);
        if (j2 == 0) {
            j2 = cursor.getLong(7) * 1000;
        }
        long j3 = cursor.getLong(3);
        int i = cursor.getInt(4);
        String string2 = cursor.getString(5);
        String string3 = cursor.getString(6);
        if (string2 == null || string2.length() == 0) {
            string2 = string;
        }
        return new AnonymousClass2eu(this.f31713D, cursor.getPosition(), m16556A(j), string, j3, string3, j2, string2, i);
    }

    /* renamed from: G */
    public final String[] m16769G() {
        if (this.f31712C == null) {
            return f32127B;
        }
        Object obj = f32127B;
        int length = obj.length;
        Object obj2 = new String[(length + 1)];
        System.arraycopy(obj, 0, obj2, 0, length);
        obj2[length] = this.f31712C;
        return obj2;
    }
}
