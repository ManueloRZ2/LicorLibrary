package com.LicorLibrary.licorlibrary.ui.main

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.LicorLibrary.licorlibrary.R
import com.LicorLibrary.licorlibrary.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding : ActivityMainBinding
    private var cal = Calendar.getInstance()
    private var publicationDate = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        /*val TextViewName : EditText = findViewById(R.id.EditTextName)
        val TextViewAuthor : EditText = findViewById(R.id.TextViewAuthor)
        val TextInputCapacity : EditText = findViewById(R.id.TextInputCapacity)

        val SaveButton : Button = findViewById(R.id.ButtonSave)
        val SaveTextView : TextView = findViewById(R.id.TextViewButton)*/

        /*
        val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            cal.set(Calendar.YEAR, year)
            cal.set(Calendar.MONTH, month)
            cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)

            val format = "MM/dd/yyyy"
            val simpleDateFormat = SimpleDateFormat(format, Locale.US)
            publicationDate = simpleDateFormat.format(cal.time).toString()
            mainBinding.buttonDate.text = publicationDate
        }

        with(mainBinding) {

            buttonDate.setOnClickListener{
                DatePickerDialog(
                    this@MainActivity,
                    dateSetListener,
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)
                ).show()
            }
            mainBinding.ButtonSave.setOnClickListener   {

                if(TextViewAuthor.text.isEmpty() ||
                    EditTextName.text.isEmpty() ||
                    TextInputDescription.text?.isEmpty() == true ||
                    TextInputCapacity.text?.isEmpty() == true){

                    Toast.makeText(applicationContext, "Debe diligenciar todos los campos obligatorios", Toast.LENGTH_SHORT).show()

                } else {
                    val Author = TextViewAuthor.text.toString()
                    val NameLicor = EditTextName.text.toString()
                    val Capacity = TextInputCapacity.text.toString().toInt()
                    val Description = TextInputDescription.text.toString()

                    var typeLicor = ""

                    if (checkBoxLicor.isChecked) typeLicor += "Licored"
                    if (checkBoxNoLicor.isChecked) typeLicor += "Not licored"

                    var Score = when {
                        radioButtonOne.isChecked -> 1
                        radioButtonTwo.isChecked -> 2
                        else -> 3
                    }


                    TextViewButton.text = getString(R.string.Info, Author, NameLicor, Capacity, Description, typeLicor)
                }

            }

        }*/

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume(){
        super.onResume()
    }

    override fun onPause(){
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
    }
}