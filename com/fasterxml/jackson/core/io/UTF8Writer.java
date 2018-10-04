package com.fasterxml.jackson.core.io;

import com.facebook.common.dextricks.DexStore;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public final class UTF8Writer extends Writer {
    private final IOContext _context;
    private OutputStream _out;
    private byte[] _outBuffer;
    private final int _outBufferEnd;
    private int _outPtr;
    private int _surrogate = 0;

    public UTF8Writer(IOContext iOContext, OutputStream outputStream) {
        this._context = iOContext;
        this._out = outputStream;
        byte[] allocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this._outBuffer = allocWriteEncodingBuffer;
        this._outBufferEnd = allocWriteEncodingBuffer.length - 4;
        this._outPtr = 0;
    }

    public final Writer append(char c) {
        write((int) c);
        return this;
    }

    public final void close() {
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            int i = this._outPtr;
            if (i > 0) {
                outputStream.write(this._outBuffer, 0, i);
                this._outPtr = 0;
            }
            outputStream = this._out;
            this._out = null;
            byte[] bArr = this._outBuffer;
            if (bArr != null) {
                this._outBuffer = null;
                this._context.releaseWriteEncodingBuffer(bArr);
            }
            outputStream.close();
            int i2 = this._surrogate;
            this._surrogate = 0;
            if (i2 > 0) {
                illegalSurrogate(i2);
            }
        }
    }

    public final int convertSurrogate(int i) {
        int i2 = this._surrogate;
        this._surrogate = 0;
        if (i >= 56320 && i <= 57343) {
            return (((i2 - 55296) << 10) + 65536) + (i - 56320);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Broken surrogate pair: first char 0x");
        stringBuilder.append(Integer.toHexString(i2));
        stringBuilder.append(", second 0x");
        stringBuilder.append(Integer.toHexString(i));
        stringBuilder.append("; illegal combination");
        throw new IOException(stringBuilder.toString());
    }

    public final void flush() {
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            int i = this._outPtr;
            if (i > 0) {
                outputStream.write(this._outBuffer, 0, i);
                this._outPtr = 0;
            }
            this._out.flush();
        }
    }

    public static void illegalSurrogate(int i) {
        throw new IOException(illegalSurrogateDesc(i));
    }

    public static String illegalSurrogateDesc(int i) {
        StringBuilder stringBuilder;
        if (i > 1114111) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal character point (0x");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(") to output; max is 0x10FFFF as per RFC 4627");
            return stringBuilder.toString();
        } else if (i < 55296) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal character point (0x");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(") to output");
            return stringBuilder.toString();
        } else if (i <= 56319) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unmatched first part of surrogate pair (0x");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(")");
            return stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unmatched second part of surrogate pair (0x");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public final void write(int i) {
        if (this._surrogate > 0) {
            i = convertSurrogate(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                illegalSurrogate(i);
            }
            this._surrogate = i;
            return;
        }
        int i2 = this._outPtr;
        if (i2 >= this._outBufferEnd) {
            this._out.write(this._outBuffer, 0, i2);
            this._outPtr = 0;
        }
        int i3;
        if (i < 128) {
            byte[] bArr = this._outBuffer;
            i3 = this._outPtr;
            this._outPtr = i3 + 1;
            bArr[i3] = (byte) i;
        } else {
            int i4;
            int i5 = this._outPtr;
            byte[] bArr2;
            if (i < DexStore.LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED) {
                bArr2 = this._outBuffer;
                i3 = i5 + 1;
                bArr2[i5] = (byte) ((i >> 6) | 192);
                i4 = i3 + 1;
                bArr2[i3] = (byte) ((i & 63) | 128);
            } else if (i <= 65535) {
                bArr2 = this._outBuffer;
                i4 = i5 + 1;
                bArr2[i5] = (byte) ((i >> 12) | 224);
                i3 = i4 + 1;
                bArr2[i4] = (byte) (((i >> 6) & 63) | 128);
                i4 = i3 + 1;
                bArr2[i3] = (byte) ((i & 63) | 128);
            } else {
                if (i > 1114111) {
                    illegalSurrogate(i);
                }
                bArr2 = this._outBuffer;
                i3 = i5 + 1;
                bArr2[i5] = (byte) ((i >> 18) | 240);
                i4 = i3 + 1;
                bArr2[i3] = (byte) (((i >> 12) & 63) | 128);
                i3 = i4 + 1;
                bArr2[i4] = (byte) (((i >> 6) & 63) | 128);
                i4 = i3 + 1;
                bArr2[i3] = (byte) ((i & 63) | 128);
            }
            this._outPtr = i4;
        }
    }

    public final void write(String str) {
        write(str, 0, str.length());
    }

    public final void write(String str, int i, int i2) {
        if (i2 < 2) {
            if (i2 == 1) {
                write(str.charAt(i));
            }
            return;
        }
        int i3;
        if (this._surrogate > 0) {
            i3 = i + 1;
            i2--;
            write(convertSurrogate(str.charAt(i)));
            i = i3;
        }
        i3 = this._outPtr;
        byte[] bArr = this._outBuffer;
        int i4 = this._outBufferEnd;
        i2 += i;
        while (i < i2) {
            int i5;
            int i6;
            if (i3 >= i4) {
                this._out.write(bArr, 0, i3);
                i3 = 0;
            }
            int i7 = i + 1;
            int charAt = str.charAt(i);
            if (charAt < 128) {
                i5 = i3 + 1;
                bArr[i3] = (byte) charAt;
                i6 = i2 - i7;
                int i8 = i4 - i5;
                if (i6 > i8) {
                    i6 = i8;
                }
                i6 += i7;
                while (true) {
                    i = i7;
                    i3 = i5;
                    if (i7 >= i6) {
                        break;
                    }
                    i7++;
                    charAt = str.charAt(i);
                    if (charAt >= 128) {
                        break;
                    }
                    i5++;
                    bArr[i3] = (byte) charAt;
                }
            }
            if (charAt < DexStore.LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED) {
                i6 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i3 = i6 + 1;
                bArr[i6] = (byte) ((charAt & 63) | 128);
                i = i7;
            } else {
                if (charAt >= 55296) {
                    if (charAt <= 57343) {
                        if (charAt > 56319) {
                            this._outPtr = i3;
                            illegalSurrogate(charAt);
                        }
                        this._surrogate = charAt;
                        if (i7 >= i2) {
                            break;
                        }
                        i = i7 + 1;
                        i7 = convertSurrogate(str.charAt(i7));
                        if (i7 > 1114111) {
                            this._outPtr = i3;
                            illegalSurrogate(i7);
                        }
                        i6 = i3 + 1;
                        bArr[i3] = (byte) ((i7 >> 18) | 240);
                        i3 = i6 + 1;
                        bArr[i6] = (byte) (((i7 >> 12) & 63) | 128);
                        i6 = i3 + 1;
                        bArr[i3] = (byte) (((i7 >> 6) & 63) | 128);
                        i3 = i6 + 1;
                        bArr[i6] = (byte) ((i7 & 63) | 128);
                    }
                }
                i5 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 12) | 224);
                i6 = i5 + 1;
                bArr[i5] = (byte) (((charAt >> 6) & 63) | 128);
                i3 = i6 + 1;
                bArr[i6] = (byte) ((charAt & 63) | 128);
                i = i7;
            }
        }
        this._outPtr = i3;
    }

    public final void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    public final void write(char[] cArr, int i, int i2) {
        if (i2 < 2) {
            if (i2 == 1) {
                write(cArr[i]);
            }
            return;
        }
        int i3;
        if (this._surrogate > 0) {
            i3 = i + 1;
            i2--;
            write(convertSurrogate(cArr[i]));
            i = i3;
        }
        i3 = this._outPtr;
        byte[] bArr = this._outBuffer;
        int i4 = this._outBufferEnd;
        i2 += i;
        while (i < i2) {
            int i5;
            int i6;
            if (i3 >= i4) {
                this._out.write(bArr, 0, i3);
                i3 = 0;
            }
            int i7 = i + 1;
            int i8 = cArr[i];
            if (i8 < 128) {
                i5 = i3 + 1;
                bArr[i3] = (byte) i8;
                i6 = i2 - i7;
                int i9 = i4 - i5;
                if (i6 > i9) {
                    i6 = i9;
                }
                i6 += i7;
                while (true) {
                    i = i7;
                    i3 = i5;
                    if (i7 >= i6) {
                        break;
                    }
                    i7++;
                    i8 = cArr[i];
                    if (i8 >= 128) {
                        break;
                    }
                    i5++;
                    bArr[i3] = (byte) i8;
                }
            }
            if (i8 < DexStore.LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED) {
                i6 = i3 + 1;
                bArr[i3] = (byte) ((i8 >> 6) | 192);
                i3 = i6 + 1;
                bArr[i6] = (byte) ((i8 & 63) | 128);
                i = i7;
            } else {
                if (i8 >= 55296) {
                    if (i8 <= 57343) {
                        if (i8 > 56319) {
                            this._outPtr = i3;
                            illegalSurrogate(i8);
                        }
                        this._surrogate = i8;
                        if (i7 >= i2) {
                            break;
                        }
                        i = i7 + 1;
                        i7 = convertSurrogate(cArr[i7]);
                        if (i7 > 1114111) {
                            this._outPtr = i3;
                            illegalSurrogate(i7);
                        }
                        i6 = i3 + 1;
                        bArr[i3] = (byte) ((i7 >> 18) | 240);
                        i3 = i6 + 1;
                        bArr[i6] = (byte) (((i7 >> 12) & 63) | 128);
                        i6 = i3 + 1;
                        bArr[i3] = (byte) (((i7 >> 6) & 63) | 128);
                        i3 = i6 + 1;
                        bArr[i6] = (byte) ((i7 & 63) | 128);
                    }
                }
                i5 = i3 + 1;
                bArr[i3] = (byte) ((i8 >> 12) | 224);
                i6 = i5 + 1;
                bArr[i5] = (byte) (((i8 >> 6) & 63) | 128);
                i3 = i6 + 1;
                bArr[i6] = (byte) ((i8 & 63) | 128);
                i = i7;
            }
        }
        this._outPtr = i3;
    }
}
