package com.instagram.school.fragment;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IT;
import X.AnonymousClass0Iw;
import X.AnonymousClass0LH;
import X.AnonymousClass0Nm;
import X.AnonymousClass0Ow;
import X.AnonymousClass0P2;
import X.AnonymousClass0bz;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass1Q2;
import X.AnonymousClass235;
import X.AnonymousClass2Hg;
import X.AnonymousClass2Hh;
import X.AnonymousClass2M9;
import X.AnonymousClass5zL;
import X.AnonymousClass60Q;
import X.AnonymousClass60R;
import X.AnonymousClass60V;
import X.AnonymousClass60Z;
import X.AnonymousClass60b;
import X.AnonymousClass60c;
import X.AnonymousClass60d;
import X.AnonymousClass60g;
import X.AnonymousClass60h;
import X.AnonymousClass60i;
import X.AnonymousClass60j;
import X.AnonymousClass60k;
import X.AnonymousClass60m;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.actionbar.ActionButton;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class UpdateSchoolFragment extends AnonymousClass0IJ implements AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass2M9 f70840B;
    /* renamed from: C */
    public final Handler f70841C = new Handler(Looper.getMainLooper());
    /* renamed from: D */
    public boolean f70842D;
    /* renamed from: E */
    public final AnonymousClass0Iw f70843E = new AnonymousClass60Z(this);
    /* renamed from: F */
    public AnonymousClass2Hh f70844F;
    /* renamed from: G */
    public AnonymousClass60R f70845G;
    /* renamed from: H */
    public final AnonymousClass0Iw f70846H = new AnonymousClass60b(this);
    /* renamed from: I */
    public UpdateSchoolViewModel f70847I;
    /* renamed from: J */
    public AnonymousClass0Cm f70848J;
    /* renamed from: K */
    private String f70849K;
    public EditText mClassYearPicker;
    public EditText mDescriptionEditText;
    public List mEditableFields;
    public View mRemoveSchoolButton;
    public View mRemoveSchoolDivider;
    public ActionButton mSaveButton;
    public EditText mSchoolEditText;
    public TextView mTagPreviewTextView;

    public final String getModuleName() {
        return "add_school";
    }

    /* renamed from: B */
    public static void m28750B(UpdateSchoolFragment updateSchoolFragment) {
        if (updateSchoolFragment.f70845G.f70817C) {
            m28752D(updateSchoolFragment);
        }
        updateSchoolFragment.getActivity().onBackPressed();
    }

    /* renamed from: C */
    public static void m28751C(UpdateSchoolFragment updateSchoolFragment) {
        if (updateSchoolFragment.f70847I.f70854F == 0) {
            new AnonymousClass0P2(updateSchoolFragment.getContext()).V(C0164R.string.select_school_before_class_year_warning_title).K(C0164R.string.select_school_before_class_year_warning_message).S(C0164R.string.ok, null).F(true).E(true).A().show();
            return;
        }
        m28755G(updateSchoolFragment, false);
        AnonymousClass5zL.m28719C("ig_school_school_detail_tap_class_year", updateSchoolFragment.f70847I.f70854F).R();
        AnonymousClass0IL B = AnonymousClass1Q2.B((String[]) updateSchoolFragment.f70847I.f70850B.toArray(new String[0]), updateSchoolFragment.f70847I.f70851C);
        B.setTargetFragment(updateSchoolFragment, 1);
        AnonymousClass0bz B2 = AnonymousClass0bz.B(updateSchoolFragment.getContext());
        B2.D(updateSchoolFragment.getFragmentManager(), B);
        B2.A(new AnonymousClass60V(updateSchoolFragment));
    }

    /* renamed from: D */
    public static void m28752D(UpdateSchoolFragment updateSchoolFragment) {
        AnonymousClass5zL.m28719C("ig_school_session_end", updateSchoolFragment.f70847I.f70854F).R();
    }

    /* renamed from: E */
    public static UpdateSchoolFragment m28753E(String str, UpdateSchoolViewModel updateSchoolViewModel) {
        Bundle bundle = new Bundle();
        bundle.putString("ARGUMENT_ENTRY_POINT", str);
        bundle.putParcelable("UpdateSchoolFragment.BUNDLE_SCHOOL_VIEW_MODEL", updateSchoolViewModel);
        bundle.putBoolean("ARGUMENT_IS_START_OF_SESSION", false);
        AnonymousClass0IL updateSchoolFragment = new UpdateSchoolFragment();
        updateSchoolFragment.setArguments(bundle);
        return updateSchoolFragment;
    }

    /* renamed from: F */
    public static void m28754F(UpdateSchoolFragment updateSchoolFragment) {
        Toast.makeText(updateSchoolFragment.getContext().getApplicationContext(), C0164R.string.something_went_wrong, 0).show();
    }

    /* renamed from: G */
    public static void m28755G(UpdateSchoolFragment updateSchoolFragment, boolean z) {
        for (View view : updateSchoolFragment.mEditableFields) {
            view.setEnabled(z);
            view.clearFocus();
        }
    }

    /* renamed from: H */
    public static void m28756H(UpdateSchoolFragment updateSchoolFragment) {
        TextView textView = updateSchoolFragment.mTagPreviewTextView;
        AnonymousClass60m anonymousClass60m = new AnonymousClass60m(updateSchoolFragment.getContext());
        anonymousClass60m.f70862F = updateSchoolFragment.f70847I.f70856H;
        anonymousClass60m.f70861E = true;
        anonymousClass60m.f70858B = updateSchoolFragment.f70847I.f70851C;
        anonymousClass60m.f70860D = updateSchoolFragment.f70847I.f70852D;
        textView.setText(anonymousClass60m.m28760A());
    }

    /* renamed from: I */
    private void m28757I() {
        this.mSchoolEditText.setText(this.f70847I.f70855G);
        this.mDescriptionEditText.setText(this.f70847I.f70852D);
        this.mClassYearPicker.setText(this.f70847I.f70851C);
        m28756H(this);
        ActionButton actionButton = this.mSaveButton;
        if (actionButton != null) {
            actionButton.setEnabled(this.f70847I.f70857I);
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        int i = C0164R.string.add_school_title;
        if (this.f70847I.f70853E) {
            i = C0164R.string.school_label;
        }
        this.mSaveButton = anonymousClass0eT.g(i, new AnonymousClass60c(this));
        int i2 = C0164R.drawable.instagram_arrow_back_24;
        if ((this.f70845G.f70816B == AnonymousClass60Q.QP_FLOW ? 1 : null) != null) {
            i2 = C0164R.drawable.instagram_x_outline_24;
        }
        anonymousClass0eT.c(i2, new AnonymousClass60d(this));
        anonymousClass0eT.n(true);
        anonymousClass0eT.k(true);
        anonymousClass0eT.Y(this.f70842D);
        ActionButton actionButton = this.mSaveButton;
        if (actionButton != null) {
            actionButton.setEnabled(this.f70847I.f70857I);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            UpdateSchoolViewModel updateSchoolViewModel = this.f70847I;
            updateSchoolViewModel.f70851C = intent.getExtras().getString("SelectClassYearBottomSheetFragment.SELECTED_CLASS_YEAR");
            UpdateSchoolViewModel.m28758B(updateSchoolViewModel);
        } else if (i == 2) {
            long longExtra = intent.getLongExtra("SearchSchoolListFragment.SELECTED_SCHOOL_ID", 0);
            if (this.f70847I.f70854F == 0 || longExtra != this.f70847I.f70854F) {
                UpdateSchoolViewModel updateSchoolViewModel2 = this.f70847I;
                long longExtra2 = intent.getLongExtra("SearchSchoolListFragment.SELECTED_SCHOOL_ID", 0);
                String stringExtra = intent.getStringExtra("SearchSchoolListFragment.SELECTED_SCHOOL_NAME");
                String stringExtra2 = intent.getStringExtra("SearchSchoolListFragment.SELECTED_SCHOOL_SHORT_NAME");
                Collection stringArrayListExtra = intent.getStringArrayListExtra("SearchSchoolListFragment.AVAILABLE_CLASS_YEAR_LIST");
                updateSchoolViewModel2.f70854F = longExtra2;
                updateSchoolViewModel2.f70855G = stringExtra;
                updateSchoolViewModel2.f70856H = stringExtra2;
                updateSchoolViewModel2.f70851C = null;
                updateSchoolViewModel2.f70850B = null;
                if (stringArrayListExtra != null) {
                    updateSchoolViewModel2.f70850B = AnonymousClass0Ow.D(stringArrayListExtra);
                }
                UpdateSchoolViewModel.m28758B(updateSchoolViewModel2);
                m28757I();
            }
        }
        if (isResumed()) {
            m28757I();
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1693796482);
        super.onCreate(bundle);
        AnonymousClass0Cm G = AnonymousClass0Ce.G(getArguments());
        this.f70848J = G;
        this.f70840B = G.B().DC;
        Boolean valueOf = Boolean.valueOf(getArguments().getBoolean("ARGUMENT_IS_START_OF_SESSION"));
        this.f70849K = getArguments().getString("ARGUMENT_ENTRY_POINT");
        this.f70845G = new AnonymousClass60R(valueOf.booleanValue(), this.f70849K, getFragmentManager());
        UpdateSchoolViewModel updateSchoolViewModel = (UpdateSchoolViewModel) getArguments().getParcelable("UpdateSchoolFragment.BUNDLE_SCHOOL_VIEW_MODEL");
        this.f70847I = new UpdateSchoolViewModel();
        if (bundle != null) {
            this.f70847I = (UpdateSchoolViewModel) bundle.getParcelable("UpdateSchoolFragment.BUNDLE_SCHOOL_VIEW_MODEL");
        } else if (updateSchoolViewModel != null) {
            this.f70847I = updateSchoolViewModel;
        } else {
            if ((this.f70845G.f70816B == AnonymousClass60Q.EDIT_SCHOOL_FLOW ? 1 : null) != null) {
                AnonymousClass0LH.E(this.f70840B);
                this.f70847I = new UpdateSchoolViewModel(this.f70840B);
            }
        }
        registerLifecycleListener(new AnonymousClass235(getActivity()));
        if (this.f70845G.f70817C) {
            AnonymousClass5zL.m28722F(this.f70849K, null, false);
            AnonymousClass5zL.m28719C("ig_school_session_start", this.f70847I.f70854F).R();
        }
        AnonymousClass5zL.m28721E(this.f70847I.f70853E ? "school_modify_school_detail" : "school_add_school_detail").R();
        AnonymousClass0cQ.G(this, 616973176, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -2042136506);
        this.f70844F = new AnonymousClass2Hh(this, new AnonymousClass2Hg());
        View inflate = layoutInflater.inflate(C0164R.layout.layout_update_school_fragment, viewGroup, false);
        AnonymousClass0cQ.G(this, -700256646, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 231867600);
        super.onDestroyView();
        View view = this.mSchoolEditText;
        if (view != null) {
            AnonymousClass0Nm.N(view);
        }
        UpdateSchoolFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, 98678322, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -130019851);
        super.onResume();
        m28757I();
        AnonymousClass0cQ.G(this, -1550579199, F);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("UpdateSchoolFragment.BUNDLE_SCHOOL_VIEW_MODEL", this.f70847I);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mSchoolEditText = (EditText) view.findViewById(C0164R.id.school_edit_text);
        this.mDescriptionEditText = (EditText) view.findViewById(C0164R.id.description_edit_text);
        this.mClassYearPicker = (EditText) view.findViewById(C0164R.id.class_year_spinner);
        this.mEditableFields = Arrays.asList(new EditText[]{this.mSchoolEditText, this.mClassYearPicker, this.mDescriptionEditText});
        this.mTagPreviewTextView = (TextView) view.findViewById(C0164R.id.tag_preview_text);
        this.mRemoveSchoolDivider = view.findViewById(C0164R.id.remove_school_divider);
        this.mRemoveSchoolButton = view.findViewById(C0164R.id.remove_school_button);
        this.mSchoolEditText.setInputType(0);
        this.mSchoolEditText.setOnClickListener(new AnonymousClass60g(this));
        this.mClassYearPicker.setInputType(0);
        this.mClassYearPicker.setOnClickListener(new AnonymousClass60h(this));
        this.mDescriptionEditText.setOnFocusChangeListener(new AnonymousClass60i(this));
        this.mDescriptionEditText.addTextChangedListener(new AnonymousClass60j(this));
        if (this.f70847I.f70853E) {
            this.mRemoveSchoolButton.setVisibility(0);
            this.mRemoveSchoolDivider.setVisibility(0);
            this.mRemoveSchoolButton.setOnClickListener(new AnonymousClass60k(this));
        }
    }
}
