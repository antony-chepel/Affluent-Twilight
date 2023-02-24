package com.foranj.farm

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.foranj.farm.cvcvbu.Huhshuixhuzs
import com.foranj.farm.databinding.ActivityUqiqosiuxuhcsBinding

class Uqiqosiuxuhcs : AppCompatActivity() {
    private lateinit var ijsjida : SharedPreferences
    var kxzcjiczxji: Int? = 0
    private lateinit var isjsdjisdhu : ActivityUqiqosiuxuhcsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        isjsdjisdhu = ActivityUqiqosiuxuhcsBinding.inflate(layoutInflater)
        setContentView(isjsdjisdhu.root)
        ijsjida = getSharedPreferences("AFF_BALANCE", MODE_PRIVATE)
        kxzcjiczxji = ijsjida.getInt(Huhshuixhuzs.iasjijjdashuwu.toString(), 1000)
        hasygsdt()
    }


    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }

    private fun hasygsdt() = with(isjsdjisdhu){
        siadjiaij.text = kxzcjiczxji.toString()
        xjzcjzjn.setOnClickListener {
            startActivity(Intent(this@Uqiqosiuxuhcs,Fcocoxiyuhxgygsd::class.java))
        }

        siodjiwij.setOnClickListener {
            startActivity(Intent(this@Uqiqosiuxuhcs,Iuwiwisuhxycg::class.java))
        }
        xijixjzcji.setOnClickListener {
            finishAffinity()
        }
    }
}