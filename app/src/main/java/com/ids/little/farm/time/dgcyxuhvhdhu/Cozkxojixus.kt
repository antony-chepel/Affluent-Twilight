package com.ids.little.farm.time.dgcyxuhvhdhu
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import android.app.Application
import android.content.Context
import android.content.SharedPreferences

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.ids.little.farm.time.hdushfuhshuyg.Fjxjkxkjc
import com.ids.little.farm.time.hdushfuhshuyg.Vococofjjid
import com.ids.little.farm.time.hdushfuhshuyg.Eqokoqkokowjisjidjis
import com.ids.little.farm.time.hdushfuhshuyg.Dspsppoxkkox
import com.ids.little.farm.time.hdushfuhshuyg.Njkxkkioiocijuhd
import com.ids.little.farm.time.xzcxz.Uysisjjixhuuchs

import retrofit2.converter.gson.GsonConverterFactory

val oykokoofkdko = module {

    single  <Dspsppoxkkox> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Dspsppoxkkox::class.java)
    }

    single <Vococofjjid> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Vococofjjid::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://astraliridescence.life/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Fjxjkxkjc(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Eqokoqkokowjisjidjis(get(named("HostInter")))
    }
    single{
        chbxvxcjidjjifjif()
    }
    single (named("SharedPreferences")) {
        gcgbvcixjidsuhhf(androidApplication())
    }
}

fun gcgbvcixjidsuhhf(epllpwlpwlsd: Application): SharedPreferences {
    return epllpwlpwlsd.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun chbxvxcjidjjifjif(): Gson {
    return GsonBuilder().create()
}

val pplwlpwlpwlpwkokoskosdkosoijxjicji = module {
    viewModel (named("MainModel")){
        Njkxkkioiocijuhd((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Uysisjjixhuuchs(get())
    }
}