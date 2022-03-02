package com.LicorLibrary.licorlibrary.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.LicorLibrary.licorlibrary.R
import com.LicorLibrary.licorlibrary.models.Licor

class AdapterLicor (
    private val licorList: ArrayList<Licor>
        ) :RecyclerView.Adapter<AdapterLicor.LicorViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LicorViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.card_item_licor, parent, false)
        return LicorViewHolder(view)
    }

    override fun onBindViewHolder(holder: LicorViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

    }

    class LicorViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){

    }
}
