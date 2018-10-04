package X;

/* renamed from: X.4qX */
public enum AnonymousClass4qX {
    RelatedHashtagImpression("related_hashtag_item_impression"),
    RelatedHashtagItemTapped("related_hashtag_item_tapped"),
    RelatedLocationImpression("related_location_item_impression"),
    RelatedLocationItemTapped("related_location_item_tapped");
    
    /* renamed from: B */
    private final String f57825B;

    private AnonymousClass4qX(String str) {
        this.f57825B = str;
    }

    /* renamed from: A */
    public final void m25190A(AnonymousClass0EE anonymousClass0EE, AnonymousClass0db anonymousClass0db, String str, String str2) {
        AnonymousClass0NN.B(this.f57825B, anonymousClass0EE).F("name", str).F("id", str2).O(anonymousClass0db).R();
    }
}
