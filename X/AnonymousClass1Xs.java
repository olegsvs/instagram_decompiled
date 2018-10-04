package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.hashtag.Hashtag;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.1Xs */
public final class AnonymousClass1Xs implements AnonymousClass0jx {
    /* renamed from: B */
    public final AnonymousClass0iD f19877B;
    /* renamed from: C */
    public final AnonymousClass0kW f19878C;
    /* renamed from: D */
    public final AnonymousClass1MZ f19879D;
    /* renamed from: E */
    public final AnonymousClass0Ie f19880E;
    /* renamed from: F */
    public final AnonymousClass0IU f19881F;
    /* renamed from: G */
    public final AnonymousClass0PZ f19882G;
    /* renamed from: H */
    public final AnonymousClass0jM f19883H;
    /* renamed from: I */
    public final AnonymousClass0hq f19884I;
    /* renamed from: J */
    public final AnonymousClass0Cm f19885J;
    /* renamed from: K */
    private final AnonymousClass0ws f19886K;
    /* renamed from: L */
    private final String f19887L = UUID.randomUUID().toString();
    /* renamed from: M */
    private final AnonymousClass3bR f19888M;

    public final void Mg(AnonymousClass0P7 anonymousClass0P7) {
    }

    public AnonymousClass1Xs(AnonymousClass0Ie anonymousClass0Ie, AnonymousClass0IU anonymousClass0IU, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0iD anonymousClass0iD, AnonymousClass0jZ anonymousClass0jZ, AnonymousClass0jf anonymousClass0jf, AnonymousClass0jg anonymousClass0jg, AnonymousClass0jr anonymousClass0jr, AnonymousClass1MZ anonymousClass1MZ, AnonymousClass0jS anonymousClass0jS, AnonymousClass3kj anonymousClass3kj, AnonymousClass0is anonymousClass0is, AnonymousClass0jj anonymousClass0jj, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0hq anonymousClass0hq, AnonymousClass0jC anonymousClass0jC, AnonymousClass0jU anonymousClass0jU, AnonymousClass0jM anonymousClass0jM, AnonymousClass0kW anonymousClass0kW) {
        this.f19877B = anonymousClass0iD;
        AnonymousClass0IL anonymousClass0IL = anonymousClass0Ie;
        this.f19880E = anonymousClass0IL;
        AnonymousClass0IU anonymousClass0IU2 = anonymousClass0IU;
        this.f19881F = anonymousClass0IU2;
        AnonymousClass0PZ anonymousClass0PZ2 = anonymousClass0PZ;
        this.f19882G = anonymousClass0PZ2;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        this.f19885J = anonymousClass0Cm2;
        this.f19884I = anonymousClass0hq;
        AnonymousClass0jM anonymousClass0jM2 = anonymousClass0jM;
        this.f19883H = anonymousClass0jM2;
        this.f19878C = anonymousClass0kW;
        AnonymousClass41e anonymousClass41e = new AnonymousClass41e(anonymousClass0IL.getActivity(), this.f19884I, anonymousClass0PZ2, anonymousClass0Cm2, anonymousClass0jj);
        AnonymousClass0iD anonymousClass0iD2 = this.f19877B;
        AnonymousClass0jf anonymousClass0jf2 = anonymousClass0jf;
        AnonymousClass0jZ anonymousClass0jZ2 = anonymousClass0jZ;
        AnonymousClass3kj anonymousClass3kj2 = anonymousClass3kj;
        AnonymousClass0jS anonymousClass0jS2 = anonymousClass0jS;
        AnonymousClass0PZ anonymousClass0PZ3 = anonymousClass0PZ2;
        AnonymousClass0Cm anonymousClass0Cm3 = anonymousClass0Cm2;
        AnonymousClass0hq anonymousClass0hq2 = this.f19884I;
        this.f19886K = new AnonymousClass0ws(anonymousClass0IL, anonymousClass0IU2, anonymousClass0PZ3, anonymousClass0iD2, anonymousClass0jZ2, anonymousClass0jf2, anonymousClass0jg, anonymousClass0jr, anonymousClass0jS2, anonymousClass3kj2, anonymousClass0Cm3, anonymousClass0hq2, anonymousClass0jC, anonymousClass0is, anonymousClass0jU, anonymousClass41e, null, anonymousClass0jM2, this.f19878C, null, null);
        this.f19879D = anonymousClass1MZ;
        AnonymousClass0Cm anonymousClass0Cm4 = this.f19885J;
        Object obj = this.f19880E;
        this.f19888M = new AnonymousClass3bR(anonymousClass0Cm4, obj, obj);
    }

