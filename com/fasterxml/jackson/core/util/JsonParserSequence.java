package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

public final class JsonParserSequence extends JsonParserDelegate {
    public int _nextParser = 1;
    public final JsonParser[] _parsers;

    public JsonParserSequence(JsonParser[] jsonParserArr) {
        super(jsonParserArr[0]);
        this._parsers = jsonParserArr;
    }

    public final void addFlattenedActiveParsers(List list) {
        int length = this._parsers.length;
        for (int i = this._nextParser - 1; i < length; i++) {
            Object obj = this._parsers[i];
            if (obj instanceof JsonParserSequence) {
                ((JsonParserSequence) obj).addFlattenedActiveParsers(list);
            } else {
                list.add(obj);
            }
        }
    }

    public final void close() {
        do {
            this.delegate.close();
        } while (switchToNext());
    }

    public static JsonParserSequence createFlattened(JsonParser jsonParser, JsonParser jsonParser2) {
        boolean z = jsonParser instanceof JsonParserSequence;
        if (z || (jsonParser2 instanceof JsonParserSequence)) {
            ArrayList arrayList = new ArrayList();
            if (z) {
                ((JsonParserSequence) jsonParser).addFlattenedActiveParsers(arrayList);
            } else {
                arrayList.add(jsonParser);
            }
            if (jsonParser2 instanceof JsonParserSequence) {
                ((JsonParserSequence) jsonParser2).addFlattenedActiveParsers(arrayList);
            } else {
                arrayList.add(jsonParser2);
            }
            return new JsonParserSequence((JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
        }
        return new JsonParserSequence(new JsonParser[]{jsonParser, jsonParser2});
    }

    public final JsonToken nextToken() {
        JsonToken nextToken = this.delegate.nextToken();
        if (nextToken == null) {
            while (switchToNext()) {
                nextToken = this.delegate.nextToken();
                if (nextToken != null) {
                }
            }
            return null;
        }
        return nextToken;
    }

    public final boolean switchToNext() {
        int i = this._nextParser;
        JsonParser[] jsonParserArr = this._parsers;
        if (i >= jsonParserArr.length) {
            return false;
        }
        this._nextParser = i + 1;
        this.delegate = jsonParserArr[i];
        return true;
    }
}
