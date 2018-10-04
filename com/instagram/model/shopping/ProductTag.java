package com.instagram.model.shopping;

import X.AnonymousClass1Mq;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TaggableModel;

public class ProductTag extends Tag {
    public static final Creator CREATOR = new AnonymousClass1Mq();
    /* renamed from: B */
    public Product f17742B;

    /* renamed from: B */
    public final String mo2198B() {
        return "product_id";
    }

    public ProductTag() {
        this(new Product());
    }

    public ProductTag(Parcel parcel) {
        super(parcel, Product.class.getClassLoader());
    }

    public ProductTag(Product product) {
        this.f17742B = product;
    }

    public ProductTag(Product product, PointF pointF) {
        this.f15363B = pointF;
        this.f17742B = product;
    }

    /* renamed from: C */
    public final /* bridge */ /* synthetic */ TaggableModel mo2199C() {
        return this.f17742B;
    }

    /* renamed from: D */
    public final /* bridge */ /* synthetic */ void mo2200D(TaggableModel taggableModel) {
        this.f17742B = (Product) taggableModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                if (super.equals(obj)) {
                    return this.f17742B.equals(((ProductTag) obj).f17742B);
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17742B.hashCode();
    }
}
