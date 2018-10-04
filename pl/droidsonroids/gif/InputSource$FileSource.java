package pl.droidsonroids.gif;

import X.AnonymousClass2Nl;

public final class InputSource$FileSource extends AnonymousClass2Nl {
    private final String mPath;

    public InputSource$FileSource(String str) {
        this.mPath = str;
    }

    public GifInfoHandle open() {
        return new GifInfoHandle(this.mPath);
    }
}