    public final void Ad(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, View view) {
        this.f19886K.Ad(anonymousClass0P7, anonymousClass0m3, view);
    }

    public final void Ag(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3) {
        AnonymousClass0Ci MA = anonymousClass0P7.MA();
        if (MA.eB == AnonymousClass0Lq.FollowStatusNotFollowing && ((Boolean) AnonymousClass0CC.f1450M.m846H(this.f19885J)).booleanValue()) {
            AnonymousClass0Ie anonymousClass0Ie = this.f19880E;
            AnonymousClass0Cn anonymousClass0Cn = this.f19885J;
            String id = MA.getId();
            AnonymousClass3KP anonymousClass3KP = AnonymousClass3KP.f40178D;
            String str = anonymousClass3KP == anonymousClass3KP ? "target_user_id" : "target_tag";
            String str2 = anonymousClass3KP == anonymousClass3KP ? "discover_page" : "tag_page";
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
            anonymousClass0Pt.f4229M = "fbsearch/accounts_recs/";
            AnonymousClass0GA H = anonymousClass0Pt.m3935D(str, id).m3935D("surface", str2).m3944M(AnonymousClass3nX.class).m3939H();
            H.f2849B = new AnonymousClass4oW(this, MA, anonymousClass0m3);
            anonymousClass0Ie.schedule(H);
        }
    }

    public final void Ar(AnonymousClass0P7 anonymousClass0P7, IgProgressImageView igProgressImageView) {
        this.f19886K.Ar(anonymousClass0P7, igProgressImageView);
    }

    public final void Bd(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, View view) {
        this.f19886K.Bd(anonymousClass0P7, anonymousClass0m3, view);
    }

    public final void Bj(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0wv anonymousClass0wv) {
        this.f19886K.Bj(anonymousClass0P7, anonymousClass0m3, i, anonymousClass0wv);
    }

    public final void Cj(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0ww anonymousClass0ww) {
        this.f19886K.Cj(anonymousClass0P7, anonymousClass0m3, i, anonymousClass0ww);
    }

    public final void DGA() {
        this.f19886K.DGA();
    }

    public final void Dg(AnonymousClass0P7 anonymousClass0P7, Hashtag hashtag, AnonymousClass0m3 anonymousClass0m3, int i) {
        this.f19886K.Dg(anonymousClass0P7, hashtag, anonymousClass0m3, i);
    }

    public final void Dj(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0wx anonymousClass0wx) {
        this.f19886K.Dj(anonymousClass0P7, anonymousClass0m3, i, anonymousClass0wx);
    }

    public final void Do(Bitmap bitmap, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, AnonymousClass0wv anonymousClass0wv) {
        this.f19886K.Do(bitmap, anonymousClass0P7, anonymousClass0m3, anonymousClass0wv);
    }

    public final void EAA(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3) {
        AnonymousClass0Cm anonymousClass0Cm = this.f19885J;
        AnonymousClass0EE anonymousClass0EE = this.f19882G;
        String str = AnonymousClass3KW.f40184C;
        String str2 = AnonymousClass3KX.f40185B;
        String kR = this.f19884I.kR();
        AnonymousClass0PZ anonymousClass0PZ = this.f19882G;
        AnonymousClass1Pl.m11294C(anonymousClass0Cm, anonymousClass0EE, str, anonymousClass0P7, str2, kR, anonymousClass0PZ instanceof AnonymousClass0uD ? ((AnonymousClass0uD) anonymousClass0PZ).CIA(anonymousClass0P7) : null, anonymousClass0m3.f9717z);
        this.f19886K.EAA(anonymousClass0P7, anonymousClass0m3);
    }

    public final void Ej(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0q0 anonymousClass0q0) {
        this.f19886K.Ej(anonymousClass0P7, anonymousClass0m3, i, anonymousClass0q0);
    }

