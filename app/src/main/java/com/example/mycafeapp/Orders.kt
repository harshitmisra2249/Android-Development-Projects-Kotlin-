package com.example.mycafeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_orders.*

class Orders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders)

        val ordersOfCustomer= intent.getStringExtra(MainActivity.KEY)

        coffeeOrder.text= "Order Placed " + ordersOfCustomer.toString()
    }
}