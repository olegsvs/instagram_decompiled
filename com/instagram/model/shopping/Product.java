package com.instagram.model.shopping;

import X.AnonymousClass0CC;
import X.AnonymousClass0F4;
import X.AnonymousClass0Ls;
import X.AnonymousClass0MJ;
import X.AnonymousClass0PA;
import X.AnonymousClass0Sj;
import X.AnonymousClass0X2;
import X.AnonymousClass0x8;
import X.AnonymousClass1Cy;
import X.AnonymousClass1Mr;
import X.AnonymousClass2ET;
import X.AnonymousClass2EU;
import X.AnonymousClass2EX;
import X.AnonymousClass2ZT;
import X.AnonymousClass2ZU;
import android.os.Parcelable.Creator;
import com.instagram.tagging.model.TaggableModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Product implements AnonymousClass0MJ, TaggableModel, AnonymousClass0PA {
    public static final Creator CREATOR = new AnonymousClass1Mr();
    /* renamed from: B */
    public String f4980B;
    /* renamed from: C */
    public String f4981C;
    /* renamed from: D */
    public String f4982D;
    /* renamed from: E */
    public String f4983E;
    /* renamed from: F */
    public String f4984F;
    /* renamed from: G */
    public boolean f4985G;
    /* renamed from: H */
    public AnonymousClass2EX f4986H;
    /* renamed from: I */
    public AnonymousClass2ET f4987I;
    /* renamed from: J */
    public String f4988J;
    /* renamed from: K */
    public ProductCheckoutProperties f4989K;
    /* renamed from: L */
    public String f4990L;
    /* renamed from: M */
    public List f4991M;
    /* renamed from: N */
    public String f4992N;
    /* renamed from: O */
    public AnonymousClass0Sj f4993O = AnonymousClass0Sj.APPROVED;
    /* renamed from: P */
    public AnonymousClass2EX f4994P;
    /* renamed from: Q */
    public Map f4995Q;
    /* renamed from: R */
    public List f4996R;

    public final boolean DY() {
        return true;
    }

    public final boolean bX() {
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean eY() {
        return false;
    }

    public final String zR() {
        return null;
    }

    public Product(AnonymousClass2ZU anonymousClass2ZU) {
        this.f4988J = anonymousClass2ZU.f31320G;
        this.f4990L = anonymousClass2ZU.f31318E;
        this.f4992N = anonymousClass2ZU.f31321H;
        this.f4984F = anonymousClass2ZU.f31317D.f31311B;
        this.f4981C = anonymousClass2ZU.f31315B.f31310B;
        this.f4982D = anonymousClass2ZU.f31316C;
        AnonymousClass2ZT anonymousClass2ZT = anonymousClass2ZU.f31319F;
        AnonymousClass2ZT anonymousClass2ZT2 = anonymousClass2ZT;
        if (anonymousClass2ZT != null) {
            this.f4986H = new AnonymousClass2EX();
            AnonymousClass0X2 anonymousClass0X2 = new AnonymousClass0X2();
            AnonymousClass0Ls anonymousClass0Ls = new AnonymousClass0Ls();
            anonymousClass0Ls.f3296G = anonymousClass2ZT2.f31314D;
            anonymousClass0Ls.f3292C = anonymousClass2ZT2.f31312B;
            anonymousClass0Ls.f3295F = anonymousClass2ZT2.f31313C;
            List arrayList = new ArrayList();
            arrayList.add(anonymousClass0Ls);
            anonymousClass0X2.f6093B = arrayList;
            this.f4986H.f27873B = anonymousClass0X2;
        }
    }

    public Product(android.os.Parcel r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r2 = this;
        r2.<init>();
        r0 = X.AnonymousClass0Sj.APPROVED;
        r2.f4993O = r0;
        r0 = r3.readString();
        r2.f4988J = r0;
        r0 = r3.readString();
        r2.f4990L = r0;
        r0 = r3.readString();
        r2.f4981C = r0;
        r0 = r3.readString();
        r2.f4984F = r0;
        r0 = r3.readString();
        r0 = X.AnonymousClass0Sj.m4390B(r0);
        r2.f4993O = r0;
        r1 = r3.readInt();
        r0 = 1;
        if (r1 != r0) goto L_0x0031;
    L_0x0030:
        goto L_0x0032;
    L_0x0031:
        r0 = 0;
    L_0x0032:
        r2.f4985G = r0;
        r0 = r3.readString();
        r2.f4980B = r0;
        r0 = com.instagram.model.shopping.ProductCheckoutProperties.class;
        r0 = r0.getClassLoader();
        r0 = r3.readParcelable(r0);
        r0 = (com.instagram.model.shopping.ProductCheckoutProperties) r0;
        r2.f4989K = r0;
        r0 = r3.readString();	 Catch:{ IOException -> 0x0052, IOException -> 0x0052 }
        r0 = X.AnonymousClass2ar.parseFromJson(r0);	 Catch:{ IOException -> 0x0052, IOException -> 0x0052 }
        r2.f4986H = r0;	 Catch:{ IOException -> 0x0052, IOException -> 0x0052 }
    L_0x0052:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.shopping.Product.<init>(android.os.Parcel):void");
    }

    /* renamed from: A */
    public final boolean m4382A() {
        return "native_checkout".equals(this.f4980B) && ((Boolean) AnonymousClass0CC.Ld.m845G()).booleanValue();
    }

    /* renamed from: B */
    public final AnonymousClass0X2 m4383B() {
        AnonymousClass2EX anonymousClass2EX = this.f4986H;
        if (anonymousClass2EX == null) {
            return null;
        }
        return anonymousClass2EX.f27873B;
    }

    /* renamed from: C */
    public final String m4384C() {
        if (m4389H()) {
            return this.f4981C;
        }
        return this.f4984F;
    }

    /* renamed from: D */
    public final List m4385D() {
        List list = this.f4991M;
        if (list != null) {
            if (!list.isEmpty()) {
                List arrayList = new ArrayList(this.f4991M.size());
                arrayList.add(m4383B());
                for (int i = 1; i < this.f4991M.size(); i++) {
                    arrayList.add(((AnonymousClass2EX) this.f4991M.get(i)).f27873B);
                }
                return arrayList;
            }
        }
        return Collections.singletonList(m4383B());
    }

    /* renamed from: E */
    public final AnonymousClass0X2 m4386E() {
        AnonymousClass2EX anonymousClass2EX = this.f4994P;
        if (anonymousClass2EX == null) {
            return null;
        }
        return anonymousClass2EX.f27873B;
    }

    /* renamed from: F */
    public final String m4387F(String str) {
        AnonymousClass1Cy.m9952G(this.f4995Q);
        return (String) this.f4995Q.get(str);
    }

    public final AnonymousClass0x8 FR() {
        return this.f4985G ? AnonymousClass0x8.SAVED : AnonymousClass0x8.NOT_SAVED;
    }

    /* renamed from: G */
    public final boolean m4388G() {
        ProductCheckoutProperties productCheckoutProperties = this.f4989K;
        return productCheckoutProperties != null && productCheckoutProperties.f27871B > 0;
    }

    public final Collection GR() {
        return Collections.EMPTY_LIST;
    }

    /* renamed from: H */
    public final boolean m4389H() {
        return this.f4981C.equals(this.f4984F) ^ 1;
    }

    public final void MRA(AnonymousClass0x8 anonymousClass0x8) {
        this.f4985G = anonymousClass0x8 == AnonymousClass0x8.SAVED;
    }

    public final void XOA(String str) {
        this.f4990L = str;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    Product product = (Product) obj;
                    if (this.f4988J.equals(product.f4988J)) {
                        if (this.f4990L.equals(product.f4990L)) {
                            if (this.f4984F.equals(product.f4984F)) {
                                if (this.f4981C.equals(product.f4981C)) {
                                    String str = this.f4982D;
                                    if (str != null) {
                                        if (!str.equals(product.f4982D)) {
                                        }
                                    } else if (product.f4982D != null) {
                                    }
                                    AnonymousClass2EX anonymousClass2EX = this.f4986H;
                                    if (anonymousClass2EX != null) {
                                        if (!anonymousClass2EX.equals(product.f4986H)) {
                                        }
                                    } else if (product.f4986H != null) {
                                    }
                                    anonymousClass2EX = this.f4994P;
                                    if (anonymousClass2EX != null) {
                                        if (!anonymousClass2EX.equals(product.f4994P)) {
                                        }
                                    } else if (product.f4994P != null) {
                                    }
                                    str = this.f4983E;
                                    if (str != null) {
                                        if (!str.equals(product.f4983E)) {
                                        }
                                    } else if (product.f4983E != null) {
                                    }
                                    if (this.f4980B.equals(product.f4980B)) {
                                        List list = this.f4996R;
                                        if (list != null) {
                                            if (list.equals(product.f4996R)) {
                                            }
                                        } else if (product.f4996R != null) {
                                        }
                                        ProductCheckoutProperties productCheckoutProperties = this.f4989K;
                                        if (productCheckoutProperties != null) {
                                            if (productCheckoutProperties.equals(product.f4989K)) {
                                            }
                                        } else if (product.f4989K != null) {
                                        }
                                        if (this.f4993O != product.f4993O) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final String getId() {
        return this.f4990L;
    }

    public final int hashCode() {
        this.f4988J.hashCode();
        this.f4990L.hashCode();
        this.f4984F.hashCode();
        this.f4981C.hashCode();
        String str = this.f4982D;
        if (str != null) {
            str.hashCode();
        }
        AnonymousClass2EX anonymousClass2EX = this.f4986H;
        if (anonymousClass2EX != null) {
            anonymousClass2EX.hashCode();
        }
        anonymousClass2EX = this.f4994P;
        if (anonymousClass2EX != null) {
            anonymousClass2EX.hashCode();
        }
        str = this.f4983E;
        if (str != null) {
            str.hashCode();
        }
        int hashCode = (this.f4980B.hashCode() * 31) * 31;
        List list = this.f4996R;
        int i = 0;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        ProductCheckoutProperties productCheckoutProperties = this.f4989K;
        if (productCheckoutProperties != null) {
            i = productCheckoutProperties.hashCode();
        }
        return ((hashCode + i) * 31) + this.f4993O.hashCode();
    }

    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.f4988J;
        r4.writeString(r0);
        r0 = r3.f4990L;
        r4.writeString(r0);
        r0 = r3.f4981C;
        r4.writeString(r0);
        r0 = r3.f4984F;
        r4.writeString(r0);
        r0 = r3.f4993O;
        r0 = r0.m4391A();
        r4.writeString(r0);
        r0 = r3.f4985G;
        r4.writeInt(r0);
        r0 = r3.f4980B;
        r4.writeString(r0);
        r0 = r3.f4989K;
        r4.writeParcelable(r0, r5);
        r3 = r3.f4986H;	 Catch:{ IOException -> 0x0047, IOException -> 0x0047 }
        r2 = new java.io.StringWriter;	 Catch:{ IOException -> 0x0047, IOException -> 0x0047 }
        r2.<init>();	 Catch:{ IOException -> 0x0047, IOException -> 0x0047 }
        r0 = X.AnonymousClass0Lm.f3274B;	 Catch:{ IOException -> 0x0047, IOException -> 0x0047 }
        r1 = r0.createGenerator(r2);	 Catch:{ IOException -> 0x0047, IOException -> 0x0047 }
        r0 = 1;	 Catch:{ IOException -> 0x0047, IOException -> 0x0047 }
        X.AnonymousClass2ar.C(r1, r3, r0);	 Catch:{ IOException -> 0x0047, IOException -> 0x0047 }
        r1.close();	 Catch:{ IOException -> 0x0047, IOException -> 0x0047 }
        r0 = r2.toString();	 Catch:{ IOException -> 0x0047, IOException -> 0x0047 }
        r4.writeString(r0);	 Catch:{ IOException -> 0x0047, IOException -> 0x0047 }
    L_0x0047:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.shopping.Product.writeToParcel(android.os.Parcel, int):void");
    }

    public final void yC() {
        AnonymousClass0F4.f2058E.m1505B(new AnonymousClass2EU(this));
    }
}
