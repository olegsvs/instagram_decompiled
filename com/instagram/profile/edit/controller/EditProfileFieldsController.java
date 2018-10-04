package com.instagram.profile.edit.controller;

import X.AnonymousClass0Cm;
import X.AnonymousClass0Fz;
import X.AnonymousClass0LH;
import X.AnonymousClass2Ed;
import X.AnonymousClass5nQ;
import X.AnonymousClass5nS;
import X.AnonymousClass6EF;
import X.AnonymousClass6EG;
import X.AnonymousClass6EI;
import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.iig.components.form.IgFormField;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EditProfileFieldsController implements AnonymousClass5nQ {
    /* renamed from: B */
    public final AnonymousClass0Fz f73125B;
    /* renamed from: C */
    public AnonymousClass5nS f73126C;
    /* renamed from: D */
    public AnonymousClass2Ed f73127D;
    /* renamed from: E */
    public final AnonymousClass0Cm f73128E;
    /* renamed from: F */
    public final Map f73129F = new HashMap();
    /* renamed from: G */
    private AnonymousClass6EI f73130G;
    public Context mContext;
    public IgFormField mNameField;
    public IgFormField mUsernameField;

    public final String vT() {
        return JsonProperty.USE_DEFAULT_NAME;
    }

    public EditProfileFieldsController(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Fz anonymousClass0Fz) {
        this.f73128E = anonymousClass0Cm;
        this.f73125B = anonymousClass0Fz;
    }

    public final boolean RY() {
        return this.mUsernameField.getText().length() != 0;
    }

    public final void Ry(Bundle bundle) {
        IgFormField igFormField = this.mNameField;
        if (igFormField != null) {
            bundle.putString("bundle_name_field", igFormField.getText().toString());
        }
        igFormField = this.mUsernameField;
        if (igFormField != null) {
            bundle.putString("bundle_username_field", igFormField.getText().toString());
        }
    }

    public final void St() {
        IgFormField igFormField = this.mNameField;
        TextWatcher textWatcher = this.f73130G.f73145L;
        Set set = igFormField.f68581F;
        if (set != null) {
            set.remove(textWatcher);
        }
        igFormField.f68577B.removeTextChangedListener(textWatcher);
        igFormField = this.mUsernameField;
        textWatcher = this.f73130G.f73145L;
        set = igFormField.f68581F;
        if (set != null) {
            set.remove(textWatcher);
        }
        igFormField.f68577B.removeTextChangedListener(textWatcher);
    }

    public final void YHA(Bundle bundle, AnonymousClass2Ed anonymousClass2Ed) {
        this.f73127D = (AnonymousClass2Ed) AnonymousClass0LH.E(anonymousClass2Ed);
        if (bundle != null) {
            CharSequence string = bundle.getString("bundle_name_field");
            if (string != null) {
                this.mNameField.setText(string);
            }
            string = bundle.getString("bundle_username_field");
            if (string != null) {
                this.mUsernameField.setText(string);
                return;
            }
            return;
        }
        this.mNameField.setText(anonymousClass2Ed.f27896H);
        this.mUsernameField.setText(this.f73127D.f27904P);
    }

    public final void gi() {
        EditProfileFieldsControllerLifecycleUtil.cleanupReferences(this);
    }

    public final void gx() {
        this.mNameField.m28365E(this.f73130G.f73145L);
        this.mUsernameField.m28365E(this.f73130G.f73145L);
    }

    public final void jLA() {
        AnonymousClass2Ed anonymousClass2Ed = this.f73127D;
        if (anonymousClass2Ed != null) {
            anonymousClass2Ed.f27896H = this.mNameField.getText().toString();
            this.f73127D.f27904P = this.mUsernameField.getText().toString();
        }
    }

    public final void uV(ViewStub viewStub, AnonymousClass6EI anonymousClass6EI) {
        this.f73130G = anonymousClass6EI;
        viewStub.setLayoutResource(C0164R.layout.edit_profile_fields);
        ViewGroup viewGroup = (ViewGroup) viewStub.inflate();
        this.mContext = viewGroup.getContext();
        this.mNameField = (IgFormField) viewGroup.findViewById(C0164R.id.full_name);
        this.mUsernameField = (IgFormField) viewGroup.findViewById(C0164R.id.username);
        this.f73126C = new AnonymousClass5nS(new AnonymousClass6EF(this));
        this.mUsernameField.setRuleChecker(new AnonymousClass6EG(this));
    }
}
