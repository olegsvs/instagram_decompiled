package com.instagram.tagging.activity;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0EE;
import X.AnonymousClass0G5;
import X.AnonymousClass0Iz;
import X.AnonymousClass0LH;
import X.AnonymousClass0ON;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ca;
import X.AnonymousClass0eU;
import X.AnonymousClass0eV;
import X.AnonymousClass1A1;
import X.AnonymousClass2NY;
import X.AnonymousClass3hW;
import X.AnonymousClass3hX;
import X.AnonymousClass3hZ;
import X.AnonymousClass3ha;
import X.AnonymousClass3hb;
import X.AnonymousClass3hc;
import X.AnonymousClass3hd;
import X.AnonymousClass3he;
import X.AnonymousClass3hh;
import X.AnonymousClass3hj;
import X.AnonymousClass3hk;
import X.AnonymousClass3hm;
import X.AnonymousClass3hn;
import X.AnonymousClass3ho;
import X.AnonymousClass3hs;
import X.AnonymousClass3ht;
import X.AnonymousClass3iU;
import X.AnonymousClass3ia;
import X.AnonymousClass420;
import X.AnonymousClass421;
import X.AnonymousClass453;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.actionbar.ActionButton;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.widget.PhotoScrollView;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TagActivity extends IgFragmentActivity implements AnonymousClass0EE, AnonymousClass3hs, AnonymousClass3hW, AnonymousClass3ia, AnonymousClass3iU, AnonymousClass3hh, AnonymousClass3hm {
    /* renamed from: B */
    public int f48598B;
    /* renamed from: C */
    public AnonymousClass3hX f48599C;
    /* renamed from: D */
    public ArrayList f48600D;
    /* renamed from: E */
    public PhotoScrollView f48601E;
    /* renamed from: F */
    public AnonymousClass0Cm f48602F;
    /* renamed from: G */
    public AnonymousClass420 f48603G;
    /* renamed from: H */
    public ReboundViewPager f48604H;
    /* renamed from: I */
    private int f48605I;
    /* renamed from: J */
    private AnonymousClass1A1 f48606J;

    /* renamed from: B */
    public static int m22187B(TagActivity tagActivity) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int size = tagActivity.f48600D.size();
        for (int i = 0; i < size; i++) {
            int i2;
            MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) tagActivity.f48600D.get(i);
            ArrayList arrayList = mediaTaggingInfo.f43454I;
            int size2 = arrayList.size();
            for (i2 = 0; i2 < size2; i2++) {
                hashSet.add(((Tag) arrayList.get(i2)).A());
            }
            arrayList = mediaTaggingInfo.f43449D;
            size2 = arrayList.size();
            for (i2 = 0; i2 < size2; i2++) {
                hashSet2.add(((Tag) arrayList.get(i2)).A());
            }
            arrayList = mediaTaggingInfo.f43455J;
            size2 = arrayList.size();
            for (i2 = 0; i2 < size2; i2++) {
                hashSet.add(((Tag) arrayList.get(i2)).A());
            }
        }
        return hashSet.size() + hashSet2.size();
    }

    public final void BGA() {
        m22190E();
    }

    /* renamed from: C */
    public static void m22188C(TagActivity tagActivity) {
        MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) tagActivity.f48600D.get(tagActivity.f48598B);
        if (mediaTaggingInfo.f43452G == AnonymousClass0ON.VIDEO) {
            AnonymousClass3hX anonymousClass3hX;
            AnonymousClass0ON anonymousClass0ON;
            AnonymousClass420 anonymousClass420;
            switch (tagActivity.f48606J.ordinal()) {
                case 0:
                    anonymousClass3hX = tagActivity.f48599C;
                    anonymousClass0ON = mediaTaggingInfo.f43452G;
                    anonymousClass420 = tagActivity.f48603G;
                    AnonymousClass3hX.m20455C(anonymousClass3hX, anonymousClass0ON, AnonymousClass1A1.PEOPLE, ((List) anonymousClass420.f48609B.get(tagActivity.jK())).size());
                    return;
                case 1:
                    anonymousClass3hX = tagActivity.f48599C;
                    anonymousClass0ON = mediaTaggingInfo.f43452G;
                    anonymousClass420 = tagActivity.f48603G;
                    AnonymousClass3hX.m20455C(anonymousClass3hX, anonymousClass0ON, AnonymousClass1A1.PRODUCT, ((List) anonymousClass420.f48610C.get(tagActivity.jK())).size());
                    return;
                default:
                    return;
            }
        }
        switch (tagActivity.f48606J.ordinal()) {
            case 0:
                AnonymousClass3hX.m20455C(tagActivity.f48599C, mediaTaggingInfo.f43452G, AnonymousClass1A1.PEOPLE, mediaTaggingInfo.f43454I.size());
                return;
            case 1:
                AnonymousClass3hX.m20455C(tagActivity.f48599C, mediaTaggingInfo.f43452G, AnonymousClass1A1.PRODUCT, mediaTaggingInfo.f43455J.size());
                return;
            default:
                return;
        }
    }

    public final List CQ() {
        AnonymousClass420 anonymousClass420 = this.f48603G;
        return (List) anonymousClass420.f48610C.get(jK());
    }

    /* renamed from: D */
    private boolean m22189D() {
        int size = this.f48600D.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = ((MediaTaggingInfo) this.f48600D.get(i)).f43449D;
            if (arrayList != null && !arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    private void m22190E() {
        AnonymousClass3ht anonymousClass3ht;
        switch (this.f48606J.ordinal()) {
            case 0:
                int size = ((List) this.f48603G.f48609B.get(jK())).size();
                if (m22187B(this) >= 35) {
                    Toast.makeText(this.f48599C.f43436D, C0164R.string.post_tagging_carousel_add_people_limit_reached, 0).show();
                    return;
                } else if (size >= 20) {
                    Toast.makeText(this.f48599C.f43436D, C0164R.string.video_tagging_add_people_limit_reached, 0).show();
                    return;
                } else {
                    AnonymousClass3hX anonymousClass3hX = this.f48599C;
                    anonymousClass3hX.f43438F.setVisibility(8);
                    ListView listView = anonymousClass3hX.f43440H;
                    if (listView != null) {
                        listView.setVisibility(8);
                    }
                    anonymousClass3ht = this.f48603G;
                    AnonymousClass421.m22193D(this, this.f48602F.f1759C, new ArrayList((Collection) anonymousClass3ht.f48609B.get(jK())), null, anonymousClass3ht);
                    return;
                }
            case 1:
                anonymousClass3ht = this.f48603G;
                AnonymousClass0Cm anonymousClass0Cm = this.f48602F;
                String jK = jK();
                AnonymousClass2NY.m15348B().f29737h = true;
                AnonymousClass453.m22745D(this, anonymousClass0Cm.f1759C, anonymousClass3ht, anonymousClass3ht.f48610C.containsKey(jK) ? new ArrayList((Collection) anonymousClass3ht.f48610C.get(jK)) : null, getModuleName());
                return;
            default:
                return;
        }
    }

    public final void Kh() {
        D().Q(this.f48606J == AnonymousClass1A1.PEOPLE ? "PeopleTagSearch" : "ProductTagSearch", 1);
        m22188C(this);
    }

    public final List OP() {
        AnonymousClass420 anonymousClass420 = this.f48603G;
        return (List) anonymousClass420.f48609B.get(jK());
    }

    public final boolean aC(int i) {
        return bC(i) && m22187B(this) < this.f48605I;
    }

    public final boolean bC(int i) {
        int i2;
        switch (AnonymousClass3hd.f43460B[this.f48606J.ordinal()]) {
            case 1:
                i2 = 20;
                break;
            case 2:
                i2 = 5;
                break;
            default:
                i2 = 0;
                break;
        }
        return i < i2;
    }

    public final boolean cC(int i) {
        return i < 20 && m22187B(this) < this.f48605I;
    }

    public final String getModuleName() {
        return this.f48606J == AnonymousClass1A1.PEOPLE ? "people_tagging" : "product_tagging";
    }

    public final String jK() {
        return ((MediaTaggingInfo) this.f48600D.get(this.f48598B)).f43451F;
    }

    public final void kn() {
        if (((MediaTaggingInfo) this.f48600D.get(this.f48598B)).f43452G == AnonymousClass0ON.VIDEO) {
            m22190E();
        }
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, 659528385);
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        this.f48602F = AnonymousClass0Ce.G(getIntent().getExtras());
        AnonymousClass1A1 anonymousClass1A1 = (AnonymousClass1A1) getIntent().getSerializableExtra("tag_type");
        this.f48606J = anonymousClass1A1;
        AnonymousClass0LH.E(anonymousClass1A1);
        Intent intent = getIntent();
        String str = "max_tags_remaining";
        anonymousClass1A1 = this.f48606J;
        AnonymousClass1A1 anonymousClass1A12 = AnonymousClass1A1.PEOPLE;
        r0.f48605I = intent.getIntExtra(str, anonymousClass1A1 == anonymousClass1A12 ? 20 : 5);
        if (bundle != null) {
            r0.f48600D = bundle2.getParcelableArrayList("media_tagging_info_list");
        } else {
            r0.f48600D = getIntent().getParcelableArrayListExtra("media_tagging_info_list");
        }
        setContentView(C0164R.layout.activity_tag);
        ImageView imageView = (ImageView) findViewById(C0164R.id.action_bar_button_back);
        imageView.setBackground(new AnonymousClass0eU(getTheme(), AnonymousClass0eV.MODAL));
        imageView.setOnClickListener(new AnonymousClass3hZ(r0));
        ((TextView) findViewById(C0164R.id.action_bar_textview_title)).setText(r0.f48606J == anonymousClass1A12 ? C0164R.string.people_tagging_add_people : C0164R.string.product_tagging_add_products);
        ActionButton actionButton = (ActionButton) findViewById(C0164R.id.action_bar_button_done);
        actionButton.setVisibility(0);
        actionButton.setButtonResource(C0164R.drawable.check);
        actionButton.setColorFilter(AnonymousClass0ca.B(AnonymousClass0G5.D(r0, C0164R.attr.modalActionBarPrimaryButtonForeground)));
        actionButton.setContentDescription(getString(C0164R.string.done));
        actionButton.setOnClickListener(new AnonymousClass3ha(r0));
        r0.f48603G = new AnonymousClass420(r0);
        r0.f48599C = new AnonymousClass3hX(r0, r0, m22187B(r0), r0.f48605I, findViewById(C0164R.id.tags_help_container), (TextView) findViewById(C0164R.id.tags_help_text), (TextView) findViewById(C0164R.id.fb_tags_help_text), (TextView) findViewById(C0164R.id.tags_secondary_help_text), (TextView) findViewById(C0164R.id.tags_tertiary_help_text), (ViewStub) findViewById(C0164R.id.tap_to_tag_icon_view_stub), r0.f48600D.size() > 1, m22189D(), r0.f48603G, r0.f48602F, this, r0.f48606J);
        if (r0.f48600D.size() == 1) {
            MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) r0.f48600D.get(0);
            if (mediaTaggingInfo.f43452G == AnonymousClass0ON.PHOTO) {
                AnonymousClass3hk.m20459B(new AnonymousClass3hj(((ViewStub) findViewById(C0164R.id.tag_photo_view_stub)).inflate(), r0.f48606J), r0.f48606J, mediaTaggingInfo, r0.f48602F, r0, r0);
            } else {
                AnonymousClass3ho.m20460B(new AnonymousClass3hn(((ViewStub) findViewById(C0164R.id.tag_video_view_stub)).inflate()), mediaTaggingInfo, r0);
            }
            if (mediaTaggingInfo.f43452G == AnonymousClass0ON.VIDEO) {
                ((ViewStub) findViewById(C0164R.id.tagged_items_view_stub)).inflate();
                r0.f48603G.f48609B.put(mediaTaggingInfo.f43451F, mediaTaggingInfo.f43454I);
                r0.f48603G.f48610C.put(mediaTaggingInfo.f43451F, mediaTaggingInfo.f43455J);
                r0.f48599C.f43440H = (ListView) findViewById(C0164R.id.tagged_items);
            }
        } else {
            int i = 0;
            int intExtra = getIntent().getIntExtra("initial_page", 0);
            r0.f48598B = intExtra;
            ((ViewStub) findViewById(C0164R.id.tag_carousel_view_stub)).inflate();
            ReboundViewPager reboundViewPager = (ReboundViewPager) findViewById(C0164R.id.tag_carousel_viewpager);
            r0.f48604H = reboundViewPager;
            reboundViewPager.M((float) intExtra, false);
            r0.f48604H.setPageSpacing(0.0f);
            r0.f48604H.setAdapter(new AnonymousClass3he(r0.f48600D, r0.f48602F, r0, r0, r0.f48606J, r0));
            r0.f48604H.A(new AnonymousClass3hb(r0));
            r0.f48604H.G(intExtra);
            int size = r0.f48600D.size();
            while (i < size) {
                MediaTaggingInfo mediaTaggingInfo2 = (MediaTaggingInfo) r0.f48600D.get(i);
                if (mediaTaggingInfo2.f43452G == AnonymousClass0ON.VIDEO) {
                    if (findViewById(C0164R.id.tagged_items) == null) {
                        ((ViewStub) findViewById(C0164R.id.tagged_items_view_stub)).inflate();
                        r0.f48599C.f43440H = (ListView) findViewById(C0164R.id.tagged_items);
                    }
                    r0.f48603G.f48609B.put(mediaTaggingInfo2.f43451F, mediaTaggingInfo2.f43454I);
                    r0.f48603G.f48610C.put(mediaTaggingInfo2.f43451F, mediaTaggingInfo2.f43455J);
                }
                i++;
            }
        }
        r0.f48601E = (PhotoScrollView) findViewById(C0164R.id.photo_scroll_view);
        if (getResources().getConfiguration().orientation == 2) {
            r0.f48601E.setOnMeasureListener(new AnonymousClass3hc(r0));
        }
        AnonymousClass0cQ.C(r0, -1884969646, B);
    }

    public final void onDestroy() {
        int B = AnonymousClass0cQ.B(this, -375823723);
        super.onDestroy();
        AnonymousClass0cQ.C(this, 644946132, B);
    }

    public final void onResume() {
        int B = AnonymousClass0cQ.B(this, 1772238699);
        super.onResume();
        AnonymousClass0Iz.f2854L.H(this);
        m22188C(this);
        AnonymousClass0cQ.C(this, 1195712231, B);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("media_tagging_info_list", this.f48600D);
    }

    public final void pCA() {
        this.f48599C.m20456A(true, m22187B(this), m22189D());
        D().Q(this.f48606J == AnonymousClass1A1.PEOPLE ? "PeopleTagSearch" : "ProductTagSearch", 1);
    }

    public final void qCA(PointF pointF) {
        this.f48599C.m20456A(false, m22187B(this), m22189D());
        PhotoScrollView photoScrollView = this.f48601E;
        if (photoScrollView != null) {
            photoScrollView.setScrollTarget(pointF.y);
        }
    }

    public final void rCA(TagsInteractiveLayout tagsInteractiveLayout, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        switch (this.f48606J.ordinal()) {
            case 0:
                AnonymousClass421.m22193D(this, this.f48602F.f1759C, arrayList, arrayList2, tagsInteractiveLayout);
                return;
            case 1:
                AnonymousClass2NY.m15348B().f29737h = true;
                AnonymousClass453.m22745D(this, this.f48602F.f1759C, tagsInteractiveLayout, arrayList3, getModuleName());
                return;
            default:
                return;
        }
    }

    public final void sCA(PointF pointF) {
        PhotoScrollView photoScrollView = this.f48601E;
        if (photoScrollView != null) {
            photoScrollView.setScrollTarget(pointF.y);
        }
    }

    public final void tCA() {
        m22190E();
    }

    public final void uCA() {
        m22188C(this);
    }
}
