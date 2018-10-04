package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.27l */
public final class AnonymousClass27l {
    /* renamed from: G */
    public static final AnonymousClass27l f26345G;
    /* renamed from: H */
    public static final AnonymousClass27l f26346H;
    /* renamed from: I */
    public static final AnonymousClass27l f26347I;
    /* renamed from: J */
    public static final AnonymousClass27l f26348J;
    /* renamed from: K */
    public static final AnonymousClass27l f26349K;
    /* renamed from: L */
    public static final AnonymousClass27l f26350L;
    /* renamed from: M */
    public static final AnonymousClass27l f26351M;
    /* renamed from: N */
    public static final AnonymousClass27l f26352N;
    /* renamed from: O */
    public static final AnonymousClass27l f26353O;
    /* renamed from: P */
    public static final AnonymousClass27l f26354P;
    /* renamed from: Q */
    public static final AnonymousClass27l f26355Q;
    /* renamed from: B */
    public String f26356B;
    /* renamed from: C */
    public List f26357C;
    /* renamed from: D */
    public boolean f26358D;
    /* renamed from: E */
    public AnonymousClass27p f26359E;
    /* renamed from: F */
    public List f26360F;

    static {
        List arrayList = new ArrayList();
        AnonymousClass27n anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "time_sticker_digital";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "time_sticker_analog";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "time_sticker_text";
        arrayList.add(anonymousClass27n);
        f26354P = new AnonymousClass27l("time_sticker_id", arrayList);
        arrayList = new ArrayList();
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "location_sticker_vibrant";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "location_sticker_subtle";
        arrayList.add(anonymousClass27n);
        f26355Q = new AnonymousClass27l("location_sticker_id", arrayList);
        arrayList = new ArrayList();
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "selfie_sticker_transparent";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "selfie_sticker_circle";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "selfie_sticker_square";
        arrayList.add(anonymousClass27n);
        f26353O = new AnonymousClass27l("selfie_sticker_id", arrayList);
        arrayList = new ArrayList();
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "product_item_text_sticker_vibrant";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "product_item_text_sticker_subtle";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "product_item_icon_sticker_vibrant";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "product_item_icon_sticker_subtle";
        arrayList.add(anonymousClass27n);
        AnonymousClass27l anonymousClass27l = new AnonymousClass27l("product_item_sticker_id", arrayList);
        arrayList = new ArrayList();
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "music_intent_sticker_basic";
        arrayList.add(anonymousClass27n);
        f26349K = new AnonymousClass27l("music_intent_sticker_id", arrayList);
        arrayList = new ArrayList();
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "music_overlay_sticker_solid";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "music_overlay_sticker_frosted";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "music_overlay_sticker_album";
        arrayList.add(anonymousClass27n);
        f26350L = new AnonymousClass27l("music_sticker_id", arrayList);
        arrayList = new ArrayList();
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "polling_sticker_vibrant";
        arrayList.add(anonymousClass27n);
        f26351M = new AnonymousClass27l("poll_sticker_bundle_id", arrayList);
        arrayList = new ArrayList();
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "question_sticker_ama";
        arrayList.add(anonymousClass27n);
        f26352N = new AnonymousClass27l("question_sticker_bundle_id", arrayList);
        arrayList = new ArrayList();
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "gif_sticker_subtle";
        arrayList.add(anonymousClass27n);
        f26347I = new AnonymousClass27l("gif_sticker_bundle", arrayList);
        arrayList = new ArrayList();
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "gallery_browse_sticker_subtle";
        arrayList.add(anonymousClass27n);
        f26346H = new AnonymousClass27l("gallery_browse_sticker_id", arrayList);
        arrayList = new ArrayList();
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "friend_sticker_editor_item";
        arrayList.add(anonymousClass27n);
        f26345G = new AnonymousClass27l("friend_sticker_editor_id", arrayList);
        arrayList = new ArrayList();
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "friend_sticker_vibrant";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "friend_sticker_facepile";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "friend_sticker_subtle";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "friend_sticker_hidden";
        arrayList.add(anonymousClass27n);
        anonymousClass27l = new AnonymousClass27l("friend_sticker_id", arrayList);
        arrayList = new ArrayList();
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "internal_sticker_vibrant";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "internal_sticker_subtle";
        arrayList.add(anonymousClass27n);
        f26348J = new AnonymousClass27l("internal_sticker_id", arrayList);
        arrayList = new ArrayList();
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "mention_sticker_vibrant";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "mention_sticker_subtle";
        arrayList.add(anonymousClass27n);
        anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26370G = "mention_sticker_rainbow";
        arrayList.add(anonymousClass27n);
        anonymousClass27l = new AnonymousClass27l("mention_sticker_id", arrayList);
    }

