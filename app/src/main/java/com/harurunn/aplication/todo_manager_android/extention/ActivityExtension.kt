package com.harurunn.aplication.todo_manager_android.extention

import android.support.annotation.IdRes
import android.support.v4.app.FragmentActivity

fun FragmentActivity.replaceFragment(
    @IdRes resourceId: Int,
    fragment: android.support.v4.app.Fragment
){
    return supportFragmentManager.beginTransaction()
        .replace(resourceId, fragment)
        .commitNowAllowingStateLoss()
}
