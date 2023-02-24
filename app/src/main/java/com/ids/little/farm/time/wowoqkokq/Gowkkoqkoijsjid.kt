package com.ids.little.farm.time.wowoqkokq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ids.little.farm.time.databinding.ActivityGowkkoqkoijsjidBinding

class Gowkkoqkoijsjid : AppCompatActivity() {
    private lateinit var ldlsosdjifji : ActivityGowkkoqkoijsjidBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ldlsosdjifji = ActivityGowkkoqkoijsjidBinding.inflate(layoutInflater)
        setContentView(ldlsosdjifji.root)
        usioadjiwji()
    }


    private fun usioadjiwji() = with(ldlsosdjifji){
        imEsd.setOnClickListener {
            startActivity(Intent(this@Gowkkoqkoijsjid,Yowowkkowjishuxc::class.java)
                .putExtra("ipl_md",0))
        }

        imMed.setOnClickListener {
            startActivity(Intent(this@Gowkkoqkoijsjid,Yowowkkowjishuxc::class.java)
                .putExtra("ipl_md",1))
        }

        imHard.setOnClickListener {
            startActivity(Intent(this@Gowkkoqkoijsjid,Yowowkkowjishuxc::class.java)
                .putExtra("ipl_md",2))
        }
    }
}