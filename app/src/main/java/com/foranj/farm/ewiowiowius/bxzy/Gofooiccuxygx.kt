package com.foranj.farm.ewiowiowius.bxzy
import com.foranj.farm.ewiowiowius.bxzy.Doooaijuhs.vkkcioxokviduh
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import android.view.ViewGroup
import com.foranj.farm.R
import com.foranj.farm.ewiowiowius.Asisiuxyycgs


class Gofooiccuxygx : Fragment() {
    lateinit var jncxjiviodjijifuhdfhug: String

    private lateinit var kkmcmkxovigfihugf: Context

    val xkkxzmkcmx: SharedPreferences by inject(named("SharedPreferences"))
    val ososoososisjdhuwu by activityViewModel<Asisiuxyycgs>(named("MainModel"))


    override fun onAttach(context: Context) {
        super.onAttach(context)
        kkmcmkxovigfihugf = context
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.mkixoiiushd, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ososoososisjdhuwu.kcjnjnxuhvhu.observe(viewLifecycleOwner) {
            if (it!=null) {
                jncxjiviodjijifuhdfhug = it.ushdhuwokwkowoks
                xkkxzmkcmx.edit().putString(vkkcioxokviduh, jncxjiviodjijifuhdfhug).apply()
                findNavController().navigate(R.id.vrooesa)
            }
        }
    }






}