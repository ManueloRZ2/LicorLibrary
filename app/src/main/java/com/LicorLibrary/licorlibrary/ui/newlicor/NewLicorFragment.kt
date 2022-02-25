package com.LicorLibrary.licorlibrary.ui.newlicor

import android.app.DatePickerDialog
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.LicorLibrary.licorlibrary.R
import com.LicorLibrary.licorlibrary.databinding.FragmentNewLicorBinding
import com.LicorLibrary.licorlibrary.models.Licor
import java.text.SimpleDateFormat
import java.util.*

class NewLicorFragment : Fragment() {

    companion object {
        fun newInstance() = NewLicorFragment()
    }

    private lateinit var newLicorBinding: FragmentNewLicorBinding
    private lateinit var viewModel: NewLicorViewModel
    private var cal = Calendar.getInstance()
    private var publicationDate = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        newLicorBinding = FragmentNewLicorBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(NewLicorViewModel::class.java)
        return newLicorBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            cal.set(Calendar.YEAR, year)
            cal.set(Calendar.MONTH, month)
            cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)

            val format = "MM/dd/yyyy"
            val simpleDateFormat = SimpleDateFormat(format, Locale.US)
            publicationDate = simpleDateFormat.format(cal.time).toString()
            newLicorBinding.buttonDate.text = publicationDate
        }

        with(newLicorBinding){

            buttonDate.setOnClickListener{
                DatePickerDialog(
                    requireContext(),
                    dateSetListener,
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)
                ).show()
            }

            newLicorBinding.ButtonSave.setOnClickListener{

                if(TextViewAuthor.text.isEmpty() ||
                    EditTextName.text.isEmpty() ||
                    TextInputDescription.text?.isEmpty() == true ||
                    TextInputCapacity.text?.isEmpty() == true){

                    Toast.makeText(
                        requireContext(),
                        "Debe diligenciar todos los campos obligatorios",
                        Toast.LENGTH_SHORT
                    ).show()

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


                    val licor = Licor(
                        name = Author,
                        author = NameLicor,
                        Capacity = Capacity,
                        Description = Description,
                        PublicationDate = publicationDate)
                }

                findNavController().navigate(NewLicorFragmentDirections.actionNewLicorFragmentToDetalleFragment(licor))

            }
            }
        }
    }

