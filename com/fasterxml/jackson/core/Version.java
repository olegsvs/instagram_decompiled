package com.fasterxml.jackson.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public final class Version implements Comparable, Serializable {
    private static final Version UNKNOWN_VERSION = new Version(0, 0, 0, null, null, null);
    public final String _artifactId;
    public final String _groupId;
    public final int _majorVersion;
    public final int _minorVersion;
    public final int _patchLevel;
    public final String _snapshotInfo;

    public Version(int i, int i2, int i3, String str, String str2, String str3) {
        this._majorVersion = i;
        this._minorVersion = i2;
        this._patchLevel = i3;
        this._snapshotInfo = str;
        if (str2 == null) {
            str2 = JsonProperty.USE_DEFAULT_NAME;
        }
        this._groupId = str2;
        if (str3 == null) {
            str3 = JsonProperty.USE_DEFAULT_NAME;
        }
        this._artifactId = str3;
    }

    public final int compareTo(Version version) {
        if (version == this) {
            return 0;
        }
        int compareTo = this._groupId.compareTo(version._groupId);
        if (compareTo == 0) {
            compareTo = this._artifactId.compareTo(version._artifactId);
            if (compareTo == 0) {
                compareTo = this._majorVersion - version._majorVersion;
                if (compareTo == 0) {
                    compareTo = this._minorVersion - version._minorVersion;
                    if (compareTo == 0) {
                        compareTo = this._patchLevel - version._patchLevel;
                    }
                }
            }
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    Version version = (Version) obj;
                    if (version._majorVersion != this._majorVersion || version._minorVersion != this._minorVersion || version._patchLevel != this._patchLevel || !version._artifactId.equals(this._artifactId) || !version._groupId.equals(this._groupId)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final String getArtifactId() {
        return this._artifactId;
    }

    public final int hashCode() {
        return this._artifactId.hashCode() ^ (((this._groupId.hashCode() + this._majorVersion) - this._minorVersion) + this._patchLevel);
    }

    public final boolean isSnapshot() {
        String str = this._snapshotInfo;
        return str != null && str.length() > 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this._majorVersion);
        stringBuilder.append('.');
        stringBuilder.append(this._minorVersion);
        stringBuilder.append('.');
        stringBuilder.append(this._patchLevel);
        if (isSnapshot()) {
            stringBuilder.append('-');
            stringBuilder.append(this._snapshotInfo);
        }
        return stringBuilder.toString();
    }

    public static Version unknownVersion() {
        return UNKNOWN_VERSION;
    }
}
