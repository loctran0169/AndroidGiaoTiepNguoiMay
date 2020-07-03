package vn.edu.uit.nhannguoimay

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_choose.*
import kotlinx.android.synthetic.main.fragment_xemchung3.*
import vn.edu.uit.nhannguoimay.adapters.AdapterChat

class FragmentXemChung3(val name: String, val img: Drawable) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(context).inflate(R.layout.fragment_xemchung3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvNhaKhach.text = name
        imgTeam.setImageDrawable(img)
        rcvChat.adapter = AdapterChat(requireContext())
    }
}