package com.instagram.modal;

import X.AnonymousClass0CB;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0F9;
import X.AnonymousClass0GO;
import X.AnonymousClass0Gn;
import X.AnonymousClass0HI;
import X.AnonymousClass0Hx;
import X.AnonymousClass0IL;
import X.AnonymousClass0IY;
import X.AnonymousClass0IZ;
import X.AnonymousClass0Ib;
import X.AnonymousClass0J5;
import X.AnonymousClass0J7;
import X.AnonymousClass0JK;
import X.AnonymousClass0JQ;
import X.AnonymousClass0JU;
import X.AnonymousClass0Jb;
import X.AnonymousClass0Jd;
import X.AnonymousClass0Jf;
import X.AnonymousClass0Jj;
import X.AnonymousClass0Jl;
import X.AnonymousClass0Jn;
import X.AnonymousClass0Jr;
import X.AnonymousClass0Jv;
import X.AnonymousClass0T4;
import X.AnonymousClass0br;
import X.AnonymousClass0bx;
import X.AnonymousClass0cQ;
import X.AnonymousClass0x6;
import X.AnonymousClass1Ee;
import X.AnonymousClass1Q0;
import X.AnonymousClass1Rm;
import X.AnonymousClass1W2;
import X.AnonymousClass1Xa;
import X.AnonymousClass237;
import X.AnonymousClass26j;
import X.AnonymousClass2CP;
import X.AnonymousClass3Im;
import X.AnonymousClass3Ip;
import X.AnonymousClass3Qs;
import X.AnonymousClass453;
import X.AnonymousClass49x;
import X.AnonymousClass4KA;
import X.AnonymousClass4Zh;
import X.AnonymousClass4Zk;
import X.AnonymousClass4ah;
import X.AnonymousClass4cn;
import X.AnonymousClass4e3;
import X.AnonymousClass4tE;
import X.AnonymousClass56X;
import X.AnonymousClass5Fw;
import X.AnonymousClass5IH;
import X.AnonymousClass5IK;
import X.AnonymousClass5Uc;
import X.AnonymousClass5Uw;
import X.AnonymousClass5VR;
import X.AnonymousClass5VZ;
import X.AnonymousClass5Vp;
import X.AnonymousClass5bq;
import X.AnonymousClass5un;
import X.AnonymousClass5vB;
import X.AnonymousClass5vH;
import X.AnonymousClass5vK;
import X.AnonymousClass5va;
import X.AnonymousClass5vh;
import X.AnonymousClass5y4;
import X.AnonymousClass5yf;
import X.AnonymousClass5yt;
import X.AnonymousClass6FI;
import X.AnonymousClass6GM;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.C0164R;
import com.facebook.forker.Process;
import com.instagram.archive.fragment.ArchiveHomeFragment;
import com.instagram.archive.fragment.ManageHighlightsFragment;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;
import com.instagram.direct.fragment.inbox.DirectSearchInboxFragment;
import com.instagram.direct.fragment.visual.DirectVisualMessageViewerFragment;
import com.instagram.igtv.viewer.IGTVViewerFragment;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.reels.fragment.ArchiveReelShareFragment;
import com.instagram.reels.fragment.ReelMoreOptionsFragment;
import com.instagram.reels.fragment.ReelViewerFragment;
import com.instagram.reels.friendlist.view.FriendListFragment;
import com.instagram.service.session.ShouldInitUserSession;
import com.instagram.video.live.livewith.fragment.IgLiveWithGuestFragment;
import java.util.HashSet;
import java.util.Set;

@ShouldInitUserSession
public class ModalActivity extends BaseFragmentActivity {
    /* renamed from: D */
    public static final int[] f5023D = (VERSION.SDK_INT > 25 ? new int[]{C0164R.anim.empty_anim, C0164R.anim.empty_anim, C0164R.anim.empty_anim, C0164R.anim.empty_anim} : new int[]{0, 0, 0, 0});
    /* renamed from: B */
    private final Set f5024B = new HashSet();
    /* renamed from: C */
    private AnonymousClass0Cm f5025C;

    /* renamed from: B */
    private int[] m4407B() {
        int[] intArrayExtra = getIntent().getIntArrayExtra("fragment_animation");
        return (intArrayExtra == null || intArrayExtra.length != 4) ? null : intArrayExtra;
    }

