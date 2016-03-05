package com.example.osx.rxjavav;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;

/**
 * Created by osx on 09/10/15.
 */
public class ProgressDialogg {

    public static ProgressDialog dialog;
    public static void getDialog(Context context){
        dialog=new ProgressDialog(context, ProgressDialog.THEME_HOLO_LIGHT);
        if(!dialog.isShowing()){
            dialog.setIndeterminate(true);
            dialog.setMessage("Loading...");
            dialog.setCancelable(false);
            dialog.show();
        }
    }
    public static void dismisss(){
        if(dialog!=null || dialog.isShowing()){
            dialog.dismiss();
        }
    }
}
