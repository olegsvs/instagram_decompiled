package com.instagram.school.fragment;

import X.AnonymousClass0Ow;
import X.AnonymousClass2M9;
import X.AnonymousClass60l;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;

public class UpdateSchoolViewModel implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass60l();
    /* renamed from: B */
    public AnonymousClass0Ow f70850B;
    /* renamed from: C */
    public String f70851C;
    /* renamed from: D */
    public String f70852D;
    /* renamed from: E */
    public boolean f70853E;
    /* renamed from: F */
    public long f70854F = 0;
    /* renamed from: G */
    public String f70855G;
    /* renamed from: H */
    public String f70856H;
    /* renamed from: I */
    public boolean f70857I;

    public final int describeContents() {
        return 0;
    }

    public UpdateSchoolViewModel(AnonymousClass2M9 anonymousClass2M9) {
        if (anonymousClass2M9 != null) {
            if (anonymousClass2M9.f29497E != null) {
                this.f70855G = anonymousClass2M9.B();
                this.f70856H = anonymousClass2M9.F();
                this.f70851C = anonymousClass2M9.f29495C;
                this.f70852D = anonymousClass2M9.f29496D;
                this.f70854F = anonymousClass2M9.E();
            }
            this.f70850B = anonymousClass2M9.A();
            this.f70853E = anonymousClass2M9.G(true);
            m28758B(this);
        }
    }

    public UpdateSchoolViewModel(Parcel parcel) {
        this.f70855G = parcel.readString();
        this.f70856H = parcel.readString();
        this.f70851C = parcel.readString();
        this.f70852D = parcel.readString();
        this.f70854F = parcel.readLong();
        this.f70853E = parcel.readByte() != (byte) 0;
        Collection arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f70850B = AnonymousClass0Ow.D(arrayList);
        m28758B(this);
    }

    /* renamed from: A */
    public final boolean m28759A(AnonymousClass2M9 anonymousClass2M9) {
        if (anonymousClass2M9 != null) {
            if (anonymousClass2M9.G(true)) {
                if (anonymousClass2M9.E() == this.f70854F && TextUtils.equals(this.f70852D, anonymousClass2M9.f29496D) && TextUtils.equals(this.f70851C, anonymousClass2M9.f29495C)) {
                    return false;
                }
                return true;
            }
        }
        if (this.f70854F != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public static void m28758B(UpdateSchoolViewModel updateSchoolViewModel) {
        updateSchoolViewModel.f70857I = updateSchoolViewModel.f70854F != 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f70855G);
        parcel.writeString(this.f70856H);
        parcel.writeString(this.f70851C);
        parcel.writeString(this.f70852D);
        parcel.writeLong(this.f70854F);
        parcel.writeByte((byte) this.f70853E);
        parcel.writeStringList(this.f70850B);
    }
}
