package com.example.hw1.mvp

import com.example.hw1.MainActivity

class MainPresenter(
    private val view: MainActivity,
    private val model: CountersModel = CountersModel()
) {

    fun counter1Click() {
        val nextValue = model.next(0)
        view.setButton1Text(nextValue.toString())
    }

    fun counter2Click() {
        val nextValue = model.next(1)
        view.setButton2Text(nextValue.toString())
    }

    fun counter3Click() {
        val nextValue = model.next(2)
        view.setButton3Text(nextValue.toString())
    }
}