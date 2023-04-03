package com.example.selectplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class view {

}

class MainActivity : AppCompatActivity() {


    fun download (view :view){

        val countDownTimer = object : CountDownTimer(1000, 500)
                override fun onTick(millisUntilFinished: Long){
                    if (progressBar.progress < progressBar.max)
                }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}