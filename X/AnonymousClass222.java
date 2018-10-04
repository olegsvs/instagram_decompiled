package X;

/* renamed from: X.222 */
public class AnonymousClass222 {
    /* renamed from: B */
    public final String f25352B;

    public AnonymousClass222(AnonymousClass222 anonymousClass222) {
        this.f25352B = anonymousClass222.f25352B;
    }

    public AnonymousClass222(String str) {
        this.f25352B = (String) AnonymousClass1Cy.G(str);
    }

    /* renamed from: A */
    public CharSequence mo3158A(Object obj) {
        AnonymousClass1Cy.G(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* renamed from: B */
    public AnonymousClass222 mo3159B(String str) {
        AnonymousClass1Cy.G(str);
        return new AnonymousClass2Ti(this, this, str);
    }
}
