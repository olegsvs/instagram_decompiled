package com.instagram.service.persistentcookiestore;

import X.AnonymousClass0gD;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class PersistentCookieStore$SerializableCookie implements Serializable {
    private static final long serialVersionUID = 6374381828722046732L;
    private final AnonymousClass0gD mCookieToSerialize;
    private AnonymousClass0gD mDeserializedCookie;

    public PersistentCookieStore$SerializableCookie(AnonymousClass0gD anonymousClass0gD) {
        this.mCookieToSerialize = anonymousClass0gD;
    }

    public AnonymousClass0gD getCookie() {
        AnonymousClass0gD anonymousClass0gD = this.mCookieToSerialize;
        AnonymousClass0gD anonymousClass0gD2 = this.mDeserializedCookie;
        return anonymousClass0gD2 != null ? anonymousClass0gD2 : anonymousClass0gD;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        String str = (String) objectInputStream.readObject();
        Date date = (Date) objectInputStream.readObject();
        int[] iArr = null;
        this.mDeserializedCookie = new AnonymousClass0gD(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject(), null, date, (String) objectInputStream.readObject(), (String) objectInputStream.readObject(), iArr, objectInputStream.readBoolean(), false, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.mCookieToSerialize.f8127H);
        objectOutputStream.writeObject(this.mCookieToSerialize.f8130K);
        objectOutputStream.writeObject(this.mCookieToSerialize.f8121B);
        objectOutputStream.writeObject(this.mCookieToSerialize.f8123D);
        objectOutputStream.writeObject(this.mCookieToSerialize.f8124E);
        objectOutputStream.writeObject(this.mCookieToSerialize.f8128I);
        objectOutputStream.writeInt(this.mCookieToSerialize.f8131L);
        objectOutputStream.writeBoolean(this.mCookieToSerialize.f8126G);
    }
}
