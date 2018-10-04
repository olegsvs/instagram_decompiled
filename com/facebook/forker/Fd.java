package com.facebook.forker;

import java.io.FileDescriptor;
import java.lang.reflect.Field;

public final class Fd {
    private static volatile Field mDescriptorField;

    public static int fileno(FileDescriptor fileDescriptor) {
        try {
            Field field = mDescriptorField;
            if (field == null) {
                field = FileDescriptor.class.getDeclaredField("descriptor");
                field.setAccessible(true);
                mDescriptorField = field;
            }
            return field.getInt(fileDescriptor);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static FileDescriptor of(int i) {
        FileDescriptor fileDescriptor = new FileDescriptor();
        try {
            Field field = mDescriptorField;
            if (field == null) {
                field = FileDescriptor.class.getDeclaredField("descriptor");
                field.setAccessible(true);
                mDescriptorField = field;
            }
            field.setInt(fileDescriptor, i);
            return fileDescriptor;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
