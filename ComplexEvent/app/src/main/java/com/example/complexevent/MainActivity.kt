package com.example.complexevent

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var progressBarValue = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText=findViewById<EditText>(R.id.editText)
        val checkBox=findViewById<CheckBox>(R.id.checkBox)
        val button=findViewById<Button>(R.id.button)
        val textView=findViewById<TextView>(R.id.textView)
        val progressBar=findViewById<ProgressBar>(R.id.progressBar)
        button.setOnClickListener {
            if (checkBox.isChecked) {
                textView.text=editText.text.toString()
                progressBarValue+=10
                if (progressBarValue>100) {
                    progressBarValue=100
                }
                progressBar.progress=progressBarValue
            }
        }
    }
}