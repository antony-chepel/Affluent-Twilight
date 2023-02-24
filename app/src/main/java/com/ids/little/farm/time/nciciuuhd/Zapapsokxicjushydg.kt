package com.ids.little.farm.time.hdushfuhshuyg

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface Dspsppoxkkox {
    @GET("ipl_cr.json")
    suspend fun hcxjiko(): Response<Xzpzlkoxkoxijs>
}
@Keep
data class Vooxoxkijjizhuuhs(
    @SerializedName("countryCode")
    val jifjif: String,
)


class Eqokoqkokowjisjidjis(private val ygxygxuh: Dspsppoxkkox) {
    suspend fun lospsodi() = ygxygxuh.hcxjiko()
}

interface Vococofjjid {
    @GET("json/?key=LbwKKoO9eF4GLMz")
    suspend fun dppcokix(): Response<Vooxoxkijjizhuuhs>
}

@Keep
data class Xzpzlkoxkoxijs(
    @SerializedName("ipl_cr_giwsdcsifj")
    val fokd: String,
    @SerializedName("ipl_cr_vdowieuhs")
    val opewokwokkoskod: String,
    @SerializedName("ipl_cr_anmckciuuvyd")
    val hhsyydudsusi: String,
)




class Fjxjkxkjc(private val siisjjisijxuhgycbbs: Vococofjjid) {
    suspend fun bcbxnnkicvijdjihufhu() = siisjjisijxuhgycbbs.dppcokix()
}






















