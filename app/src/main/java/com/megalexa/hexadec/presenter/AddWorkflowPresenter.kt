package com.megalexa.hexadec.presenter

import com.megalexa.hexadec.presenter.contract.MainContract

class AddWorkflowPresenter(view:MainContract.AddWorkflowView):MainContract.AddWorkflowContract {
    private var view:MainContract.AddWorkflowView? = view

    override fun onDestroy() {
        this.view=null
    }

}