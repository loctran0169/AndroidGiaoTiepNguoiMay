package vn.edu.uit.nhannguoimay.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import vn.edu.uit.nhannguoimay.R

class AdapterUser(val context: Context)  : RecyclerView.Adapter<AdapterUser.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterUser.ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_user,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: AdapterUser.ViewHolder, position: Int) {

    }

    inner  class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

    }
}