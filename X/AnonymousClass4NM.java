package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.4NM */
public final class AnonymousClass4NM {
    /* renamed from: B */
    public final IntentFilter f53351B;
    /* renamed from: C */
    public final BroadcastReceiver f53352C = new AnonymousClass4NL(this);

    public AnonymousClass4NM() {
        IntentFilter intentFilter = new IntentFilter();
        this.f53351B = intentFilter;
        intentFilter.addAction("com.android.music.metachanged");
        this.f53351B.addAction("com.android.music.playstatechanged");
        this.f53351B.addAction("com.htc.music.metachanged");
        this.f53351B.addAction("com.htc.music.playstatechanged");
        this.f53351B.addAction("fm.last.android.metachanged");
        this.f53351B.addAction("fm.last.android.playstatechanged");
        this.f53351B.addAction("com.sec.android.app.music.metachanged");
        this.f53351B.addAction("com.sec.android.app.music.playstatechanged");
        this.f53351B.addAction("com.nullsoft.winamp.metachanged");
        this.f53351B.addAction("com.nullsoft.winamp.playstatechanged");
        this.f53351B.addAction("com.amazon.mp3.metachanged");
        this.f53351B.addAction("com.amazon.mp3.playstatechanged");
        this.f53351B.addAction("com.miui.player.metachanged");
        this.f53351B.addAction("com.miui.player.playstatechanged");
        this.f53351B.addAction("com.real.IMP.metachanged");
        this.f53351B.addAction("com.real.IMP.playstatechanged");
        String str = "com.real.RealPlayer.playstatechanged";
        this.f53351B.addAction(str);
        this.f53351B.addAction(str);
        this.f53351B.addAction("com.sonyericsson.music.metachanged");
        this.f53351B.addAction("com.sonyericsson.music.playstatechanged");
        this.f53351B.addAction("com.samsung.sec.android.MusicPlayer.metachanged");
        this.f53351B.addAction("com.samsung.sec.android.MusicPlayer.playstatechanged");
        this.f53351B.addAction("com.samsung.music.metachanged");
        this.f53351B.addAction("com.samsung.music.playstatechanged");
        this.f53351B.addAction("com.samsung.sec.metachanged");
        this.f53351B.addAction("com.samsung.sec.playstatechanged");
        this.f53351B.addAction("com.samsung.sec.android.metachanged");
        this.f53351B.addAction("com.samsung.sec.android.playstatechanged");
        this.f53351B.addAction("com.samsung.MusicPlayer.metachanged");
        this.f53351B.addAction("com.samsung.MusicPlayer.playstatechanged");
        this.f53351B.addAction("com.spotify.music.metadatachanged");
        this.f53351B.addAction("com.spotify.music.playbackstatechanged");
        this.f53351B.addAction("com.rhapsody.metadatachanged");
        this.f53351B.addAction("com.rhapsody.playbackstatechanged");
    }
}
