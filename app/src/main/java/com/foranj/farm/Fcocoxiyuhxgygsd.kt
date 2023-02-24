package com.foranj.farm

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import com.foranj.farm.cvcvbu.Huhshuixhuzs
import com.foranj.farm.databinding.ActivityFcocoxiyuhxgygsdBinding
import kotlin.random.Random

class Fcocoxiyuhxgygsd : AppCompatActivity() {
    private lateinit var isjdjisdkosoksdko : SharedPreferences
    private lateinit var sajjidasji : SharedPreferences
    private lateinit var wppqlpqkowkosko : ActivityFcocoxiyuhxgygsdBinding
    private var ijxcijcxivjxcvji = 5
    private var hbxcjnvjnxvjnc: CountDownTimer? = null
    private var jisajidijasokxokzcko = false



    var uhxchuhuhuxc: Int? = 0









    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        wppqlpqkowkosko = ActivityFcocoxiyuhxgygsdBinding.inflate(layoutInflater)
        setContentView(wppqlpqkowkosko.root)
        isjdjisdkosoksdko = getSharedPreferences("AFF_BALANCE", MODE_PRIVATE)
        uhxchuhuhuxc = isjdjisdkosoksdko.getInt(Huhshuixhuzs.iasjijjdashuwu.toString(), 1000)
        sajjidasji = getSharedPreferences("win_res_aff", Context.MODE_PRIVATE)
        wppqlpqkowkosko.ncnxbuvhhudshu.text = uhxchuhuhuxc.toString()
        wppqlpqkowkosko.ijcxjijivhusdugysdgy.text = ijxcijcxivjxcvji.toString()
        skoaokdaskoasdo()
        wppqlpqkowkosko.icBackImpGmSec.setOnClickListener {
            startActivity(Intent(this,Uqiqosiuxuhcs::class.java))
        }
        wppqlpqkowkosko.sijdji.setOnClickListener {
            if(uhxchuhuhuxc!= 0){
                if(ijxcijcxivjxcvji<=uhxchuhuhuxc!!){
                    uhxchuhuhuxc = uhxchuhuhuxc!!.minus(ijxcijcxivjxcvji)
                    wppqlpqkowkosko.ncnxbuvhhudshu.text = uhxchuhuhuxc.toString()
                    isjdjisdkosoksdko.edit().putInt(Huhshuixhuzs.iasjijjdashuwu.toString(), uhxchuhuhuxc!!).apply()

                    if(uhxchuhuhuxc!!<0){
                        uhxchuhuhuxc = 0
                        wppqlpqkowkosko.ncnxbuvhhudshu.text = uhxchuhuhuxc.toString()
                        isjdjisdkosoksdko.edit().putInt(Huhshuixhuzs.iasjijjdashuwu.toString(), uhxchuhuhuxc!!).apply()
                    }
                    fokkosdkodso()
                } else {
                    Toast.makeText(this, "Your balance is lower thant bet", Toast.LENGTH_SHORT).show()
                    ijxcijcxivjxcvji = 5
                    wppqlpqkowkosko.ijcxjijivhusdugysdgy.text = ijxcijcxivjxcvji.toString()
                }

            } else {
                Toast.makeText(this, "Your balance is 0", Toast.LENGTH_SHORT).show()
            }
        }
    }


    private fun fokkosdkodso() = with(wppqlpqkowkosko){
        var sjidijsdji = 0
        hbxcjnvjnxvjnc?.cancel()

        hbxcjnvjnxvjnc = object : CountDownTimer(10000, 100) {
            override fun onTick(millisUntilFinished: Long) {
                jisajidijasokxokzcko = true
                sjidijsdji++
                sijdji.isClickable = false
                sijdji.alpha = 0.7f
                sijaijwdhuuhsd.isClickable = false
                apskoakoijsudh.isClickable = false

                if(sjidijsdji>6) sjidijsdji = 0
                imAffIt1.setImageResource(Huhshuixhuzs.wokoskokoajidasji[sjidijsdji])
                imAffIt2.setImageResource(Huhshuixhuzs.wokoskokoajidasji[sjidijsdji])
                imAffIt3.setImageResource(Huhshuixhuzs.wokoskokoajidasji[sjidijsdji])
                imAffIt4.setImageResource(Huhshuixhuzs.wokoskokoajidasji[sjidijsdji])
                imAffIt5.setImageResource(Huhshuixhuzs.wokoskokoajidasji[sjidijsdji])
                imAffIt6.setImageResource(Huhshuixhuzs.wokoskokoajidasji[sjidijsdji])
                imAffIt7.setImageResource(Huhshuixhuzs.wokoskokoajidasji[sjidijsdji])
                imAffIt8.setImageResource(Huhshuixhuzs.wokoskokoajidasji[sjidijsdji])
                imAffIt9.setImageResource(Huhshuixhuzs.wokoskokoajidasji[sjidijsdji])



            }

            override fun onFinish() {
                jisajidijasokxokzcko = false
                sijdji.isClickable = true
                sijdji.alpha = 1.0f
                sijaijwdhuuhsd.isClickable = true
                apskoakoijsudh.isClickable = true
                ijgijjijidfji()
            }

        }.start()
    }


    private fun skoaokdaskoasdo() = with(wppqlpqkowkosko){
        sijaijwdhuuhsd.setOnClickListener {
            if(uhxchuhuhuxc!! > ijxcijcxivjxcvji){
                ijxcijcxivjxcvji +=5
                ijcxjijivhusdugysdgy.text = ijxcijcxivjxcvji.toString()
                if(ijxcijcxivjxcvji >= 200){
                    ijxcijcxivjxcvji = 5
                    ijcxjijivhusdugysdgy.text = ijxcijcxivjxcvji.toString()
                }
            } else {
                ijxcijcxivjxcvji = uhxchuhuhuxc!!
                ijcxjijivhusdugysdgy.text = ijxcijcxivjxcvji.toString()
            }
        }

        apskoakoijsudh.setOnClickListener {
            if(uhxchuhuhuxc!! >= 5 ){
                if(ijxcijcxivjxcvji!=0){
                    ijxcijcxivjxcvji -=5
                    ijcxjijivhusdugysdgy.text = ijxcijcxivjxcvji.toString()
                } else {
                    ijxcijcxivjxcvji = 0
                    Toast.makeText(this@Fcocoxiyuhxgygsd, "Count set low", Toast.LENGTH_SHORT).show()
                }

            }
        }

    }


    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, Uqiqosiuxuhcs::class.java))
    }

    private fun ijgijjijidfji() = with(wppqlpqkowkosko){
        val sodksdjwi = Huhshuixhuzs.okcokokdjijifdji[Random.nextInt(12)]
        val ygzxcgy = Huhshuixhuzs.wokoskokoajidasji[Random.nextInt(7)]
        val suhdwisjiaoasdjiasdji = Huhshuixhuzs.wokoskokoajidasji[Random.nextInt(7)]
        val jnjnjnbhcxbhd = Huhshuixhuzs.wokoskokoajidasji[Random.nextInt(7)]
        val qpqlpwkokoskosadjuxhchu = Huhshuixhuzs.wokoskokoajidasji[Random.nextInt(7)]
        val hncxhbvc = Huhshuixhuzs.wokoskokoajidasji[Random.nextInt(7)]
        val nnxcmvcxjvndsuhdsh = Huhshuixhuzs.wokoskokoajidasji[Random.nextInt(7)]
        val ofkdjiijjidsjia = Huhshuixhuzs.wokoskokoajidasji[Random.nextInt(7)]
        val sokwkosok = Huhshuixhuzs.wokoskokoajidasji[Random.nextInt(7)]
        val huxzgygycx = Huhshuixhuzs.wokoskokoajidasji[Random.nextInt(7)]



        imAffIt1.setImageResource(ygzxcgy)
        imAffIt2.setImageResource(suhdwisjiaoasdjiasdji)
        imAffIt3.setImageResource(qpqlpwkokoskosadjuxhchu)
        imAffIt4.setImageResource(jnjnjnbhcxbhd)
        imAffIt5.setImageResource(hncxhbvc)
        imAffIt6.setImageResource(nnxcmvcxjvndsuhdsh)
        imAffIt7.setImageResource(ofkdjiijjidsjia)
        imAffIt8.setImageResource(sokwkosok)
        imAffIt9.setImageResource(huxzgygycx)
        val jsdisadij = sajjidasji.getInt("win_res_aff",0)
        val zxhchuhuzx = jsdisadij + ijxcijcxivjxcvji * sodksdjwi
        sajjidasji.edit().putInt("win_res_aff",zxhchuhuzx.toInt()).apply()
        uhxchuhuhuxc = uhxchuhuhuxc!!.plus(zxhchuhuzx.toInt())
        isjdjisdkosoksdko.edit().putInt(Huhshuixhuzs.iasjijjdashuwu.toString(), uhxchuhuhuxc!!).apply()

        wppqlpqkowkosko.ncnxbuvhhudshu.text = uhxchuhuhuxc.toString()
    }





    override fun onDestroy() {
        super.onDestroy()
        hbxcjnvjnxvjnc?.cancel()
    }
}