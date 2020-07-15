package com.example.rememberthat.LoginFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.rememberthat.R
import kotlinx.android.synthetic.main.fragment_login.view.*


/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        view.login_button.setOnClickListener {

            Toast.makeText(this.context, "Login Clicked", Toast.LENGTH_SHORT).show()

            //Navigation.findNavController(view)
            //     .navigate(R.id.)
        }
        view.newUser_id.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.newUserFragment)

        }

        view.forgotPassword_id.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.forgotPageFragment)

        }


        return view
    }

}

