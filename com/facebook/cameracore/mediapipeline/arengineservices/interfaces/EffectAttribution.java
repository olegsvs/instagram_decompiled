package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

public class EffectAttribution {
    private final License[] mLicenses;

    public class AttributedAsset {
        private final String mAssetIdentifier;
        private final String mAssetURL;
        private final String mAuthor;
        private final String mNotes;
        private final String mTitle;

        public AttributedAsset(String str, String str2, String str3, String str4, String str5) {
            this.mAssetIdentifier = str;
            this.mTitle = str2;
            this.mAuthor = str3;
            this.mAssetURL = str4;
            this.mNotes = str5;
        }
    }

    public class License {
        private final AttributedAsset[] mAttributedAssets;
        private final String mIdentifier;
        private final String mName;
        private final String mUrl;

        public License(String str, String str2, String str3, AttributedAsset[] attributedAssetArr) {
            this.mIdentifier = str;
            this.mName = str2;
            this.mUrl = str3;
            this.mAttributedAssets = attributedAssetArr;
        }
    }

    public EffectAttribution(License[] licenseArr) {
        this.mLicenses = licenseArr;
    }
}
