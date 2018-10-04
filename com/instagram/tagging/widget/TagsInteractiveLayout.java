package com.instagram.tagging.widget;

import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0EE;
import X.AnonymousClass0cQ;
import X.AnonymousClass0iy;
import X.AnonymousClass1A1;
import X.AnonymousClass1ak;
import X.AnonymousClass3ht;
import X.AnonymousClass3iT;
import X.AnonymousClass3iU;
import X.AnonymousClass3iZ;
import X.AnonymousClass3ia;
import X.AnonymousClass3ib;
import X.AnonymousClass3ic;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.model.fbfriend.FbFriend;
import com.instagram.model.fbfriend.FbFriendTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductTag;
import com.instagram.tagging.model.Tag;
import java.util.ArrayList;

public class TagsInteractiveLayout extends TagsLayout implements AnonymousClass0EE, AnonymousClass3ht {
    /* renamed from: B */
    public AnonymousClass1ak f48640B = new AnonymousClass1ak(this, AnonymousClass0iy.PHOTO_TAG);
    /* renamed from: C */
    public ArrayList f48641C;
    /* renamed from: D */
    public AnonymousClass3ia f48642D;
    /* renamed from: E */
    public AnonymousClass3iT f48643E;
    /* renamed from: F */
    public ArrayList f48644F;
    /* renamed from: G */
    public ArrayList f48645G;
    /* renamed from: H */
    public boolean f48646H;
    /* renamed from: I */
    public boolean f48647I;
    /* renamed from: J */
    public AnonymousClass3iT f48648J;
    /* renamed from: K */
    private final GestureDetector f48649K = new GestureDetector(getContext(), new AnonymousClass3ib(this));
    /* renamed from: L */
    private AnonymousClass3iU f48650L;
    /* renamed from: M */
    private AnonymousClass0Cm f48651M;
    /* renamed from: N */
    private boolean f48652N;

    public class UnnamedTagSavedState extends BaseSavedState {
        public static final Creator CREATOR = new AnonymousClass3ic();
        /* renamed from: B */
        public PointF f43606B;

        public UnnamedTagSavedState(Parcel parcel) {
            super(parcel);
            PointF pointF = new PointF();
            this.f43606B = pointF;
            pointF.x = parcel.readFloat();
            this.f43606B.y = parcel.readFloat();
        }

