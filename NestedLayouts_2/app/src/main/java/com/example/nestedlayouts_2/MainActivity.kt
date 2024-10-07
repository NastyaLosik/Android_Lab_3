package com.example.nestedlayouts_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var currentValue = 1
    private var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView11=findViewById<TextView>(R.id.textView11)
        val textView12=findViewById<TextView>(R.id.textView12)
        val textView13=findViewById<TextView>(R.id.textView13)
        val textView21=findViewById<TextView>(R.id.textView21)
        val textView22=findViewById<TextView>(R.id.textView22)
        val textView23=findViewById<TextView>(R.id.textView23)
        val textView31=findViewById<TextView>(R.id.textView31)
        val textView32=findViewById<TextView>(R.id.textView32)
        val textView33=findViewById<TextView>(R.id.textView33)
        val button=findViewById<Button>(R.id.RollButton)
        button.setOnClickListener {
            when (currentValue) {
                1 -> {
                    textView11.text=(currentValue + count).toString()
                    textView21.text=(currentValue + count).toString()
                    textView31.text=(currentValue + count).toString()
                    textView13.text=""
                    textView23.text=""
                    textView33.text=""
                }
                2 -> {
                    textView11.text=(currentValue + count).toString()
                    textView21.text=(currentValue + count).toString()
                    textView31.text=(currentValue + count).toString()
                    textView12.text=(currentValue + count).toString()
                    textView22.text=(currentValue + count).toString()
                    textView32.text=(currentValue + count).toString()
                    textView11.text=""
                    textView21.text=""
                    textView31.text=""
                }
                3 -> {
                    textView13.text=(currentValue + count).toString()
                    textView23.text=(currentValue + count).toString()
                    textView33.text=(currentValue + count).toString()
                    textView12.text=""
                    textView22.text=""
                    textView32.text=""
                }
            }
            currentValue++
            if (currentValue>3) {
                currentValue=1
                count+=3
            }
        }
    }
}
