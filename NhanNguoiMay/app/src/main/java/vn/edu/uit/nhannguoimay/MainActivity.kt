package vn.edu.uit.nhannguoimay

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_choose.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)
        ql1.setOnClickListener {
            val intentx = Intent(this,FragmentChoose::class.java)
            intentx.putExtra("name","ql1")
            startActivity(intentx)
        }
        ql2.setOnClickListener {
            val intentx = Intent(this,FragmentChoose::class.java)
            intentx.putExtra("name","ql2")
            startActivity(intentx)
        }
        xc1.setOnClickListener {
            val intentx = Intent(this,FragmentChoose::class.java)
            intentx.putExtra("name","xc1")
            startActivity(intentx)
        }
        xc2.setOnClickListener {
            val intentx = Intent(this,FragmentChoose::class.java)
            intentx.putExtra("name","xc2")
            startActivity(intentx)
        }
        xc3.setOnClickListener {
            val intentx = Intent(this,FragmentChoose::class.java)
            intentx.putExtra("name","xc3")
            startActivity(intentx)
        }
        xc4.setOnClickListener {
            val intentx = Intent(this,FragmentChoose::class.java)
            intentx.putExtra("name","xc4")
            startActivity(intentx)
        }
    }

}

