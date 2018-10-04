package com.facebook.forker;

import android.content.Context;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.Map.Entry;

public final class ProcessBuilder implements Cloneable {
    private static final String TAG = "fb-ProcessBuilder";
    private ArrayList mArgv;
    private byte[] mEnvironCache;
    private ArrayList mEnvironKeys;
    private ArrayList mEnvironValues;
    private String mExecutable;
    private BitSet mKeepFds;
    private int[] mStreamDispositions;
    private File mTmpDir;

    public ProcessBuilder() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r4 = this;
        r4.<init>();
        r0 = new java.util.ArrayList;
        r0.<init>();
        r4.mArgv = r0;
        r0 = new java.util.BitSet;
        r0.<init>();
        r4.mKeepFds = r0;
        r0 = 3;
        r0 = new int[r0];
        r0 = {-3, -3, -3};
        r4.mStreamDispositions = r0;
        r0 = r4.mKeepFds;
        r3 = 0;
        r0.set(r3);
        r1 = r4.mKeepFds;
        r0 = 1;
        r1.set(r0);
        r1 = r4.mKeepFds;
        r0 = 2;
        r1.set(r0);
        r0 = "ANDROID_PROPERTY_WORKSPACE";
        r2 = java.lang.System.getenv(r0);
        if (r2 == 0) goto L_0x0049;
    L_0x0033:
        r0 = 44;
        r1 = r2.indexOf(r0);
        r0 = -1;
        if (r1 == r0) goto L_0x0049;
    L_0x003c:
        r0 = r2.substring(r3, r1);
        r1 = r4.mKeepFds;	 Catch:{ NumberFormatException -> 0x0049 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0049 }
        r1.set(r0);	 Catch:{ NumberFormatException -> 0x0049 }
    L_0x0049:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.forker.ProcessBuilder.<init>():void");
    }

    public ProcessBuilder(String str, String... strArr) {
        this();
        this.mExecutable = str;
        this.mArgv.add(str);
        for (Object add : strArr) {
            this.mArgv.add(add);
        }
    }

    public ProcessBuilder addArgument(String str) {
        this.mArgv.add(str);
        return this;
    }

    public ProcessBuilder addArguments(Iterable iterable) {
        for (String addArgument : iterable) {
            addArgument(addArgument);
        }
        return this;
    }

    public ProcessBuilder addArguments(String... strArr) {
        for (Object add : strArr) {
            this.mArgv.add(add);
        }
        return this;
    }

    private static byte[] buildEnvironBlock(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((((String) arrayList.get(i2)).length() + 1) + ((String) arrayList2.get(i2)).length()) + 1;
        }
        try {
            OutputStream unsafeByteArrayOutputStream = new UnsafeByteArrayOutputStream(i);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(unsafeByteArrayOutputStream));
            for (int i3 = 0; i3 < size; i3++) {
                bufferedWriter.write((String) arrayList.get(i3));
                bufferedWriter.write(61);
                bufferedWriter.write((String) arrayList2.get(i3));
                bufferedWriter.write(0);
            }
            bufferedWriter.flush();
            return unsafeByteArrayOutputStream.getRawBuffer();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public ProcessBuilder clearenv() {
        ArrayList arrayList = this.mEnvironKeys;
        if (arrayList == null) {
            this.mEnvironKeys = new ArrayList();
            this.mEnvironValues = new ArrayList();
        } else {
            arrayList.clear();
            this.mEnvironValues.clear();
            this.mEnvironCache = null;
        }
        return this;
    }

    public ProcessBuilder clone() {
        makeEnvironBlock();
        try {
            ProcessBuilder processBuilder = (ProcessBuilder) super.clone();
            processBuilder.mArgv = (ArrayList) this.mArgv.clone();
            processBuilder.mKeepFds = (BitSet) this.mKeepFds.clone();
            processBuilder.mStreamDispositions = (int[]) this.mStreamDispositions.clone();
            ArrayList arrayList = this.mEnvironKeys;
            if (arrayList != null) {
                processBuilder.mEnvironKeys = (ArrayList) arrayList.clone();
                processBuilder.mEnvironValues = (ArrayList) this.mEnvironValues.clone();
            }
            Object obj = this.mEnvironCache;
            if (obj != null) {
                processBuilder.mEnvironCache = (byte[]) obj.clone();
            }
            processBuilder.mTmpDir = this.mTmpDir;
            return processBuilder;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public Process create() {
        String str = this.mExecutable;
        ArrayList arrayList = this.mArgv;
        return new Process(str, (String[]) arrayList.toArray(new String[arrayList.size()]), makeEnvironBlock(), getArrayOfSetBits(this.mKeepFds), this.mStreamDispositions, this.mTmpDir);
    }

    public void freezeEnviron() {
        if (this.mEnvironKeys == null) {
            Map map = System.getenv();
            int size = map.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (Entry entry : map.entrySet()) {
                arrayList.add(entry.getKey());
                arrayList2.add(entry.getValue());
            }
            this.mEnvironKeys = arrayList;
            this.mEnvironValues = arrayList2;
        }
    }

    public static File genDefaultTmpDir(Context context) {
        return context.getDir("fb-forker-tmp", 0);
    }

    private static int[] getArrayOfSetBits(BitSet bitSet) {
        int[] iArr = new int[bitSet.cardinality()];
        int i = 0;
        int nextSetBit = bitSet.nextSetBit(0);
        while (nextSetBit != -1) {
            int i2 = i + 1;
            iArr[i] = nextSetBit;
            nextSetBit = bitSet.nextSetBit(nextSetBit + 1);
            i = i2;
        }
        return iArr;
    }

    private byte[] makeEnvironBlock() {
        ArrayList arrayList = this.mEnvironKeys;
        if (arrayList != null && this.mEnvironCache == null) {
            this.mEnvironCache = buildEnvironBlock(arrayList, this.mEnvironValues);
        }
        return this.mEnvironCache;
    }

    public ProcessBuilder setDefaultTmpDir(File file) {
        this.mTmpDir = file;
        return this;
    }

    public ProcessBuilder setExecutable(String str) {
        this.mExecutable = str;
        return this;
    }

    public ProcessBuilder setFdCloseOnExec(int i, boolean z) {
        if (z) {
            this.mKeepFds.clear(i);
        } else {
            this.mKeepFds.set(i);
        }
        return this;
    }

    public ProcessBuilder setStream(int i, int i2) {
        this.mStreamDispositions[i] = i2;
        return this;
    }

    public ProcessBuilder setTmpDir(File file) {
        this.mTmpDir = file;
        return this;
    }

    public ProcessBuilder setenv(String str, String str2) {
        if (str.indexOf(0) != -1 || str2.indexOf(0) != -1) {
            throw new IllegalArgumentException("environment variables cannot contain NUL");
        } else if (str.indexOf(61) == -1) {
            unsetenv(str);
            this.mEnvironKeys.add(str);
            this.mEnvironValues.add(str2);
            this.mEnvironCache = null;
            return this;
        } else {
            throw new IllegalArgumentException("environment variable names cannot contain '='");
        }
    }

    public String toString() {
        Writer stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.format("<ProcessBuilder executable=[%s] argv=[", new Object[]{this.mExecutable});
        for (int i = 0; i < this.mArgv.size(); i++) {
            if (i > 0) {
                printWriter.print(" ");
            }
            printWriter.print((String) this.mArgv.get(i));
        }
        printWriter.format("] keepFds=[%s] streamDispositions=[%s]", new Object[]{Arrays.toString(getArrayOfSetBits(this.mKeepFds)), Arrays.toString(this.mStreamDispositions)});
        printWriter.print(">");
        return stringWriter.toString();
    }

    public ProcessBuilder unsetenv(String str) {
        freezeEnviron();
        ArrayList arrayList = this.mEnvironKeys;
        ArrayList arrayList2 = this.mEnvironValues;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(arrayList.get(i))) {
                this.mEnvironCache = null;
                arrayList.remove(i);
                arrayList2.remove(i);
                break;
            }
        }
        return this;
    }
}
