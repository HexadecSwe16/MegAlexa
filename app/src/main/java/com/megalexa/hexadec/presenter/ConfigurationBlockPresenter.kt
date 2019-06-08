package com.megalexa.hexadec.presenter

import android.text.Layout
import com.megalexa.hexadec.presenter.contract.MainContract
import android.content.Intent.getIntent
import android.content.Intent.parseIntent
import android.content.Intent
import android.view.View
import com.megalexa.hexadec.R


class ConfigurationBlockPresenter(view:MainContract.ConfigurationBlockView):MainContract.ConfigurationBlockContract {

    private var view:MainContract.ConfigurationBlockView? = view


    override fun onDestroy() {
        this.view=null
    }



}