package X;

import com.instagram.service.persistentcookiestore.PersistentCookieStore$SerializableCookie;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* renamed from: X.0g9 */
public final class AnonymousClass0g9 extends ObjectInputStream {
    public AnonymousClass0g9(InputStream inputStream) {
        super(inputStream);
    }

    public final ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
        if (!readClassDescriptor.getName().equals("com.instagram.api.SerializableCookie")) {
            if (!readClassDescriptor.getName().equals("com.instagram.service.PersistentCookieStore$SerializableCookie")) {
                return readClassDescriptor;
            }
        }
        return ObjectStreamClass.lookup(PersistentCookieStore$SerializableCookie.class);
    }
}
