package com.example.myapplication.fragments

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.fragment.findNavController
import com.example.myapplication.Interfaces.OnClick
import com.example.myapplication.R
import com.example.myapplication.RvAdapter
import com.example.myapplication.Tarifs
import com.example.myapplication.databinding.FragmentTarifBinding
import java.io.Serializable

var list : ArrayList<Tarifs> = ArrayList<Tarifs>()
class Tarif_Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addMembers()
    }

    override fun onDestroy() {
        super.onDestroy()
        list.clear()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view =  inflater.inflate(R.layout.fragment_tarif_, container, false)
        var binding = FragmentTarifBinding.bind(view)
        var myAdapter = RvAdapter(list , object : OnClick {
            override fun onClick(tarif: Tarifs) {
                var bundle = Bundle()
                bundle.putSerializable("key" , tarif)
                findNavController().navigate(R.id.action_tarif_Fragment_to_infoFragment,bundle)
            }
        })

        binding.rv.adapter = myAdapter
        return view
    }

}
fun addMembers(){
    list.add(Tarifs("*Code#" , "bu yerda sizning reklamangiz bo'lishi mumkin edi ))" , "Mobi 10"))
    list.add(Tarifs("*Code#" , "bu yerda sizning reklamangiz bo'lishi mumkin edi ))" , "Mobi 20"))
    list.add(Tarifs("*Code#" , "bu yerda sizning reklamangiz bo'lishi mumkin edi ))" , "Mobi 30"))
    list.add(Tarifs("*Code#" , "bu yerda sizning reklamangiz bo'lishi mumkin edi ))" , "Mobi 40"))
    list.add(Tarifs("*Code#" , "bu yerda sizning reklamangiz bo'lishi mumkin edi ))" , "Mobi 50"))
    list.add(Tarifs("*Code#" , "bu yerda sizning reklamangiz bo'lishi mumkin edi ))" , "Mobi 60"))
    list.add(Tarifs("*Code#" , "bu yerda sizning reklamangiz bo'lishi mumkin edi ))" , "Mobi 70"))
    list.add(Tarifs("*Code#" , "bu yerda sizning reklamangiz bo'lishi mumkin edi ))" , "Mobi 80"))
    list.add(Tarifs("*Code#" , "bu yerda sizning reklamangiz bo'lishi mumkin edi ))" , "Mobi 90"))
    list.add(Tarifs("*Code#" , "bu yerda sizning reklamangiz bo'lishi mumkin edi ))" , "Mobi 100"))
}
