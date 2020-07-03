package vn.edu.uit.nhannguoimay

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_choose.*
import kotlinx.android.synthetic.main.fragment_quanly2.*
import vn.edu.uit.nhannguoimay.adapters.AdapterFilmVertical

class FragmentQuanLy2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(context).inflate(R.layout.fragment_quanly2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapterSpinner1 = ArrayAdapter(
            requireContext(),
            R.layout.item_sub_name,
            listOf("Thể loại", "Hành động", "Hoạt hình")
        )
        adapterSpinner1.setDropDownViewResource(R.layout.item_sub_name_dropdown)
        spinner1.adapter = adapterSpinner1
        val adapterSpinner2 = ArrayAdapter(
            requireContext(),
            R.layout.item_sub_name,
            listOf("Quốc gia", "Việt nam", "Nhật bản")
        )
        adapterSpinner2.setDropDownViewResource(R.layout.item_sub_name_dropdown)
        spinner2.adapter = adapterSpinner2
        val adapterSpinner3 =
            ArrayAdapter(requireContext(), R.layout.item_sub_name, listOf("Năm", "2019", "2020"))
        adapterSpinner3.setDropDownViewResource(R.layout.item_sub_name_dropdown)
        spinner3.adapter = adapterSpinner3
        rcvPhim.adapter = AdapterFilmVertical(requireContext(), 10, true)

        btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

    public fun View.hideKeyboard() {
        val inputMethodManager =
            context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
    }
}