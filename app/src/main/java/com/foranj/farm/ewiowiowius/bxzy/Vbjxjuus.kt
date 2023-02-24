package com.foranj.farm.ewiowiowius.bxzy

import android.app.Application
import android.content.Context
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.qplpqplwokkosokd
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.nncnvucgydjifjiigigfs
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.wpppwppspd
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.cjhvxnv
import com.foranj.farm.cvcvbu.cuhidfiodijjhufd
import com.foranj.farm.cvcvbu.xpxppxocsdijfuhfdhu
import com.my.tracker.MyTracker
import com.onesignal.OneSignal

import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class Vbjxjuus: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(cjhvxnv)

        val sioisjjidji = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val ofofkokcxkojivxcijhuuhsdhus = getSharedPreferences("PREFS_NAME", 0)

        val sppapaosoks = MyTracker.getTrackerParams()
        val hhcbbhcygd = MyTracker.getTrackerConfig()
        val isisoskakoasdjiwjihusaydgy = MyTracker.getInstanceId(this)
        hhcbbhcygd.isTrackingLaunchEnabled = true
        val bvjv = UUID.randomUUID().toString()

        if (ofofkokcxkojivxcijhuuhsdhus.getBoolean("my_first_time", true)) {
            sppapaosoks.setCustomUserId(bvjv)
            sioisjjidji.edit().putString(wpppwppspd, bvjv).apply()
            sioisjjidji.edit().putString(qplpqplwokkosokd, isisoskakoasdjiwjihusaydgy).apply()
            ofofkokcxkojivxcijhuuhsdhus.edit().putBoolean("my_first_time", false).apply()
        } else {
            val sppwppokskosdjixhuc = sioisjjidji.getString(wpppwppspd, bvjv)
            sppapaosoks.setCustomUserId(sppwppokskosdjixhuc)
        }
        MyTracker.initTracker(nncnvucgydjifjiigigfs, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Vbjxjuus)
            modules(
                listOf(
                    xpxppxocsdijfuhfdhu, cuhidfiodijjhufd
                )
            )
        }
    }
}