    /* renamed from: T */
    public final void mo394T() {
        if (mo382D().mo1453E(C0164R.id.layout_container_main) == null) {
            String stringExtra = getIntent().getStringExtra("fragment_name");
            Bundle bundleExtra = getIntent().getBundleExtra("fragment_arguments");
            AnonymousClass0IL anonymousClass0IL = null;
            if ("branded_content_violation_alert".equals(stringExtra)) {
                anonymousClass0IL = AnonymousClass0IY.m2265B().m2274I(bundleExtra);
            } else {
                if (!RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(stringExtra)) {
                    if (!"direct_pick_recipients".equals(stringExtra)) {
                        if ("direct_permissions_inbox".equals(stringExtra)) {
                            AnonymousClass0J7.f2895B.mo533O();
                            anonymousClass0IL = new AnonymousClass5Uw();
                        } else if ("reel_settings".equals(stringExtra)) {
                            anonymousClass0IL = AnonymousClass0Jd.f2931B.mo634H().m4340B();
                        } else if ("favorites_home".equals(stringExtra)) {
                            anonymousClass0IL = AnonymousClass0x6.f12474B.mo1982A();
                        } else if ("favorites_nux".equals(stringExtra)) {
                            anonymousClass0IL = AnonymousClass0x6.f12474B.mo1985D();
                        } else if ("archive_reel_share".equals(stringExtra)) {
                            AnonymousClass0Jd.f2931B.mo634H();
                            anonymousClass0IL = new ArchiveReelShareFragment();
                            anonymousClass0IL.setArguments(bundleExtra);
                        } else if ("livewith_guest".equals(stringExtra)) {
                            AnonymousClass0JQ.f2915B.mo568G();
                            anonymousClass0IL = new IgLiveWithGuestFragment();
                        } else if ("reel_more options".equals(stringExtra)) {
                            AnonymousClass0Jd.f2931B.mo634H();
                            anonymousClass0IL = new ReelMoreOptionsFragment();
                            anonymousClass0IL.setArguments(new Bundle());
                        } else if ("direct_quick_reply_camera_fragment".equals(stringExtra)) {
                            AnonymousClass0J7.f2895B.mo533O();
                            anonymousClass0IL = new AnonymousClass4Zk();
                        } else if ("direct_visual_reply_fragment".equals(stringExtra)) {
                            AnonymousClass0J7.f2895B.mo533O();
                            anonymousClass0IL = new AnonymousClass1Q0();
                        } else if ("direct_quick_camera_fragment".equals(stringExtra)) {
                            AnonymousClass0J7.f2895B.mo533O();
                            anonymousClass0IL = new AnonymousClass4Zh();
                        } else if ("direct_expiring_media_viewer".equals(stringExtra)) {
                            AnonymousClass0J7.f2895B.mo533O();
                            anonymousClass0IL = new DirectVisualMessageViewerFragment();
                        } else if ("direct_private_story_recipients".equals(stringExtra)) {
                            AnonymousClass0J7.f2895B.mo533O();
                            AnonymousClass0Cm anonymousClass0Cm = this.f5025C;
                            AnonymousClass3Im anonymousClass4e3 = new AnonymousClass4e3(bundleExtra);
                            anonymousClass4e3.f39972B.putString("IgSessionManager.USER_ID", anonymousClass0Cm.f1759C);
                            anonymousClass0IL = anonymousClass4e3.B();
                        } else if ("direct_story_create_group".equals(stringExtra)) {
                            AnonymousClass0J7.f2895B.mo533O();
                            anonymousClass0IL = new AnonymousClass5Vp();
                        } else if ("direct_search_inbox_fragment".equals(stringExtra)) {
                            AnonymousClass0J7.f2895B.mo533O();
                            anonymousClass0IL = new DirectSearchInboxFragment();
                        } else {
                            if (!"direct_app_search_reels_fragment".equals(stringExtra)) {
                                if (!"direct_app_invites".equals(stringExtra)) {
                                    if ("direct_add_members".equals(stringExtra)) {
                                        AnonymousClass0J7.f2895B.mo533O();
                                        anonymousClass0IL = new AnonymousClass5VZ();
                                    } else if ("direct_thread_detail".equals(stringExtra)) {
                                        AnonymousClass0J7.f2895B.mo533O();
                                        anonymousClass0IL = new AnonymousClass5VR();
                                    } else if ("gdpr_consent".equals(stringExtra)) {
                                        AnonymousClass0Jr.f2946B.mo669A();
                                        anonymousClass0IL = new AnonymousClass5bq();
                                        anonymousClass0IL.setArguments(bundleExtra);
                                    } else if ("qp_full_screen".equals(stringExtra)) {
                                        AnonymousClass0Jv.f2949B.mo680J();
                                        anonymousClass0IL = new AnonymousClass0T4();
                                        anonymousClass0IL.setArguments(bundleExtra);
                                    } else if ("hashtag_feed".equals(stringExtra)) {
                                        AnonymousClass3Qs.f41179B.A();
                                        anonymousClass0IL = new AnonymousClass4tE();
                                    } else if ("location_feed".equals(stringExtra)) {
                                        AnonymousClass0Ib.f2781B.mo613B();
                                        anonymousClass0IL = new AnonymousClass1Xa();
                                    } else if ("reel_viewer".equals(stringExtra)) {
                                        AnonymousClass0Jd.f2931B.mo634H();
                                        anonymousClass0IL = new ReelViewerFragment();
                                    } else if ("attribution_quick_camera_fragment".equals(stringExtra)) {
                                        AnonymousClass0Hx.f2719B.mo558A();
                                        anonymousClass0IL = new AnonymousClass4KA();
                                    } else if ("location_picker".equals(stringExtra)) {
                                        AnonymousClass0Hx.f2719B.mo558A();
                                        anonymousClass0IL = new AnonymousClass5Uc();
                                    } else if ("shopping_viewer".equals(stringExtra)) {
                                        anonymousClass0IL = AnonymousClass0Jn.f2942B.mo663A().m4399A(bundleExtra);
                                    } else if ("shopping_editable_feed".equals(stringExtra)) {
                                        AnonymousClass0Jn.f2942B.mo663A();
                                        anonymousClass0IL = new AnonymousClass6FI();
                                    } else if ("shopping_product_tag_search".equals(stringExtra)) {
                                        AnonymousClass0Jn.f2942B.mo663A();
                                        anonymousClass0IL = new AnonymousClass453();
                                    } else if ("profile".equals(stringExtra)) {
                                        String string = bundleExtra.getString("UserDetailFragment.EXTRA_USER_ID");
                                        String string2 = bundleExtra.getString("UserDetailFragment.EXTRA_USER_NAME");
                                        AnonymousClass0bx C;
                                        if (string != null) {
                                            C = AnonymousClass0bx.m5660C(this.f5025C, string, "modal_activity");
                                            C.f6905E = bundleExtra;
                                            anonymousClass0IL = AnonymousClass0Jj.f2938B.mo659B().m4355D(C.m5662A());
                                        } else if (string2 != null) {
                                            C = AnonymousClass0bx.m5661D(this.f5025C, string2, "modal_activity");
                                            C.f6905E = bundleExtra;
                                            anonymousClass0IL = AnonymousClass0Jj.f2938B.mo659B().m4355D(C.m5662A());
                                        }
                                    } else if ("profile_photo".equals(stringExtra)) {
                                        AnonymousClass0GO.m1803C().mo343A();
                                        anonymousClass0IL = new AnonymousClass56X();
                                        Bundle bundle = new Bundle();
                                        bundle.putBoolean("extra_standalone", true);
                                        anonymousClass0IL.setArguments(bundle);
                                    } else if ("quick_camera".equals(stringExtra)) {
                                        AnonymousClass0Hx.f2719B.mo558A();
                                        anonymousClass0IL = new AnonymousClass0br();
                                    } else if ("reel_dashboard_add_to_story_camera".equals(stringExtra)) {
                                        AnonymousClass0Jd.f2931B.mo634H();
                                        anonymousClass0IL = new AnonymousClass5un();
                                    } else if ("reel_poll_share_result_camera".equals(stringExtra)) {
                                        AnonymousClass0Jd.f2931B.mo634H();
                                        anonymousClass0IL = new AnonymousClass5va();
                                    } else if ("reel_feed_post_share".equals(stringExtra)) {
                                        AnonymousClass0Jd.f2931B.mo634H();
                                        anonymousClass0IL = new AnonymousClass5vB();
                                    } else if ("reel_highlight_share".equals(stringExtra)) {
                                        AnonymousClass0Jd.f2931B.mo634H();
                                        anonymousClass0IL = new AnonymousClass5vH();
                                    } else if ("reel_mention_reshare".equals(stringExtra)) {
                                        AnonymousClass0Jd.f2931B.mo634H();
                                        anonymousClass0IL = new AnonymousClass5vK();
                                    } else if ("saved_feed".equals(stringExtra)) {
                                        AnonymousClass0Jf.f2933B.mo651A();
                                        anonymousClass0IL = new AnonymousClass5yf();
                                    } else if ("selectable_saved_feed".equals(stringExtra)) {
                                        AnonymousClass0Jf.f2933B.mo651A();
                                        anonymousClass0IL = new AnonymousClass5yt();
                                    } else if ("create_collection".equals(stringExtra)) {
                                        AnonymousClass0Jf.f2933B.mo651A();
                                        anonymousClass0IL = new AnonymousClass5y4();
                                    } else if ("iglive_capture".equals(stringExtra)) {
                                        AnonymousClass0JQ.f2915B.mo568G();
                                        anonymousClass0IL = new AnonymousClass6GM();
                                        anonymousClass0IL.setArguments(bundleExtra);
                                    } else if ("nametag".equals(stringExtra)) {
                                        AnonymousClass0J5.f2887B.mo511B();
                                        anonymousClass0IL = new AnonymousClass49x();
                                    } else if ("sms_verify".equals(stringExtra)) {
                                        anonymousClass0IL = AnonymousClass0GO.m1803C().mo343A().m3661I();
                                    } else if ("phone_number_entry".equals(stringExtra)) {
                                        anonymousClass0IL = AnonymousClass0GO.m1803C().mo343A().m3660H(this.f5025C);
                                    } else if ("developer_options".equals(stringExtra)) {
                                        DeveloperOptionsLauncher.loadAndLaunchDeveloperOptions(getApplicationContext(), mo382D(), this, this.f5025C, bundleExtra);
                                    } else {
                                        AnonymousClass0IL anonymousClass0IL2;
                                        if ("analytics_events_list".equals(stringExtra)) {
                                            try {
                                                anonymousClass0IL2 = (AnonymousClass0IL) Class.forName("com.instagram.analytics.eventlog.EventLogListFragment").newInstance();
                                            } catch (Throwable e) {
                                                AnonymousClass0Gn.m1885L("ModalActivity", e);
                                            }
                                        } else if ("nav_stack_list".equals(stringExtra)) {
                                            try {
                                                anonymousClass0IL2 = (AnonymousClass0IL) Class.forName("com.instagram.analytics.navigation.debug.ModuleStackFragment").newInstance();
                                            } catch (Throwable e2) {
                                                AnonymousClass0Gn.m1885L("ModalActivity", e2);
                                            }
                                        } else if ("qe_settings".equals(stringExtra)) {
                                            try {
                                                anonymousClass0IL2 = (AnonymousClass0IL) Class.forName("com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment").newInstance();
                                            } catch (Throwable e22) {
                                                AnonymousClass0Gn.m1885L("ModalActivity", e22);
                                            }
                                        } else if ("zero_video_setting".equals(stringExtra)) {
                                            anonymousClass0IL = AnonymousClass0IY.m2265B().m2303l(this.f5025C);
                                        } else if ("archive_home".equals(stringExtra)) {
                                            AnonymousClass0JK.f2907B.mo553C();
                                            anonymousClass0IL = new ArchiveHomeFragment();
                                        } else if ("archive_reels".equals(stringExtra)) {
                                            anonymousClass0IL = AnonymousClass0JK.f2907B.mo553C().m3799A(bundleExtra);
                                        } else if ("manage_highlights".equals(stringExtra)) {
                                            AnonymousClass0JK.f2907B.mo553C();
                                            anonymousClass0IL = new ManageHighlightsFragment();
                                            anonymousClass0IL.setArguments(bundleExtra);
                                        } else if ("rapid_feedback".equals(stringExtra)) {
                                            anonymousClass0IL = AnonymousClass0IY.m2265B().m2295d(bundleExtra);
                                        } else if ("igtv".equals(stringExtra)) {
                                            AnonymousClass2CP.f27395B.D();
                                            anonymousClass0IL = new IGTVViewerFragment();
                                            if (bundleExtra != null) {
                                                anonymousClass0IL.setArguments(bundleExtra);
                                            }
                                        } else if ("igtv_settings".equals(stringExtra)) {
                                            AnonymousClass2CP.f27395B.D();
                                            anonymousClass0IL = new AnonymousClass1W2();
                                        } else if ("user_options".equals(stringExtra)) {
                                            AnonymousClass0Jl.f2940B.mo662A();
                                            anonymousClass0IL = new AnonymousClass5IH();
                                        } else if ("user_options_redesign".equals(stringExtra)) {
                                            AnonymousClass0Jl.f2940B.mo662A();
                                            anonymousClass0IL = new AnonymousClass5IK();
                                        } else if ("activity_status_options".equals(stringExtra)) {
                                            AnonymousClass0Jl.f2940B.mo662A();
                                            anonymousClass0IL = new AnonymousClass5Fw();
                                            anonymousClass0IL.setArguments(bundleExtra);
                                        } else if ("comments".equals(stringExtra)) {
                                            AnonymousClass0Jb.f2929B.mo619B();
                                            anonymousClass0IL = new AnonymousClass1Rm(bundleExtra).DD();
                                        } else if ("direct_edit_quick_reply".equals(stringExtra)) {
                                            AnonymousClass0J7.f2895B.mo533O();
                                            anonymousClass0IL = new AnonymousClass4ah();
                                        } else if ("reel_question_response_share".equals(stringExtra)) {
                                            AnonymousClass0Jd.f2931B.mo634H();
                                            anonymousClass0IL = new AnonymousClass5vh();
                                        } else if ("friend_list_editor".equals(stringExtra)) {
                                            AnonymousClass0Hx.f2719B.mo558A();
                                            anonymousClass0IL = new FriendListFragment();
                                            anonymousClass0IL.setArguments(bundleExtra);
                                        } else if ("search_find_friends".equals(stringExtra)) {
                                            anonymousClass0IL = AnonymousClass0JU.f2920B.mo597E().m4234B(this.f5025C);
                                        } else if ("discover_connect_contacts".equals(stringExtra)) {
                                            anonymousClass0IL = AnonymousClass3Ip.f39973B.A().A(2);
                                        } else if ("discover_connect_facebook".equals(stringExtra)) {
                                            anonymousClass0IL = AnonymousClass3Ip.f39973B.A().A(1);
                                        }
                                        anonymousClass0IL = anonymousClass0IL2;
                                    }
                                }
                            }
                            AnonymousClass0J7.f2895B.mo533O();
                            throw new IllegalStateException("Should not be able to access this from main ig app");
                        }
                    }
                }
                AnonymousClass0J7.f2895B.mo533O();
                anonymousClass0IL = new AnonymousClass4cn();
            }
            if (anonymousClass0IL != null) {
                if (anonymousClass0IL instanceof AnonymousClass1Ee) {
                    ((AnonymousClass1Ee) anonymousClass0IL).m10220D(mo382D(), "dialog_fragment");
                } else {
                    AnonymousClass0IZ.m2304B(new AnonymousClass0IZ(this).m2312F(anonymousClass0IL, bundleExtra).m2305C(), AnonymousClass237.f25448C);
                }
                setRequestedOrientation(1);
            }
        }
    }

