package com.hexadec.megalexa.ui.activities

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.megalexa.hexadec.R
import com.megalexa.hexadec.presenter.ConfigurationBlockPresenter
import com.megalexa.hexadec.presenter.contract.MainContract
import com.megalexa.hexadec.view.activity.SettingsActivity

import kotlinx.android.synthetic.main.workflow_view.my_toolbar

class ConfigurationBlocks: AppCompatActivity(), MainContract.ConfigurationBlockView {

    internal lateinit var presenter: MainContract.ConfigurationBlockContract

    override fun setPresenter(presenter: MainContract.ConfigurationBlockContract) {
        this.presenter=presenter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setSupportActionBar(my_toolbar)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        setPresenter(ConfigurationBlockPresenter(this@ConfigurationBlocks))

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listOf("Calcio", "Notizie"))

       var name = intent.getStringExtra("name")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.new_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if ( item.itemId == R.id.settings) {
            startActivity(Intent(this@ConfigurationBlocks, SettingsActivity::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onStart() {
        super.onStart()
          var TextV: TextView? = findViewById(R.id.textViewWorkflowName)
          val prova = intent.extras.getString("workflowCorrente")
    }
}