package com.foranj.farm.ewiowiowius.bxzy
import android.webkit.*
import android.os.Looper
import android.provider.MediaStore
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.foranj.farm.cvcvbu.Ywioowkosjijixcs
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.wpppwppspd
import org.koin.core.qualifier.named
import java.io.File
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.owiwjiwokoksokdijxuch
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.jcjvnkdokfokkojidshufygy
import java.io.IOException
import android.content.Context
import android.content.Intent
import java.text.SimpleDateFormat
import java.util.*
import android.net.Uri










class Kioosiuxsaw : AppCompatActivity() {
    private val szoozkkxokcojsuhhduf by viewModel<Ywioowkosjijixcs>(
        named("BeamModel")
    )
    var yycgyf = ""
    private  val fooreppllpwlpwlppslkosaidji = 1
    private var sijdij = false
    private var kkkcicjvihuuhybbybgv: ValueCallback<Array<Uri>>? = null
    lateinit var ncbbcxjkxcjvudhhuf: WebView

    private var eoodkok: String? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ncbbcxjkxcjvudhhuf = WebView(this)
        setContentView(ncbbcxjkxcjvudhhuf)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(ncbbcxjkxcjvudhhuf, true)
        szoozkkxokcojsuhhduf.xokxkozkosiijdjiwuhsygadyg(ncbbcxjkxcjvudhhuf)

