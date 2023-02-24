package com.ids.little.farm.time.xzcxz
import android.view.ViewGroup
import android.view.View
import androidx.navigation.fragment.findNavController
import com.ids.little.farm.time.R
import com.ids.little.farm.time.dgcyxuhvhdhu.Fioxokzocijsuyd.bbcvjucjubhufhu
import com.ids.little.farm.time.hdushfuhshuyg.Njkxkkioiocijuhd
import org.koin.core.qualifier.named
import android.content.Context
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater



class Wsissiskxhjzcuhs : Fragment() {
    val ygcgyvijdijdjivf by activityViewModel<Njkxkkioiocijuhd>(named("MainModel"))
    private lateinit var sllsosdksdojixijc: Context
    lateinit var sisiisudss: String
    val uhzxchuxs: SharedPreferences by inject(named("SharedPreferences"))





    override fun onAttach(context: Context) {
        super.onAttach(context)
        sllsosdksdojixijc = context
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.wowppqoowijsd, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ygcgyvijdijdjivf.aplapslpaslp.observe(viewLifecycleOwner) {
            if (it!=null) {
                sisiisudss = it.jifjif
                uhzxchuxs.edit().putString(bbcvjucjubhufhu, sisiisudss).apply()
                findNavController().navigate(R.id.hnnxbbcgxgfds)
            }
        }
    }






}