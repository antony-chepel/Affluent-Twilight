package com.ids.little.farm.time.dgcyxuhvhdhu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.koin.core.qualifier.named
import java.io.File
import android.util.Log
import android.webkit.*
import com.ids.little.farm.time.xzcxz.Uysisjjixhuuchs
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.io.IOException
import android.content.Context
import android.content.Intent
import java.text.SimpleDateFormat
import com.ids.little.farm.time.dgcyxuhvhdhu.Fioxokzocijsuyd.opeeppwskoadkookxijcji
import java.util.*
import android.net.Uri

import com.ids.little.farm.time.dgcyxuhvhdhu.Fioxokzocijsuyd.xlplpxzlpxlpzckojiuhdhygeygywij
import android.os.Looper
import android.provider.MediaStore

import com.ids.little.farm.time.dgcyxuhvhdhu.Fioxokzocijsuyd.hcvmkijhudhuygdtftfwdt


class Dsopsopsookxuhcs : AppCompatActivity() {
    private var qplplsokdsokasjid: ValueCallback<Array<Uri>>? = null
    private var aplzllpxlpzxlpzx: String? = null
    private val gtokokokfjicijxvji by viewModel<Uysisjjixhuuchs>(
        named("BeamModel")
    )
    private  val vogkokokovckobjidjifi = 1
    lateinit var fookrkokod: WebView
    private var rlpepellpdlpf = false
    var fplcpxvokdji = ""




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fookrkokod = WebView(this)
        setContentView(fookrkokod)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(fookrkokod, true)
        gtokokokfjicijxvji.roepplelplpkosiuxhuzcgygys(fookrkokod)

