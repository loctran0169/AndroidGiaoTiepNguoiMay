package vn.edu.uit.nhannguoimay.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import vn.edu.uit.nhannguoimay.R

class AdapterChat(val context: Context) : RecyclerView.Adapter<AdapterChat.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterChat.ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_chat, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: AdapterChat.ViewHolder, position: Int) {

    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}