package com.hasanaltunbay.mvvmcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.hasanaltunbay.mvvmcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    private val viewModel:ViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.degisken=this



        viewModel.sonuc.observe(this,{
            binding.sonuc=it
        })

    }
    fun buttonTopla(gelenSayi1:String,gelenSayi2:String){

        viewModel.topla(gelenSayi1,gelenSayi2)

    }
    fun buttonCikar(gelenSayi1:String,gelenSayi2:String){

        viewModel.cikar(gelenSayi1,gelenSayi2)

    }

    fun buttonCarp(gelenSayi1:String,gelenSayi2:String){

        viewModel.carp(gelenSayi1,gelenSayi2)

    }

    fun buttonBol(gelenSayi1:String,gelenSayi2:String){

        viewModel.bol(gelenSayi1,gelenSayi2)

    }
    fun buttonTemizle(){

        binding.sonuc="0"
    }


}