package com.foranj.farm
import androidx.navigation.fragment.findNavController
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import com.foranj.farm.ewiowiowius.Asisiuxyycgs
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.doxoxopcovk
import org.koin.core.qualifier.named
import android.view.ViewGroup








class Bkkkcoivhud : Fragment() {
    private lateinit var sodkkowok: Context
    lateinit var ncnjxjvidijuhf: String
    val xbbcizj: SharedPreferences by inject(named("SharedPreferences"))
    val oqoqkiwjijishudhuxc by activityViewModel<Asisiuxyycgs>(named("MainModel"))




    override fun onAttach(context: Context) {
        super.onAttach(context)
        sodkkowok = context
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.jnnchgshawsd, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val odkkokof = xbbcizj.getString(doxoxopcovk, null)
        val qplpkosokdijsdji = xbbcizj.getString("appCamp", null)

        if (odkkokof=="1" &&qplpkosokdijsdji == null) {
            oqoqkiwjijishudhuxc.nnncjjnxjnjnvijidjihufhud(sodkkowok)
            oqoqkiwjijishudhuxc.dllpeplpdl.observe(viewLifecycleOwner) {
                if (it != null) {
                    ncnjxjvidijuhf = it.toString()
                    xbbcizj.edit().putString("appCamp", ncnjxjvidijuhf).apply()
                    findNavController().navigate(R.id.dpwokskoxijchs)
                }
            }
        } else {
            findNavController().navigate(R.id.dpwokskoxijchs)
        }
    }







}