        public UnnamedTagSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f43606B.x);
            parcel.writeFloat(this.f43606B.y);
        }
    }

    public final void gWA() {
    }

    public String getModuleName() {
        return "tags_interactive_layout";
    }

    public final void pJA() {
    }

    public TagsInteractiveLayout(Context context) {
        super(context);
    }

    public TagsInteractiveLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TagsInteractiveLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void AC(Product product) {
        AnonymousClass3iT anonymousClass3iT = this.f48648J;
        if (anonymousClass3iT != null) {
            m22199C(new ProductTag(product, anonymousClass3iT.getNormalizedPosition()));
        }
    }

    /* renamed from: B */
    public static void m22198B(TagsInteractiveLayout tagsInteractiveLayout, PointF pointF) {
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.8f);
        alphaAnimation.setFillAfter(true);
        for (int i = 0; i < tagsInteractiveLayout.getChildCount(); i++) {
            AnonymousClass3iT D = tagsInteractiveLayout.D(i);
            D.setAnimation(alphaAnimation);
            D.f43580H = false;
        }
        tagsInteractiveLayout.f12122B = false;
        CharSequence string = tagsInteractiveLayout.getResources().getString(C0164R.string.people_tagging_default_text);
        View anonymousClass3iT = new AnonymousClass3iT(tagsInteractiveLayout.getContext(), tagsInteractiveLayout.f12123C);
        anonymousClass3iT.setText(string);
        anonymousClass3iT.setNormalizedPosition(pointF);
        tagsInteractiveLayout.f48648J = anonymousClass3iT;
        tagsInteractiveLayout.addView(anonymousClass3iT);
        tagsInteractiveLayout.f48642D.qCA(pointF);
    }

    public final void BC(AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass3iT anonymousClass3iT = this.f48648J;
        if (anonymousClass3iT != null) {
            m22199C(new PeopleTag(anonymousClass0Ci, anonymousClass3iT.getNormalizedPosition()));
        }
    }

    /* renamed from: C */
    private void m22199C(Tag tag) {
        if (tag instanceof PeopleTag) {
            this.f48644F.add((PeopleTag) tag);
        } else if (tag instanceof FbFriendTag) {
            this.f48641C.add((FbFriendTag) tag);
        } else if (tag instanceof ProductTag) {
            this.f48645G.add((ProductTag) tag);
        }
        A(tag, false);
        jH();
    }

    /* renamed from: G */
    public final boolean m22200G(float f, float f2) {
        if (this.f48648J != null) {
            jH();
            return true;
        }
        int i;
        switch (AnonymousClass3iZ.f43604B[getTagType().ordinal()]) {
            case 1:
                if ((this.f48650L.bC(getNumberOfTags()) ^ 1) == 0) {
                    if (!this.f48652N) {
                        i = C0164R.string.people_tagging_carousel_add_people_limit_reached;
                        break;
                    }
                    i = C0164R.string.post_tagging_carousel_add_people_limit_reached;
                    break;
                }
                i = C0164R.string.people_tagging_add_people_limit_reached;
                break;
            case 2:
                if (!this.f48650L.bC(getNumberOfTags())) {
                    i = C0164R.string.product_tagging_add_product_limit_reached;
                    break;
                }
                i = C0164R.string.product_tagging_carousel_add_product_limit_reached;
                break;
            default:
                i = 0;
                break;
        }
        AnonymousClass3iT anonymousClass3iT = this.f48643E;
        if (anonymousClass3iT != null) {
            if (this.f48646H) {
                Tag tag = (Tag) anonymousClass3iT.getTag();
                if (tag instanceof PeopleTag) {
                    this.f48644F.remove(tag);
                } else if (tag instanceof FbFriendTag) {
                    this.f48641C.remove(tag);
                    AnonymousClass1ak.E(this.f48640B, -1, tag.C().getId(), "invite_tag_removed", this.f48651M);
                } else if (tag instanceof ProductTag) {
                    this.f48645G.remove(tag);
                }
                removeView(findViewWithTag(tag));
                this.f48642D.pCA();
            }
            if (this.f48647I) {
                this.f48643E.m20480F();
            }
        } else if (this.f48650L.aC(getNumberOfTags())) {
            PointF pointF = new PointF(f / ((float) getWidth()), f2 / ((float) getHeight()));
            this.f48642D.rCA(this, this.f48644F, this.f48641C, this.f48645G);
            m22198B(this, pointF);
        } else {
            Toast.makeText(getContext(), i, 0).show();
        }
        return true;
    }

    private int getNumberOfTags() {
        if (getTagType() == AnonymousClass1A1.PRODUCT) {
            return this.f48645G.size();
        }
        return this.f48644F.size() + this.f48641C.size();
    }

    public final void jH() {
        this.f12122B = true;
        removeView(this.f48648J);
        this.f48648J = null;
        Animation alphaAnimation = new AlphaAnimation(0.8f, 1.0f);
        alphaAnimation.setFillAfter(true);
        for (int i = 0; i < getChildCount(); i++) {
            AnonymousClass3iT D = D(i);
            D.startAnimation(alphaAnimation);
            D.f43580H = true;
        }
        this.f48642D.pCA();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof UnnamedTagSavedState) {
            UnnamedTagSavedState unnamedTagSavedState = (UnnamedTagSavedState) parcelable;
            super.onRestoreInstanceState(unnamedTagSavedState.getSuperState());
            m22198B(this, unnamedTagSavedState.f43606B);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (this.f48648J == null) {
            return onSaveInstanceState;
        }
        Parcelable unnamedTagSavedState = new UnnamedTagSavedState(onSaveInstanceState);
        unnamedTagSavedState.f43606B = this.f48648J.getNormalizedPosition();
        return unnamedTagSavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, -212043952);
        if (this.f48643E != null && motionEvent.getAction() == 1) {
            this.f48642D.sCA(this.f48643E.getNormalizedPosition());
            if (this.f48643E.getTag() != null) {
                Tag tag = (Tag) this.f48643E.getTag();
                tag.f15363B = this.f48643E.getNormalizedPosition();
                if (tag instanceof FbFriendTag) {
                    AnonymousClass1ak.E(this.f48640B, -1, tag.C().getId(), "invite_tag_updated", this.f48651M);
                }
            }
        }
        boolean onTouchEvent = this.f48649K.onTouchEvent(motionEvent);
        AnonymousClass0cQ.L(this, 697980870, M);
        return onTouchEvent;
    }

    public void setEditListener(AnonymousClass3ia anonymousClass3ia) {
        this.f48642D = anonymousClass3ia;
    }

    public void setProductTags(ArrayList arrayList, boolean z, AnonymousClass0Cm anonymousClass0Cm) {
        super.setTags(arrayList, z, anonymousClass0Cm == null ? null : anonymousClass0Cm.B());
        this.f48651M = anonymousClass0Cm;
        this.f48645G = arrayList;
    }

    public void setProvider(AnonymousClass3iU anonymousClass3iU) {
        this.f48650L = anonymousClass3iU;
    }

    public void setTags(ArrayList arrayList, ArrayList arrayList2, boolean z, AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0Ci B = anonymousClass0Cm.B();
        this.f48651M = anonymousClass0Cm;
        super.setTags(arrayList, z, B);
        this.f48644F = arrayList;
        super.setTags(arrayList2, z, B);
        this.f48641C = arrayList2;
    }

    public void setVideoTaggingCreationEnabled(boolean z) {
        this.f48652N = z;
    }

    public final void zB(FbFriend fbFriend) {
        AnonymousClass3iT anonymousClass3iT = this.f48648J;
        if (anonymousClass3iT != null) {
            m22199C(new FbFriendTag(fbFriend, anonymousClass3iT.getNormalizedPosition()));
        }
    }
}
