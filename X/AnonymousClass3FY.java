package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3FY */
public final class AnonymousClass3FY {
    /* renamed from: B */
    public boolean f39543B;
    /* renamed from: C */
    public int f39544C;
    /* renamed from: D */
    public AnonymousClass3DU f39545D;
    /* renamed from: E */
    public AnonymousClass3FM f39546E;
    /* renamed from: F */
    public AnonymousClass36h f39547F;
    /* renamed from: G */
    public AnonymousClass36h f39548G;
    /* renamed from: H */
    public int f39549H;
    /* renamed from: I */
    public List f39550I;
    /* renamed from: J */
    public HashMap f39551J = new HashMap();
    /* renamed from: K */
    public int f39552K = 0;
    /* renamed from: L */
    public int f39553L = -1;
    /* renamed from: M */
    public int f39554M;
    /* renamed from: N */
    public List f39555N = new ArrayList();
    /* renamed from: O */
    public boolean f39556O;
    /* renamed from: P */
    public int f39557P;
    /* renamed from: Q */
    public List f39558Q = new ArrayList();
    /* renamed from: R */
    public List f39559R = new ArrayList();

    /* renamed from: A */
    public final AnonymousClass0db m19129A() {
        AnonymousClass0db C = AnonymousClass0db.C();
        C.G("supports_face_filters", this.f39556O ? "1" : "0");
        C.C("button_tap_count", this.f39544C);
        C.C("face_effect_off_tap_count", this.f39549H);
        C.G("button_was_shown", this.f39543B ? "1" : "0");
        C.C("num_effects_in_tray", this.f39554M);
        C.C("tray_dismissed_with_active_effect_count", this.f39557P);
        if (this.f39556O) {
            List list = this.f39550I;
            if (!(list == null || list.isEmpty())) {
                int i = this.f39552K;
                if (i == 0) {
                    i = 1;
                }
                int i2 = this.f39553L;
                for (i = 
/*
Method generation error in method: X.3FY.A():X.0db, dex: classes2.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r4_2 'i' int) = (r4_0 'i' int), (r4_1 'i' int) binds: {(r4_1 'i' int)=B:16:0x004e, (r4_0 'i' int)=B:15:0x004c} in method: X.3FY.A():X.0db, dex: classes2.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
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
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 26 more

*/

                /* renamed from: B */
                public final boolean m19130B() {
                    AnonymousClass36h anonymousClass36h = this.f39547F;
                    return (anonymousClass36h == null || anonymousClass36h.equals(this.f39548G)) ? false : true;
                }

                /* renamed from: C */
                public final void m19131C(AnonymousClass36h anonymousClass36h) {
                    this.f39547F = anonymousClass36h;
                    if (anonymousClass36h.equals(this.f39548G)) {
                        this.f39549H++;
                        return;
                    }
                    AnonymousClass3FW anonymousClass3FW = (AnonymousClass3FW) this.f39551J.get(this.f39547F.f37882L);
                    if (anonymousClass3FW != null) {
                        anonymousClass3FW.f39541N = 0;
                        anonymousClass3FW.f39538K++;
                    }
                }

                /* renamed from: D */
                public final void m19132D(List list) {
                    this.f39550I = list;
                    this.f39551J.clear();
                    for (int i = 0; i < this.f39550I.size(); i++) {
                        AnonymousClass36h anonymousClass36h = (AnonymousClass36h) list.get(i);
                        this.f39551J.put(anonymousClass36h.f37882L, new AnonymousClass3FW(anonymousClass36h, i));
                    }
                    this.f39554M = list.size();
                }
            }
