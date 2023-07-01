package com.hasanaltunbay.mvvmcalculator

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel:ViewModel() {

    var sonuc=MutableLiveData<String>()

    var repo=Repository()

    init {
        sonuc=repo.repoSonucAl()
    }

    fun topla(gelenSayi1:String,gelenSayi2:String){

        repo.toplama(gelenSayi1,gelenSayi2)
    }
    fun cikar(gelenSayi1:String,gelenSayi2:String){

        repo.cikarma(gelenSayi1,gelenSayi2)
    }
    fun carp(gelenSayi1:String,gelenSayi2:String){

        repo.carpma(gelenSayi1,gelenSayi2)
    }
    fun bol(gelenSayi1:String,gelenSayi2:String){

        repo.bolme(gelenSayi1,gelenSayi2)
    }


}