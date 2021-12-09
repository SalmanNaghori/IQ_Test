package com.example.iq_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        val userName=intent.getStringExtra(setData.name)
        val score=intent.getStringExtra(setData.score)
        val totalquestion=intent.getStringExtra("Total size")

        congo.text="Congratulation ${userName} !!"
        Score.text="${score} / ${totalquestion}"
        f_btn.setOnClickListener {
                startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}