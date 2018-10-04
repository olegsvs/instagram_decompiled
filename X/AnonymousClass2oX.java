package X;

import android.content.Context;
import android.database.Cursor;

/* renamed from: X.2oX */
public final class AnonymousClass2oX {
    /* renamed from: B */
    public boolean f34281B;
    /* renamed from: C */
    public Boolean f34282C;
    /* renamed from: D */
    public final boolean f34283D;
    /* renamed from: E */
    public final String f34284E;
    /* renamed from: F */
    public String f34285F;
    /* renamed from: G */
    public boolean f34286G;
    /* renamed from: H */
    public boolean f34287H;
    /* renamed from: I */
    public boolean f34288I;

    public AnonymousClass2oX(String str, String str2, boolean z, boolean z2, Boolean bool, boolean z3, boolean z4, String str3, boolean z5, boolean z6, boolean z7) {
        this.f34284E = str;
        this.f34283D = z;
        this.f34281B = z2;
        this.f34282C = bool;
        this.f34287H = z3;
        this.f34288I = z4;
        this.f34285F = str3;
        this.f34286G = z5;
    }

    /* renamed from: B */
    public static AnonymousClass2oX m17280B(Context context) {
        Cursor query = context.getContentResolver().query(AnonymousClass2oZ.m17281B(context.getPackageName()), null, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    int columnIndex = query.getColumnIndex(AnonymousClass2oY.f34293F);
                    int columnIndex2 = query.getColumnIndex("signature");
                    int columnIndex3 = query.getColumnIndex("is_managed");
                    int columnIndex4 = query.getColumnIndex(AnonymousClass2oY.f34289B);
                    int columnIndex5 = query.getColumnIndex(AnonymousClass2oY.f34290C);
                    int columnIndex6 = query.getColumnIndex(AnonymousClass2oY.f34291D);
                    int columnIndex7 = query.getColumnIndex(AnonymousClass2oY.f34292E);
                    int columnIndex8 = query.getColumnIndex(AnonymousClass2oY.f34294G);
                    int columnIndex9 = query.getColumnIndex(AnonymousClass2oY.f34297J);
                    int columnIndex10 = query.getColumnIndex(AnonymousClass2oY.f34295H);
                    int columnIndex11 = query.getColumnIndex(AnonymousClass2oY.f34296I);
                    String string = query.getString(columnIndex);
                    String string2 = query.getString(columnIndex2);
                    int i = query.getInt(columnIndex3);
                    boolean z = true;
                    boolean z2 = i != 0;
                    boolean z3 = query.getInt(columnIndex4) != 0;
                    boolean z4 = query.getInt(columnIndex6) != 0;
                    boolean z5 = query.getInt(columnIndex7) != 0;
                    String string3 = query.getString(columnIndex8);
                    boolean z6 = columnIndex9 >= 0 && query.getInt(columnIndex9) != 0;
                    boolean z7 = columnIndex10 >= 0 && query.getInt(columnIndex10) != 0;
                    context = (columnIndex10 < 0 || query.getInt(columnIndex11) == 0) ? null : true;
                    Boolean bool = null;
                    if (columnIndex5 >= 0) {
                        if (query.getInt(columnIndex5) == 0) {
                            z = false;
                        }
                        bool = Boolean.valueOf(z);
                    }
                    AnonymousClass2oX anonymousClass2oX = new AnonymousClass2oX(string, string2, z2, z3, bool, z4, z5, string3, z6, z7, context);
                    return anonymousClass2oX;
                }
                throw new IllegalStateException("Failed to fetch settings: empty cursor");
            } finally {
                query.close();
            }
        } else {
            throw new IllegalStateException("Failed to fetch settings: null cursor.");
        }
    }
}
