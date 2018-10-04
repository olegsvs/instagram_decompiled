package X;

import oauth.signpost.AbstractOAuthConsumer;
import oauth.signpost.http.HttpRequest;

/* renamed from: X.3fH */
public final class AnonymousClass3fH extends AbstractOAuthConsumer {
    public AnonymousClass3fH(String str, String str2) {
        super(str, str2);
    }

    public final HttpRequest wrap(Object obj) {
        if (obj instanceof AnonymousClass0a8) {
            return new AnonymousClass3fI((AnonymousClass0a8) obj);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This consumer expects requests of type ");
        stringBuilder.append(AnonymousClass0a8.class.getCanonicalName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
