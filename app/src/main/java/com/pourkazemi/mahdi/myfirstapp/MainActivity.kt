package com.pourkazemi.mahdi.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pourkazemi.mahdi.myfirstapp.databinding.ActivityMainBinding

const val TAG = "MainActivity"
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG,"onCreateCalled")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause Called")

    }

    override fun onStop() {
        super.onStop()
        binding.textview.text="goodbye"

        Log.d(TAG,"onStop Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart Called")
    }
}