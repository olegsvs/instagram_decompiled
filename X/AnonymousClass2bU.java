package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2bU */
public final class AnonymousClass2bU {
    /* renamed from: B */
    public static boolean m16421B(AnonymousClass2Fy anonymousClass2Fy, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("audio_asset_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Fy.f28175N = str2;
            return true;
        } else if ("audio_asset_start_time_in_ms".equals(str)) {
            anonymousClass2Fy.f28163B = Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        } else if ("derived_content_start_time_in_ms".equals(str)) {
            anonymousClass2Fy.f28167F = Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        } else if ("overlap_duration_in_ms".equals(str)) {
            anonymousClass2Fy.f28171J = Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        } else if ("ig_artist".equals(str)) {
            anonymousClass2Fy.f28169H = AnonymousClass0Ci.B(jsonParser);
            return true;
        } else if ("audio_asset_url".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Fy.f28176O = str2;
            return true;
        } else if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Fy.f28174M = str2;
            return true;
        } else if ("display_artist".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Fy.f28168G = str2;
            return true;
        } else if ("cover_artwork_uri".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Fy.f28165D = str2;
            return true;
        } else if ("cover_artwork_thumbnail_uri".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Fy.f28166E = str2;
            return true;
        } else if ("is_explicit".equals(str)) {
            anonymousClass2Fy.f28170I = jsonParser.getValueAsBoolean();
            return true;
        } else if ("browse_session_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Fy.f28164C = str2;
            return true;
        } else if ("should_mute_audio".equals(str)) {
            anonymousClass2Fy.f28172K = jsonParser.getValueAsBoolean();
            return true;
        } else if (!"should_mute_audio_reason".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Fy.f28173L = str2;
            return true;
        }
    }

    /* renamed from: C */
    public static void m16422C(JsonGenerator jsonGenerator, AnonymousClass2Fy anonymousClass2Fy, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (anonymousClass2Fy.f28175N != null) {
            jsonGenerator.writeStringField("audio_asset_id", anonymousClass2Fy.f28175N);
        }
        if (anonymousClass2Fy.f28163B != null) {
            jsonGenerator.writeNumberField("audio_asset_start_time_in_ms", anonymousClass2Fy.f28163B.intValue());
        }
        if (anonymousClass2Fy.f28167F != null) {
            jsonGenerator.writeNumberField("derived_content_start_time_in_ms", anonymousClass2Fy.f28167F.intValue());
        }
        if (anonymousClass2Fy.f28171J != null) {
            jsonGenerator.writeNumberField("overlap_duration_in_ms", anonymousClass2Fy.f28171J.intValue());
        }
        if (anonymousClass2Fy.f28169H != null) {
            jsonGenerator.writeFieldName("ig_artist");
            AnonymousClass11v.C(jsonGenerator, anonymousClass2Fy.f28169H, true);
        }
        if (anonymousClass2Fy.f28176O != null) {
            jsonGenerator.writeStringField("audio_asset_url", anonymousClass2Fy.f28176O);
        }
        if (anonymousClass2Fy.f28174M != null) {
            jsonGenerator.writeStringField(DialogModule.KEY_TITLE, anonymousClass2Fy.f28174M);
        }
        if (anonymousClass2Fy.f28168G != null) {
            jsonGenerator.writeStringField("display_artist", anonymousClass2Fy.f28168G);
        }
        if (anonymousClass2Fy.f28165D != null) {
            jsonGenerator.writeStringField("cover_artwork_uri", anonymousClass2Fy.f28165D);
        }
        if (anonymousClass2Fy.f28166E != null) {
            jsonGenerator.writeStringField("cover_artwork_thumbnail_uri", anonymousClass2Fy.f28166E);
        }
        jsonGenerator.writeBooleanField("is_explicit", anonymousClass2Fy.f28170I);
        if (anonymousClass2Fy.f28164C != null) {
            jsonGenerator.writeStringField("browse_session_id", anonymousClass2Fy.f28164C);
        }
        jsonGenerator.writeBooleanField("should_mute_audio", anonymousClass2Fy.f28172K);
        if (anonymousClass2Fy.f28173L != null) {
            jsonGenerator.writeStringField("should_mute_audio_reason", anonymousClass2Fy.f28173L);
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass2Fy parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Fy anonymousClass2Fy = new AnonymousClass2Fy();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2bU.m16421B(anonymousClass2Fy, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Fy;
    }
}
