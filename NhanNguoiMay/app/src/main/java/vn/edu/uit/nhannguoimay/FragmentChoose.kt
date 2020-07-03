package vn.edu.uit.nhannguoimay

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class FragmentChoose : AppCompatActivity() {

    var idFrag = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name = intent.getStringExtra("name")
        when (name) {
            "ql1" -> {
                openFragment(FragmentQuanLy1(), name)
            }
            "ql2" -> {
                openFragment(FragmentQuanLy2(), name)
            }
            "xc1" -> {
                openFragment(FragmentXemChung1(), name)
            }
            "xc2" -> {
                openFragment(FragmentXemChung2(), name)
            }
            "xc3" -> {
                openFragment(
                    FragmentXemChung3("HOME", resources.getDrawable(R.drawable.liver)),
                    name
                )
            }
            "xc4" -> {
                openFragment(
                    FragmentXemChung3("AWAY", resources.getDrawable(R.drawable.manches)),
                    name
                )
            }
        }
    }

    private fun openFragment(fragment: Fragment, name: String) {
        if (!idFrag) {
            supportFragmentManager.beginTransaction()
                .add(R.id.frmMain, fragment, name).commit()
            idFrag = true
        } else {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frmMain, fragment, name).commit()
        }
    }
}