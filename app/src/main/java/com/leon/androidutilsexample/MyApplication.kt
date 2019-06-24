package com.leon.androidutilsexample

import android.app.Application
import com.leon.androidutils.AppUtils

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        AppUtils.initUtils(this)
    }
}