package X;

import java.util.Locale;

/* renamed from: X.6D4 */
public final class AnonymousClass6D4 implements AnonymousClass5dc {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5hJ f72984B;

    public AnonymousClass6D4(AnonymousClass5hJ anonymousClass5hJ) {
        this.f72984B = anonymousClass5hJ;
    }

    public final void Ft(AnonymousClass5dW anonymousClass5dW) {
        AnonymousClass5cn anonymousClass5cn = this.f72984B.f68201D;
        anonymousClass5dW.m28159A(String.format(Locale.US, "(function(d, s, id){    var sdkURL = \"%s\";    var js, fjs = d.getElementsByTagName(s)[0];    if (d.getElementById(id) || 'FBExtensions' in window) {return;}    js = d.createElement(s); js.id = id;    js.src = sdkURL;    fjs.parentNode.insertBefore(js, fjs);}(document, 'script', 'facebook-platform-extensions-sdk'));", new Object[]{anonymousClass5cn.f67454B}));
    }
}
