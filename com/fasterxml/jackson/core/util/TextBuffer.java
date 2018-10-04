package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.math.BigDecimal;
import java.util.ArrayList;

public final class TextBuffer {
    public static final char[] NO_CHARS = new char[0];
    private final BufferRecycler _allocator;
    private char[] _currentSegment;
    private int _currentSize;
    private boolean _hasSegments = false;
    private char[] _inputBuffer;
    private int _inputLen;
    private int _inputStart;
    private char[] _resultArray;
    private String _resultString;
    private int _segmentSize;
    private ArrayList _segments;

    public TextBuffer(BufferRecycler bufferRecycler) {
        this._allocator = bufferRecycler;
    }

    private static char[] _charArray(int i) {
        return new char[i];
    }

    public final void append(char c) {
        if (this._inputStart >= 0) {
            unshare(16);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr = this._currentSegment;
        if (this._currentSize >= cArr.length) {
            expand(1);
            cArr = this._currentSegment;
        }
        int i = this._currentSize;
        this._currentSize = i + 1;
        cArr[i] = c;
    }

    public final void append(String str, int i, int i2) {
        if (this._inputStart >= 0) {
            unshare(i2);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr = this._currentSegment;
        int length = cArr.length;
        int i3 = this._currentSize;
        length -= i3;
        if (length >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this._currentSize += i2;
            return;
        }
        if (length > 0) {
            int i4 = i + length;
            str.getChars(i, i4, cArr, i3);
            i2 -= length;
            i = i4;
        }
        while (true) {
            expand(i2);
            int min = Math.min(this._currentSegment.length, i2);
            length = i + min;
            str.getChars(i, length, this._currentSegment, 0);
            this._currentSize += min;
            i2 -= min;
            if (i2 > 0) {
                i = length;
            } else {
                return;
            }
        }
    }

    public final void append(char[] cArr, int i, int i2) {
        if (this._inputStart >= 0) {
            unshare(i2);
        }
        this._resultString = null;
        this._resultArray = null;
        Object obj = this._currentSegment;
        int length = obj.length;
        int i3 = this._currentSize;
        length -= i3;
        if (length >= i2) {
            System.arraycopy(cArr, i, obj, i3, i2);
            this._currentSize += i2;
            return;
        }
        if (length > 0) {
            System.arraycopy(cArr, i, obj, i3, length);
            i += length;
            i2 -= length;
        }
        do {
            expand(i2);
            int min = Math.min(this._currentSegment.length, i2);
            System.arraycopy(cArr, i, this._currentSegment, 0, min);
            this._currentSize += min;
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    private char[] buildResultArray() {
        String str = this._resultString;
        if (str != null) {
            return str.toCharArray();
        }
        int i;
        if (this._inputStart >= 0) {
            i = this._inputLen;
            if (i >= 1) {
                char[] _charArray = _charArray(i);
                System.arraycopy(this._inputBuffer, this._inputStart, _charArray, 0, this._inputLen);
                return _charArray;
            }
        }
        i = size();
        if (i >= 1) {
            int i2;
            _charArray = _charArray(i);
            ArrayList arrayList = this._segments;
            if (arrayList != null) {
                int size = arrayList.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    char[] cArr = (char[]) this._segments.get(i3);
                    i = cArr.length;
                    System.arraycopy(cArr, 0, _charArray, i2, i);
                    i2 += i;
                }
            } else {
                i2 = 0;
            }
            System.arraycopy(this._currentSegment, 0, _charArray, i2, this._currentSize);
            return _charArray;
        }
        return NO_CHARS;
    }

    private void clearSegments() {
        this._hasSegments = false;
        this._segments.clear();
        this._segmentSize = 0;
        this._currentSize = 0;
    }

    public final char[] contentsAsArray() {
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr;
        }
        cArr = buildResultArray();
        this._resultArray = cArr;
        return cArr;
    }

    public final BigDecimal contentsAsDecimal() {
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return new BigDecimal(cArr);
        }
        int i = this._inputStart;
        if (i >= 0) {
            return new BigDecimal(this._inputBuffer, i, this._inputLen);
        }
        if (this._segmentSize == 0) {
            return new BigDecimal(this._currentSegment, 0, this._currentSize);
        }
        return new BigDecimal(contentsAsArray());
    }

    public final double contentsAsDouble() {
        return NumberInput.parseDouble(contentsAsString());
    }

    public final String contentsAsString() {
        if (this._resultString == null) {
            char[] cArr = this._resultArray;
            if (cArr != null) {
                this._resultString = new String(cArr);
            } else {
                int i = this._inputStart;
                int i2;
                if (i >= 0) {
                    i2 = this._inputLen;
                    if (i2 < 1) {
                        String str = JsonProperty.USE_DEFAULT_NAME;
                        this._resultString = str;
                        return str;
                    }
                    this._resultString = new String(this._inputBuffer, i, i2);
                } else {
                    int i3 = this._segmentSize;
                    i2 = this._currentSize;
                    if (i3 == 0) {
                        String str2;
                        if (i2 == 0) {
                            str2 = JsonProperty.USE_DEFAULT_NAME;
                        } else {
                            str2 = new String(this._currentSegment, 0, i2);
                        }
                        this._resultString = str2;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder(i3 + i2);
                        ArrayList arrayList = this._segments;
                        if (arrayList != null) {
                            i = arrayList.size();
                            for (i2 = 0; i2 < i; i2++) {
                                cArr = (char[]) this._segments.get(i2);
                                stringBuilder.append(cArr, 0, cArr.length);
                            }
                        }
                        stringBuilder.append(this._currentSegment, 0, this._currentSize);
                        this._resultString = stringBuilder.toString();
                    }
                }
            }
        }
        return this._resultString;
    }

    public final char[] emptyAndGetCurrentSegment() {
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        char[] cArr = this._currentSegment;
        if (cArr != null) {
            return cArr;
        }
        cArr = findBuffer(0);
        this._currentSegment = cArr;
        return cArr;
    }

    private void expand(int i) {
        if (this._segments == null) {
            this._segments = new ArrayList();
        }
        Object obj = this._currentSegment;
        this._hasSegments = true;
        this._segments.add(obj);
        this._segmentSize += obj.length;
        int length = obj.length;
        int i2 = length >> 1;
        if (i2 >= i) {
            i = i2;
        }
        char[] _charArray = _charArray(Math.min(262144, length + i));
        this._currentSize = 0;
        this._currentSegment = _charArray;
    }

    public final char[] expandCurrentSegment() {
        int i;
        Object obj = this._currentSegment;
        int length = obj.length;
        if (length == 262144) {
            i = 262145;
        } else {
            i = Math.min(262144, (length >> 1) + length);
        }
        Object _charArray = _charArray(i);
        this._currentSegment = _charArray;
        System.arraycopy(obj, 0, _charArray, 0, length);
        return this._currentSegment;
    }

    private char[] findBuffer(int i) {
        BufferRecycler bufferRecycler = this._allocator;
        if (bufferRecycler != null) {
            return bufferRecycler.allocCharBuffer(CharBufferType.TEXT_BUFFER, i);
        }
        return new char[Math.max(i, JsonMappingException.MAX_REFS_TO_LIST)];
    }

    public final char[] finishCurrentSegment() {
        if (this._segments == null) {
            this._segments = new ArrayList();
        }
        this._hasSegments = true;
        this._segments.add(this._currentSegment);
        int length = this._currentSegment.length;
        this._segmentSize += length;
        char[] _charArray = _charArray(Math.min(length + (length >> 1), 262144));
        this._currentSize = 0;
        this._currentSegment = _charArray;
        return _charArray;
    }

    public final char[] getCurrentSegment() {
        if (this._inputStart >= 0) {
            unshare(1);
        } else {
            char[] cArr = this._currentSegment;
            if (cArr == null) {
                this._currentSegment = findBuffer(0);
            } else if (this._currentSize >= cArr.length) {
                expand(1);
            }
        }
        return this._currentSegment;
    }

    public final int getCurrentSegmentSize() {
        return this._currentSize;
    }

    public final char[] getTextBuffer() {
        if (this._inputStart >= 0) {
            return this._inputBuffer;
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr;
        }
        String str = this._resultString;
        if (str != null) {
            cArr = str.toCharArray();
            this._resultArray = cArr;
            return cArr;
        } else if (this._hasSegments) {
            return contentsAsArray();
        } else {
            return this._currentSegment;
        }
    }

    public final int getTextOffset() {
        int i = this._inputStart;
        return i >= 0 ? i : 0;
    }

    public final void releaseBuffers() {
        if (this._allocator == null) {
            resetWithEmpty();
        } else if (this._currentSegment != null) {
            resetWithEmpty();
            char[] cArr = this._currentSegment;
            this._currentSegment = null;
            this._allocator.releaseCharBuffer(CharBufferType.TEXT_BUFFER, cArr);
        }
    }

    public final void resetWithCopy(char[] cArr, int i, int i2) {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        } else if (this._currentSegment == null) {
            this._currentSegment = findBuffer(i2);
        }
        this._segmentSize = 0;
        this._currentSize = 0;
        append(cArr, i, i2);
    }

