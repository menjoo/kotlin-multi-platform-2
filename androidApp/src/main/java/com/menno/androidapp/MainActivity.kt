package com.menno.androidapp

import android.content.Context
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import org.core.counter.*

class MainActivity : AppCompatActivity() {

    private lateinit var counterRepository: CounterRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        counterRepository = counterRepository(this as Context)

        fab.setOnClickListener { view ->
            counterRepository.increment()

            Snackbar.make(view, "you tapped ${counterRepository.getCount()} times!", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}
