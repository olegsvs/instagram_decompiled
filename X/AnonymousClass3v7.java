package X;

import com.facebook.forker.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.3v7 */
public final class AnonymousClass3v7 implements AnonymousClass2uj {
    /* renamed from: B */
    private ByteBuffer f46754B;
    /* renamed from: C */
    private int f46755C = -1;
    /* renamed from: D */
    private int f46756D = 0;
    /* renamed from: E */
    private boolean f46757E;
    /* renamed from: F */
    private ByteBuffer f46758F;
    /* renamed from: G */
    private int f46759G = -1;

    public final int AP() {
        return 2;
    }

    public AnonymousClass3v7() {
        ByteBuffer byteBuffer = AnonymousClass2uj.f35676B;
        this.f46754B = byteBuffer;
        this.f46758F = byteBuffer;
    }

    public final int BP() {
        return this.f46759G;
    }

    public final boolean EF(int i, int i2, int i3) {
        if (!(i3 == 3 || i3 == 2 || i3 == Process.WAIT_RESULT_TIMEOUT)) {
            if (i3 != 1073741824) {
                throw new AnonymousClass2ui(i, i2, i3);
            }
        }
        if (this.f46759G == i && this.f46755C == i2 && this.f46756D == i3) {
            return false;
        }
        this.f46759G = i;
        this.f46755C = i2;
        this.f46756D = i3;
        return true;
    }

    public final boolean OX() {
        return this.f46757E && this.f46758F == AnonymousClass2uj.f35676B;
    }

    public final void YIA() {
        this.f46757E = true;
    }

    public final void ZIA(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f46756D;
        if (i2 != Process.WAIT_RESULT_TIMEOUT) {
            if (i2 == 3) {
                i *= 2;
            } else if (i2 == 1073741824) {
                i /= 2;
            }
            if (this.f46754B.capacity() >= i) {
                this.f46754B = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            } else {
                this.f46754B.clear();
            }
            i2 = this.f46756D;
            if (i2 != Process.WAIT_RESULT_TIMEOUT) {
                while (position < limit) {
                    this.f46754B.put(byteBuffer.get(position + 1));
                    this.f46754B.put(byteBuffer.get(position + 2));
                    position += 3;
                }
            } else if (i2 != 3) {
                while (position < limit) {
                    this.f46754B.put((byte) 0);
                    this.f46754B.put((byte) ((byteBuffer.get(position) & 255) - 128));
                    position++;
                }
            } else if (i2 == 1073741824) {
                while (position < limit) {
                    this.f46754B.put(byteBuffer.get(position + 2));
                    this.f46754B.put(byteBuffer.get(position + 3));
                    position += 4;
                }
            }
            byteBuffer.position(byteBuffer.limit());
            this.f46754B.flip();
            this.f46758F = this.f46754B;
            return;
        }
        i = (i / 3) * 2;
        if (this.f46754B.capacity() >= i) {
            this.f46754B.clear();
        } else {
            this.f46754B = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        i2 = this.f46756D;
        if (i2 != Process.WAIT_RESULT_TIMEOUT) {
            while (position < limit) {
                this.f46754B.put(byteBuffer.get(position + 1));
                this.f46754B.put(byteBuffer.get(position + 2));
                position += 3;
            }
        } else if (i2 != 3) {
            while (position < limit) {
                this.f46754B.put((byte) 0);
                this.f46754B.put((byte) ((byteBuffer.get(position) & 255) - 128));
                position++;
            }
        } else if (i2 == 1073741824) {
            while (position < limit) {
                this.f46754B.put(byteBuffer.get(position + 2));
                this.f46754B.put(byteBuffer.get(position + 3));
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f46754B.flip();
        this.f46758F = this.f46754B;
        return;
        throw new IllegalStateException();
    }

    public final void flush() {
        this.f46758F = AnonymousClass2uj.f35676B;
        this.f46757E = false;
    }

    public final boolean isActive() {
        int i = this.f46756D;
        return (i == 0 || i == 2) ? false : true;
    }

    public final void reset() {
        flush();
        this.f46759G = -1;
        this.f46755C = -1;
        this.f46756D = 0;
        this.f46754B = AnonymousClass2uj.f35676B;
    }

    public final ByteBuffer yO() {
        ByteBuffer byteBuffer = this.f46758F;
        this.f46758F = AnonymousClass2uj.f35676B;
        return byteBuffer;
    }

    public final int zO() {
        return this.f46755C;
    }
}
