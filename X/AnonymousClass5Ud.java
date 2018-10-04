package X;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Images.Media;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import com.facebook.C0164R;
import com.facebook.common.dextricks.DexStore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.crop.CropImageView;
import com.instagram.creation.photo.util.ExifImageData;
import com.instagram.util.jpeg.JpegBridge;
import com.instagram.util.jpeg.NativeImage;
import java.util.Map;

/* renamed from: X.5Ud */
public final class AnonymousClass5Ud extends AnonymousClass4Y6 implements AnonymousClass0TV, AnonymousClass4Xv {
    /* renamed from: W */
    private static final Class f65002W = AnonymousClass5Ud.class;
    /* renamed from: X */
    public static final AnonymousClass0Ks f65003X;
    /* renamed from: B */
    public RectF f65004B;
    /* renamed from: C */
    public AnonymousClass0PF f65005C;
    /* renamed from: D */
    public ExifImageData f65006D;
    /* renamed from: E */
    public final Handler f65007E = new Handler();
    /* renamed from: F */
    public AnonymousClass2Mw f65008F;
    /* renamed from: G */
    public CropImageView f65009G;
    /* renamed from: H */
    public boolean f65010H;
    /* renamed from: I */
    public int f65011I;
    /* renamed from: J */
    public AnonymousClass2FI f65012J;
    /* renamed from: K */
    public Bitmap f65013K;
    /* renamed from: L */
    public AnonymousClass0Ur f65014L;
    /* renamed from: M */
    public Uri f65015M;
    /* renamed from: N */
    public boolean f65016N;
    /* renamed from: O */
    public AnonymousClass0Cm f65017O;
    /* renamed from: P */
    private ViewGroup f65018P;
    /* renamed from: Q */
    private ContentResolver f65019Q;
    /* renamed from: R */
    private ColorFilterAlphaImageView f65020R;
    /* renamed from: S */
    private CropInfo f65021S;
    /* renamed from: T */
    private Uri f65022T;
    /* renamed from: U */
    private boolean f65023U;
    /* renamed from: V */
    private float[] f65024V;

    public final void In(CropImageView cropImageView) {
    }

    public final void Ln(CropImageView cropImageView) {
    }

    public final String getModuleName() {
        return "crop";
    }

    static {
        AnonymousClass0Kq B = AnonymousClass0Kq.B();
        B.f3132F = "image-preload-executor";
        f65003X = B.A();
    }

    /* renamed from: B */
    public static void m27073B(AnonymousClass5Ud anonymousClass5Ud) {
        AnonymousClass2Mw anonymousClass2Mw = anonymousClass5Ud.f65008F;
        if (anonymousClass2Mw != null) {
            AnonymousClass0GG.B(f65003X, new AnonymousClass4Xh(anonymousClass5Ud, anonymousClass2Mw.vK()), 2051874888);
        }
    }

    /* renamed from: C */
    public static void m27074C(AnonymousClass5Ud anonymousClass5Ud, Uri uri) {
        if (anonymousClass5Ud.f65005C != null) {
            Location location = null;
            if (!(anonymousClass5Ud.f65006D.f39811B == null || anonymousClass5Ud.f65006D.f39812C == null)) {
                location = new Location("photo");
                location.setLatitude(anonymousClass5Ud.f65006D.f39811B.doubleValue());
                location.setLongitude(anonymousClass5Ud.f65006D.f39812C.doubleValue());
            }
            Uri uri2 = uri;
            anonymousClass5Ud.f65005C.Km(uri2, location, anonymousClass5Ud.f65021S, anonymousClass5Ud.f65006D.f39813D, anonymousClass5Ud.getArguments().getInt("mediaSource", 0));
        }
    }

