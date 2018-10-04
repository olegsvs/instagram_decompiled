package org.webrtc;

public class Size {
    public int height;
    public int width;

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        if (this.width == size.width && this.height == size.height) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.width * 65537) + 1) + this.height;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.width);
        stringBuilder.append("x");
        stringBuilder.append(this.height);
        return stringBuilder.toString();
    }
}