    public final void Eo(Bitmap bitmap, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, AnonymousClass0wx anonymousClass0wx) {
        this.f19886K.Eo(bitmap, anonymousClass0P7, anonymousClass0m3, anonymousClass0wx);
    }

    public final void Fn(AnonymousClass0P7 anonymousClass0P7) {
        this.f19886K.Fn(anonymousClass0P7);
    }

    public final void Fo(Bitmap bitmap, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, AnonymousClass0ph anonymousClass0ph) {
        this.f19886K.Fo(bitmap, anonymousClass0P7, anonymousClass0m3, anonymousClass0ph);
    }

    public final void GUA(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, View view, AnonymousClass0wy anonymousClass0wy) {
        this.f19886K.GUA(anonymousClass0P7, anonymousClass0m3, view, anonymousClass0wy);
    }

    public final void Gg(AnonymousClass0P7 anonymousClass0P7) {
        this.f19886K.Gg(anonymousClass0P7);
    }

    public final void Go(Bitmap bitmap, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, AnonymousClass0q0 anonymousClass0q0) {
        this.f19886K.Go(bitmap, anonymousClass0P7, anonymousClass0m3, anonymousClass0q0);
    }

    public final void Ig(AnonymousClass0P7 anonymousClass0P7) {
        this.f19886K.Ig(anonymousClass0P7);
    }

    public final void JAA(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3) {
        this.f19877B.notifyDataSetChanged();
    }

    public final void Jg(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i) {
        AnonymousClass0P7 anonymousClass0P72 = anonymousClass0P7;
        AnonymousClass0m3 anonymousClass0m32 = anonymousClass0m3;
        AnonymousClass0ms anonymousClass0ms = new AnonymousClass0ms(anonymousClass0P72, anonymousClass0m32);
        AnonymousClass0IL anonymousClass0IL = this.f19880E;
        Activity activity = anonymousClass0IL.getActivity();
        AnonymousClass0IU anonymousClass0IU = this.f19881F;
        AnonymousClass0Fz loaderManager = this.f19880E.getLoaderManager();
        AnonymousClass0PZ anonymousClass0PZ = this.f19882G;
        AnonymousClass0Cm anonymousClass0Cm = this.f19885J;
        AnonymousClass0a4 anonymousClass0a4 = anonymousClass0m32.f9715x;
        int i2 = anonymousClass0m32.f9673H;
        AnonymousClass0hq anonymousClass0hq = this.f19884I;
        AnonymousClass0hq anonymousClass0hq2 = anonymousClass0hq;
        int i3 = i2;
        AnonymousClass0xX anonymousClass0xX = new AnonymousClass0xX(anonymousClass0IL, activity, anonymousClass0IU, loaderManager, anonymousClass0PZ, anonymousClass0P72, anonymousClass0m32, anonymousClass0Cm, anonymousClass0a4, i, i3, anonymousClass0hq2, this.f19883H, this.f19878C);
        anonymousClass0xX.f12609O = new AnonymousClass4oU(this, anonymousClass0P72, anonymousClass0m32, anonymousClass0ms);
        anonymousClass0xX.m8572A();
    }

    public final void KAA(String str) {
        this.f19886K.KAA(str);
    }

    public final void LAA(AnonymousClass0Ci anonymousClass0Ci) {
        this.f19886K.LAA(anonymousClass0Ci);
    }

    public final void Md(AnonymousClass0P7 anonymousClass0P7) {
        this.f19886K.Md(anonymousClass0P7);
    }

    public final void Nd(AnonymousClass0P7 anonymousClass0P7) {
        this.f19886K.Nd(anonymousClass0P7);
    }

    public final void Of(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0P7 anonymousClass0P72, AnonymousClass0P7 anonymousClass0P73, int i, int i2, int i3) {
        this.f19886K.Of(anonymousClass0P7, anonymousClass0P72, anonymousClass0P73, i, i2, i3);
    }

    public final void Og(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3) {
        this.f19886K.Og(anonymousClass0P7, anonymousClass0m3);
    }

