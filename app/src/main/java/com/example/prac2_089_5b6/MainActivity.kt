package com.example.prac2_089_5b6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()
        displayMsg("onStart Method Called")
    }

    override fun onResume() {
        super.onResume()
        displayMsg("onResume Method Called")
    }

    override fun onPause() {
        super.onPause()
        displayMsg("onPause Method Called")
    }

    override fun onStop() {
        super.onStop()
        displayMsg("onStop Method Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        displayMsg("onDestroy Method Called")
    }

    fun displayMsg(msg:String){
        Toast.makeText(this, "$msg", Toast.LENGTH_SHORT).show()
    }
}