package com.ids.little.farm.time.wowoqkokq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ids.little.farm.time.databinding.ActivityNllsiyudygdgygyefBinding

class Nllsiyudygdgygyef : AppCompatActivity() {
    private lateinit var kixuhuhsc : ActivityNllsiyudygdgygyefBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kixuhuhsc = ActivityNllsiyudygdgygyefBinding.inflate(layoutInflater)
        setContentView(kixuhuhsc.root)
        woqkkokodijsa()
    }



    private fun woqkkokodijsa() = with(kixuhuhsc){

        bPl.setOnClickListener {
            startActivity(Intent(this@Nllsiyudygdgygyef,Gowkkoqkoijsjid::class.java))
        }
        bEx.setOnClickListener {
            finishAffinity()
        }
        val ysgadgw = intent.getIntExtra("scrs_ipl",5)
      if(ysgadgw <=5){
          tvTxt.text = "Bad now, should training more"
          scrCthe.text = "You catched $ysgadgw balls"

      } else if(ysgadgw ==10) {
          tvTxt.text = "Good result, close to pro"
          scrCthe.text = "You catched $ysgadgw balls"
      }

      else if(ysgadgw >=20) {
          tvTxt.text = "Congratulate, you are real pro"

      } else {
          scrCthe.text = "You catched $ysgadgw balls"
      }




    }
}