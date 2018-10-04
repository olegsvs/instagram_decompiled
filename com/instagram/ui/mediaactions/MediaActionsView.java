package com.instagram.ui.mediaactions;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0E6;
import X.AnonymousClass0Nm;
import X.AnonymousClass0dw;
import X.AnonymousClass0pj;
import X.AnonymousClass0vX;
import X.AnonymousClass1Dt;
import X.AnonymousClass1H8;
import X.AnonymousClass1WP;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.videothumbnail.ThumbView;

public class MediaActionsView extends FrameLayout {
    /* renamed from: B */
    public ProgressBar f12019B;
    /* renamed from: C */
    public View f12020C;
    /* renamed from: D */
    public ScrubberPreviewThumbnailView f12021D;
    /* renamed from: E */
    public ViewStub f12022E;
    /* renamed from: F */
    public TextView f12023F;
    /* renamed from: G */
    public boolean f12024G;
    /* renamed from: H */
    public View f12025H;
    /* renamed from: I */
    public TextView f12026I;
    /* renamed from: J */
    public View f12027J;
    /* renamed from: K */
    private View f12028K;
    /* renamed from: L */
    private TextView f12029L;
    /* renamed from: M */
    private final Animation f12030M;
    /* renamed from: N */
    private View f12031N;
    /* renamed from: O */
    private final boolean f12032O;
    /* renamed from: P */
    private float f12033P;
    /* renamed from: Q */
    private boolean f12034Q;
    /* renamed from: R */
    private TransitionDrawable f12035R;
    /* renamed from: S */
    private final ViewStub f12036S;
    /* renamed from: T */
    private ImageView f12037T;
    /* renamed from: U */
    private AnonymousClass0pj f12038U;

    public MediaActionsView(Context context) {
        this(context, null);
    }

