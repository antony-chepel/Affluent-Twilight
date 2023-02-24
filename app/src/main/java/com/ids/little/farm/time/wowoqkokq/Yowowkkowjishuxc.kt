package com.ids.little.farm.time.wowoqkokq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import androidx.core.content.ContextCompat
import com.ids.little.farm.time.R
import com.ids.little.farm.time.databinding.ActivityYowowkkowjishuxcBinding
import kotlin.random.Random

class Yowowkkowjishuxc : AppCompatActivity() {
    private var count : CountDownTimer? = null
    private var countScrs = 0
    private var timeCount = 15
    val lisygds = listOf(R.drawable.ipl_cr_it_1,R.drawable.ipl_cr_it_2,R.drawable.ipl_cr_it_3,)
    private lateinit var easyAnim : Animation
    private lateinit var medAnim : Animation
    private lateinit var hrdAnim : Animation
    private lateinit var mkviuuhdhuf : ActivityYowowkkowjishuxcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mkviuuhdhuf = ActivityYowowkkowjishuxcBinding.inflate(layoutInflater)
        setContentView(mkviuuhdhuf.root)
        easyAnim = AnimationUtils.loadAnimation(this, R.anim.easy_ipl_anim)
        medAnim = AnimationUtils.loadAnimation(this, R.anim.med_ipl_anim)
        hrdAnim = AnimationUtils.loadAnimation(this, R.anim.hrd_ipl_anim)
        tsagydgyas()
        koaskodijdasji()
    }



    private fun tsagydgyas() = with(mkviuuhdhuf){
        count?.cancel()
        count = object : CountDownTimer(15000,1000){
            override fun onTick(p0: Long) {
                timeCount--
                tvTime.text = "Time : $timeCount sec"
            }

            override fun onFinish() {
                timeCount = 15
                startActivity(Intent(this@Yowowkkowjishuxc,Nllsiyudygdgygyef::class.java)
                    .putExtra("scrs_ipl",countScrs)
                )

            }

        }.start()
    }



    private fun koaskodijdasji() = with(mkviuuhdhuf){
         val img1 = lisygds[Random.nextInt(3)]
         val img2 = lisygds[Random.nextInt(3)]
         val img3 = lisygds[Random.nextInt(3)]
         val img4 = lisygds[Random.nextInt(3)]
         val img5 = lisygds[Random.nextInt(3)]

        val mde = intent.getIntExtra("ipl_md",0)

        imageView.setImageResource(img1)
        imageView2.setImageResource(img2)
        imageView3.setImageResource(img3)
        imageView4.setImageResource(img4)
        imageView5.setImageResource(img5)


        when(mde){
            0->{
                imageView.startAnimation(easyAnim)
                imageView2.startAnimation(easyAnim)
                imageView3.startAnimation(easyAnim)
                imageView4.startAnimation(easyAnim)
                imageView5.startAnimation(easyAnim)


                Handler().postDelayed({
                    val img1re = lisygds[Random.nextInt(3)]
                    val img2re = lisygds[Random.nextInt(3)]
                    val img3re = lisygds[Random.nextInt(3)]
                    val img4re = lisygds[Random.nextInt(3)]
                    val img5re = lisygds[Random.nextInt(3)]
                    imageView.setImageResource(img1re)
                    imageView2.setImageResource(img2re)
                    imageView3.setImageResource(img3re)
                    imageView4.setImageResource(img4re)
                    imageView5.setImageResource(img5re)
                },1000)


                Handler().postDelayed({
                    val img1re = lisygds[Random.nextInt(3)]
                    val img2re = lisygds[Random.nextInt(3)]
                    val img3re = lisygds[Random.nextInt(3)]
                    val img4re = lisygds[Random.nextInt(3)]
                    val img5re = lisygds[Random.nextInt(3)]
                    imageView.setImageResource(img1re)
                    imageView2.setImageResource(img2re)
                    imageView3.setImageResource(img3re)
                    imageView4.setImageResource(img4re)
                    imageView5.setImageResource(img5re)
                },5000)


                Handler().postDelayed({
                    val img1re = lisygds[Random.nextInt(3)]
                    val img2re = lisygds[Random.nextInt(3)]
                    val img3re = lisygds[Random.nextInt(3)]
                    val img4re = lisygds[Random.nextInt(3)]
                    val img5re = lisygds[Random.nextInt(3)]
                    imageView.setImageResource(img1re)
                    imageView2.setImageResource(img2re)
                    imageView3.setImageResource(img3re)
                    imageView4.setImageResource(img4re)
                    imageView5.setImageResource(img5re)
                },10000)

                Handler().postDelayed({
                    val img1re = lisygds[Random.nextInt(3)]
                    val img2re = lisygds[Random.nextInt(3)]
                    val img3re = lisygds[Random.nextInt(3)]
                    val img4re = lisygds[Random.nextInt(3)]
                    val img5re = lisygds[Random.nextInt(3)]
                    imageView.setImageResource(img1re)
                    imageView2.setImageResource(img2re)
                    imageView3.setImageResource(img3re)
                    imageView4.setImageResource(img4re)
                    imageView5.setImageResource(img5re)
                },13000)





                easyAnim.setAnimationListener(object : AnimationListener{
                    override fun onAnimationStart(p0: Animation?) {

                        imageView.setOnClickListener {
                            if(imageView.drawable.constantState == ContextCompat.getDrawable(this@Yowowkkowjishuxc,R.drawable.ipl_cr_it_2)?.constantState){
                                countScrs +=1
                                tvCatched.text = "Catched balles : $countScrs"
                            }
                        }

                         imageView2.setOnClickListener {
                             if(imageView2.drawable.constantState == ContextCompat.getDrawable(this@Yowowkkowjishuxc,R.drawable.ipl_cr_it_2)?.constantState){
                                 countScrs +=1
                                 tvCatched.text = "Catched balles : $countScrs"
                             }
                         }



                        imageView3.setOnClickListener {
                            if(imageView3.drawable.constantState == ContextCompat.getDrawable(this@Yowowkkowjishuxc,R.drawable.ipl_cr_it_2)?.constantState){
                                countScrs +=1
                                tvCatched.text = "Catched balles : $countScrs"
                            }
                        }



                        imageView4.setOnClickListener {
                            if(imageView4.drawable.constantState == ContextCompat.getDrawable(this@Yowowkkowjishuxc,R.drawable.ipl_cr_it_2)?.constantState){
                                countScrs +=1
                                tvCatched.text = "Catched balles : $countScrs"
                            }
                        }



                        imageView5.setOnClickListener {
                            if(imageView5.drawable.constantState == ContextCompat.getDrawable(this@Yowowkkowjishuxc,R.drawable.ipl_cr_it_2)?.constantState){
                                countScrs +=1
                                tvCatched.text = "Catched balles : $countScrs"
                            }
                        }


                    }

                    override fun onAnimationEnd(p0: Animation?) {


                    }

                    override fun onAnimationRepeat(p0: Animation?) {
                    }

                })


            }
            1->{
                imageView.startAnimation(medAnim)
                imageView2.startAnimation(medAnim)
                imageView3.startAnimation(medAnim)
                imageView4.startAnimation(medAnim)
                imageView5.startAnimation(medAnim)



                Handler().postDelayed({
                    val img1re = lisygds[Random.nextInt(3)]
                    val img2re = lisygds[Random.nextInt(3)]
                    val img3re = lisygds[Random.nextInt(3)]
                    val img4re = lisygds[Random.nextInt(3)]
                    val img5re = lisygds[Random.nextInt(3)]
                    imageView.setImageResource(img1re)
                    imageView2.setImageResource(img2re)
                    imageView3.setImageResource(img3re)
                    imageView4.setImageResource(img4re)
                    imageView5.setImageResource(img5re)
                },1000)


                Handler().postDelayed({
                    val img1re = lisygds[Random.nextInt(3)]
                    val img2re = lisygds[Random.nextInt(3)]
                    val img3re = lisygds[Random.nextInt(3)]
                    val img4re = lisygds[Random.nextInt(3)]
                    val img5re = lisygds[Random.nextInt(3)]
                    imageView.setImageResource(img1re)
                    imageView2.setImageResource(img2re)
                    imageView3.setImageResource(img3re)
                    imageView4.setImageResource(img4re)
                    imageView5.setImageResource(img5re)
                },5000)


                Handler().postDelayed({
                    val img1re = lisygds[Random.nextInt(3)]
                    val img2re = lisygds[Random.nextInt(3)]
                    val img3re = lisygds[Random.nextInt(3)]
                    val img4re = lisygds[Random.nextInt(3)]
                    val img5re = lisygds[Random.nextInt(3)]
                    imageView.setImageResource(img1re)
                    imageView2.setImageResource(img2re)
                    imageView3.setImageResource(img3re)
                    imageView4.setImageResource(img4re)
                    imageView5.setImageResource(img5re)
                },10000)

                Handler().postDelayed({
                    val img1re = lisygds[Random.nextInt(3)]
                    val img2re = lisygds[Random.nextInt(3)]
                    val img3re = lisygds[Random.nextInt(3)]
                    val img4re = lisygds[Random.nextInt(3)]
                    val img5re = lisygds[Random.nextInt(3)]
                    imageView.setImageResource(img1re)
                    imageView2.setImageResource(img2re)
                    imageView3.setImageResource(img3re)
                    imageView4.setImageResource(img4re)
                    imageView5.setImageResource(img5re)
                },13000)

                medAnim.setAnimationListener(object : AnimationListener{
                    override fun onAnimationStart(p0: Animation?) {

                        imageView.setOnClickListener {
                            if(imageView.drawable.constantState == ContextCompat.getDrawable(this@Yowowkkowjishuxc,R.drawable.ipl_cr_it_2)?.constantState){
                                countScrs +=1
                                tvCatched.text = "Catched balles : $countScrs"
                            }
                        }

                        imageView2.setOnClickListener {
                            if(imageView2.drawable.constantState == ContextCompat.getDrawable(this@Yowowkkowjishuxc,R.drawable.ipl_cr_it_2)?.constantState){
                                countScrs +=1
                                tvCatched.text = "Catched balles : $countScrs"
                            }
                        }



                        imageView3.setOnClickListener {
                            if(imageView3.drawable.constantState == ContextCompat.getDrawable(this@Yowowkkowjishuxc,R.drawable.ipl_cr_it_2)?.constantState){
                                countScrs +=1
                                tvCatched.text = "Catched balles : $countScrs"
                            }
                        }



                        imageView4.setOnClickListener {
                            if(imageView4.drawable.constantState == ContextCompat.getDrawable(this@Yowowkkowjishuxc,R.drawable.ipl_cr_it_2)?.constantState){
                                countScrs +=1
                                tvCatched.text = "Catched balles : $countScrs"
                            }
                        }



                        imageView5.setOnClickListener {
                            if(imageView5.drawable.constantState == ContextCompat.getDrawable(this@Yowowkkowjishuxc,R.drawable.ipl_cr_it_2)?.constantState){
                                countScrs +=1
                                tvCatched.text = "Catched balles : $countScrs"
                            }
                        }


                    }

                    override fun onAnimationEnd(p0: Animation?) {

                    }

                    override fun onAnimationRepeat(p0: Animation?) {
                    }

                })

            }

            2->{
                imageView.startAnimation(hrdAnim)
                imageView2.startAnimation(hrdAnim)
                imageView3.startAnimation(hrdAnim)
                imageView4.startAnimation(hrdAnim)
                imageView5.startAnimation(hrdAnim)


                Handler().postDelayed({
                    val img1re = lisygds[Random.nextInt(3)]
                    val img2re = lisygds[Random.nextInt(3)]
                    val img3re = lisygds[Random.nextInt(3)]
                    val img4re = lisygds[Random.nextInt(3)]
                    val img5re = lisygds[Random.nextInt(3)]
                    imageView.setImageResource(img1re)
                    imageView2.setImageResource(img2re)
                    imageView3.setImageResource(img3re)
                    imageView4.setImageResource(img4re)
                    imageView5.setImageResource(img5re)
                },1000)


                Handler().postDelayed({
                    val img1re = lisygds[Random.nextInt(3)]
                    val img2re = lisygds[Random.nextInt(3)]
                    val img3re = lisygds[Random.nextInt(3)]
                    val img4re = lisygds[Random.nextInt(3)]
                    val img5re = lisygds[Random.nextInt(3)]
                    imageView.setImageResource(img1re)
                    imageView2.setImageResource(img2re)
                    imageView3.setImageResource(img3re)
                    imageView4.setImageResource(img4re)
                    imageView5.setImageResource(img5re)
                },5000)


                Handler().postDelayed({
                    val img1re = lisygds[Random.nextInt(3)]
                    val img2re = lisygds[Random.nextInt(3)]
                    val img3re = lisygds[Random.nextInt(3)]
                    val img4re = lisygds[Random.nextInt(3)]
                    val img5re = lisygds[Random.nextInt(3)]
                    imageView.setImageResource(img1re)
                    imageView2.setImageResource(img2re)
                    imageView3.setImageResource(img3re)
                    imageView4.setImageResource(img4re)
                    imageView5.setImageResource(img5re)
                },10000)

                Handler().postDelayed({
                    val img1re = lisygds[Random.nextInt(3)]
                    val img2re = lisygds[Random.nextInt(3)]
                    val img3re = lisygds[Random.nextInt(3)]
                    val img4re = lisygds[Random.nextInt(3)]
                    val img5re = lisygds[Random.nextInt(3)]
                    imageView.setImageResource(img1re)
                    imageView2.setImageResource(img2re)
                    imageView3.setImageResource(img3re)
                    imageView4.setImageResource(img4re)
                    imageView5.setImageResource(img5re)
                },13000)


                hrdAnim.setAnimationListener(object : AnimationListener{
                    override fun onAnimationStart(p0: Animation?) {

                        imageView.setOnClickListener {
                            if(imageView.drawable.constantState == ContextCompat.getDrawable(this@Yowowkkowjishuxc,R.drawable.ipl_cr_it_2)?.constantState){
                                countScrs +=1
                                tvCatched.text = "Catched balles : $countScrs"
                            }
                        }

                        imageView2.setOnClickListener {
                            if(imageView2.drawable.constantState == ContextCompat.getDrawable(this@Yowowkkowjishuxc,R.drawable.ipl_cr_it_2)?.constantState){
                                countScrs +=1
                                tvCatched.text = "Catched balles : $countScrs"
                            }
                        }



                        imageView3.setOnClickListener {
                            if(imageView3.drawable.constantState == ContextCompat.getDrawable(this@Yowowkkowjishuxc,R.drawable.ipl_cr_it_2)?.constantState){
                                countScrs +=1
                                tvCatched.text = "Catched balles : $countScrs"
                            }
                        }



                        imageView4.setOnClickListener {
                            if(imageView4.drawable.constantState == ContextCompat.getDrawable(this@Yowowkkowjishuxc,R.drawable.ipl_cr_it_2)?.constantState){
                                countScrs +=1
                                tvCatched.text = "Catched balles : $countScrs"
                            }
                        }



                        imageView5.setOnClickListener {
                            if(imageView5.drawable.constantState == ContextCompat.getDrawable(this@Yowowkkowjishuxc,R.drawable.ipl_cr_it_2)?.constantState){
                                countScrs +=1
                                tvCatched.text = "Catched balles : $countScrs"
                            }
                        }


                    }

                    override fun onAnimationEnd(p0: Animation?) {


                    }

                    override fun onAnimationRepeat(p0: Animation?) {
                    }

                })
            }
        }


    }





    override fun onDestroy() {
        super.onDestroy()
        count?.cancel()
    }


}