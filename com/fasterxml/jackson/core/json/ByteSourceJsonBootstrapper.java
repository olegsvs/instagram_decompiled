package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.core.io.UTF32Reader;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public final class ByteSourceJsonBootstrapper {
    public boolean _bigEndian = true;
    private final boolean _bufferRecyclable;
    public int _bytesPerChar = 0;
    public final IOContext _context;
    public final InputStream _in;
    public final byte[] _inputBuffer;
    private int _inputEnd;
    public int _inputProcessed;
    private int _inputPtr;

    public ByteSourceJsonBootstrapper(IOContext iOContext, InputStream inputStream) {
        this._context = iOContext;
        this._in = inputStream;
        this._inputBuffer = iOContext.allocReadIOBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._inputProcessed = 0;
        this._bufferRecyclable = true;
    }

    public ByteSourceJsonBootstrapper(IOContext iOContext, byte[] bArr, int i, int i2) {
        this._context = iOContext;
        this._in = null;
        this._inputBuffer = bArr;
        this._inputPtr = i;
        this._inputEnd = i2 + i;
        this._inputProcessed = -i;
        this._bufferRecyclable = false;
    }

    private boolean checkUTF16(int i) {
        if ((65280 & i) == 0) {
            this._bigEndian = true;
        } else if ((i & 255) != 0) {
            return false;
        } else {
            this._bigEndian = false;
        }
        this._bytesPerChar = 2;
        return true;
    }

    private boolean checkUTF32(int i) {
        if ((i >> 8) == 0) {
            this._bigEndian = true;
        } else if ((16777215 & i) == 0) {
            this._bigEndian = false;
        } else if ((-16711681 & i) == 0) {
            reportWeirdUCS4("3412");
        } else if ((i & -65281) != 0) {
            return false;
        } else {
            reportWeirdUCS4("2143");
        }
        this._bytesPerChar = 4;
        return true;
    }

    public final JsonParser constructParser(int i, ObjectCodec objectCodec, BytesToNameCanonicalizer bytesToNameCanonicalizer, CharsToNameCanonicalizer charsToNameCanonicalizer, boolean z, boolean z2) {
        int i2 = i;
        ObjectCodec objectCodec2 = objectCodec;
        if (detectEncoding() != JsonEncoding.UTF8 || !z) {
            return new ReaderBasedJsonParser(this._context, i2, constructReader(), objectCodec2, charsToNameCanonicalizer.makeChild(z, z2));
        }
        return new UTF8StreamJsonParser(this._context, i2, this._in, objectCodec2, bytesToNameCanonicalizer.makeChild(z, z2), this._inputBuffer, this._inputPtr, this._inputEnd, this._bufferRecyclable);
    }

    public final Reader constructReader() {
        JsonEncoding encoding = this._context.getEncoding();
        switch (encoding.ordinal()) {
            case 0:
            case 1:
            case 2:
                InputStream inputStream = this._in;
                if (inputStream == null) {
                    inputStream = new ByteArrayInputStream(this._inputBuffer, this._inputPtr, this._inputEnd);
                } else {
                    int i = this._inputPtr;
                    int i2 = this._inputEnd;
                    if (i < i2) {
                        inputStream = new MergedStream(this._context, inputStream, this._inputBuffer, i, i2);
                    }
                }
                return new InputStreamReader(inputStream, encoding.getJavaName());
            case 3:
            case 4:
                IOContext iOContext = this._context;
                return new UTF32Reader(iOContext, this._in, this._inputBuffer, this._inputPtr, this._inputEnd, iOContext.getEncoding().isBigEndian());
            default:
                throw new RuntimeException("Internal error");
        }
    }

    public final JsonEncoding detectEncoding() {
        int i;
        JsonEncoding jsonEncoding;
        int i2 = 1;
        byte[] bArr;
        if (ensureLoaded(4)) {
            bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            i3 = (bArr[i3 + 3] & 255) | (((bArr[i3] << 24) | ((bArr[i3 + 1] & 255) << 16)) | ((bArr[i3 + 2] & 255) << 8));
            if (!handleBOM(i3)) {
                if (!checkUTF32(i3)) {
                    if (checkUTF16(i3 >>> 16)) {
                    }
                }
            }
            if (i2 != 0) {
                i = this._bytesPerChar;
                if (i == 4) {
                    switch (i) {
                        case 1:
                            break;
                        case 2:
                            if (!this._bigEndian) {
                                jsonEncoding = JsonEncoding.UTF16_LE;
                                break;
                            }
                            jsonEncoding = JsonEncoding.UTF16_BE;
                            break;
                        default:
                            throw new RuntimeException("Internal error");
                    }
                }
                jsonEncoding = this._bigEndian ? JsonEncoding.UTF32_BE : JsonEncoding.UTF32_LE;
                this._context.setEncoding(jsonEncoding);
                return jsonEncoding;
            }
            jsonEncoding = JsonEncoding.UTF8;
            this._context.setEncoding(jsonEncoding);
            return jsonEncoding;
        } else if (ensureLoaded(2)) {
            bArr = this._inputBuffer;
            int i4 = this._inputPtr;
            if (checkUTF16((bArr[i4 + 1] & 255) | ((bArr[i4] & 255) << 8))) {
                if (i2 != 0) {
                    i = this._bytesPerChar;
                    if (i == 4) {
                        switch (i) {
                            case 1:
                                break;
                            case 2:
                                if (!this._bigEndian) {
                                    jsonEncoding = JsonEncoding.UTF16_BE;
                                    break;
                                }
                                jsonEncoding = JsonEncoding.UTF16_LE;
                                break;
                            default:
                                throw new RuntimeException("Internal error");
                        }
                    } else if (this._bigEndian) {
                    }
                    this._context.setEncoding(jsonEncoding);
                    return jsonEncoding;
                }
                jsonEncoding = JsonEncoding.UTF8;
                this._context.setEncoding(jsonEncoding);
                return jsonEncoding;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            i = this._bytesPerChar;
            if (i == 4) {
                switch (i) {
                    case 1:
                        break;
                    case 2:
                        if (!this._bigEndian) {
                            jsonEncoding = JsonEncoding.UTF16_LE;
                            break;
                        }
                        jsonEncoding = JsonEncoding.UTF16_BE;
                        break;
                    default:
                        throw new RuntimeException("Internal error");
                }
            } else if (this._bigEndian) {
            }
            this._context.setEncoding(jsonEncoding);
            return jsonEncoding;
        }
        jsonEncoding = JsonEncoding.UTF8;
        this._context.setEncoding(jsonEncoding);
        return jsonEncoding;
    }

    public final boolean ensureLoaded(int i) {
        int i2 = this._inputEnd - this._inputPtr;
        while (i2 < i) {
            int i3;
            InputStream inputStream = this._in;
            if (inputStream == null) {
                i3 = -1;
            } else {
                byte[] bArr = this._inputBuffer;
                i3 = this._inputEnd;
                i3 = inputStream.read(bArr, i3, bArr.length - i3);
            }
            if (i3 < 1) {
                return false;
            }
            this._inputEnd += i3;
            i2 += i3;
        }
        return true;
    }

    private boolean handleBOM(int i) {
        int i2;
        int i3;
        if (i != -16842752) {
            i2 = 4;
            if (i != -131072) {
                if (i == 65279) {
                    this._bigEndian = true;
                    this._inputPtr += 4;
                    this._bytesPerChar = 4;
                    return true;
                } else if (i != 65534) {
                    i3 = i >>> 16;
                    i2 = 2;
                    if (i3 == 65279) {
                        this._inputPtr += 2;
                        this._bytesPerChar = 2;
                        this._bigEndian = true;
                        return true;
                    } else if (i3 != 65534) {
                        if ((i >>> 8) == 15711167) {
                            return false;
                        }
                        this._inputPtr += 3;
                        this._bytesPerChar = 1;
                        this._bigEndian = true;
                        return true;
                    }
                } else {
                    reportWeirdUCS4("2143");
                }
            }
            this._inputPtr += i2;
            this._bytesPerChar = i2;
            this._bigEndian = false;
            return true;
        }
        reportWeirdUCS4("3412");
        i3 = i >>> 16;
        i2 = 2;
        if (i3 == 65279) {
            this._inputPtr += 2;
            this._bytesPerChar = 2;
            this._bigEndian = true;
            return true;
        } else if (i3 != 65534) {
            this._inputPtr += i2;
            this._bytesPerChar = i2;
            this._bigEndian = false;
            return true;
        } else if ((i >>> 8) == 15711167) {
            return false;
        } else {
            this._inputPtr += 3;
            this._bytesPerChar = 1;
            this._bigEndian = true;
            return true;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fasterxml.jackson.core.format.MatchStrength hasJSONFormat(com.fasterxml.jackson.core.format.InputAccessor r5) {
        /*
        r0 = r5.hasMoreBytes();
        if (r0 != 0) goto L_0x0009;
    L_0x0006:
        r0 = com.fasterxml.jackson.core.format.MatchStrength.INCONCLUSIVE;
        return r0;
    L_0x0009:
        r1 = r5.nextByte();
        r0 = -17;
        if (r1 != r0) goto L_0x003e;
    L_0x0011:
        r0 = r5.hasMoreBytes();
        if (r0 != 0) goto L_0x0018;
    L_0x0017:
        goto L_0x0006;
    L_0x0018:
        r1 = r5.nextByte();
        r0 = -69;
        if (r1 == r0) goto L_0x0023;
    L_0x0020:
        r0 = com.fasterxml.jackson.core.format.MatchStrength.NO_MATCH;
        return r0;
    L_0x0023:
        r0 = r5.hasMoreBytes();
        if (r0 != 0) goto L_0x002a;
    L_0x0029:
        goto L_0x0006;
    L_0x002a:
        r1 = r5.nextByte();
        r0 = -65;
        if (r1 == r0) goto L_0x0033;
    L_0x0032:
        goto L_0x0020;
    L_0x0033:
        r0 = r5.hasMoreBytes();
        if (r0 != 0) goto L_0x003a;
    L_0x0039:
        goto L_0x0006;
    L_0x003a:
        r1 = r5.nextByte();
    L_0x003e:
        r4 = skipSpace(r5, r1);
        if (r4 >= 0) goto L_0x0045;
    L_0x0044:
        goto L_0x0006;
    L_0x0045:
        r1 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r0 = 34;
        if (r4 != r1) goto L_0x005b;
    L_0x004b:
        r1 = skipSpace(r5);
        if (r1 >= 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0006;
    L_0x0052:
        if (r1 == r0) goto L_0x0058;
    L_0x0054:
        r0 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r1 != r0) goto L_0x0020;
    L_0x0058:
        r0 = com.fasterxml.jackson.core.format.MatchStrength.SOLID_MATCH;
        return r0;
    L_0x005b:
        r2 = 91;
        if (r4 != r2) goto L_0x006d;
    L_0x005f:
        r1 = skipSpace(r5);
        if (r1 >= 0) goto L_0x0066;
    L_0x0065:
        goto L_0x0006;
    L_0x0066:
        r0 = 93;
        if (r1 == r0) goto L_0x0058;
    L_0x006a:
        if (r1 != r2) goto L_0x0058;
    L_0x006c:
        goto L_0x0058;
    L_0x006d:
        r3 = com.fasterxml.jackson.core.format.MatchStrength.WEAK_MATCH;
        if (r4 != r0) goto L_0x0072;
    L_0x0071:
        return r3;
    L_0x0072:
        r2 = 48;
        r1 = 57;
        if (r4 > r1) goto L_0x007b;
    L_0x0078:
        if (r4 < r2) goto L_0x007b;
    L_0x007a:
        goto L_0x0071;
    L_0x007b:
        r0 = 45;
        if (r4 != r0) goto L_0x008e;
    L_0x007f:
        r0 = skipSpace(r5);
        if (r0 >= 0) goto L_0x0086;
    L_0x0085:
        goto L_0x0006;
    L_0x0086:
        if (r0 > r1) goto L_0x008b;
    L_0x0088:
        if (r0 < r2) goto L_0x008b;
    L_0x008a:
        goto L_0x0071;
    L_0x008b:
        r3 = com.fasterxml.jackson.core.format.MatchStrength.NO_MATCH;
        goto L_0x0071;
    L_0x008e:
        r0 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        if (r4 != r0) goto L_0x0099;
    L_0x0092:
        r0 = "ull";
        r0 = tryMatch(r5, r0, r3);
        return r0;
    L_0x0099:
        r0 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r4 != r0) goto L_0x00a4;
    L_0x009d:
        r0 = "rue";
        r0 = tryMatch(r5, r0, r3);
        return r0;
    L_0x00a4:
        r0 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r4 != r0) goto L_0x0020;
    L_0x00a8:
        r0 = "alse";
        r0 = tryMatch(r5, r0, r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper.hasJSONFormat(com.fasterxml.jackson.core.format.InputAccessor):com.fasterxml.jackson.core.format.MatchStrength");
    }

    private static void reportWeirdUCS4(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported UCS-4 endianness (");
        stringBuilder.append(str);
        stringBuilder.append(") detected");
        throw new CharConversionException(stringBuilder.toString());
    }

    private static int skipSpace(InputAccessor inputAccessor) {
        if (inputAccessor.hasMoreBytes()) {
            return skipSpace(inputAccessor, inputAccessor.nextByte());
        }
        return -1;
    }

    private static int skipSpace(InputAccessor inputAccessor, byte b) {
        while (true) {
            int i = b & 255;
            if (i != 32 && i != 13 && i != 10 && i != 9) {
                return i;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return -1;
            }
            b = inputAccessor.nextByte();
        }
    }

    private static MatchStrength tryMatch(InputAccessor inputAccessor, String str, MatchStrength matchStrength) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != str.charAt(i)) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }
}