    public final void resetWithEmpty() {
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
    }

    public final void resetWithShared(char[] cArr, int i, int i2) {
        this._resultString = null;
        this._resultArray = null;
        this._inputBuffer = cArr;
        this._inputStart = i;
        this._inputLen = i2;
        if (this._hasSegments) {
            clearSegments();
        }
    }

    public final void resetWithString(String str) {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = str;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        this._currentSize = 0;
    }

    public final void setCurrentLength(int i) {
        this._currentSize = i;
    }

    public final int size() {
        if (this._inputStart >= 0) {
            return this._inputLen;
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this._resultString;
        if (str != null) {
            return str.length();
        }
        return this._segmentSize + this._currentSize;
    }

    public final String toString() {
        return contentsAsString();
    }

    private void unshare(int i) {
        int i2 = this._inputLen;
        this._inputLen = 0;
        Object obj = this._inputBuffer;
        this._inputBuffer = null;
        int i3 = this._inputStart;
        this._inputStart = -1;
        i += i2;
        char[] cArr = this._currentSegment;
        if (cArr == null || i > cArr.length) {
            this._currentSegment = findBuffer(i);
        }
        if (i2 > 0) {
            System.arraycopy(obj, i3, this._currentSegment, 0, i2);
        }
        this._segmentSize = 0;
        this._currentSize = i2;
    }
}
