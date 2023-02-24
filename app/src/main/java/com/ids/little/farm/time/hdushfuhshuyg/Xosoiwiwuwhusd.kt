package com.ids.little.farm.time.hdushfuhshuyg
import com.ids.little.farm.time.dgcyxuhvhdhu.Fioxokzocijsuyd.wpllpslpplslpsakodoxjicz
import android.app.Application
import com.ids.little.farm.time.dgcyxuhvhdhu.Fioxokzocijsuyd.xlplpxzlpxlpzckojiuhdhygeygywij
import android.content.Context
import com.ids.little.farm.time.dgcyxuhvhdhu.oykokoofkdko
import com.my.tracker.MyTracker
import com.ids.little.farm.time.dgcyxuhvhdhu.pplwlpwlpwlpwkokoskosdkosoijxjicji
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import com.ids.little.farm.time.dgcyxuhvhdhu.Fioxokzocijsuyd.ncnxjcvjijdijfuhodkkooksdhuw
import org.koin.android.ext.koin.androidLogger
import com.ids.little.farm.time.dgcyxuhvhdhu.Fioxokzocijsuyd.ixzjcjixzjiihuhusahuaiokdkwkodw
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class Xosoiwiwuwhusd: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ixzjcjixzjiihuhusahuaiokdkwkodw)

        val ogoplfpdplx = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val epwplplsploxkkozcji = getSharedPreferences("PREFS_NAME", 0)

        val jnjnchbvdo = MyTracker.getTrackerParams()
        val fokrkoepllpslpakoxijc = MyTracker.getTrackerConfig()
        val depllpsplplsakooxjic = MyTracker.getInstanceId(this)
        fokrkoepllpslpakoxijc.isTrackingLaunchEnabled = true
        val oxkjidjif = UUID.randomUUID().toString()

        if (epwplplsploxkkozcji.getBoolean("my_first_time", true)) {
            jnjnchbvdo.setCustomUserId(oxkjidjif)
            ogoplfpdplx.edit().putString(xlplpxzlpxlpzckojiuhdhygeygywij, oxkjidjif).apply()
            ogoplfpdplx.edit().putString(ncnxjcvjijdijfuhodkkooksdhuw, depllpsplplsakooxjic).apply()
            epwplplsploxkkozcji.edit().putBoolean("my_first_time", false).apply()
        } else {
            val isosokakodkookdsjixuhc = ogoplfpdplx.getString(xlplpxzlpxlpzckojiuhdhygeygywij, oxkjidjif)
            jnjnchbvdo.setCustomUserId(isosokakodkookdsjixuhc)
        }
        MyTracker.initTracker(wpllpslpplslpsakodoxjicz, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Xosoiwiwuwhusd)
            modules(
                listOf(
                    pplwlpwlpwlpwkokoskosdkosoijxjicji, oykokoofkdko
                )
            )
        }
    }
}