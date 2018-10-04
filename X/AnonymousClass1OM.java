package X;

/* renamed from: X.1OM */
public final class AnonymousClass1OM {
    /* renamed from: B */
    public static long m11154B(String str, long j) {
        try {
            str = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
            Class cls = Class.forName("libcore.io.Libcore");
            Class cls2 = Class.forName("libcore.io.Os");
            Object obj = cls.getField("os").get(null);
            return ((Long) cls2.getMethod("sysconf", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(str)})).longValue();
        } catch (Exception e) {
            AnonymousClass1OM.m11155C(e);
            return j;
        } catch (Exception e2) {
            AnonymousClass1OM.m11155C(e2);
            return j;
        } catch (Exception e22) {
            AnonymousClass1OM.m11155C(e22);
            return j;
        } catch (Exception e222) {
            AnonymousClass1OM.m11155C(e222);
            return j;
        } catch (Exception e2222) {
            AnonymousClass1OM.m11155C(e2222);
            return j;
        }
    }

    /* renamed from: C */
    private static void m11155C(Exception exception) {
        AnonymousClass1OI.m11151C("Sysconf", "Unable to read _SC_CLK_TCK by reflection", exception);
    }
}
