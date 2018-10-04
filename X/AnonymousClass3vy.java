package X;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3vy */
public final class AnonymousClass3vy implements AnonymousClass2yN {
    /* renamed from: B */
    private static final Pattern f47090B = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    public final Object BHA(Uri uri, InputStream inputStream) {
        Object readLine = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8"))).readLine();
        try {
            Matcher matcher = f47090B.matcher(readLine);
            if (matcher.matches()) {
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                uri = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1 : -1;
                    long parseLong = Long.parseLong(matcher.group(5));
                    Object group2 = matcher.group(7);
                    uri -= j * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0 : Long.parseLong(group2))) * 60) * 1000);
                }
                return Long.valueOf(uri);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Couldn't parse timestamp: ");
            stringBuilder.append(readLine);
            throw new AnonymousClass2uR(stringBuilder.toString());
        } catch (Throwable e) {
            throw new AnonymousClass2uR(e);
        }
    }
}
