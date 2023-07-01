package com.hasanaltunbay.mvvmcalculator

import androidx.lifecycle.MutableLiveData

class Repository {

    var repoSonuc= MutableLiveData<String>()

    init {
        repoSonuc= MutableLiveData<String>("0")
    }

    fun repoSonucAl():MutableLiveData<String>{
        return repoSonuc
    }

    fun toplama(gelenSayi1:String,gelenSayi2:String){

        val sayi1=gelenSayi1.toFloat()
        val sayi2=gelenSayi2.toFloat()

        val toplam=sayi1+sayi2
        repoSonuc.value=toplam.toString()
    }
    fun cikarma(gelenSayi1:String,gelenSayi2:String){

        val sayi1=gelenSayi1.toFloat()
        val sayi2=gelenSayi2.toFloat()

        val toplam=sayi1-sayi2
        repoSonuc.value=toplam.toString()
    }
    fun carpma(gelenSayi1:String,gelenSayi2:String){

        val sayi1=gelenSayi1.toFloat()
        val sayi2=gelenSayi2.toFloat()

        val toplam=sayi1*sayi2
        repoSonuc.value=toplam.toString()
    }
    fun bolme(gelenSayi1:String,gelenSayi2:String){

        val sayi1=gelenSayi1.toFloat()
        val sayi2=gelenSayi2.toFloat()

        val toplam=sayi1/sayi2
        repoSonuc.value=toplam.toString()
    }

}