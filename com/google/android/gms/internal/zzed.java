package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzed implements IInterface {
    /* renamed from: B */
    private final IBinder f15989B;
    /* renamed from: C */
    private final String f15990C;

    public zzed(IBinder iBinder, String str) {
        int I = AnonymousClass0cQ.m5859I(this, 1245643870);
        this.f15989B = iBinder;
        this.f15990C = str;
        AnonymousClass0cQ.m5858H(this, -1089612423, I);
    }

    /* renamed from: A */
    public final Parcel m10308A() {
        int I = AnonymousClass0cQ.m5859I(this, 1708310903);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15990C);
        AnonymousClass0cQ.m5858H(this, 1968302932, I);
        return obtain;
    }

    /* renamed from: B */
    public final Parcel m10309B(int i, Parcel parcel) {
        int I = AnonymousClass0cQ.m5859I(this, 8906521);
        Parcel obtain = Parcel.obtain();
        IBinder iBinder;
        try {
            iBinder = this.f15989B;
            iBinder.transact(i, parcel, obtain, 0);
            obtain.readException();
        } catch (RuntimeException e) {
            iBinder = e;
            throw iBinder;
        } finally {
            
/*
Method generation error in method: com.google.android.gms.internal.zzed.B(int, android.os.Parcel):android.os.Parcel, dex: classes.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001f: INVOKE  (wrap: android.os.Parcel
  ?: MERGE  (r6_1 android.os.Parcel) = (r6_0 'parcel' android.os.Parcel), (r2_0 'obtain' android.os.Parcel)) android.os.Parcel.recycle():void type: VIRTUAL in method: com.google.android.gms.internal.zzed.B(int, android.os.Parcel):android.os.Parcel, dex: classes.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:203)
	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:100)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:50)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:299)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: MERGE  (r6_1 android.os.Parcel) = (r6_0 'parcel' android.os.Parcel), (r2_0 'obtain' android.os.Parcel) in method: com.google.android.gms.internal.zzed.B(int, android.os.Parcel):android.os.Parcel, dex: classes.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:101)
	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:84)
	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:632)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:338)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 22 more
Caused by: jadx.core.utils.exceptions.CodegenException: MERGE can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:211)
	... 27 more

*/

            /* renamed from: C */
            public final void m10310C(int i, Parcel parcel) {
                int I = AnonymousClass0cQ.m5859I(this, 1328881082);
                Parcel obtain = Parcel.obtain();
                try {
                    this.f15989B.transact(i, parcel, obtain, 0);
                    obtain.readException();
                } finally {
                    parcel.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 29578627, I);
                }
            }

            /* renamed from: D */
            public final void m10311D(int i, Parcel parcel) {
                int I = AnonymousClass0cQ.m5859I(this, -119707248);
                try {
                    this.f15989B.transact(i, parcel, null, 1);
                } finally {
                    parcel.recycle();
                    AnonymousClass0cQ.m5858H(this, 224235344, I);
                }
            }

            public final IBinder asBinder() {
                int I = AnonymousClass0cQ.m5859I(this, -1553003046);
                IBinder iBinder = this.f15989B;
                AnonymousClass0cQ.m5858H(this, 1682233844, I);
                return iBinder;
            }
        }
