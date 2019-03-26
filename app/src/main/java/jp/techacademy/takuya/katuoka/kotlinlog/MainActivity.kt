package jp.techacademy.takuya.katuoka.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("takuya", 3, "小説")
        val huma = Human("takuya", 3, "小説")

        human.say()
        huma.think()
    }
}
