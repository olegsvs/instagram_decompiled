package android.support.v4.media;

import X.AnonymousClass1mA;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1mA();
    /* renamed from: B */
    private final CharSequence f22542B;
    /* renamed from: C */
    private Object f22543C;
    /* renamed from: D */
    private final Bundle f22544D;
    /* renamed from: E */
    private final Bitmap f22545E;
    /* renamed from: F */
    private final Uri f22546F;
    /* renamed from: G */
    private final String f22547G;
    /* renamed from: H */
    private final Uri f22548H;
    /* renamed from: I */
    private final CharSequence f22549I;
    /* renamed from: J */
    private final CharSequence f22550J;

    public final int describeContents() {
        return 0;
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.f22547G = parcel.readString();
        this.f22550J = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f22549I = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f22542B = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f22545E = (Bitmap) parcel.readParcelable(null);
        this.f22546F = (Uri) parcel.readParcelable(null);
        this.f22544D = parcel.readBundle();
        this.f22548H = (Uri) parcel.readParcelable(null);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f22547G = str;
        this.f22550J = charSequence;
        this.f22549I = charSequence2;
        this.f22542B = charSequence3;
        this.f22545E = bitmap;
        this.f22546F = uri;
        this.f22544D = bundle;
        this.f22548H = uri2;
    }

    /* renamed from: A */
    public final Object m12980A() {
        if (this.f22543C == null) {
            if (VERSION.SDK_INT >= 21) {
                Builder builder = new Builder();
                builder.setMediaId(this.f22547G);
                builder.setTitle(this.f22550J);
                builder.setSubtitle(this.f22549I);
                builder.setDescription(this.f22542B);
                builder.setIconBitmap(this.f22545E);
                builder.setIconUri(this.f22546F);
                Bundle bundle = this.f22544D;
                if (VERSION.SDK_INT < 23 && this.f22548H != null) {
                    if (bundle == null) {
                        bundle = new Bundle();
                        bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                    }
                    bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f22548H);
                }
                builder.setExtras(bundle);
                if (VERSION.SDK_INT >= 23) {
                    builder.setMediaUri(this.f22548H);
                }
                MediaDescription build = builder.build();
                this.f22543C = build;
                return build;
            }
        }
        return this.f22543C;
    }

    /* renamed from: B */
    public static MediaDescriptionCompat m12979B(Object obj) {
        Uri uri = null;
        Bundle bundle = null;
        if (obj != null) {
            int i = VERSION.SDK_INT;
            if (i >= 21) {
                Uri uri2;
                MediaDescriptionCompat mediaDescriptionCompat;
                String mediaId = ((MediaDescription) obj).getMediaId();
                CharSequence title = ((MediaDescription) obj).getTitle();
                CharSequence subtitle = ((MediaDescription) obj).getSubtitle();
                CharSequence description = ((MediaDescription) obj).getDescription();
                Bitmap iconBitmap = ((MediaDescription) obj).getIconBitmap();
                Uri iconUri = ((MediaDescription) obj).getIconUri();
                Bundle extras = ((MediaDescription) obj).getExtras();
                if (extras == null) {
                    uri2 = null;
                } else {
                    uri2 = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                }
                if (uri2 != null) {
                    if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                        if (uri2 != null) {
                            uri = uri2;
                        } else if (i >= 23) {
                            uri = ((MediaDescription) obj).getMediaUri();
                        }
                        mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                        mediaDescriptionCompat.f22543C = obj;
                        return mediaDescriptionCompat;
                    }
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
                bundle = extras;
                if (uri2 != null) {
                    uri = uri2;
                } else if (i >= 23) {
                    uri = ((MediaDescription) obj).getMediaUri();
                }
                mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                mediaDescriptionCompat.f22543C = obj;
                return mediaDescriptionCompat;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f22550J);
        stringBuilder.append(", ");
        stringBuilder.append(this.f22549I);
        stringBuilder.append(", ");
        stringBuilder.append(this.f22542B);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.f22547G);
            TextUtils.writeToParcel(this.f22550J, parcel, i);
            TextUtils.writeToParcel(this.f22549I, parcel, i);
            TextUtils.writeToParcel(this.f22542B, parcel, i);
            parcel.writeParcelable(this.f22545E, i);
            parcel.writeParcelable(this.f22546F, i);
            parcel.writeBundle(this.f22544D);
            parcel.writeParcelable(this.f22548H, i);
            return;
        }
        ((MediaDescription) m12980A()).writeToParcel(parcel, i);
    }
}
