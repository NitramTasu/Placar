package com.schwans.martin.placar.ui.placaraac

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class PlacarAACViewModel: ViewModel(){

    val placarA = MutableLiveData<Int>()
    val placarB = MutableLiveData<Int>()

    init {
        placarA.value = 0
        placarB.value = 0
    }

    fun adicionarPontoTimeA(ponto:Int){
        placarA.value = placarA.value?.plus(ponto)

    }
    fun adicionarPontoTimeB(ponto:Int){
        placarB.value = placarB.value?.plus(ponto)
    }

    fun reiniciarJogo(){
        placarA.value = 0
        placarB.value = 0
    }


}