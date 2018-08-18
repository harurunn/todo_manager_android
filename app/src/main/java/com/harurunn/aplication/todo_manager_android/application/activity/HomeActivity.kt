package com.harurunn.aplication.todo_manager_android.application.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.harurunn.aplication.todo_manager_android.R
import com.harurunn.aplication.todo_manager_android.application.fragment.NavigationBarFragment
import com.harurunn.aplication.todo_manager_android.extention.replaceFragment

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        showNavigationBar()
    }

    private fun showNavigationBar(){
        replaceFragment(R.id.navigation_recycler, NavigationBarFragment.newInstance())
    }

}
