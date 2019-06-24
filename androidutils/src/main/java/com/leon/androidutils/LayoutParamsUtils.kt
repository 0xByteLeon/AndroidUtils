package com.leon.androidutils

import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.dip

class LayoutParamsUtils(val view: View) {
    var layoutParams: ViewGroup.LayoutParams = view.layoutParams

    fun setMargin(view:View,left:Float,top:Float,right:Float,bottom:Float): LayoutParamsUtils {
        layoutParams.let {
            if (it is ViewGroup.MarginLayoutParams){
                it.leftMargin = dp2px(left)
                it.topMargin = dp2px(top)
                it.rightMargin = dp2px(right)
                it.bottomMargin = dp2px(bottom)
            }
        }
        return this
    }

    fun setHorizontalMargin(horizontalMargin:Float): LayoutParamsUtils {
        layoutParams.let {
            if (it is ViewGroup.MarginLayoutParams){
                it.leftMargin = dp2px(horizontalMargin)
                it.rightMargin = dp2px(horizontalMargin)
            }
        }
        return this
    }

    fun setVerticalMargin(verticalMargin:Float): LayoutParamsUtils {
        layoutParams.let {
            if (it is ViewGroup.MarginLayoutParams){
                it.topMargin = dp2px(verticalMargin)
                it.rightMargin = dp2px(verticalMargin)
            }
        }
        return this
    }

    fun apply(){
        view.layoutParams = layoutParams
    }

    private fun dp2px(dp:Float):Int{
        return AppUtils.application.dip(dp)
    }

    private fun dp2px(dp:Int):Int{
        return AppUtils.application.dip(dp)
    }
}