package cn.paojiao.sqlitefinal.utils;

import android.database.Cursor;
import java.io.Closeable;

/**
 * Desction:IO工具类
 * Author:pengjianbo
 * Date:15/7/3 上午11:04
 */
public class IOUtils {

    private IOUtils() {
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable e) {
            }
        }
    }

    public static void closeQuietly(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable e) {
            }
        }
    }
}
