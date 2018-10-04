package com.instagram.settings.controlcenter.api;

import X.AnonymousClass0Pn;
import X.AnonymousClass3eT;
import X.AnonymousClass3eU;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class DataDownloadStatusCheckResponse extends AnonymousClass0Pn implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3eT();
    /* renamed from: B */
    public String f43019B;
    /* renamed from: C */
    public String f43020C;
    /* renamed from: D */
    public String f43021D;
    /* renamed from: E */
    public JobStatus f43022E;

    public enum JobStatus implements Parcelable {
        HAS_VALID_DOWNLOADABLE,
        JOB_IN_PROGRESS,
        NO_VALID_DOWNLOADABLE;
        
        public static final Creator CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new AnonymousClass3eU();
        }

        /* renamed from: B */
        public static JobStatus m20298B(String str) {
            for (JobStatus jobStatus : values()) {
                if (str.equalsIgnoreCase(jobStatus.name())) {
                    return jobStatus;
                }
            }
            throw new UnsupportedOperationException();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public DataDownloadStatusCheckResponse(Parcel parcel) {
        this.f43021D = parcel.readString();
        this.f43020C = parcel.readString();
        this.f43019B = parcel.readString();
        this.f43022E = (JobStatus) parcel.readParcelable(JobStatus.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43021D);
        parcel.writeString(this.f43020C);
        parcel.writeString(this.f43019B);
        parcel.writeParcelable(this.f43022E, 0);
    }
}
