package X;

/* renamed from: X.60R */
public final class AnonymousClass60R {
    /* renamed from: B */
    public AnonymousClass60Q f70816B;
    /* renamed from: C */
    public boolean f70817C;
    /* renamed from: D */
    private String f70818D;
    /* renamed from: E */
    private final AnonymousClass0IU f70819E;

    public AnonymousClass60R(boolean z, String str, AnonymousClass0IU anonymousClass0IU) {
        AnonymousClass60Q anonymousClass60Q = AnonymousClass60Q.UNKNOWN;
        this.f70816B = anonymousClass60Q;
        this.f70817C = z;
        this.f70818D = str;
        this.f70819E = anonymousClass0IU;
        if (str != null) {
            String str2 = this.f70818D;
            Object obj = -1;
            switch (str2.hashCode()) {
                case -946046420:
                    if (str2.equals("inferred_general")) {
                        obj = 3;
                        break;
                    }
                    break;
                case 3615:
                    if (str2.equals("qp")) {
                        obj = 5;
                        break;
                    }
                    break;
                case 3752533:
                    if (str2.equals("entry_persistent_profile_prompt_general_school")) {
                        obj = 2;
                        break;
                    }
                    break;
                case 21668309:
                    if (str2.equals("entry_persistent_profile_prompt")) {
                        obj = 1;
                        break;
                    }
                    break;
                case 91607761:
                    if (str2.equals("entry_school_tag_on_edit_profile")) {
                        obj = 4;
                        break;
                    }
                    break;
                case 169606531:
                    if (str2.equals("inferred")) {
                        obj = null;
                        break;
                    }
                    break;
                default:
                    break;
            }
            switch (obj) {
                case null:
                case 1:
                    this.f70816B = AnonymousClass60Q.UPSELL_FLOW;
                    return;
                case 2:
                case 3:
                    this.f70816B = AnonymousClass60Q.UPSELL_GENERAL_FLOW;
                    return;
                case 4:
                    this.f70816B = AnonymousClass60Q.EDIT_SCHOOL_FLOW;
                    return;
                case 5:
                    this.f70816B = AnonymousClass60Q.QP_FLOW;
                    return;
                default:
                    this.f70816B = anonymousClass60Q;
                    return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final void m28748A() {
        /*
        r3 = this;
        r1 = r3.f70818D;
        r2 = 1;
        if (r1 == 0) goto L_0x0061;
    L_0x0005:
        r0 = r1.hashCode();
        switch(r0) {
            case -946046420: goto L_0x0049;
            case -347390998: goto L_0x003f;
            case -241363628: goto L_0x0035;
            case 3615: goto L_0x002b;
            case 21668309: goto L_0x0021;
            case 169606531: goto L_0x0017;
            case 1195341721: goto L_0x000d;
            default: goto L_0x000c;
        };
    L_0x000c:
        goto L_0x0053;
    L_0x000d:
        r0 = "invitation";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x0015:
        r0 = 2;
        goto L_0x0054;
    L_0x0017:
        r0 = "inferred";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x001f:
        r0 = 3;
        goto L_0x0054;
    L_0x0021:
        r0 = "entry_persistent_profile_prompt";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x0029:
        r0 = 5;
        goto L_0x0054;
    L_0x002b:
        r0 = "qp";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x0033:
        r0 = 6;
        goto L_0x0054;
    L_0x0035:
        r0 = "entry_add_school_on_edit_profile";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x003d:
        r0 = 0;
        goto L_0x0054;
    L_0x003f:
        r0 = "entry_school_tag_on_others_profile";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x0047:
        r0 = 1;
        goto L_0x0054;
    L_0x0049:
        r0 = "inferred_general";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0053;
    L_0x0051:
        r0 = 4;
        goto L_0x0054;
    L_0x0053:
        r0 = -1;
    L_0x0054:
        switch(r0) {
            case 0: goto L_0x005e;
            case 1: goto L_0x005b;
            case 2: goto L_0x005b;
            case 3: goto L_0x005b;
            case 4: goto L_0x005b;
            case 5: goto L_0x005b;
            case 6: goto L_0x0058;
            default: goto L_0x0057;
        };
    L_0x0057:
        goto L_0x0061;
    L_0x0058:
        r1 = "UPDATE_SCHOOL_DIRECTORY_BACK_STACK_NAME";
        goto L_0x0062;
    L_0x005b:
        r1 = "ADD_SCHOOL_INTRO_BACK_STACK_NAME";
        goto L_0x0062;
    L_0x005e:
        r1 = "EditProfileFragment.BACK_STACK_NAME";
        goto L_0x0062;
    L_0x0061:
        r1 = 0;
    L_0x0062:
        if (r1 == 0) goto L_0x0069;
    L_0x0064:
        r0 = r3.f70819E;
        r0.N(r1, r2);
    L_0x0069:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.60R.A():void");
    }
}
