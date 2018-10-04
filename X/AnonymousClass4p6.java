package X;

/* renamed from: X.4p6 */
public final class AnonymousClass4p6 extends AnonymousClass0wR {
    /* renamed from: B */
    public final AnonymousClass5XJ f57645B;
    /* renamed from: C */
    private final AnonymousClass4p5 f57646C;

    public AnonymousClass4p6(AnonymousClass4p5 anonymousClass4p5, AnonymousClass5XJ anonymousClass5XJ) {
        this.f57646C = anonymousClass4p5;
        this.f57645B = anonymousClass5XJ;
    }

    public final Class WT() {
        return String.class;
    }

    public final /* bridge */ /* synthetic */ void ac(Object obj, int i) {
        String str = (String) obj;
        AnonymousClass5XJ anonymousClass5XJ = this.f57645B;
        if (!anonymousClass5XJ.f65789C.contains(str)) {
            anonymousClass5XJ.f65789C.add(str);
            AnonymousClass4pJ.m25174D(anonymousClass5XJ.f65790D, "explore_inspired_hashtag_impression", anonymousClass5XJ.f65791E.kR(), anonymousClass5XJ.f65792F, str, i).R();
        }
    }

    public final void rWA(AnonymousClass0wM anonymousClass0wM, int i) {
        String str = (String) this.f57646C.f57644D.get(i);
        anonymousClass0wM.tWA(str, str, i);
    }
}
