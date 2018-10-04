package X;

import android.text.Editable;
import android.text.Selection;
import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.4QQ */
public final class AnonymousClass4QQ implements AnonymousClass2JW {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5TZ f53931B;
    /* renamed from: C */
    private String f53932C;

    public final void Pp() {
    }

    public final boolean ev(AnonymousClass1lB anonymousClass1lB) {
        return false;
    }

    public AnonymousClass4QQ(AnonymousClass5TZ anonymousClass5TZ) {
        this.f53931B = anonymousClass5TZ;
    }

    public final void Wz(ConstrainedEditText constrainedEditText, int i, int i2) {
        Editable text = constrainedEditText.getText();
        if (text.length() != 0) {
            CharSequence B = AnonymousClass4QY.m24186B(constrainedEditText);
            String obj = text.toString();
            if (AnonymousClass2CG.m14641B(B)) {
                Object obj2;
                AnonymousClass5TZ anonymousClass5TZ = this.f53931B;
                int C = AnonymousClass5TZ.C(text);
                int selectionEnd = Selection.getSelectionEnd(text);
                Object obj3 = 1;
                if (C >= 0) {
                    AnonymousClass2VP[] anonymousClass2VPArr = (AnonymousClass2VP[]) text.getSpans(C, selectionEnd, AnonymousClass2VP.class);
                    if (anonymousClass2VPArr.length > 0 && anonymousClass5TZ.f64511N.contains(anonymousClass2VPArr[0])) {
                        obj2 = 1;
                        if (obj2 == null) {
                            if (AnonymousClass5TZ.B(anonymousClass5TZ, text)) {
                                obj3 = null;
                            }
                        }
                        if (!(obj3 == null || obj.equals(this.f53932C))) {
                            this.f53931B.f64504G.filter(B);
                            this.f53931B.f64517T.m24187A(constrainedEditText, i, i2);
                            this.f53932C = obj;
                        }
                    }
                }
                obj2 = null;
                if (obj2 == null) {
                    if (AnonymousClass5TZ.B(anonymousClass5TZ, text)) {
                        obj3 = null;
                    }
                }
                this.f53931B.f64504G.filter(B);
                this.f53931B.f64517T.m24187A(constrainedEditText, i, i2);
                this.f53932C = obj;
            }
            AnonymousClass0nJ anonymousClass0nJ = this.f53931B.f64499B;
            anonymousClass0nJ.f53941B.clear();
            anonymousClass0nJ.notifyDataSetChanged();
            this.f53932C = obj;
        }
    }
}
