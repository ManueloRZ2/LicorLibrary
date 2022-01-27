package com.LicorLibrary.licorlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.LicorLibrary.licorlibrary.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        /*val TextViewName : EditText = findViewById(R.id.EditTextName)
        val TextViewAuthor : EditText = findViewById(R.id.TextViewAuthor)
        val TextInputCapacity : EditText = findViewById(R.id.TextInputCapacity)

        val SaveButton : Button = findViewById(R.id.ButtonSave)
        val SaveTextView : TextView = findViewById(R.id.TextViewButton)*/


        mainBinding.ButtonSave.setOnClickListener{
            val Information : String = mainBinding.textViewName.text.toString() + ", " + mainBinding.TextViewAuthor.text.toString() + ", " + mainBinding.TextInputCapacity.text.toString()

            mainBinding.TextViewButton.text = Information
        }
    }
}