        fookrkokod.webViewClient = Fdppclppvjijib()
        fookrkokod.webChromeClient = Rwokokqkoqosjidhuxhuc()
        fookrkokod.loadUrl(vjncjbcvjbfjiijf())
    }



    override fun onBackPressed() {

        if (fookrkokod.canGoBack()) {
            if (rlpepellpdlpf) {
                fookrkokod.stopLoading()
                fookrkokod.loadUrl(fplcpxvokdji)
            }
            this.rlpepellpdlpf = true
            fookrkokod.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                rlpepellpdlpf = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }




    fun foplpcplxlookvjidhuhu(eopwpwlwlp: String?) {
        if (!eopwpwlwlp!!.contains("t.me")) {

            if (fplcpxvokdji == "") {
                fplcpxvokdji = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    eopwpwlwlp
                ).toString()

                val dokfkodko = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val sijd = dokfkodko.edit()
                sijd.putString("SAVED_URL", eopwpwlwlp)
                sijd.apply()
            }
        }
    }

    inner class Fdppclppvjijib: WebViewClient() {
        override fun shouldOverrideUrlLoading(odk: WebView?, xhuchu: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(xhuchu)) {
                    return false
                }
                if (gtokokokfjicijxvji.vvcxijvdhuhud(xhuchu)) {

                    val bccnxvkmcxijdi = Intent(Intent.ACTION_VIEW)
                    bccnxvkmcxijdi.data = Uri.parse(xhuchu)
                    startActivity(bccnxvkmcxijdi)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            foplpcplxlookvjidhuhu(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@Dsopsopsookxuhcs, description, Toast.LENGTH_SHORT).show()
        }
    }




    override fun onActivityResult(forkooe: Int, aopsalaslpaskooks: Int, hcbbhv: Intent?) {

        if (forkooe != vogkokokovckobjidjifi || qplplsokdsokasjid == null) {
            super.onActivityResult(forkooe, aopsalaslpaskooks, hcbbhv)
            return
        }
        var ovkockokocvjiijbji: Array<Uri>? = null

        if (aopsalaslpaskooks == RESULT_OK) {
            if (hcbbhv == null) {
                if (aplzllpxlpzxlpzx != null) {
                    ovkockokocvjiijbji = arrayOf(Uri.parse(aplzllpxlpzxlpzx))
                }
            } else {
                val dopls = hcbbhv.dataString
                if (dopls != null) {
                    ovkockokocvjiijbji = arrayOf(Uri.parse(dopls))
                }
            }
        }
        qplplsokdsokasjid!!.onReceiveValue(ovkockokocvjiijbji)
        qplplsokdsokasjid = null
        return
    }

    private fun vjncjbcvjbfjiijf(): String {

        val owkqkqkokskokod = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val xucxjijicx = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)
        val hnbhcvhbchdudvij = xucxjijicx.getString(opeeppwskoadkookxijcji, null)

        val wplwlpwlplpskodkokoxczjizxji = xucxjijicx.getString(xlplpxzlpxlpzckojiuhdhygeygywij, null)
        val ivicjjicvjibjivhufhb = xucxjijicx.getString(hcvmkijhudhuygdtftfwdt, null)


        when (xucxjijicx.getString("WebInt", null)) {
            "campaign" -> {
                gtokokokfjicijxvji.ydisookasojidijwjiwd(ivicjjicvjibjivhufhb.toString())
            }
            "deepLink" -> {
                gtokokokfjicijxvji.ydisookasojidijwjiwd(ivicjjicvjibjivhufhb.toString())
            }
            "deepLinkNOApps" -> {
                gtokokokfjicijxvji.ydisookasojidijwjiwd(wplwlpwlplpskodkokoxczjizxji.toString())
            }
            "geo" -> {
                gtokokokfjicijxvji.ydisookasojidijwjiwd(wplwlpwlplpskodkokoxczjizxji.toString())
            }
        }
        return owkqkqkokskokod.getString("SAVED_URL", hnbhcvhbchdudvij).toString()
    }






    inner class Rwokokqkoqosjidhuxhuc : WebChromeClient() {

        override fun onShowFileChooser(
            jcnv: WebView?,
            epllpelps: ValueCallback<Array<Uri>>?,
            icixjic: FileChooserParams?
        ): Boolean {
            qplplsokdsokasjid?.onReceiveValue(null)
            qplplsokdsokasjid = epllpelps
            var eplwlplpwpsokdaxxcz: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (eplwlplpwpsokdaxxcz!!.resolveActivity(packageManager) != null) {
                var gkovkokocbojifdijuhd: File? = null
                try {
                    gkovkokocbojifdijuhd = gvvkokockookvckookbjifij()
                    eplwlplpwpsokdaxxcz.putExtra("PhotoPath", aplzllpxlpzxlpzx)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (gkovkokocbojifdijuhd != null) {
                    aplzllpxlpzxlpzx = "file:" + gkovkokocbojifdijuhd.absolutePath
                    eplwlplpwpsokdaxxcz.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(gkovkokocbojifdijuhd)
                    )
                } else {
                    eplwlplpwpsokdaxxcz = null
                }
            }
            val wokkosdlpdlpslpdslplpdskox = Intent(Intent.ACTION_GET_CONTENT)
            wokkosdlpdlpslpdslplpdskox.addCategory(Intent.CATEGORY_OPENABLE)
            wokkosdlpdlpslpdslplpdskox.type = "image/*"
            val hbcvhbhvbxc: Array<Intent?> = eplwlplpwpsokdaxxcz?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val lplpokekoeokodf = Intent(Intent.ACTION_CHOOSER)
            lplpokekoeokodf.putExtra(Intent.EXTRA_INTENT, wokkosdlpdlpslpdslplpdskox)
            lplpokekoeokodf.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            lplpokekoeokodf.putExtra(Intent.EXTRA_INITIAL_INTENTS, hbcvhbhvbxc)
            startActivityForResult(lplpokekoeokodf, vogkokokovckobjidjifi)
            return true
        }

        fun gvvkokockookvckookbjifij(): File? {
            val rokeokkoe = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val dplsslpdlplpsdkokxcv = "JPEG_" + rokeokkoe + "_"
            val hcbxbhvhdokd = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                dplsslpdlplpsdkokxcv,
                ".jpg",
                hcbxbhvhdokd
            )
        }
    }






}

