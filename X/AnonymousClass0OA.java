package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import com.android.internal.util.Predicate;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.core.JsonParser;
import com.instagram.common.math.Matrix4;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.model.venue.Venue;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.VideoUploadUrl;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.0OA */
public final class AnonymousClass0OA implements AnonymousClass0MJ, AnonymousClass0OB {
    public boolean AB;
    public AnonymousClass1JM AC;
    public int AD;
    /* renamed from: B */
    public String f3788B;
    public ArrayList BB;
    public String BC;
    public String BD;
    /* renamed from: C */
    public List f3789C;
    public String CB;
    public long CC;
    public String CD;
    /* renamed from: D */
    public List f3790D;
    public String DB;
    public Boolean DC;
    public List DD;
    /* renamed from: E */
    public boolean f3791E;
    public AnonymousClass2F0 EB;
    public double EC;
    public List ED;
    /* renamed from: F */
    public boolean f3792F;
    public long FB;
    public double FC;
    public Integer FD;
    /* renamed from: G */
    public String f3793G;
    public int GB;
    public transient AnonymousClass19c GC;
    public AnonymousClass1IK GD;
    /* renamed from: H */
    public String f3794H;
    public int HB;
    public ArrayList HC;
    private volatile boolean HD;
    /* renamed from: I */
    public float f3795I;
    public boolean IB;
    public AnonymousClass19b IC;
    private final Set ID;
    /* renamed from: J */
    public String f3796J;
    public boolean JB;
    public AnonymousClass2GB JC;
    /* renamed from: K */
    public AnonymousClass0ZS f3797K;
    public boolean KB;
    public List KC;
    /* renamed from: L */
    public AnonymousClass2b9 f3798L;
    public Boolean LB;
    public List LC;
    /* renamed from: M */
    public String f3799M;
    public boolean MB;
    public List MC;
    /* renamed from: N */
    public volatile boolean f3800N;
    public boolean NB;
    public List NC;
    /* renamed from: O */
    public boolean f3801O;
    public boolean OB;
    public String OC;
    /* renamed from: P */
    public BackgroundGradientColors f3802P;
    public boolean PB;
    public long PC;
    /* renamed from: Q */
    public AnonymousClass1Kk f3803Q;
    public boolean QB;
    public AnonymousClass0OE QC;
    /* renamed from: R */
    public BrandedContentTag f3804R;
    public boolean RB;
    public AnonymousClass0OC RC;
    /* renamed from: S */
    public String f3805S;
    public boolean SB;
    public String SC;
    /* renamed from: T */
    public String f3806T;
    public int TB;
    public AnonymousClass19a TC;
    /* renamed from: U */
    public Integer f3807U;
    public String UB;
    public String UC;
    /* renamed from: V */
    public String f3808V;
    public int VB;
    public AnonymousClass0OC VC;
    /* renamed from: W */
    public String f3809W;
    public String WB;
    public List WC;
    /* renamed from: X */
    public List f3810X;
    public int XB;
    public AnonymousClass0OK XC;
    /* renamed from: Y */
    public String f3811Y;
    public long YB;
    public long YC;
    /* renamed from: Z */
    public List f3812Z;
    public double ZB;
    public String ZC;
    /* renamed from: a */
    public boolean f3813a;
    public double aB;
    public int aC;
    /* renamed from: b */
    public long f3814b;
    public volatile boolean bB;
    public AnonymousClass1Km bC;
    /* renamed from: c */
    public int f3815c;
    public int cB;
    public String cC;
    /* renamed from: d */
    public boolean f3816d;
    public volatile boolean dB;
    public Set dC;
    /* renamed from: e */
    public AnonymousClass2E0 f3817e;
    public AnonymousClass0P7 eB;
    public String eC;
    /* renamed from: f */
    public List f3818f;
    public String fB;
    public AnonymousClass2F7 fC;
    /* renamed from: g */
    public String f3819g;
    public AnonymousClass0ON gB;
    public String gC;
    /* renamed from: h */
    public final Set f3820h;
    public boolean hB;
    public int hC;
    /* renamed from: i */
    public boolean f3821i;
    public Boolean iB;
    public volatile AnonymousClass0OC iC;
    /* renamed from: j */
    public AnonymousClass0VZ f3822j;
    public boolean jB;
    public List jC;
    /* renamed from: k */
    public AnonymousClass1E0 f3823k;
    public Boolean kB;
    public long kC;
    /* renamed from: l */
    public List f3824l;
    public long lB;
    public String lC;
    /* renamed from: m */
    public List f3825m;
    public boolean mB;
    public boolean mC;
    /* renamed from: n */
    public String f3826n;
    public Integer nB;
    public boolean nC;
    /* renamed from: o */
    public double f3827o;
    public String oB;
    public int oC;
    /* renamed from: p */
    public double f3828p;
    public int pB;
    public String pC;
    /* renamed from: q */
    public double f3829q;
    public String qB;
    public int qC;
    /* renamed from: r */
    public int f3830r;
    public String rB;
    public String rC;
    /* renamed from: s */
    public Long f3831s;
    public int sB;
    public int sC;
    /* renamed from: t */
    public String f3832t;
    public HashMap tB;
    public int tC;
    /* renamed from: u */
    public boolean f3833u;
    public String uB;
    public int uC;
    /* renamed from: v */
    public ArrayList f3834v;
    public boolean vB;
    public int vC;
    /* renamed from: w */
    public int f3835w;
    public int wB;
    public Venue wC;
    /* renamed from: x */
    public AnonymousClass1Ol f3836x;
    public AnonymousClass0PB xB;
    public AnonymousClass19c xC;
    /* renamed from: y */
    public String f3837y;
    public ArrayList yB;
    public List yC;
    /* renamed from: z */
    public boolean f3838z;
    public boolean zB;
    public int zC;

