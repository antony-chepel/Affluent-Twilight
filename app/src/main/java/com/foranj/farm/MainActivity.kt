package com.foranj.farm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.foranj.farm.ewiowiowius.Asisiuxyycgs
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val okdkoskokofko by viewModel<Asisiuxyycgs>(named("MainModel"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        okdkoskokofko.gokofkokokckoijdjiiijwijjdjwjs(this)
    }
}