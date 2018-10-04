package com.instagram.business.instantexperiences;

import X.AnonymousClass5dG;
import X.AnonymousClass5go;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserActivity;

public class InstantExperiencesLibImpl extends AnonymousClass5go {
    public Intent getInstantExperiencesIntent(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        Intent intent = new Intent(context, InstantExperiencesBrowserActivity.class);
        context = new Bundle();
        context.putString("IgSessionManager.USER_ID", str2);
        context.putString(AnonymousClass5dG.BUSINESS_ID.toString(), str);
        context.putString(AnonymousClass5dG.WEBSITE_URL.toString(), str3);
        context.putString(AnonymousClass5dG.SOURCE.toString(), str4);
        context.putString(AnonymousClass5dG.APP_ID.toString(), str6);
        context.putString(AnonymousClass5dG.SURFACE.toString(), str5);
        intent.putExtras(context);
        return intent;
    }
}