    /* renamed from: D */
    public static void m27075D(AnonymousClass5Ud anonymousClass5Ud) {
        AnonymousClass0Ur anonymousClass0Ur = anonymousClass5Ud.f65014L;
        if (anonymousClass0Ur != null) {
            anonymousClass0Ur.dismiss();
            anonymousClass5Ud.f65014L = null;
        }
        int i = 0;
        if (anonymousClass5Ud.f65013K == null) {
            Toast.makeText(anonymousClass5Ud.getActivity(), C0164R.string.unable_to_load_image, 0).show();
            anonymousClass5Ud.f65005C.ze();
            return;
        }
        if (anonymousClass5Ud.getActivity() != null) {
            if (!anonymousClass5Ud.getActivity().isFinishing()) {
                anonymousClass5Ud.f65009G.E(new AnonymousClass3HX(anonymousClass5Ud.f65013K, anonymousClass5Ud.f65006D.f39813D), anonymousClass5Ud.f65024V);
                if (anonymousClass5Ud.f65009G.getHighlightView() == null) {
                    AnonymousClass4Xz anonymousClass4Xz = new AnonymousClass4Xz(anonymousClass5Ud.f65009G);
                    int width = anonymousClass5Ud.f65013K.getWidth();
                    int height = anonymousClass5Ud.f65013K.getHeight();
                    int min = Math.min(width, height);
                    int i2 = (width - min) / 2;
                    int i3 = (height - min) / 2;
                    anonymousClass5Ud.f65004B = new RectF((float) i2, (float) i3, (float) (i2 + min), (float) (i3 + min));
                    RectF rectF = new RectF();
                    anonymousClass5Ud.f65009G.getBaseMatrix().mapRect(rectF, anonymousClass5Ud.f65004B);
                    anonymousClass4Xz.B(rectF, anonymousClass5Ud.f65010H);
                    anonymousClass5Ud.f65009G.setHighlightView(anonymousClass4Xz);
                    anonymousClass5Ud.f65009G.f65027D = new RectF(0.0f, 0.0f, (float) width, (float) height);
                    AnonymousClass0IC D = AnonymousClass4Xy.D(anonymousClass5Ud.f65008F, anonymousClass5Ud.f65013K, anonymousClass5Ud.f65006D.f39813D);
                    anonymousClass5Ud.f65009G.F(anonymousClass5Ud.f65010H ? 1.0f : ((Float) D.f2727B).floatValue(), ((Float) D.f2728C).floatValue(), anonymousClass5Ud.f65004B);
                }
                if (!anonymousClass5Ud.f65010H) {
                    anonymousClass5Ud.f65009G.setListener(anonymousClass5Ud);
                }
                anonymousClass5Ud.f65009G.m27084G();
                String vK = anonymousClass5Ud.f65008F.vK();
                if (AnonymousClass0ci.B(AnonymousClass0ch.DEFAULT).f7232C) {
                    AnonymousClass0GG.B(f65003X, new AnonymousClass4Xk(anonymousClass5Ud, vK), 997467770);
                }
                anonymousClass5Ud.f65023U = anonymousClass5Ud.f65013K.getWidth() == anonymousClass5Ud.f65013K.getHeight();
                if (anonymousClass5Ud.f65010H || anonymousClass5Ud.f65023U) {
                    i = 8;
                }
                anonymousClass5Ud.f65020R.setVisibility(i);
            }
        }
    }

    /* renamed from: E */
    public static void m27076E(AnonymousClass5Ud anonymousClass5Ud) {
        if (anonymousClass5Ud.f65009G.getHighlightView() != null) {
            if (!anonymousClass5Ud.f65016N) {
                anonymousClass5Ud.f65009G.A();
                AnonymousClass4Xx C = AnonymousClass4Xy.C(anonymousClass5Ud.f65009G, anonymousClass5Ud.f65008F.getWidth(), anonymousClass5Ud.f65008F.getHeight(), anonymousClass5Ud.f65013K.getWidth(), anonymousClass5Ud.f65013K.getHeight(), anonymousClass5Ud.f65004B, anonymousClass5Ud.f65006D.f39813D);
                if (C.A()) {
                    anonymousClass5Ud.f65021S = new CropInfo(anonymousClass5Ud.f65008F.getWidth(), anonymousClass5Ud.f65008F.getHeight(), C.f55035C);
                    anonymousClass5Ud.f65016N = true;
                    anonymousClass5Ud.f65009G.m27085H();
                    anonymousClass5Ud.f65009G.setListener(null);
                    anonymousClass5Ud.f65024V = anonymousClass5Ud.f65009G.getCropMatrixValues();
                    if (AnonymousClass0ci.B(AnonymousClass0ch.DEFAULT).f7231B) {
                        AnonymousClass3CJ.D(anonymousClass5Ud.f65017O).F(new CropInfo(anonymousClass5Ud.f65013K.getWidth(), anonymousClass5Ud.f65013K.getHeight(), C.f55037E), false, anonymousClass5Ud.f65006D.f39813D);
                    }
                    anonymousClass5Ud.f65009G.f65026C = null;
                    if (anonymousClass5Ud.f65010H) {
                        Rect rect = C.f55037E;
                        CharSequence string = anonymousClass5Ud.getResources().getString(C0164R.string.processing);
                        new Thread(new AnonymousClass5bM(anonymousClass5Ud, new AnonymousClass4Xl(anonymousClass5Ud, rect), ProgressDialog.show(anonymousClass5Ud.getActivity(), null, string, true, false), anonymousClass5Ud.f65007E)).start();
                        return;
                    }
                    ((AnonymousClass0PI) anonymousClass5Ud.getContext()).VK().X(anonymousClass5Ud.f65013K, C.f55036D);
                    AnonymousClass5Ud.m27074C(anonymousClass5Ud, anonymousClass5Ud.f65008F.uH());
                }
            }
        }
    }