    public final boolean DY() {
        return false;
    }

    public final boolean bX() {
        return false;
    }

    public final boolean eY() {
        return false;
    }

    public final String zR() {
        return null;
    }

    public AnonymousClass0OA() {
        this.ID = new HashSet();
        this.f3820h = new HashSet();
        this.yB = new ArrayList();
        this.f3834v = new ArrayList();
        this.HC = new ArrayList();
        this.f3804R = null;
        this.BB = new ArrayList();
        this.f3817e = null;
        this.PC = -1;
        this.zC = 100;
        this.f3812Z = new ArrayList();
        this.JB = false;
        this.WC = new CopyOnWriteArrayList();
        this.dC = new HashSet();
        this.f3789C = Collections.emptyList();
        this.f3790D = Collections.emptyList();
        this.TC = new AnonymousClass19a();
        this.f3835w = 0;
        this.QC = new AnonymousClass0OE();
        this.f3814b = -1;
        this.IC = new AnonymousClass19b();
    }

    public AnonymousClass0OA(String str) {
        this.ID = new HashSet();
        this.f3820h = new HashSet();
        this.yB = new ArrayList();
        this.f3834v = new ArrayList();
        this.HC = new ArrayList();
        this.f3804R = null;
        this.BB = new ArrayList();
        this.f3817e = null;
        this.PC = -1;
        this.zC = 100;
        this.f3812Z = new ArrayList();
        this.JB = false;
        this.WC = new CopyOnWriteArrayList();
        this.dC = new HashSet();
        this.f3789C = Collections.emptyList();
        this.f3790D = Collections.emptyList();
        this.TC = new AnonymousClass19a();
        this.f3835w = 0;
        this.QC = new AnonymousClass0OE();
        this.f3814b = -1;
        this.IC = new AnonymousClass19b();
        this.xC = AnonymousClass19c.values()[AnonymousClass19c.values().length - 1];
        this.UB = str;
        this.pC = str;
        AnonymousClass0OC anonymousClass0OC = AnonymousClass0OC.NOT_UPLOADED;
        this.VC = anonymousClass0OC;
        this.iC = anonymousClass0OC;
        this.RC = null;
        this.bB = true;
        this.kC = System.currentTimeMillis();
        AnonymousClass2Ex.B(this);
    }

