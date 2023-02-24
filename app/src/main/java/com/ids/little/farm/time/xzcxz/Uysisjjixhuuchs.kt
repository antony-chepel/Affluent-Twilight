package com.ids.little.farm.time.xzcxz
import android.annotation.SuppressLint
import android.webkit.WebSettings
import org.json.JSONObject
import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException


class Uysisjjixhuuchs(ookdijduhfhu: Application): ViewModel() {
    val bhchbbhxuhdhu = ookdijduhfhu.packageManager

    fun vvcxijvdhuhud(okojidij: String): Boolean {
        try {
            bhchbbhxuhdhu.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }

    fun ydisookasojidijwjiwd(cokxkovkoxcokd: String) {
        OneSignal.setExternalUserId(
            cokxkovkoxcokd,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(dpleplplsplsdko: JSONObject) {
                    try {
                        if (dpleplplsplsdko.has("push") && dpleplplsplsdko.getJSONObject("push").has("success")) {
                            val fokekos = dpleplplsplsdko.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $fokekos"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (dpleplplsplsdko.has("email") && dpleplplsplsdko.getJSONObject("email").has("success")) {
                            val xokkocjid =
                                dpleplplsplsdko.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $xokkocjid"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (dpleplplsplsdko.has("sms") && dpleplplsplsdko.getJSONObject("sms").has("success")) {
                            val woowposldokwijsdji = dpleplplsplsdko.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $woowposldokwijsdji"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    @SuppressLint("SetJavaScriptEnabled")
    fun roepplelplpkosiuxhuzcgygys(cxuhv: WebView): WebSettings{
        val dplelpkow = cxuhv.settings
        dplelpkow.cacheMode = WebSettings.LOAD_DEFAULT
        dplelpkow.allowFileAccess = true
        dplelpkow.mediaPlaybackRequiresUserGesture = false
        dplelpkow.useWideViewPort = true
        dplelpkow.javaScriptEnabled = true
        dplelpkow.builtInZoomControls = true
        dplelpkow.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        dplelpkow.domStorageEnabled = true
        dplelpkow.loadWithOverviewMode = true
        dplelpkow.allowContentAccess = true
        dplelpkow.setSupportMultipleWindows(false)
        dplelpkow.allowFileAccess = true
        dplelpkow.pluginState = WebSettings.PluginState.ON
        dplelpkow.displayZoomControls = false
        dplelpkow.userAgentString = dplelpkow.userAgentString.replace("; wv", "")
        dplelpkow.setSupportZoom(true)
        dplelpkow.allowContentAccess = true
        dplelpkow.javaScriptCanOpenWindowsAutomatically = true
        return dplelpkow
    }

}