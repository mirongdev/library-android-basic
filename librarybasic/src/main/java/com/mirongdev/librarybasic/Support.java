package com.mirongdev.librarybasic;

import android.content.Context;
import android.widget.Toast;

public class Support {
    private static Toast currentToast;

    public static void alertToast(Context context, String message) {
        if (currentToast != null) {
            currentToast.cancel();
        }
        currentToast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        currentToast.show();
    }
}