    /* renamed from: A */
    public final synchronized void m3555A(AnonymousClass0Qe anonymousClass0Qe) {
        this.ID.add(anonymousClass0Qe);
    }

    public final void AA(boolean z) {
        this.NB = z;
        this.VC = z ? AnonymousClass0OC.DRAFT : AnonymousClass0OC.NOT_UPLOADED;
        this.iC = z ? AnonymousClass0OC.DRAFT : AnonymousClass0OC.NOT_UPLOADED;
    }

    /* renamed from: B */
    public static X.AnonymousClass0OA m3547B(X.AnonymousClass0OA r3, java.lang.String r4) {
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
        r2 = new java.io.StringWriter;	 Catch:{ IOException -> 0x0023 }
        r2.<init>();	 Catch:{ IOException -> 0x0023 }
        r0 = X.AnonymousClass0Lm.f3274B;	 Catch:{ IOException -> 0x0023 }
        r1 = r0.createGenerator(r2);	 Catch:{ IOException -> 0x0023 }
        r0 = 1;	 Catch:{ IOException -> 0x0023 }
        X.AnonymousClass19Z.m9676C(r1, r3, r0);	 Catch:{ IOException -> 0x0023 }
        r1.close();	 Catch:{ IOException -> 0x0023 }
        r0 = r2.toString();	 Catch:{ IOException -> 0x0023 }
        r1 = X.AnonymousClass19Z.parseFromJson(r0);	 Catch:{ IOException -> 0x0023 }
        r0 = 0;	 Catch:{ IOException -> 0x0023 }
        r1.pC = r0;	 Catch:{ IOException -> 0x0023 }
        r1.LA(r4);	 Catch:{ IOException -> 0x0023 }
        r1.UB = r4;	 Catch:{ IOException -> 0x0023 }
        return r1;	 Catch:{ IOException -> 0x0023 }
    L_0x0023:
        r1 = new java.lang.IllegalStateException;
        r0 = "Failed to copy pending media";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0OA.B(X.0OA, java.lang.String):X.0OA");
    }

    /* renamed from: B */
    public final synchronized void m3556B(AnonymousClass0OT anonymousClass0OT) {
        this.WC.add(anonymousClass0OT);
    }

    public final void BA(long j) {
        this.FB = j / 1000;
    }

    /* renamed from: C */
    public static AnonymousClass0OA m3548C(String str) {
        AnonymousClass0OA anonymousClass0OA = new AnonymousClass0OA(str);
        anonymousClass0OA.gB = AnonymousClass0ON.PHOTO;
        return anonymousClass0OA;
    }

    /* renamed from: C */
    public final void m3557C(AnonymousClass2F9 anonymousClass2F9) {
        this.dC.add(anonymousClass2F9.toString());
    }

    public final void CA(boolean z) {
        this.HD = z;
        AnonymousClass0OA.m3552G(this);
    }

    public final boolean CY() {
        return this.mB;
    }

    public final boolean Cc() {
        return m3597q();
    }

    /* renamed from: D */
    public static AnonymousClass0OA m3549D(String str) {
        AnonymousClass0OA anonymousClass0OA = new AnonymousClass0OA(str);
        anonymousClass0OA.gB = AnonymousClass0ON.VIDEO;
        return anonymousClass0OA;
    }

    /* renamed from: D */
    public final synchronized List m3558D() {
        return this.f3789C;
    }

    public final void DA(int i, int i2) {
        this.HB = i;
        this.GB = i2;
    }

