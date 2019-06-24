package com.leon.androidutils

import android.app.Application
import android.content.Context

object AppUtils {
    lateinit var application: Application
    fun initUtils(context: Context) {
        application = context.applicationContext as Application
    }
}