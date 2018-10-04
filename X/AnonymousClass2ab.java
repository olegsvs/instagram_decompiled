package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.instagram.model.business.Address;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: X.2ab */
public final class AnonymousClass2ab {
    /* renamed from: B */
    public static String m16352B(Address address) {
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        createGenerator.writeStartObject();
        if (address.f27741F != null) {
            createGenerator.writeStringField("address_street", address.f27741F);
        }
        if (address.f27737B != null) {
            createGenerator.writeStringField("city_id", address.f27737B);
        }
        if (address.f27739D != null) {
            createGenerator.writeStringField("zip", address.f27739D);
        }
        createGenerator.writeEndObject();
        createGenerator.close();
        return stringWriter.toString();
    }
}
