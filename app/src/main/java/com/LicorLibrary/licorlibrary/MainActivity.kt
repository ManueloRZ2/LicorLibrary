package com.LicorLibrary.licorlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TextViewName : EditText = findViewById(R.id.EditTextName)
        val TextViewAuthor : EditText = findViewById(R.id.TextViewAuthor)
        val TextInputCapacity : EditText = findViewById(R.id.TextInputCapacity)

        val SaveButton : Button = findViewById(R.id.ButtonSave)
        val SaveTextView : TextView = findViewById(R.id.TextViewButton)

        SaveButton.setOnClickListener{
            val Information : String = TextViewName.text.toString() + ", " + TextViewAuthor.text.toString() + ", " + TextInputCapacity.text.toString()

            SaveTextView.text = Information
        }
    }
}