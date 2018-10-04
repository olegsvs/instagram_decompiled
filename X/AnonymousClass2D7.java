package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2D7 */
public final class AnonymousClass2D7 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2Zt f27544B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1yN f27545C;
    /* renamed from: D */
    public final /* synthetic */ int f27546D;
    /* renamed from: E */
    public final /* synthetic */ Set f27547E;

    public AnonymousClass2D7(AnonymousClass2Zt anonymousClass2Zt, Set set, AnonymousClass1yN anonymousClass1yN, int i) {
        this.f27544B = anonymousClass2Zt;
        this.f27547E = set;
        this.f27545C = anonymousClass1yN;
        this.f27546D = i;
    }

    public final void run() {
        AnonymousClass2D8 parseFromJson;
        AnonymousClass1yU anonymousClass1yU = this.f27544B;
        Set<String> set = this.f27547E;
        AnonymousClass1yN anonymousClass1yN = this.f27545C;
        int i = this.f27546D;
        List<String> arrayList = new ArrayList();
        AnonymousClass09Q B = AnonymousClass09Q.B();
        InputStream open = anonymousClass1yU.f24918B.getAssets().open("app_modules.json");
        AnonymousClass2D9 anonymousClass2D9 = new AnonymousClass2D9();
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(open);
        List<AnonymousClass2D8> arrayList2 = new ArrayList();
        createParser.nextToken();
        if (createParser.getCurrentToken() == JsonToken.START_ARRAY) {
            while (createParser.nextToken() != JsonToken.END_ARRAY) {
                if (createParser.getCurrentToken() == JsonToken.START_OBJECT) {
                    RuntimeException iOException;
                    parseFromJson = AnonymousClass2Zu.parseFromJson(createParser);
                    if (parseFromJson == null) {
                        iOException = new IOException("Failed to parse local metadata");
                    } else if (parseFromJson.f27550D == null || parseFromJson.f27549C == null || parseFromJson.f27548B == null) {
                        iOException = new RuntimeException(StringFormatUtil.formatStrLocaleSafe("Missing metadata: name: %s, hash: %s, filename: %s", parseFromJson.f27550D, parseFromJson.f27549C, parseFromJson.f27548B));
                    } else {
                        arrayList2.add(parseFromJson);
                    }
                    throw iOException;
                }
            }
        }
        for (AnonymousClass2D8 parseFromJson2 : arrayList2) {
            if (set.contains(parseFromJson2.f27550D)) {
                arrayList.add(parseFromJson2.f27549C);
                B.H(parseFromJson2.f27550D, Integer.valueOf(4));
            }
        }
        anonymousClass1yU.f31363D.f31360C.Y(15335438, i, "download_module_start");
        AnonymousClass2DB anonymousClass2DB = anonymousClass1yU.f31362C;
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        createGenerator.writeStartArray();
        for (String writeString : arrayList) {
            createGenerator.writeString(writeString);
        }
        createGenerator.writeEndArray();
        createGenerator.close();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass2DB.f27552B);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "android_modules/download/";
        AnonymousClass0Pt M = anonymousClass0Pt.G("hashes", stringWriter.toString()).M(AnonymousClass2Zn.class);
        M.f4218B = AnonymousClass0Qw.OffScreen;
        AnonymousClass0GA H = M.N().H();
        int size = arrayList.size();
        AtomicReference atomicReference = new AtomicReference();
        H.f2849B = new AnonymousClass2DA(anonymousClass2DB, atomicReference);
        AnonymousClass0Ix.C(H);
        List list = (List) atomicReference.get();
        if (list != null) {
            int size2 = list.size();
            if (size == size2) {
                for (AnonymousClass2D2 anonymousClass2D2 : (List) atomicReference.get()) {
                    AnonymousClass09M anonymousClass09M = anonymousClass1yU.f31361B;
                    AnonymousClass0a9 AHA = AnonymousClass0a9.f6449F.AHA(anonymousClass2D2.f27526B);
                    AnonymousClass0gN anonymousClass0gN = new AnonymousClass0gN();
                    anonymousClass0gN.f8152H = AnonymousClass0Qv.API;
                    InputStream EN = AnonymousClass0Gp.f2421B.B(AHA, anonymousClass0gN.A()).EN();
                    try {
                        anonymousClass09M.A(anonymousClass2D2.f27528D, anonymousClass2D2.f27527C);
                        AnonymousClass1yV.m13959B(anonymousClass09M.B(anonymousClass2D2.f27528D, anonymousClass2D2.f27527C), EN, anonymousClass2D2.f27527C);
                        EN.close();
                    } catch (Exception e) {
                        anonymousClass1yN.m13949A(e);
                        anonymousClass1yU.f31363D.m16308A(i, e, (short) 3);
                        for (String H2 : set) {
                            B.H(H2, Integer.valueOf(3));
                        }
                        return;
                    } catch (Throwable th) {
                        EN.close();
                    }
                }
                anonymousClass1yN.m13950B(Integer.valueOf(1));
                for (String H22 : set) {
                    B.H(H22, Integer.valueOf(2));
                }
                anonymousClass1yU.f31363D.m16308A(i, null, (short) 2);
                return;
            }
            throw new IOException(StringFormatUtil.formatStrLocaleSafe("Failed to download some module metadata files, expected %s, got %s", Integer.valueOf(size), Integer.valueOf(size2)));
        }
        throw new IOException("Failed to download module metadata files");
    }
}
