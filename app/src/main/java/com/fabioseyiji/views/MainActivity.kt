package com.fabioseyiji.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.RadioButton
import android.widget.Toast
import com.fabioseyiji.views.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener

class MainActivity : AppCompatActivity() {
    private lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)

        amb.mainTb.apply {
            title = getString(R.string.app_name)
            setSupportActionBar(this)
        }

        with(amb) {
            salvarBt.setOnClickListener {
                val formulario = Formulario(
                    nomeEt.text.toString(),
                    telefoneEt.text.toString(),
                    emailEt.text.toString(),
                    emailCb.isActivated,
                    findViewById<RadioButton>(sexoRg.checkedRadioButtonId)?.text.toString(),
                    cidadeEt.text.toString(),
                    ufSp.selectedItem.toString()
                )
            }
        }

        with(amb){
            limparBt.setOnClickListener{
                nomeEt.text.clear()
                telefoneEt.text.clear()
                emailEt.text.clear()
                emailCb.isChecked = false
                sexoRg.clearCheck()
                cidadeEt.text.clear()
                ufSp.setSelection(0)
            }
        }

    }
}
