package pl.droidsonroids.gif;

import java.io.IOException;

public class GifIOException extends IOException {
    private static final long serialVersionUID = 13038402904505L;
    private final String mErrnoMessage;
    public final GifError reason;

    private GifIOException(int i, String str) {
        this.reason = GifError.fromCode(i);
        this.mErrnoMessage = str;
    }

    public static GifIOException fromCode(int i) {
        if (i == GifError.NO_ERROR.errorCode) {
            return null;
        }
        return new GifIOException(i, null);
    }

    public String getMessage() {
        if (this.mErrnoMessage == null) {
            return this.reason.getFormattedDescription();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.reason.getFormattedDescription());
        stringBuilder.append(": ");
        stringBuilder.append(this.mErrnoMessage);
        return stringBuilder.toString();
    }
}