    public MediaActionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaActionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12038U = AnonymousClass0pj.HIDDEN;
        LayoutInflater.from(context).inflate(C0164R.layout.view_media_actions, this);
        this.f12036S = (ViewStub) findViewById(C0164R.id.video_actions_view_stub);
        this.f12030M = AnimationUtils.loadAnimation(getContext(), C0164R.anim.video_loading_indicator);
        this.f12032O = ((Boolean) AnonymousClass0E6.m1317C(AnonymousClass0CC.Vl)).booleanValue();
    }

    /* renamed from: A */
    public final void m8314A() {
        if (this.f12025H != null) {
            if (this.f12034Q) {
                this.f12035R.reverseTransition(0);
                this.f12034Q = false;
            }
            this.f12026I.setVisibility(8);
            m8311B(this, false);
            AnonymousClass1H8.m10614B(this.f12020C, 100, false);
            this.f12023F.setVisibility(8);
        }
    }

    /* renamed from: B */
    public final void m8315B() {
        if (this.f12025H != null) {
            if (this.f12034Q) {
                this.f12035R.reverseTransition(100);
                this.f12034Q = false;
            }
            AnonymousClass1H8.m10614B(this.f12026I, 100, false);
            m8311B(this, false);
            AnonymousClass1H8.m10614B(this.f12020C, 100, false);
            m8312C(this, false);
            ScrubberPreviewThumbnailView scrubberPreviewThumbnailView = this.f12021D;
            if (scrubberPreviewThumbnailView != null) {
                scrubberPreviewThumbnailView.setVisibility(8);
                ThumbView thumbView = this.f12021D.f12099C;
                thumbView.f12102D++;
            }
        }
    }

    /* renamed from: B */
    public static void m8311B(MediaActionsView mediaActionsView, boolean z) {
        mediaActionsView.f12019B.animate().scaleX(z ? 0.93f : 1.0f).y(z ? (float) mediaActionsView.getContext().getResources().getDimensionPixelOffset(C0164R.dimen.progress_bar_margin) : 0.0f).setDuration(160);
        mediaActionsView.f12019B.setProgressDrawable(AnonymousClass0Ca.m939E(mediaActionsView.getContext(), z ? C0164R.drawable.view_media_actions_progress_bar_progress_active : C0164R.drawable.view_media_actions_progress_bar_progress));
    }

    /* renamed from: C */
    public final void m8316C() {
        View view = this.f12025H;
        if (view != null) {
            view.setHapticFeedbackEnabled(true);
            this.f12025H.performHapticFeedback(0);
            m8311B(this, true);
            m8312C(this, true);
            ScrubberPreviewThumbnailView scrubberPreviewThumbnailView = this.f12021D;
            if (scrubberPreviewThumbnailView != null) {
                scrubberPreviewThumbnailView.setVisibility(0);
            }
        }
    }

    /* renamed from: C */
    public static void m8312C(MediaActionsView mediaActionsView, boolean z) {
        mediaActionsView.f12024G = true;
        mediaActionsView.f12023F.setVisibility(0);
        Animation animationSet = new AnimationSet(true);
        animationSet.addAnimation(new AlphaAnimation(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f));
        animationSet.addAnimation(new ScaleAnimation(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f, z ? 0.0f : 1.0f, z ? 1.0f : 0.0f, 1, mediaActionsView.getTimePillScalePivotX(), 1, 0.5f));
        animationSet.setDuration(160);
        animationSet.setAnimationListener(new AnonymousClass1WP(mediaActionsView, z));
        mediaActionsView.f12023F.clearAnimation();
        mediaActionsView.f12023F.setAnimation(animationSet);
    }

    /* renamed from: D */
    private void m8313D() {
        if (this.f12025H == null) {
            View inflate = this.f12036S.inflate();
            this.f12025H = inflate;
            this.f12035R = (TransitionDrawable) inflate.getBackground();
            View findViewById = this.f12025H.findViewById(C0164R.id.video_states);
            this.f12027J = findViewById;
            this.f12037T = (ImageView) findViewById.findViewById(C0164R.id.video_icon);
            this.f12029L = (TextView) this.f12027J.findViewById(C0164R.id.countdown_timer);
            this.f12028K = this.f12027J.findViewById(C0164R.id.caminner);
            this.f12031N = this.f12027J.findViewById(C0164R.id.retry);
            this.f12020C = this.f12025H.findViewById(C0164R.id.progress_bar_gradient);
            this.f12019B = (ProgressBar) this.f12025H.findViewById(C0164R.id.progress_bar);
            this.f12023F = (TextView) this.f12025H.findViewById(C0164R.id.time_pill);
            this.f12026I = (TextView) this.f12025H.findViewById(C0164R.id.video_controls_nux);
            this.f12033P = this.f12023F.getX();
            this.f12023F.setText(AnonymousClass0dw.m6137E(0));
            this.f12023F.setBackground(new AnonymousClass1Dt(getContext()));
            this.f12022E = (ViewStub) this.f12025H.findViewById(C0164R.id.thumbnail_preview_stub);
        }
    }

    /* renamed from: E */
    public final void m8317E() {
        if (this.f12025H != null) {
            AnonymousClass1H8.m10614B(this.f12026I, 100, false);
            this.f12035R.startTransition(100);
            this.f12034Q = true;
        }
    }

    /* renamed from: F */
    public final void m8318F() {
        if (this.f12025H != null) {
            AnonymousClass1H8.m10614B(this.f12027J, 250, false);
            AnonymousClass1H8.m10614B(this.f12020C, 100, true);
        }
    }

    /* renamed from: G */
    public final void m8319G(int i) {
        if (this.f12025H != null) {
            setProgress(i);
            AnonymousClass0vX anonymousClass0vX = this.f12021D;
            if (anonymousClass0vX != null) {
                ProgressBar progressBar = this.f12019B;
                if (progressBar != null) {
                    int progress = progressBar.getProgress();
                    int max = this.f12019B.getMax();
                    ThumbView thumbView = anonymousClass0vX.f12099C;
                    if (thumbView != null) {
                        thumbView.m8343C(progress, max);
                        anonymousClass0vX.f12099C.setScrubberThumbnailCallback(anonymousClass0vX);
                    }
                }
            }
        }
    }

    /* renamed from: H */
    public final void m8320H() {
        if (this.f12025H != null) {
            AnonymousClass1H8.m10614B(this.f12026I, 100, true);
        }
    }

    /* renamed from: I */
    public final void m8321I() {
        setProgress(0);
        ScrubberPreviewThumbnailView scrubberPreviewThumbnailView = this.f12021D;
        if (scrubberPreviewThumbnailView != null) {
            ThumbView.m8340B(scrubberPreviewThumbnailView.f12099C);
        }
    }

    /* renamed from: J */
    public final void m8322J(int i, int i2) {
        ProgressBar progressBar = this.f12019B;
        if (progressBar != null) {
            if (this.f12032O) {
                if (progressBar.getMax() != i2) {
                    this.f12019B.setMax(i2);
                }
                setProgress(i);
            }
        }
    }

    private float getTimePillScalePivotX() {
        return ((this.f12023F.getX() - this.f12033P) / ((float) this.f12023F.getWidth())) + 0.5f;
    }

    private void setProgress(int i) {
        ProgressBar progressBar = this.f12019B;
        if (progressBar != null && progressBar.getProgress() != i) {
            this.f12019B.setProgress(i);
            if (!this.f12024G) {
                this.f12023F.setText(AnonymousClass0dw.m6137E((long) i));
                float width = (((float) this.f12025H.getWidth()) * 0.06999999f) / 2.0f;
                float width2 = ((float) (this.f12025H.getWidth() - this.f12023F.getWidth())) - width;
                this.f12023F.setX(Math.min(Math.max((((((float) i) / ((float) this.f12019B.getMax())) * (((float) this.f12025H.getWidth()) * 0.93f)) + width) - ((float) (this.f12023F.getWidth() / 2)), width), width2));
            }
        }
    }

    public void setRemainingTime(int i) {
        TextView textView = this.f12029L;
        if (textView != null) {
            textView.setText(AnonymousClass0dw.m6137E((long) i));
        }
    }

    public void setVideoIconState(AnonymousClass0pj anonymousClass0pj) {
        if (this.f12038U != anonymousClass0pj) {
            m8313D();
            setVideoIconVisibility(anonymousClass0pj);
            if (this.f12027J.getVisibility() == 0 && anonymousClass0pj == AnonymousClass0pj.PROGRESS_BAR_ONLY) {
                AnonymousClass1H8.m10614B(this.f12027J, 250, false);
            } else if (!(this.f12027J.getVisibility() == 0 || anonymousClass0pj == AnonymousClass0pj.PROGRESS_BAR_ONLY)) {
                AnonymousClass1H8.m10614B(this.f12027J, 250, true);
            }
            this.f12025H.setVisibility(anonymousClass0pj == AnonymousClass0pj.HIDDEN ? 8 : 0);
            this.f12038U = anonymousClass0pj;
        }
    }

    private void setVideoIconVisibility(AnonymousClass0pj anonymousClass0pj) {
        Object obj;
        TextView textView;
        int i = 8;
        this.f12031N.setVisibility(anonymousClass0pj == AnonymousClass0pj.RETRY ? 0 : 8);
        if (anonymousClass0pj != AnonymousClass0pj.LOADING) {
            if (anonymousClass0pj != AnonymousClass0pj.AUTOPLAY) {
                obj = null;
                this.f12028K.setVisibility(obj == null ? 0 : 8);
                if (anonymousClass0pj == AnonymousClass0pj.PLAY) {
                    this.f12037T.setVisibility(0);
                    this.f12037T.setImageResource(C0164R.drawable.feed_play);
                } else if (obj == null) {
                    this.f12037T.setVisibility(0);
                    this.f12037T.setImageResource(C0164R.drawable.feed_camera);
                } else {
                    this.f12037T.setVisibility(8);
                }
                if (anonymousClass0pj != AnonymousClass0pj.LOADING) {
                    this.f12030M.reset();
                    this.f12028K.startAnimation(this.f12030M);
                } else {
                    this.f12028K.clearAnimation();
                }
                textView = this.f12029L;
                if (anonymousClass0pj == AnonymousClass0pj.TIMER) {
                    i = 0;
                }
                textView.setVisibility(i);
            }
        }
        obj = 1;
        if (obj == null) {
        }
        this.f12028K.setVisibility(obj == null ? 0 : 8);
        if (anonymousClass0pj == AnonymousClass0pj.PLAY) {
            this.f12037T.setVisibility(0);
            this.f12037T.setImageResource(C0164R.drawable.feed_play);
        } else if (obj == null) {
            this.f12037T.setVisibility(8);
        } else {
            this.f12037T.setVisibility(0);
            this.f12037T.setImageResource(C0164R.drawable.feed_camera);
        }
        if (anonymousClass0pj != AnonymousClass0pj.LOADING) {
            this.f12028K.clearAnimation();
        } else {
            this.f12030M.reset();
            this.f12028K.startAnimation(this.f12030M);
        }
        textView = this.f12029L;
        if (anonymousClass0pj == AnonymousClass0pj.TIMER) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public void setVisibility(int i) {
        if (i == 0 || !this.f12032O) {
            AnonymousClass1H8.m10614B(this.f12027J, 250, true);
            AnonymousClass0Nm.m3456i(this.f12025H, i);
            return;
        }
        AnonymousClass1H8.m10614B(this.f12027J, 250, false);
    }
}
