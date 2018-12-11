package com.schwans.martin.placar.ui.placaraac

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.schwans.martin.placar.R
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarAACActivity : AppCompatActivity() {

    lateinit var placarAACViewModel: PlacarAACViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar_aac)

        placarAACViewModel = ViewModelProviders
                            .of(this)
                            .get(PlacarAACViewModel::class.java)

        registraObservers()

        bt3PontosTimeA.setOnClickListener {
            placarAACViewModel.adicionarPontoTimeA(3)
        }

        bt2PontosTimeA.setOnClickListener {
            placarAACViewModel.adicionarPontoTimeA(2)
        }

        bt1PontosTimeA.setOnClickListener {
            placarAACViewModel.adicionarPontoTimeA(1)
        }


        bt3PontosTimeB.setOnClickListener {
            placarAACViewModel.adicionarPontoTimeB(3)
        }

        bt2PontosTimeB.setOnClickListener {
            placarAACViewModel.adicionarPontoTimeB(2)
        }

        bt1PontosTimeB.setOnClickListener {
            placarAACViewModel.adicionarPontoTimeB(1)
        }

        btReiniciar.setOnClickListener { placarAACViewModel.reiniciarJogo() }
    }

    private fun registraObservers() {
        placarAACViewModel.placarA.observe(this, Observer{
            tvPlacarTimeA.text = it.toString()
        })

        placarAACViewModel.placarB.observe(this, Observer{
            tvPlacarTimeB.text = it.toString()
        })
    }
}
