package org.webrtc;

public class NativeLibrary {
    public static String TAG = "NativeLibrary";
    private static boolean libraryLoaded = false;
    private static Object lock = new Object();

    public class DefaultLoader implements NativeLibraryLoader {
        public boolean load(String str) {
            String str2 = NativeLibrary.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Loading library: ");
            stringBuilder.append(str);
            Logging.m29383d(str2, stringBuilder.toString());
            try {
                System.loadLibrary(str);
                return true;
            } catch (Throwable e) {
                str2 = NativeLibrary.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to load native library: ");
                stringBuilder.append(str);
                Logging.m29385e(str2, stringBuilder.toString(), e);
                return false;
            }
        }
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader) {
        synchronized (lock) {
            if (libraryLoaded) {
                Logging.m29383d(TAG, "Native library has already been loaded.");
            } else {
                Logging.m29383d(TAG, "Loading native library.");
                libraryLoaded = nativeLibraryLoader.load("jingle_peerconnection_so");
            }
        }
    }

    public static boolean isLoaded() {
        boolean z;
        synchronized (lock) {
            z = libraryLoaded;
        }
        return z;
    }
}
