package com.ids.little.farm.time.hdushfuhshuyg
import android.content.Context
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ids.little.farm.time.R
import android.content.SharedPreferences
import android.os.Bundle
import com.ids.little.farm.time.dgcyxuhvhdhu.Fioxokzocijsuyd.covokokdijfjidji
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View




import org.koin.android.ext.android.inject



class Fosokosjixchygs : Fragment() {
    private lateinit var aplalpsalpaskjixjicjixzji: Context
    lateinit var kxzkucshud: String
    val xlozkcox by activityViewModel<Njkxkkioiocijuhd>(named("MainModel"))
    val odkkosdokkosfsdjiijcji: SharedPreferences by inject(named("SharedPreferences"))




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val uhxckoxkosokcsk = odkkosdokkosfsdjiijcji.getString(covokokdijfjidji, null)
        val fokkovvockok = odkkosdokkosfsdjiijcji.getString("appCamp", null)

        if (uhxckoxkosokcsk=="1" &&fokkovvockok == null) {
            xlozkcox.ofkofkocjixjivcji(aplalpsalpaskjixjicjixzji)
            xlozkcox.rpdkosokfok.observe(viewLifecycleOwner) {
                if (it != null) {
                    kxzkucshud = it.toString()
                    odkkosdokkosfsdjiijcji.edit().putString("appCamp", kxzkucshud).apply()
                    findNavController().navigate(R.id.fioicjxhuyygvgydsifw)
                }
            }
        } else {
            findNavController().navigate(R.id.fioicjxhuyygvgydsifw)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.osksokijw, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        aplalpsalpaskjixjicjixzji = context
    }


}