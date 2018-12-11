package com.schwans.martin.placar.ui.time

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.schwans.martin.placar.ui.placar.PlacarActivity
import com.schwans.martin.placar.R
import com.schwans.martin.placar.ui.placaraac.PlacarAACActivity
import com.schwans.martin.placar.ui.placaraac.PlacarAACViewModel
import com.schwans.martin.placar.utils.KEY_EXTRA_TIME_A
import com.schwans.martin.placar.utils.KEY_EXTRA_TIME_B
import kotlinx.android.synthetic.main.activity_times.*

class TimesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_times)

        btIniciarJogo.setOnClickListener({
            var intent = Intent(this, PlacarAACActivity::class.java)
            intent.putExtra(KEY_EXTRA_TIME_A, inputTimeA.text.toString())
            intent.putExtra(KEY_EXTRA_TIME_B, inputTimeB.text.toString())
            startActivity(intent)
        })

        btNovoJogo.setOnClickListener({

            println("Clicou em novo jogo")
        })
    }
}
