package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.model.venue.Venue;

/* renamed from: X.18p */
public final class AnonymousClass18p {
    /* renamed from: B */
    public static boolean m9638B(Venue venue, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("pk".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            venue.f6710G = str2;
            return true;
        } else if ("name".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            venue.f6716M = str2;
            return true;
        } else if ("short_name".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            venue.f6717N = str2;
            return true;
        } else if ("address".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            venue.f6705B = str2;
            return true;
        } else if ("external_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            venue.f6706C = str2;
            return true;
        } else if ("facebook_places_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            venue.f6708E = str2;
            return true;
        } else if ("foursquare_v2_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            venue.f6709F = str2;
            return true;
        } else {
            if (!"external_source".equals(str)) {
                if (!"external_id_source".equals(str)) {
                    if ("profile_pic_url".equals(str)) {
                        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                            str2 = jsonParser.getText();
                        }
                        venue.f6712I = str2;
                        return true;
                    } else if ("profile_pic_username".equals(str)) {
                        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                            str2 = jsonParser.getText();
                        }
                        venue.f6711H = str2;
                        return true;
                    } else if ("lat".equals(str)) {
                        venue.f6713J = Double.valueOf(jsonParser.getValueAsDouble());
                        return true;
                    } else if ("lng".equals(str)) {
                        venue.f6714K = Double.valueOf(jsonParser.getValueAsDouble());
                        return true;
                    } else if (!"has_viewer_saved".equals(str)) {
                        return false;
                    } else {
                        venue.f6715L = jsonParser.getValueAsBoolean();
                        return true;
                    }
                }
            }
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            venue.f6707D = str2;
            return true;
        }
    }

    /* renamed from: C */
    public static void m9639C(JsonGenerator jsonGenerator, Venue venue, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (venue.f6710G != null) {
            jsonGenerator.writeStringField("pk", venue.f6710G);
        }
        if (venue.f6716M != null) {
            jsonGenerator.writeStringField("name", venue.f6716M);
        }
        if (venue.f6717N != null) {
            jsonGenerator.writeStringField("short_name", venue.f6717N);
        }
        if (venue.f6705B != null) {
            jsonGenerator.writeStringField("address", venue.f6705B);
        }
        if (venue.f6706C != null) {
            jsonGenerator.writeStringField("external_id", venue.f6706C);
        }
        if (venue.f6708E != null) {
            jsonGenerator.writeStringField("facebook_places_id", venue.f6708E);
        }
        if (venue.f6709F != null) {
            jsonGenerator.writeStringField("foursquare_v2_id", venue.f6709F);
        }
        if (venue.f6707D != null) {
            jsonGenerator.writeStringField("external_source", venue.f6707D);
        }
        if (venue.f6712I != null) {
            jsonGenerator.writeStringField("profile_pic_url", venue.f6712I);
        }
        if (venue.f6711H != null) {
            jsonGenerator.writeStringField("profile_pic_username", venue.f6711H);
        }
        if (venue.f6713J != null) {
            jsonGenerator.writeNumberField("lat", venue.f6713J.doubleValue());
        }
        if (venue.f6714K != null) {
            jsonGenerator.writeNumberField("lng", venue.f6714K.doubleValue());
        }
        jsonGenerator.writeBooleanField("has_viewer_saved", venue.f6715L);
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.model.venue.Venue parseFromJson(com.fasterxml.jackson.core.JsonParser r3) {
        /*
        r2 = new com.instagram.model.venue.Venue;
        r2.<init>();
        r1 = r3.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
        if (r1 == r0) goto L_0x0012;
    L_0x000d:
        r3.skipChildren();
        r0 = 0;
        return r0;
    L_0x0012:
        r1 = r3.nextToken();
        r0 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
        if (r1 == r0) goto L_0x0028;
    L_0x001a:
        r0 = r3.getCurrentName();
        r3.nextToken();
        X.AnonymousClass18p.m9638B(r2, r0, r3);
        r3.skipChildren();
        goto L_0x0012;
    L_0x0028:
        r1 = "facebook_places";
        r0 = r2.f6707D;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0039;
    L_0x0032:
        r0 = r2.f6708E;
        if (r0 == 0) goto L_0x0039;
    L_0x0036:
        r2.f6706C = r0;
        goto L_0x003e;
    L_0x0039:
        r0 = r2.f6709F;
        if (r0 == 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0036;
    L_0x003e:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.18p.parseFromJson(com.fasterxml.jackson.core.JsonParser):com.instagram.model.venue.Venue");
    }
}
