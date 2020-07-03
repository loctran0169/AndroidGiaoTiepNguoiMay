package vn.edu.uit.nhannguoimay.adapters

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joooonho.SelectableRoundedImageView
import vn.edu.uit.nhannguoimay.R

class AdapterFilmVertical(val context: Context, val num: Int, val isSelect: Boolean = false) :
    RecyclerView.Adapter<AdapterFilmVertical.ViewHolder>() {

    private var idSelected: Int = -1
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterFilmVertical.ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return num
    }

    override fun onBindViewHolder(holder: AdapterFilmVertical.ViewHolder, position: Int) {
        if (idSelected == position)
            holder.img.borderColor = Color.RED
        else
            holder.img.borderColor = Color.TRANSPARENT

        holder.img.setOnClickListener {
            if (!isSelect) return@setOnClickListener
            notifyItemChanged(idSelected)
            if (holder.img.borderColor == Color.TRANSPARENT) {
                holder.img.borderColor = Color.RED
                idSelected = position
            } else {
                holder.img.borderColor = Color.TRANSPARENT
                idSelected = -1
            }
        }
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img = view.findViewById<SelectableRoundedImageView>(R.id.imgFilm)
    }
}