    public AnonymousClass27l(String str, List list) {
        this.f26356B = str;
        this.f26360F = list;
        this.f26357C = Collections.emptyList();
        m14513B();
    }

    /* renamed from: A */
    public final List m14512A() {
        List arrayList = new ArrayList();
        for (AnonymousClass27n anonymousClass27n : this.f26360F) {
            arrayList.add(anonymousClass27n.f26370G);
        }
        return arrayList;
    }

    /* renamed from: B */
    public final AnonymousClass27l m14513B() {
        if (this.f26356B.equals("time_sticker_id")) {
            this.f26359E = AnonymousClass27p.TIME;
        } else if (this.f26356B.equals("location_sticker_id")) {
            this.f26359E = AnonymousClass27p.UNIVERSAL_LOCATION;
        } else if (this.f26356B.equals("selfie_sticker_id")) {
            this.f26359E = AnonymousClass27p.SELFIE_STICKER;
        } else if (this.f26356B.equals("hashtag_sticker_id")) {
            this.f26359E = AnonymousClass27p.HASHTAG_STICKER;
        } else if (this.f26356B.equals("mention_sticker_id")) {
            this.f26359E = AnonymousClass27p.MENTION;
        } else if (this.f26356B.equals("product_item_sticker_id")) {
            this.f26359E = AnonymousClass27p.PRODUCT;
        } else if (this.f26356B.equals("music_intent_sticker_id")) {
            this.f26359E = AnonymousClass27p.MUSIC_INTENT;
        } else if (this.f26356B.equals("music_sticker_id")) {
            this.f26359E = AnonymousClass27p.MUSIC_OVERLAY;
        } else if (this.f26356B.equals("poll_sticker_bundle_id")) {
            this.f26359E = AnonymousClass27p.POLLING;
        } else if (this.f26356B.equals("question_sticker_bundle_id")) {
            this.f26359E = AnonymousClass27p.QUESTION;
        } else if (this.f26356B.equals("slider_sticker_bundle_id")) {
            this.f26359E = AnonymousClass27p.SLIDER;
        } else if (this.f26356B.equals("media_sticker_bundle")) {
            this.f26359E = AnonymousClass27p.MEDIA;
        } else if (this.f26356B.equals("gif_sticker_bundle")) {
            this.f26359E = AnonymousClass27p.GIF_SEARCH;
        } else if (this.f26356B.equals("gallery_browse_sticker_id")) {
            this.f26359E = AnonymousClass27p.GALLERY_BROWSE;
        } else if (this.f26356B.equals("friend_sticker_editor_id")) {
            this.f26359E = AnonymousClass27p.FRIEND_STICKER_EDITOR;
        } else if (this.f26356B.equals("internal_sticker_id")) {
            this.f26359E = AnonymousClass27p.INTERNAL;
        } else if (this.f26356B.equals("question_response_reshare_sticker_id")) {
            this.f26359E = AnonymousClass27p.QUESTION_RESPONSE_RESHARE;
        } else if (((AnonymousClass27n) this.f26360F.get(0)).f26376M != null) {
            this.f26359E = AnonymousClass27p.GEO_STICKER;
        } else {
            this.f26359E = AnonymousClass27p.NORMAL;
        }
        return this;
    }

    /* renamed from: B */
    public static AnonymousClass27l m14511B(String str, String str2, float f, Bitmap bitmap) {
        AnonymousClass27n anonymousClass27n = new AnonymousClass27n();
        anonymousClass27n.f26375L = bitmap;
        anonymousClass27n.f26373J = (float) bitmap.getWidth();
        anonymousClass27n.f26371H = (float) bitmap.getHeight();
        anonymousClass27n.f26374K = f;
        anonymousClass27n.f26370G = str2;
        return new AnonymousClass27l(str, Collections.singletonList(anonymousClass27n));
    }
}
