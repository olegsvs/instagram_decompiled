package android.support.v4.media;

import X.AnonymousClass0O7;
import X.AnonymousClass0O8;
import X.AnonymousClass1mB;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class MediaMetadataCompat implements Parcelable {
    /* renamed from: C */
    public static final AnonymousClass0O7 f22551C;
    public static final Creator CREATOR = new AnonymousClass1mB();
    /* renamed from: B */
    public final Bundle f22552B;

    public final int describeContents() {
        return 0;
    }

    static {
        AnonymousClass0O8 anonymousClass0O7 = new AnonymousClass0O7();
        f22551C = anonymousClass0O7;
        anonymousClass0O7.put("android.media.metadata.TITLE", Integer.valueOf(1));
        anonymousClass0O7 = f22551C;
        anonymousClass0O7.put("android.media.metadata.ARTIST", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.DURATION", Integer.valueOf(0));
        anonymousClass0O7.put("android.media.metadata.ALBUM", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.WRITER", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.DATE", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.YEAR", Integer.valueOf(0));
        anonymousClass0O7.put("android.media.metadata.GENRE", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
        anonymousClass0O7.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
        anonymousClass0O7.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
        anonymousClass0O7.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.ART", Integer.valueOf(2));
        anonymousClass0O7.put("android.media.metadata.ART_URI", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
        anonymousClass0O7.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
        anonymousClass0O7.put("android.media.metadata.RATING", Integer.valueOf(3));
        anonymousClass0O7.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
        anonymousClass0O7.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.BT_FOLDER_TYPE", Integer.valueOf(0));
        anonymousClass0O7.put("android.media.metadata.MEDIA_URI", Integer.valueOf(1));
        anonymousClass0O7.put("android.media.metadata.ADVERTISEMENT", Integer.valueOf(0));
        anonymousClass0O7.put("android.media.metadata.DOWNLOAD_STATUS", Integer.valueOf(0));
        String[] strArr = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        String[] strArr2 = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        strArr2 = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f22552B = parcel.readBundle();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f22552B);
    }
}
