package com.example.connivingdog.faceintegration

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import com.facebook.CallbackManager
import com.facebook.FacebookException
import com.facebook.login.LoginResult
import com.facebook.FacebookCallback
import kotlinx.android.synthetic.main.activity_log_in.*
import com.facebook.login.LoginManager
import java.util.*


class logIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)


        var callbackManager = CallbackManager.Factory.create()

        login_button.setReadPermissions(Arrays.asList(editText.text.toString()))

        LoginManager.getInstance().registerCallback(callbackManager,
                object : FacebookCallback<LoginResult> {
                    override fun onSuccess(loginResult: LoginResult) {
                        // App code
                        Snackbar.make(this@logIn.findViewById(android.R.id.content),"logged in",Snackbar.LENGTH_SHORT)
                    }

                    override fun onCancel() {
                        // App code
                    }

                    override fun onError(exception: FacebookException) {
                        // App code
                    }
                })
    }
}
