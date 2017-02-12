package com.rogiry.clog;

import android.content.Context;
import android.util.Log;

/**
 * Created by Kang on 2016-11-02.
 */

public class CLog {
    private Context c;

    private String packageName = null;
    private String basicTag = "CLog::";

    public CLog(Context c) {
        this.c = c;
        packageName = c.getApplicationContext().getPackageName() + ".";
    }

    public CLog(String packageName) {
        this.packageName = packageName;
    }

    public void d(String msg){
        Log.d(TraceResult(), msg);
    }

    public void e(String msg){
        Log.e(TraceResult(), msg);
    }

    public void i(String msg){
        Log.i(TraceResult(), msg);
    }

    public void v(String msg){
        Log.v(TraceResult(), msg);
    }

    private String TraceResult() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        String className = elements[4].getClassName().replace(packageName, "");
        String methodName = elements[4].getMethodName();
        int lineNumber = elements[4].getLineNumber();
        String fileName = elements[4].getFileName();

        return basicTag + "[" + className + "]"
                + "->" + methodName + "(" + fileName + ":" + lineNumber + ")";
    }
}