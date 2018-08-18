package com.harurunn.aplication.todo_manager_android.application.fragment

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.harurunn.aplication.todo_manager_android.application.adapter.NavigationBarAdapter
import com.harurunn.aplication.todo_manager_android.databinding.FragmentNavigationBarBinding

class NavigationBarFragment: android.support.v4.app.Fragment(){
    private lateinit var myContext: Context
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var binding: FragmentNavigationBarBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        myContext = context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentNavigationBarBinding.inflate(inflater, container, false)
        binding.navigationBarRecyclerView.layoutManager = LinearLayoutManager(myContext)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val list = ArrayList<String>()
        for (i in 0..99) {
            list.add(i.toString())
        }

        viewAdapter = NavigationBarAdapter(list)
        binding.navigationBarRecyclerView.adapter = viewAdapter
    }

    companion object {
        fun newInstance(): NavigationBarFragment{
            return  NavigationBarFragment()
        }
    }
}