        ncbbcxjkxcjvudhhuf.webViewClient = Ziisiisodkdfjieji()
        ncbbcxjkxcjvudhhuf.webChromeClient = Gjjxjuucicijcixjjdjif()
        ncbbcxjkxcjvudhhuf.loadUrl(sppppxzlkodfjieudgygysfdy())
    }

    fun ogoofoocijixv(pwpwpsokdok: String?) {
        if (!pwpwpsokdok!!.contains("t.me")) {

            if (yycgyf == "") {
                yycgyf = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    pwpwpsokdok
                ).toString()

                val mmmxkxiicicovkodji = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val riooekkos = mmmxkxiicicovkodji.edit()
                riooekkos.putString("SAVED_URL", pwpwpsokdok)
                riooekkos.apply()
            }
        }
    }

    override fun onBackPressed() {

        if (ncbbcxjkxcjvudhhuf.canGoBack()) {
            if (sijdij) {
                ncbbcxjkxcjvudhhuf.stopLoading()
                ncbbcxjkxcjvudhhuf.loadUrl(yycgyf)
            }
            this.sijdij = true
            ncbbcxjkxcjvudhhuf.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                sijdij = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


    override fun onActivityResult(bhhvhvhvu: Int, owpwllpelplpeokdko: Int, doxxzoks: Intent?) {

        if (bhhvhvhvu != fooreppllpwlpwlppslkosaidji || kkkcicjvihuuhybbybgv == null) {
            super.onActivityResult(bhhvhvhvu, owpwllpelplpeokdko, doxxzoks)
            return
        }
        var epwplwlplpskoskod: Array<Uri>? = null

        if (owpwllpelplpeokdko == RESULT_OK) {
            if (doxxzoks == null) {
                if (eoodkok != null) {
                    epwplwlplpskoskod = arrayOf(Uri.parse(eoodkok))
                }
            } else {
                val llclclocokkov = doxxzoks.dataString
                if (llclclocokkov != null) {
                    epwplwlplpskoskod = arrayOf(Uri.parse(llclclocokkov))
                }
            }
        }
        kkkcicjvihuuhybbybgv!!.onReceiveValue(epwplwlplpskoskod)
        kkkcicjvihuuhybbybgv = null
        return
    }



    private fun sppppxzlkodfjieudgygysfdy(): String {

        val hbvbhicjj = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val wopklwppsppsdkoxkozkocozxjicuhzxh = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)
        val cuihuc = wopklwppsppsdkoxkozkocozxjicuhzxh.getString(jcjvnkdokfokkojidshufygy, null)

        val sookaokskodijw = wopklwppsppsdkoxkozkocozxjicuhzxh.getString(wpppwppspd, null)
        val nnvhjcbuvh = wopklwppsppsdkoxkozkocozxjicuhzxh.getString(owiwjiwokoksokdijxuch, null)


        when (wopklwppsppsdkoxkozkocozxjicuhzxh.getString("WebInt", null)) {
            "campaign" -> {
                szoozkkxokcojsuhhduf.gokodokskoicxijvhuuxch(nnvhjcbuvh.toString())
            }
            "deepLink" -> {
                szoozkkxokcojsuhhduf.gokodokskoicxijvhuuxch(nnvhjcbuvh.toString())
            }
            "deepLinkNOApps" -> {
                szoozkkxokcojsuhhduf.gokodokskoicxijvhuuxch(sookaokskodijw.toString())
            }
            "geo" -> {
                szoozkkxokcojsuhhduf.gokodokskoicxijvhuuxch(sookaokskodijw.toString())
            }
        }
        return hbvbhicjj.getString("SAVED_URL", cuihuc).toString()
    }

    inner class Gjjxjuucicijcixjjdjif : WebChromeClient() {

        override fun onShowFileChooser(
            vokco: WebView?,
            owiiejijejijishudhus: ValueCallback<Array<Uri>>?,
            jncjnxvjnidj: FileChooserParams?
        ): Boolean {
            kkkcicjvihuuhybbybgv?.onReceiveValue(null)
            kkkcicjvihuuhybbybgv = owiiejijejijishudhus
            var otkokookeokkojidsji: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (otkokookeokkojidsji!!.resolveActivity(packageManager) != null) {
                var fijjixcjivjijci: File? = null
                try {
                    fijjixcjivjijci = vgoijibjin()
                    otkokookeokkojidsji.putExtra("PhotoPath", eoodkok)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (fijjixcjivjijci != null) {
                    eoodkok = "file:" + fijjixcjivjijci.absolutePath
                    otkokookeokkojidsji.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(fijjixcjivjijci)
                    )
                } else {
                    otkokookeokkojidsji = null
                }
            }
            val toooeoeowkkowokoksodijxc = Intent(Intent.ACTION_GET_CONTENT)
            toooeoeowkkowokoksodijxc.addCategory(Intent.CATEGORY_OPENABLE)
            toooeoeowkkowokoksodijxc.type = "image/*"
            val gcgxuhdhufjijiejife: Array<Intent?> = otkokookeokkojidsji?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val mmkkxmkmiciicoxokcokvkoijfjihug = Intent(Intent.ACTION_CHOOSER)
            mmkkxmkmiciicoxokcokvkoijfjihug.putExtra(Intent.EXTRA_INTENT, toooeoeowkkowokoksodijxc)
            mmkkxmkmiciicoxokcokvkoijfjihug.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            mmkkxmkmiciicoxokcokvkoijfjihug.putExtra(Intent.EXTRA_INITIAL_INTENTS, gcgxuhdhufjijiejife)
            startActivityForResult(mmkkxmkmiciicoxokcokvkoijfjihug, fooreppllpwlpwlppslkosaidji)
            return true
        }

        fun vgoijibjin(): File? {
            val oekowpllpslxokcjihuxhcu = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val hbccxijd = "JPEG_" + oekowpllpslxokcjihuxhcu + "_"
            val aopaspsakook = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                hbccxijd,
                ".jpg",
                aopaspsakook
            )
        }
    }










    inner class Ziisiisodkdfjieji: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (szoozkkxokcojsuhhduf.gdudisokxczjicjizxji(url)) {

                    val idjjif = Intent(Intent.ACTION_VIEW)
                    idjjif.data = Uri.parse(url)
                    startActivity(idjjif)
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
            ogoofoocijixv(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@Kioosiuxsaw, description, Toast.LENGTH_SHORT).show()
        }
    }




}

