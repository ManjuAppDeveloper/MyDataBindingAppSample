package com.example.mydatabindingappsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mydatabindingappsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var mainBinding : ActivityMainBinding
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var userModel = UserModel()
        userModel.uName = "Manjunath"
        userModel.pwd = "143Darling"
        mainBinding.userModel = userModel
    }
}