    public final void Ov(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, View view, String str, String str2, String str3) {
        this.f19886K.Ov(anonymousClass0P7, anonymousClass0m3, view, str, str2, str3);
    }

    public final void Oy(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0kC anonymousClass0kC) {
        this.f19886K.Oy(anonymousClass0P7, anonymousClass0m3, i, anonymousClass0kC);
    }

    public final void Pg(AnonymousClass0P7 anonymousClass0P7) {
        this.f19886K.Pg(anonymousClass0P7);
    }

    public final void Po(AnonymousClass0P7 anonymousClass0P7) {
        this.f19886K.Po(anonymousClass0P7);
    }

    public final void Py(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i) {
        this.f19886K.Py(anonymousClass0P7, anonymousClass0m3, i);
    }

    public final void Qg(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i) {
        this.f19886K.Qg(anonymousClass0P7, anonymousClass0m3, i);
    }

    public final void RAA(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0ph anonymousClass0ph) {
        this.f19886K.RAA(anonymousClass0P7, anonymousClass0m3, i, anonymousClass0ph);
    }

    public final void Rg(AnonymousClass0MI anonymousClass0MI, AnonymousClass0a4 anonymousClass0a4, AnonymousClass10I anonymousClass10I) {
        AnonymousClass0MI anonymousClass0MI2 = anonymousClass0MI;
        List singletonList = Collections.singletonList(anonymousClass0MI);
        AnonymousClass3bR anonymousClass3bR = this.f19888M;
        anonymousClass3bR.f42625M = this.f19887L;
        AnonymousClass10I anonymousClass10I2 = anonymousClass10I;
        anonymousClass3bR.f42622J = new AnonymousClass41T(anonymousClass10I.kI(), new AnonymousClass4oV(this));
        anonymousClass3bR.B(anonymousClass10I2, anonymousClass0MI2, singletonList, singletonList, singletonList, AnonymousClass0Qf.EXPLORE_FEED_ITEM_HEADER, null, null);
    }

    public final void SAA(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0ph anonymousClass0ph) {
        this.f19886K.SAA(anonymousClass0P7, anonymousClass0m3, i, anonymousClass0ph);
    }

    public final void TAA(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0ph anonymousClass0ph) {
        this.f19886K.TAA(anonymousClass0P7, anonymousClass0m3, i, anonymousClass0ph);
    }

    public final void Vu() {
        this.f19886K.Vu();
    }

    public final void Wy(AnonymousClass0vl anonymousClass0vl, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0wv anonymousClass0wv) {
        this.f19886K.Wy(anonymousClass0vl, anonymousClass0P7, anonymousClass0m3, i, anonymousClass0wv);
    }

    public final void XAA(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0wv anonymousClass0wv, MotionEvent motionEvent) {
        this.f19886K.XAA(anonymousClass0P7, anonymousClass0m3, i, anonymousClass0wv, motionEvent);
    }

    public final void Xg(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i) {
        this.f19886K.Xg(anonymousClass0P7, anonymousClass0m3, i);
    }

    public final void Xp(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i) {
        this.f19886K.Xp(anonymousClass0P7, anonymousClass0m3, i);
    }

    public final void Xy(AnonymousClass0vl anonymousClass0vl, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0ww anonymousClass0ww) {
        this.f19886K.Xy(anonymousClass0vl, anonymousClass0P7, anonymousClass0m3, i, anonymousClass0ww);
    }

    public final void YAA(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0ww anonymousClass0ww, MotionEvent motionEvent) {
        this.f19886K.YAA(anonymousClass0P7, anonymousClass0m3, i, anonymousClass0ww, motionEvent);
    }

    public final void Yg(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3) {
        this.f19886K.Yg(anonymousClass0P7, anonymousClass0m3);
    }

    public final void Yq() {
        this.f19886K.Yq();
    }

    public final void Yw(AnonymousClass0P7 anonymousClass0P7) {
        this.f19886K.Yw(anonymousClass0P7);
    }

    public final void Yy(AnonymousClass0vl anonymousClass0vl, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0wx anonymousClass0wx) {
        this.f19886K.Yy(anonymousClass0vl, anonymousClass0P7, anonymousClass0m3, i, anonymousClass0wx);
    }