    /* renamed from: F */
    public static void m27077F(AnonymousClass5Ud anonymousClass5Ud, NativeImage nativeImage) {
        String H = AnonymousClass5Ud.m27079H(anonymousClass5Ud, anonymousClass5Ud.f65015M);
        if (H != null) {
            if (!H.isEmpty()) {
                if (JpegBridge.saveImage(nativeImage, anonymousClass5Ud.f65015M.getPath(), 95, false) == 1) {
                    AnonymousClass0OR.D(anonymousClass5Ud.f65007E, new AnonymousClass4Xm(anonymousClass5Ud), 2021392070);
                    return;
                }
                AnonymousClass0Dc.D(f65002W, "Native jpeg save failed for file %s", new Object[]{H});
                AnonymousClass0OR.D(anonymousClass5Ud.f65007E, new AnonymousClass1Qf(anonymousClass5Ud), -464581799);
            }
        }
        AnonymousClass0Dc.B(f65002W, "Can't crop: mSaveUri is not valid");
        AnonymousClass0OR.D(anonymousClass5Ud.f65007E, new AnonymousClass1Qf(anonymousClass5Ud), -464581799);
    }

    /* renamed from: G */
    private static String m27078G(AnonymousClass5Ud anonymousClass5Ud, Uri uri, String str, String[] strArr) {
        Throwable th;
        Cursor cursor = null;
        try {
            cursor = anonymousClass5Ud.f65019Q.query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return JsonProperty.USE_DEFAULT_NAME;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: H */
    private static String m27079H(AnonymousClass5Ud anonymousClass5Ud, Uri uri) {
        Object obj = VERSION.SDK_INT >= 19 ? 1 : null;
        if ("file".equals(uri.getScheme())) {
            return uri.getPath();
        }
        if (obj == null) {
            return AnonymousClass5Ud.m27081J(anonymousClass5Ud, uri);
        }
        return AnonymousClass5Ud.m27080I(anonymousClass5Ud, uri);
    }

    /* renamed from: I */
    private static String m27080I(AnonymousClass5Ud anonymousClass5Ud, Uri uri) {
        if (DocumentsContract.isDocumentUri(anonymousClass5Ud.getContext(), uri)) {
            String[] split = DocumentsContract.getDocumentId(uri).split(":");
            return AnonymousClass5Ud.m27078G(anonymousClass5Ud, Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{split[1]});
        }
        AnonymousClass0Dc.N(f65002W, "getRealPathFromUriKitKat failed for non-document uri %s", new Object[]{uri});
        return JsonProperty.USE_DEFAULT_NAME;
    }

    /* renamed from: J */
    private static String m27081J(AnonymousClass5Ud anonymousClass5Ud, Uri uri) {
        Throwable th;
        String str = JsonProperty.USE_DEFAULT_NAME;
        int i = 1;
        Cursor cursor = null;
        try {
            String[] strArr = new String[1];
            String str2 = "_data";
            strArr[0] = str2;
            cursor = anonymousClass5Ud.f65019Q.query(uri, strArr, null, null, null);
            if (cursor != null) {
                try {
                    int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str2);
                    cursor.moveToFirst();
                    str = cursor.getString(columnIndexOrThrow);
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            AnonymousClass0Dc.N(f65002W, "Failed to get cursor for %s from content resolver. falling back to path", new Object[]{uri});
            if (uri.getScheme().equals("file")) {
                return uri.getPath();
            }
            i = 0;
            if (cursor != null) {
                cursor.close();
            }
            if (i == 0) {
                str = JsonProperty.USE_DEFAULT_NAME;
            }
            return str;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void Zt(Map map) {
        Activity activity = (Activity) getContext();
        if (((AnonymousClass1Bb) map.get("android.permission.WRITE_EXTERNAL_STORAGE")) != AnonymousClass1Bb.GRANTED) {
            AnonymousClass2FI anonymousClass2FI = this.f65012J;
            if (anonymousClass2FI != null) {
                anonymousClass2FI.D(map);
                return;
            }
            Context context = getContext();
            String H = AnonymousClass0G5.H(context, C0164R.attr.appName);
            this.f65012J = new AnonymousClass2FI(this.f65018P, C0164R.layout.permission_empty_state_view).D(map).H(context.getString(C0164R.string.storage_permission_rationale_title, new Object[]{H})).G(context.getString(C0164R.string.storage_permission_rationale_message, new Object[]{H})).E(C0164R.string.storage_permission_rationale_link).F(new AnonymousClass4Xd(this, activity));
        }
    }

    public final void onAttach(android.content.Context r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        super.onAttach(r3);
        r0 = r3;	 Catch:{ ClassCastException -> 0x0009 }
        r0 = (X.AnonymousClass0PF) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f65005C = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;	 Catch:{ ClassCastException -> 0x0009 }
    L_0x0009:
        r2 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r3.toString();
        r1.append(r0);
        r0 = " must implement CropFragmentListener";
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5Ud.onAttach(android.content.Context):void");
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1152511855);
        super.onCreate(bundle);
        this.f65019Q = getActivity().getContentResolver();
        Bundle arguments = getArguments();
        this.f65017O = AnonymousClass0Ce.G(arguments);
        this.f65015M = (Uri) arguments.getParcelable("output");
        this.f65011I = arguments.getInt("CropFragment.largestDimension");
        this.f65022T = (Uri) getArguments().getParcelable("CropFragment.imageUri");
        if (bundle != null) {
            this.f65024V = bundle.getFloatArray("CropFragment.CropMatrix");
        }
        this.f65010H = getArguments().getBoolean("CropFragment.isAvatar", false);
        AnonymousClass0cQ.G(this, 1093918010, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1120925585);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_crop, viewGroup, false);
        this.f65018P = (ViewGroup) inflate.findViewById(C0164R.id.preview_container);
        this.f65009G = (CropImageView) inflate.findViewById(C0164R.id.crop_image_view);
        ImageView imageView = (ImageView) inflate.findViewById(C0164R.id.button_back);
        imageView.setOnClickListener(new AnonymousClass4Xe(this));
        imageView.setBackground(new AnonymousClass0eU(getActivity().getTheme(), AnonymousClass0eV.MODAL));
        ((ColorFilterAlphaImageView) inflate.findViewById(C0164R.id.save)).setOnClickListener(new AnonymousClass4Xf(this));
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) inflate.findViewById(C0164R.id.croptype_toggle_button);
        this.f65020R = colorFilterAlphaImageView;
        colorFilterAlphaImageView.setOnClickListener(new AnonymousClass4Xg(this));
        AnonymousClass0cQ.G(this, -534905263, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1346653512);
        super.onDestroyView();
        if (!this.f65016N) {
            AnonymousClass5Ud.m27073B(this);
        }
        this.f65016N = false;
        this.f65009G.m27085H();
        this.f65009G.setListener(null);
        this.f65009G.f65026C = null;
        this.f65009G = null;
        AnonymousClass0Ur anonymousClass0Ur = this.f65014L;
        if (anonymousClass0Ur != null) {
            anonymousClass0Ur.dismiss();
            this.f65014L = null;
        }
        this.f65020R = null;
        AnonymousClass2FI anonymousClass2FI = this.f65012J;
        if (anonymousClass2FI != null) {
            anonymousClass2FI.A();
            this.f65012J = null;
        }
        this.f65018P = null;
        AnonymousClass0cQ.G(this, 44313364, F);
    }

    public final void onDetach() {
        int F = AnonymousClass0cQ.F(this, -1265177340);
        super.onDetach();
        this.f65005C = null;
        AnonymousClass0cQ.G(this, -250967382, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -1436633426);
        super.onResume();
        getActivity().getWindow().addFlags(DexStore.LOAD_RESULT_MIXED_MODE);
        if (AnonymousClass1Ba.D(getContext(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
            AnonymousClass2FI anonymousClass2FI = this.f65012J;
            if (anonymousClass2FI != null) {
                anonymousClass2FI.A();
                this.f65012J = null;
            }
            getLoaderManager().C(AnonymousClass11J.f13391B.getAndIncrement(), null, new AnonymousClass4Xj(this, this.f65022T));
            if (this.f65013K == null) {
                AnonymousClass0Ur anonymousClass0Ur = new AnonymousClass0Ur(getContext());
                this.f65014L = anonymousClass0Ur;
                anonymousClass0Ur.A(getString(C0164R.string.loading));
                this.f65014L.show();
            }
        } else {
            AnonymousClass1Ba.H((Activity) getContext(), this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
        }
        if (!this.f65010H) {
            AnonymousClass2NY.B().f29719P = true;
        }
        AnonymousClass0cQ.G(this, -1766371573, F);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        float[] fArr;
        super.onSaveInstanceState(bundle);
        String str = "CropFragment.CropMatrix";
        AnonymousClass4Y2 anonymousClass4Y2 = this.f65009G;
        if (anonymousClass4Y2 == null) {
            fArr = this.f65024V;
        } else {
            fArr = anonymousClass4Y2.getCropMatrixValues();
        }
        bundle.putFloatArray(str, fArr);
    }

    public final void rj(boolean z) {
        AnonymousClass1Qp anonymousClass1Qp;
        if (!this.f65023U) {
            if (!z) {
                anonymousClass1Qp = AnonymousClass1Qp.RECTANGULAR;
                ((AnonymousClass0PI) getContext()).VK().f38952F = anonymousClass1Qp;
            }
        }
        anonymousClass1Qp = AnonymousClass1Qp.SQUARE;
        ((AnonymousClass0PI) getContext()).VK().f38952F = anonymousClass1Qp;
    }
}