    public final void finish() {
        super.finish();
        int[] B = m4407B();
        if (B != null) {
            overridePendingTransition(B[2], B[3]);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f5024B.remove(Integer.valueOf(i))) {
            AnonymousClass0IL E = mo382D().mo1453E(C0164R.id.layout_container_main);
            if (E != null) {
                E.onActivityResult(i, i2, intent);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.m5852B(this, 974291974);
        AnonymousClass0F9.m1509C().m1517G(this);
        this.f5025C = AnonymousClass0Ce.m951H(this);
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("translucent_navigation_bar", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("will_hide_system_ui", false);
        if (booleanExtra && VERSION.SDK_INT >= 19) {
            getWindow().addFlags(134217728);
            getWindow().addFlags(Process.WAIT_RESULT_TIMEOUT);
        } else if (!booleanExtra2) {
            findViewById(C0164R.id.layout_container_parent).setFitsSystemWindows(true);
            getWindow().getDecorView().setSystemUiVisibility(1280);
        }
        int[] B2 = m4407B();
        if (B2 != null) {
            overridePendingTransition(B2[0], B2[1]);
        }
        AnonymousClass0cQ.m5853C(this, 23611305, B);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!AnonymousClass0CB.m834D() || ((i != 82 && keyEvent.getScanCode() != 64) || !AnonymousClass26j.B())) {
            return super.onKeyDown(i, keyEvent);
        }
        AnonymousClass0HI.m1976C(this, AnonymousClass0Ce.m951H(this)).mo376A();
        return true;
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        this.f5024B.add(Integer.valueOf(i));
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }
}
