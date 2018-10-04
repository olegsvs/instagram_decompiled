package X;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.62U */
public final class AnonymousClass62U extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f71175B;
    /* renamed from: C */
    private final AnonymousClass6Ha f71176C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass62U(Context context, AnonymousClass6Ha anonymousClass6Ha) {
        this.f71175B = context;
        this.f71176C = anonymousClass6Ha;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Context context;
        AnonymousClass61k anonymousClass61k;
        int I = AnonymousClass0cQ.I(this, -1040506858);
        AnonymousClass61s anonymousClass61s = (AnonymousClass61s) ((AnonymousClass62B) obj).f71130B;
        AnonymousClass0LH.E(anonymousClass61s);
        if (view == null) {
            context = this.f71175B;
            view = LayoutInflater.from(context).inflate(C0164R.layout.related_media_row, viewGroup, false);
            AnonymousClass62W anonymousClass62W = new AnonymousClass62W();
            anonymousClass62W.f71180D = (TextView) view.findViewById(C0164R.id.related_media_title);
            anonymousClass62W.f71179C = (TextView) view.findViewById(C0164R.id.related_media_action_button);
            anonymousClass62W.f71178B = (RecyclerView) view.findViewById(C0164R.id.tracked_content);
            AnonymousClass0la anonymousClass0rr = new AnonymousClass0rr(context, 0, false);
            anonymousClass0rr.f9543B = true;
            anonymousClass62W.f71178B.setLayoutManager(anonymousClass0rr);
            anonymousClass62W.f71178B.A(new AnonymousClass0ru(context.getResources().getDimensionPixelSize(C0164R.dimen.shopping_viewer_margin), context.getResources().getDimensionPixelSize(C0164R.dimen.horizontal_list_spacing)));
            view.setTag(anonymousClass62W);
        }
        context = this.f71175B;
        AnonymousClass62W anonymousClass62W2 = (AnonymousClass62W) view.getTag();
        AnonymousClass6Ha anonymousClass6Ha = this.f71176C;
        anonymousClass62W2.f71180D.setText(context.getResources().getString(C0164R.string.shopping_viewer_related_posts_title));
        if (anonymousClass61s.f71035C.size() <= 10) {
            if (anonymousClass61s.f71035C.size() != 10 || !anonymousClass61s.f71034B) {
                anonymousClass62W2.f71179C.setVisibility(8);
                anonymousClass61k = (AnonymousClass61k) anonymousClass62W2.f71178B.getAdapter();
                if (anonymousClass61k != null) {
                    AnonymousClass0nJ anonymousClass61k2 = new AnonymousClass61k(context, anonymousClass6Ha, AnonymousClass62X.f71181B);
                    anonymousClass61k2.m28798P(anonymousClass61s.f71035C);
                    anonymousClass62W2.f71178B.setAdapter(anonymousClass61k2);
                } else {
                    if ((anonymousClass61k.f71015D.equals(anonymousClass61s.f71035C) ^ 1) != 0) {
                        anonymousClass61k.m28798P(anonymousClass61s.f71035C);
                        anonymousClass62W2.f71178B.FA(0);
                    }
                }
                AnonymousClass0cQ.H(this, -1416812220, I);
                return view;
            }
        }
        anonymousClass62W2.f71179C.setText(context.getResources().getString(C0164R.string.see_all));
        anonymousClass62W2.f71179C.setVisibility(0);
        anonymousClass62W2.f71179C.setOnClickListener(new AnonymousClass62V(anonymousClass6Ha));
        anonymousClass61k = (AnonymousClass61k) anonymousClass62W2.f71178B.getAdapter();
        if (anonymousClass61k != null) {
            if ((anonymousClass61k.f71015D.equals(anonymousClass61s.f71035C) ^ 1) != 0) {
                anonymousClass61k.m28798P(anonymousClass61s.f71035C);
                anonymousClass62W2.f71178B.FA(0);
            }
        } else {
            AnonymousClass0nJ anonymousClass61k22 = new AnonymousClass61k(context, anonymousClass6Ha, AnonymousClass62X.f71181B);
            anonymousClass61k22.m28798P(anonymousClass61s.f71035C);
            anonymousClass62W2.f71178B.setAdapter(anonymousClass61k22);
        }
        AnonymousClass0cQ.H(this, -1416812220, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass62B anonymousClass62B = (AnonymousClass62B) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
