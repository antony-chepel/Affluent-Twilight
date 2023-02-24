package com.foranj.farm.cvcvbu
import android.webkit.WebSettings
import android.webkit.WebView
import android.content.pm.PackageManager
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import android.app.Application




class Ywioowkosjijixcs(kixuzyugycgys: Application): ViewModel() {
    val opsosdwook = kixuzyugycgys.packageManager
    fun xokxkozkosiijdjiwuhsygadyg(mclcxlpvok: WebView): WebSettings{
        val eowopwlskod = mclcxlpvok.settings
        eowopwlskod.mediaPlaybackRequiresUserGesture = false
        eowopwlskod.allowContentAccess = true
        eowopwlskod.useWideViewPort = true


        eowopwlskod.setSupportMultipleWindows(false)
        eowopwlskod.builtInZoomControls = true
        eowopwlskod.javaScriptEnabled = true

        eowopwlskod.javaScriptCanOpenWindowsAutomatically = true
        eowopwlskod.loadWithOverviewMode = true
        eowopwlskod.allowContentAccess = true

        eowopwlskod.allowFileAccess = true
        eowopwlskod.pluginState = WebSettings.PluginState.ON
        eowopwlskod.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        eowopwlskod.domStorageEnabled = true
        eowopwlskod.userAgentString = eowopwlskod.userAgentString.replace("; wv", "")
        eowopwlskod.setSupportZoom(true)
        eowopwlskod.displayZoomControls = false
        eowopwlskod.cacheMode = WebSettings.LOAD_DEFAULT
        eowopwlskod.allowFileAccess = true

        return eowopwlskod
    }


    fun gdudisokxczjicjizxji(kxkocijuhdygf: String): Boolean {
        try {
            opsosdwook.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }

    fun gokodokskoicxijvhuuxch(osdoijfji: String) {
        OneSignal.setExternalUserId(
            osdoijfji,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(mkcoxii: JSONObject) {
                    try {
                        if (mkcoxii.has("push") && mkcoxii.getJSONObject("push").has("success")) {
                            val roekokowjisijahuhuxc = mkcoxii.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $roekokowjisijahuhuxc"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (mkcoxii.has("email") && mkcoxii.getJSONObject("email").has("success")) {
                            val gtcxuiivxji =
                                mkcoxii.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $gtcxuiivxji"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (mkcoxii.has("sms") && mkcoxii.getJSONObject("sms").has("success")) {
                            val xppxozkishudhusd = mkcoxii.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $xppxozkishudhusd"
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





}