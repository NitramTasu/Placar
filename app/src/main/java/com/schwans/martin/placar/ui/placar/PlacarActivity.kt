package com.schwans.martin.placar.ui.placar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.schwans.martin.placar.R
import com.schwans.martin.placar.utils.KEY_EXTRA_TIME_A
import com.schwans.martin.placar.utils.KEY_EXTRA_TIME_B
import com.schwans.martin.placar.utils.PLACAR_CASA
import com.schwans.martin.placar.utils.PLACAR_VISITANTE
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarActivity : AppCompatActivity() {

    private var placarA = 0
    private var placarB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

        if(savedInstanceState != null){
            placarA = savedInstanceState.getInt(PLACAR_CASA)
            placarB = savedInstanceState.getInt(PLACAR_VISITANTE)

            tvPlacarTimeA.text = placarA.toString()
            tvPlacarTimeB.text = placarB.toString()
        }

        tvTimeA.text = intent.extras.getString(KEY_EXTRA_TIME_A)
        tvTimeB.text = intent.extras.getString(KEY_EXTRA_TIME_B)


        bt1PontosTimeA.setOnClickListener { adiciarPontoTimeA(1) }
        bt2PontosTimeA.setOnClickListener { adiciarPontoTimeA(2) }
        bt3PontosTimeA.setOnClickListener { adiciarPontoTimeA(3) }

        bt1PontosTimeB.setOnClickListener { adiciarPontoTimeB(1) }
        bt2PontosTimeB.setOnClickListener { adiciarPontoTimeB(2) }
        bt3PontosTimeB.setOnClickListener { adiciarPontoTimeB(3) }

        btReiniciar.setOnClickListener { reiniciar() }

    }

    private fun adiciarPontoTimeA(ponto: Int) {
        placarA += ponto
        tvPlacarTimeA.text = placarA.toString()
    }

    private fun adiciarPontoTimeB(ponto: Int) {
        placarB += ponto
        tvPlacarTimeB.text = placarB.toString()
    }

    private fun reiniciar(){
        placarA = 0
        placarB = 0
        tvPlacarTimeA.text = "0"
        tvPlacarTimeB.text = "0"
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putInt(PLACAR_CASA, placarA)
        outState?.putInt(PLACAR_VISITANTE, placarB)
    }

}
