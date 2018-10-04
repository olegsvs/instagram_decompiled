package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1wK */
public final class AnonymousClass1wK implements Externalizable {
    /* renamed from: B */
    public String f24424B = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: C */
    public String f24425C;
    /* renamed from: D */
    public boolean f24426D;
    /* renamed from: E */
    public boolean f24427E;
    /* renamed from: F */
    public List f24428F = new ArrayList();
    /* renamed from: G */
    public String f24429G = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: H */
    public boolean f24430H = false;
    /* renamed from: I */
    public String f24431I;

    public AnonymousClass1wK() {
        String str = JsonProperty.USE_DEFAULT_NAME;
        this.f24431I = str;
        this.f24425C = str;
    }

    public final void readExternal(ObjectInput objectInput) {
        this.f24431I = objectInput.readUTF();
        this.f24425C = objectInput.readUTF();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f24428F.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f24427E = true;
            this.f24429G = readUTF;
        }
        if (objectInput.readBoolean()) {
            readUTF = objectInput.readUTF();
            this.f24426D = true;
            this.f24424B = readUTF;
        }
        this.f24430H = objectInput.readBoolean();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f24431I);
        objectOutput.writeUTF(this.f24425C);
        int size = this.f24428F.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) this.f24428F.get(i));
        }
        objectOutput.writeBoolean(this.f24427E);
        if (this.f24427E) {
            objectOutput.writeUTF(this.f24429G);
        }
        objectOutput.writeBoolean(this.f24426D);
        if (this.f24426D) {
            objectOutput.writeUTF(this.f24424B);
        }
        objectOutput.writeBoolean(this.f24430H);
    }
}
