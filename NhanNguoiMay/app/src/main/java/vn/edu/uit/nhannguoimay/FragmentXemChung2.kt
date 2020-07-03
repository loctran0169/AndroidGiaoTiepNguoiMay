package vn.edu.uit.nhannguoimay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_xemchung2.*
import vn.edu.uit.nhannguoimay.adapters.AdapterFilmVertical
import vn.edu.uit.nhannguoimay.adapters.AdapterUser

class FragmentXemChung2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(context).inflate(R.layout.fragment_xemchung2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rcvUser.adapter = AdapterUser(requireContext())
        rcvDangCho.adapter = AdapterFilmVertical(requireContext(), 1)
        btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}