    public final void ZAA(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0wx anonymousClass0wx) {
        this.f19886K.ZAA(anonymousClass0P7, anonymousClass0m3, i, anonymousClass0wx);
    }

    public final void Zg(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3) {
        this.f19886K.Zg(anonymousClass0P7, anonymousClass0m3);
    }

    public final void Zq(float f) {
        this.f19886K.Zq(f);
    }

    public final void Zy(AnonymousClass0vl anonymousClass0vl, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0q0 anonymousClass0q0) {
        this.f19886K.Zy(anonymousClass0vl, anonymousClass0P7, anonymousClass0m3, i, anonymousClass0q0);
    }

    public final void aAA(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0q0 anonymousClass0q0, MotionEvent motionEvent) {
        this.f19886K.aAA(anonymousClass0P7, anonymousClass0m3, i, anonymousClass0q0, motionEvent);
    }

    public final void aq(float f) {
        this.f19886K.aq(f);
    }

    public final void bq(float f) {
        this.f19886K.bq(f);
    }

    public final void ce() {
        this.f19886K.ce();
    }

    public final void cg(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i) {
        this.f19886K.cg(anonymousClass0P7, anonymousClass0m3, i);
    }

    public final void cq(String str) {
        this.f19886K.cq(str);
    }

    public final void dJA() {
        this.f19886K.dJA();
    }

    public final void eg(AnonymousClass0P7 anonymousClass0P7) {
        this.f19886K.eg(anonymousClass0P7);
    }

    public final void fg(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, View view) {
        this.f19886K.fg(anonymousClass0P7, anonymousClass0m3, view);
    }

    public final void iDA() {
        this.f19886K.iDA();
    }

    public final void li(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i) {
        this.f19886K.li(anonymousClass0P7, anonymousClass0m3, i);
    }

    public final void ll(Bitmap bitmap, AnonymousClass0P7 anonymousClass0P7) {
        this.f19886K.ll(bitmap, anonymousClass0P7);
    }

    public final boolean mV() {
        return this.f19886K.mV();
    }

    public final void nx(AnonymousClass0P7 anonymousClass0P7) {
        this.f19886K.nx(anonymousClass0P7);
    }

    public final void pl(Object obj) {
        this.f19886K.pl(obj);
    }

    public final void rVA() {
        this.f19886K.rVA();
    }

    public final void sg(AnonymousClass0vl anonymousClass0vl, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0ph anonymousClass0ph) {
        this.f19886K.sg(anonymousClass0vl, anonymousClass0P7, anonymousClass0m3, i, anonymousClass0ph);
    }

    public final void tf(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i) {
        this.f19886K.tf(anonymousClass0P7, anonymousClass0m3, i);
    }

    public final void tg(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3) {
        this.f19886K.tg(anonymousClass0P7, anonymousClass0m3);
    }

    public final void uf(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i) {
        this.f19886K.uf(anonymousClass0P7, anonymousClass0m3, i);
    }

    public final void ug() {
        this.f19886K.ug();
    }

    public final void vz(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i) {
        this.f19886K.vz(anonymousClass0P7, anonymousClass0m3, i);
    }

    public final void wf(AnonymousClass0P7 anonymousClass0P7) {
        this.f19886K.wf(anonymousClass0P7);
    }

    public final void wg(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0px anonymousClass0px) {
        this.f19886K.wg(anonymousClass0P7, anonymousClass0m3, i, anonymousClass0px);
    }

    public final void yi(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0ph anonymousClass0ph) {
        this.f19886K.yi(anonymousClass0P7, anonymousClass0m3, i, anonymousClass0ph);
    }

    public final void yt(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3) {
        this.f19886K.yt(anonymousClass0P7, anonymousClass0m3);
    }

    public final void zAA(String str, String str2, int i, String str3, AnonymousClass0mZ anonymousClass0mZ, String str4) {
        this.f19886K.zAA(str, str2, i, str3, anonymousClass0mZ, str4);
    }

    public final void zg(AnonymousClass0SK anonymousClass0SK) {
        this.f19886K.zg(anonymousClass0SK);
    }

    public final void zi(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i) {
        this.f19886K.zi(anonymousClass0P7, anonymousClass0m3, i);
    }
}