    /* renamed from: E */
    public static int m3550E(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i2 = 0; i2 < numberOfCameras; i2++) {
            CameraInfo cameraInfo = new CameraInfo();
            Camera.getCameraInfo(i2, cameraInfo);
            int i3 = cameraInfo.facing;
            if ((i >= 4 && i3 == 1) || (i < 4 && i3 == 0)) {
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: E */
    public final synchronized List m3559E() {
        return this.f3790D;
    }

    public final void EA(boolean z) {
        if (this.KB != z) {
            this.KB = z;
            if (!z) {
                for (AnonymousClass2Ew Ui : this.f3820h) {
                    Ui.Ui();
                }
            }
        }
    }

    /* renamed from: F */
    public static String m3551F(AnonymousClass0ON anonymousClass0ON) {
        if (anonymousClass0ON == AnonymousClass0ON.PHOTO) {
            return "photo";
        }
        if (anonymousClass0ON == AnonymousClass0ON.VIDEO) {
            return MediaStreamTrack.VIDEO_TRACK_KIND;
        }
        if (anonymousClass0ON == AnonymousClass0ON.CAROUSEL) {
            return "album";
        }
        if (anonymousClass0ON == AnonymousClass0ON.AUDIO) {
            return MediaStreamTrack.AUDIO_TRACK_KIND;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown MediaType ");
        stringBuilder.append(anonymousClass0ON.toString());
        throw new RuntimeException(stringBuilder.toString());
    }

    /* renamed from: F */
    public final List m3560F() {
        List list = this.f3810X;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return Collections.emptyList();
    }

    public final synchronized void FA(long j) {
        this.YB = j;
    }

    /* renamed from: G */
    public final String m3561G() {
        if (this.f3811Y == null) {
            this.f3811Y = AnonymousClass0NS.m3316B("capture_flow_v2").mo895E();
        }
        return this.f3811Y;
    }

    /* renamed from: G */
    public static synchronized void m3552G(AnonymousClass0OA anonymousClass0OA) {
        synchronized (anonymousClass0OA) {
            for (AnonymousClass0Qe Cv : new ArrayList(anonymousClass0OA.ID)) {
                Cv.Cv(anonymousClass0OA);
            }
        }
    }

    public final synchronized void GA(long j, boolean z) {
        this.lB = j;
        boolean z2 = j > 0 && z;
        this.dB = z2;
        AnonymousClass0OA.m3552G(this);
    }

    /* renamed from: H */
    public final synchronized int m3562H() {
        int i;
        i = 0;
        for (AnonymousClass0OT yW : this.WC) {
            if (yW.yW()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static AnonymousClass0ON m3553H(JsonParser jsonParser) {
        jsonParser = jsonParser.getText();
        if ("photo".equals(jsonParser)) {
            return AnonymousClass0ON.PHOTO;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(jsonParser)) {
            return AnonymousClass0ON.VIDEO;
        }
        if ("album".equals(jsonParser)) {
            return AnonymousClass0ON.CAROUSEL;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(jsonParser)) {
            return AnonymousClass0ON.AUDIO;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown MediaType ");
        stringBuilder.append(jsonParser);
        throw new RuntimeException(stringBuilder.toString());
    }

    public final void HA(AnonymousClass2F8 anonymousClass2F8, double d) {
        double max = Math.max(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, Math.min(d, 1.0d));
        Double.valueOf(max);
        int A = this.IC.m9684A();
        this.IC.m9685B(anonymousClass2F8, max);
        if (this.IC.m9684A() != A) {
            AnonymousClass0OA.m3552G(this);
        }
    }

    public final boolean HV() {
        return this.f3804R != null;
    }

    /* renamed from: I */
    public final Rect m3563I() {
        return new Rect(((Integer) this.f3818f.get(0)).intValue(), ((Integer) this.f3818f.get(1)).intValue(), ((Integer) this.f3818f.get(2)).intValue(), ((Integer) this.f3818f.get(3)).intValue());
    }

    /* renamed from: I */
    private String m3554I() {
        AnonymousClass0P7 anonymousClass0P7 = this.eB;
        if (anonymousClass0P7 == null) {
            return "NULL_MEDIA";
        }
        String str;
        AnonymousClass0Ci MA = anonymousClass0P7.MA();
        if (MA == null) {
            str = "NULL_USER";
        } else {
            str = MA.getId();
        }
        return str;
    }

    public final void IA(String str) {
        long j;
        this.OC = str;
        if (str == null) {
            j = 0;
        } else {
            j = AnonymousClass1Ag.m9744H(str);
        }
        this.PC = j;
    }

    public final boolean IV() {
        for (AnonymousClass0OA s : m3558D()) {
            if (s.m3599s()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final synchronized AnonymousClass0OT m3564J(Class cls) {
        for (AnonymousClass0OT anonymousClass0OT : this.WC) {
            if (!anonymousClass0OT.yW() && cls.isAssignableFrom(anonymousClass0OT.getClass())) {
                return (AnonymousClass0OT) cls.cast(anonymousClass0OT);
            }
        }
        return null;
    }

    public final void JA(AnonymousClass0OC anonymousClass0OC) {
        this.VC = anonymousClass0OC;
        if (anonymousClass0OC == AnonymousClass0OC.CONFIGURED) {
            this.f3814b = AnonymousClass0Gd.m1838C();
        }
        AnonymousClass0OA.m3552G(this);
    }

    /* renamed from: K */
    public final boolean m3565K() {
        if (!this.HD) {
            if (!this.QB) {
                return false;
            }
        }
        return true;
    }

    public final void KA(AnonymousClass0OK anonymousClass0OK) {
        AnonymousClass0OK anonymousClass0OK2 = this.XC;
        if (!(anonymousClass0OK2 == null || anonymousClass0OK2 == AnonymousClass0OK.UNKNOWN || this.XC == anonymousClass0OK || this.f3791E)) {
            String str = "sharetype_changed";
            AnonymousClass0Gn.m1877D(str, AnonymousClass0IE.m2137E("userid:%s,uploadid:%s,old mShareType:%s,new mShareType:%s,waterfall:%s", m3554I(), this.pC, this.XC, anonymousClass0OK, m3561G()), 20);
        }
        this.XC = anonymousClass0OK;
    }

    /* renamed from: L */
    public final AnonymousClass0ON m3566L() {
        if (m3598r()) {
            return AnonymousClass0ON.VIDEO;
        }
        return this.gB;
    }

    public final void LA(String str) {
        if (this.pC != null) {
            AnonymousClass0Gn.m1877D("change_uploadid", AnonymousClass0IE.m2137E("sharetype:%s, old:%s, new:%s", this.XC, this.pC, str), 10);
        }
        this.pC = str;
        this.TC.f15159D = str;
    }

    /* renamed from: M */
    public final int m3567M() {
        if (this.GC == null) {
            return 0;
        }
        return this.xC.ordinal() - this.GC.ordinal();
    }

    public final void MA(int i, int i2) {
        this.vC = i;
        this.uC = i2;
    }

    /* renamed from: N */
    public final float m3568N() {
        return ((float) m3554I().width()) / ((float) m3554I().height());
    }

    public final synchronized void NA(List list) {
        this.DD = list;
    }

    /* renamed from: O */
    public final int m3569O() {
        if (m3591k()) {
            int i = 0;
            List<AnonymousClass0OA> D = m3558D();
            for (AnonymousClass0OA O : D) {
                i += O.m3569O();
            }
            return Math.round((float) (i / D.size()));
        }
        int A = this.IC.m9684A();
        Integer.valueOf(A);
        return A;
    }

    public final boolean OA(Set set) {
        if (this.f3791E) {
            return m3576V(AnonymousClass0OT.class, new AnonymousClass2Ev(this, set)).isEmpty() ^ 1;
        }
        return set.contains(m3577W());
    }

    /* renamed from: P */
    public final Map m3570P() {
        if (this.NC == null) {
            return null;
        }
        Map hashMap = new HashMap();
        for (Object put : AnonymousClass15c.values()) {
            hashMap.put(put, new ArrayList());
        }
        for (AnonymousClass0ZF anonymousClass0ZF : this.NC) {
            ((List) hashMap.get(anonymousClass0ZF.f6315W)).add(anonymousClass0ZF);
        }
        return hashMap;
    }

    /* renamed from: Q */
    public final List m3571Q(AnonymousClass15c anonymousClass15c) {
        List list = this.NC;
        if (list == null) {
            return null;
        }
        return AnonymousClass1dZ.m12220C(list, new AnonymousClass2Et(this, anonymousClass15c));
    }

    /* renamed from: R */
    public final List m3572R() {
        if (AnonymousClass26g.B(this.LC)) {
            return null;
        }
        return ((AnonymousClass1D1) this.LC.get(0)).f15619D;
    }

    /* renamed from: S */
    public final String m3573S() {
        AnonymousClass0OE anonymousClass0OE = this.QC;
        AnonymousClass0OF B = AnonymousClass0OE.m3613B(this.VC, m3599s());
        Map hashMap = new HashMap();
        hashMap.put("num_reupload", Integer.valueOf(anonymousClass0OE.f3852B));
        hashMap.put("num_step_manual_retry", anonymousClass0OE.f3854D.get(B.ordinal()));
        hashMap.put("num_step_auto_retry", anonymousClass0OE.f3853C.get(B.ordinal()));
        return new JSONObject(hashMap).toString();
    }

    /* renamed from: T */
    public final synchronized List m3574T(Predicate predicate) {
        return m3576V(AnonymousClass0OT.class, predicate);
    }

    public final boolean TX() {
        return this.f3833u;
    }

    /* renamed from: U */
    public final synchronized List m3575U(Class cls) {
        return m3576V(cls, null);
    }

    /* renamed from: V */
    public final synchronized List m3576V(Class cls, Predicate predicate) {
        List arrayList;
        arrayList = new ArrayList();
        for (AnonymousClass0OT anonymousClass0OT : this.WC) {
            AnonymousClass0OT anonymousClass0OT2;
            if (cls.isAssignableFrom(anonymousClass0OT2.getClass())) {
                anonymousClass0OT2 = (AnonymousClass0OT) cls.cast(anonymousClass0OT2);
                if (predicate == null || predicate.apply(anonymousClass0OT2)) {
                    arrayList.add(anonymousClass0OT2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: W */
    public final AnonymousClass0OK m3577W() {
        if (this.XC == null) {
            Boolean bool = this.LB;
            AnonymousClass0OK anonymousClass0OK = (bool == null || !bool.booleanValue()) ? AnonymousClass0OK.FOLLOWERS_SHARE : AnonymousClass0OK.DIRECT_SHARE;
            this.XC = anonymousClass0OK;
            AnonymousClass0Gn.m1877D("sharetype_null", AnonymousClass0IE.m2137E("uerid:%s,uploadid:%s,new mShareType:%s,waterfall:%s", m3554I(), this.pC, this.XC, m3561G()), 20);
        }
        return this.XC;
    }

    /* renamed from: X */
    public final Set m3578X() {
        Set hashSet = new HashSet();
        for (String B : this.dC) {
            AnonymousClass2F9 B2 = AnonymousClass2F9.B(B);
            if (B2 != null) {
                hashSet.add(B2);
            }
        }
        return hashSet;
    }

    /* renamed from: Y */
    public final String m3579Y() {
        return !AnonymousClass26g.B(this.LC) ? ((AnonymousClass1D1) this.LC.get(0)).m9963A() : null;
    }

    /* renamed from: Z */
    public final Matrix4 m3580Z() {
        if (this.yC == null) {
            return null;
        }
        Matrix4 matrix4 = new Matrix4();
        for (AnonymousClass1Oi anonymousClass1Oi : this.yC) {
            matrix4.m11183A(anonymousClass1Oi.f18003J);
        }
        return matrix4;
    }

    /* renamed from: a */
    public final synchronized List m3581a() {
        List arrayList;
        if (this.DD != null) {
            arrayList = new ArrayList(this.DD);
        } else {
            arrayList = new ArrayList();
        }
        return arrayList;
    }

    /* renamed from: b */
    public final AnonymousClass1IK m3582b() {
        if (this.GD == null) {
            this.GD = new AnonymousClass1IK();
        }
        return this.GD;
    }

    /* renamed from: c */
    public final boolean m3583c() {
        String str = this.f3819g;
        return str != null && new File(str).exists();
    }

    /* renamed from: d */
    public final boolean m3584d() {
        List list = this.f3824l;
        return (list == null || list.isEmpty()) ? false : true;
    }

    /* renamed from: e */
    public final boolean m3585e() {
        if (m3598r() || this.DB == null) {
            return false;
        }
        return true;
    }

    public final AnonymousClass0ZS eI() {
        List<AnonymousClass0ZF> list = this.NC;
        if (list != null) {
            for (AnonymousClass0ZF anonymousClass0ZF : list) {
                if (anonymousClass0ZF.f6315W == AnonymousClass15c.FRIEND_LIST) {
                    return AnonymousClass0ZS.FRIEND_LIST;
                }
            }
        }
        AnonymousClass0ZS anonymousClass0ZS = this.f3797K;
        if (anonymousClass0ZS != null) {
            return anonymousClass0ZS;
        }
        return AnonymousClass0ZS.DEFAULT;
    }

    /* renamed from: f */
    public final boolean m3586f() {
        if ((this.f3809W == null || this.f3809W.isEmpty()) && m3560F().isEmpty() && !m3596p()) {
            if ((this.wC != null ? 1 : null) == null && (this.yB.isEmpty() ^ 1) == 0 && !m3588h()) {
                if (!HV()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: g */
    public final synchronized boolean m3587g() {
        return m3564J(AnonymousClass0OT.class) != null;
    }

    public final boolean gW() {
        return this.f3792F;
    }

    public final String getId() {
        return this.pC;
    }

    /* renamed from: h */
    public final boolean m3588h() {
        if (!m3591k()) {
            return this.HC.isEmpty() ^ true;
        }
        for (AnonymousClass0OA h : m3558D()) {
            if (h.m3588h()) {
                return true;
            }
        }
        return false;
    }

    public final void hOA(boolean z) {
        this.f3792F = z;
    }

    /* renamed from: i */
    public final boolean m3589i() {
        List list = this.MC;
        return (list == null || list.isEmpty()) ? false : true;
    }

    /* renamed from: j */
    public final boolean m3590j() {
        return (this.dC.isEmpty() || m3578X().isEmpty()) ? false : true;
    }

    /* renamed from: k */
    public final boolean m3591k() {
        return this.gB == AnonymousClass0ON.CAROUSEL;
    }

    /* renamed from: l */
    public final boolean m3592l() {
        return this.uB != null;
    }

    public final void lOA(boolean z) {
        this.f3833u = z;
    }

    /* renamed from: m */
    public final boolean m3593m() {
        boolean z = true;
        if (this.VC == AnonymousClass0OC.CONFIGURED) {
            long j = -1;
            Object obj;
            if (this.gB == AnonymousClass0ON.PHOTO) {
                if (((Boolean) AnonymousClass0CC.BH.m845G()).booleanValue() && m3577W() == AnonymousClass0OK.DIRECT_SHARE && ((Boolean) AnonymousClass0CC.AH.m845G()).booleanValue()) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    j = (long) ((Integer) AnonymousClass0CC.CH.m845G()).intValue();
                }
            } else if (this.gB == AnonymousClass0ON.VIDEO) {
                if (((Boolean) AnonymousClass0CC.HH.m845G()).booleanValue() && m3577W() == AnonymousClass0OK.DIRECT_SHARE && ((Boolean) AnonymousClass0CC.GH.m845G()).booleanValue()) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    j = (long) ((Integer) AnonymousClass0CC.IH.m845G()).intValue();
                }
            }
            if (j >= 0) {
                if (this.f3814b >= 0) {
                    if (AnonymousClass0Gd.m1838C() >= this.f3814b + TimeUnit.SECONDS.toMillis(j)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    /* renamed from: n */
    public final synchronized boolean m3594n() {
        return this.lB > 0;
    }

    /* renamed from: o */
    public final boolean m3595o() {
        Object obj;
        List list;
        Object obj2;
        if (m3577W() != AnonymousClass0OK.REEL_SHARE) {
            if (m3577W() != AnonymousClass0OK.REEL_SHARE_AND_DIRECT_STORY_SHARE) {
                obj = null;
                list = this.MC;
                if (list != null) {
                    if (list.isEmpty()) {
                        obj2 = null;
                        if (obj == null && r0 != null) {
                            return true;
                        }
                    }
                }
                obj2 = 1;
                return obj == null ? false : false;
            }
        }
        obj = 1;
        list = this.MC;
        if (list != null) {
            if (list.isEmpty()) {
                obj2 = null;
                if (obj == null) {
                }
            }
        }
        obj2 = 1;
        if (obj == null) {
        }
    }

    /* renamed from: p */
    public final boolean m3596p() {
        return (this.ZB == StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED || this.aB == StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) ? false : true;
    }

    /* renamed from: q */
    public final boolean m3597q() {
        return AnonymousClass0OK.FELIX.equals(this.XC);
    }

    /* renamed from: r */
    public final boolean m3598r() {
        return this.gB == AnonymousClass0ON.PHOTO && this.f3838z;
    }

    public final boolean rY() {
        return this.mC;
    }

    /* renamed from: s */
    public final boolean m3599s() {
        return this.gB == AnonymousClass0ON.VIDEO;
    }

    public final boolean sY() {
        return this.nC;
    }

    /* renamed from: t */
    public final void m3600t(long j) {
        this.YC = j / 1000;
    }

    public final void tOA(boolean z) {
        this.mB = z;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Media type:");
        stringBuilder.append(this.gB);
        stringBuilder.append("\tkey: ");
        stringBuilder.append(this.UB);
        stringBuilder.append("\nServer Status: ");
        stringBuilder.append(this.VC);
        stringBuilder.append("\nTarget Status: ");
        stringBuilder.append(this.iC);
        if (this.gB == AnonymousClass0ON.VIDEO) {
            stringBuilder.append("\nSession name: ");
            stringBuilder.append(this.CD);
            stringBuilder.append("\nRendered Video Path: ");
            stringBuilder.append(this.OC);
        }
        if (this.WB != null) {
            stringBuilder.append("\nLast uploaded error: ");
            stringBuilder.append(this.WB);
            stringBuilder.append("\nLast uploaded error code: ");
            stringBuilder.append(this.XB);
        }
        if ((this.TC.f15160E.isEmpty() ^ 1) != 0) {
            stringBuilder.append("\nseg children media: ");
            stringBuilder.append(this.TC.m9678B());
        }
        stringBuilder.append("\nUploadJobData: ");
        stringBuilder.append(this.rC);
        return stringBuilder.toString();
    }

    /* renamed from: u */
    public final synchronized boolean m3601u() {
        boolean z;
        z = true;
        if (m3591k() && m3558D() != null) {
            for (AnonymousClass0OA u : m3558D()) {
                if (u.m3601u()) {
                    break;
                }
            }
        }
        if (!(this.VC == this.iC && this.RC == null)) {
            if (this.f3791E && !m3587g()) {
                if (this.MB) {
                }
            }
        }
        z = false;
        return z;
    }

    /* renamed from: v */
    public final synchronized void m3602v(AnonymousClass0Qe anonymousClass0Qe) {
        this.ID.remove(anonymousClass0Qe);
    }

    /* renamed from: w */
    public final synchronized void m3603w(Predicate predicate) {
        this.WC.removeAll(m3576V(AnonymousClass0OT.class, predicate));
    }

    /* renamed from: x */
    public final synchronized void m3604x(VideoUploadUrl videoUploadUrl) {
        if (!(this.DD == null || this.DD.isEmpty())) {
            this.DD.remove(videoUploadUrl);
        }
    }

    public final void xOA(boolean z) {
        this.mC = z;
    }

    /* renamed from: y */
    public final synchronized void m3605y(AnonymousClass0OC anonymousClass0OC) {
        if (this.RC == null || anonymousClass0OC.m3608B(this.RC)) {
            this.RC = anonymousClass0OC;
        }
    }

    public final void yOA(boolean z) {
        this.nC = z;
    }

    /* renamed from: z */
    public final void m3606z(List list) {
        List arrayList = new ArrayList(list);
        List arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass0OA anonymousClass0OA = (AnonymousClass0OA) arrayList.get(i);
            arrayList2.add(anonymousClass0OA.UB);
            anonymousClass0OA.m3555A(new AnonymousClass2Eu(this));
        }
        synchronized (this) {
            this.f3789C = Collections.unmodifiableList(arrayList);
            this.f3790D = Collections.unmodifiableList(arrayList2);
        }
    }
}
