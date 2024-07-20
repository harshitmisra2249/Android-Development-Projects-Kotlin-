package com.example.mycafeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.btnOrder
import kotlinx.android.synthetic.main.activity_main.eT1
import kotlinx.android.synthetic.main.activity_main.eT2
import kotlinx.android.synthetic.main.activity_main.eT3
import kotlinx.android.synthetic.main.activity_main.eT4

class MainActivity : AppCompatActivity() {

    // creating key
    companion object {
        const val KEY = "com.example.day13.MainActivity.KEY"
    }
    private lateinit var binding: activity_mainbinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnOrder.setOnClickListener{
            val ordersPlaced = eT1.text.toString() + " " + eT2.text.toString() + " "+
                    eT3.text.toString() + " " + eT4.text.toString()

            intent= Intent(this, Orders::class.java)
            intent.putExtra(KEY, ordersPlaced)
            startActivity(intent)

        }
    }
}