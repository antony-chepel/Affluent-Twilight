package com.foranj.farm

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.foranj.farm.cvcvbu.Huhshuixhuzs
import com.foranj.farm.databinding.ActivityIuwiwisuhxycgBinding
import com.google.android.material.snackbar.Snackbar

class Iuwiwisuhxycg : AppCompatActivity() {
    private lateinit var ijsjida : SharedPreferences
    private lateinit var zxjuxzhcxh : ActivityIuwiwisuhxycgBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        zxjuxzhcxh = ActivityIuwiwisuhxycgBinding.inflate(layoutInflater)
        setContentView(zxjuxzhcxh.root)
        ijsjida = getSharedPreferences("AFF_BALANCE", MODE_PRIVATE)
        hzxytfczxft()
    }


    private fun hzxytfczxft() = with(zxjuxzhcxh){
        icBImp.setOnClickListener {
            startActivity(Intent(this@Iuwiwisuhxycg,Uqiqosiuxuhcs::class.java))
        }

        sioadsjiaisjd.setOnClickListener {
            ijsjida.edit().putInt(Huhshuixhuzs.iasjijjdashuwu.toString(),1000).apply()
            Snackbar.make(zxjuxzhcxh.root,"Your balance refresh to default",Snackbar.LENGTH_SHORT).show()
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this,Uqiqosiuxuhcs::class.java))
    }
}