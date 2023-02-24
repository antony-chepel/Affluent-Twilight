package com.ids.little.farm.time

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ids.little.farm.time.hdushfuhshuyg.Njkxkkioiocijuhd
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val fokokosdok by viewModel<Njkxkkioiocijuhd>(named("MainModel"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fokokosdok.hcbbhvjidijfjiijuhdsfhu(this@MainActivity)
    }
}