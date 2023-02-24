package com.foranj.farm.cvcvbu

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.foranj.farm.ewiowiowius.*
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val cuhidfiodijjhufd = module {

    single  <Torkekoekokoskosajiixcij> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Torkekoekokoskosajiixcij::class.java)
    }

    single <Fdpppwpwppsokoxock> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Fdpppwpwppsokoxock::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://affluenttwilight.life/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Gofkoeokokokoskkoxjicizj(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Gossojidijasjix(get(named("HostInter")))
    }
    single{
        hbbhvjijiduhfhudhu()
    }
    single (named("SharedPreferences")) {
        foovoocijbhuhuf(androidApplication())
    }
}

fun foovoocijbhuhuf(rpepep: Application): SharedPreferences {
    return rpepep.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun hbbhvjijiduhfhudhu(): Gson {
    return GsonBuilder().create()
}

val xpxppxocsdijfuhfdhu = module {
    viewModel (named("MainModel")){
        Asisiuxyycgs((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Ywioowkosjijixcs(get())
    }
}