package fragment

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.harurunn.aplication.todo_manager_android.databinding.FragmentNavigationBarBinding

class NavigationBarFragment:Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val binding = FragmentNavigationBarBinding.inflate(inflater, container, false)
        //return super.onCreateView(inflater, container, savedInstanceState)

        return binding.root
    }
}
