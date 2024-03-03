package com.fabioseyiji.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
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
        // Java
//        setSupportActionBar(amb.mainTb)
//        supportActionBar?.title = getString(R.string.app_name)

        amb.estadoCivilSp.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                amb.conjugeLl.visibility = if (position == 2) View.VISIBLE else View.GONE
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                //Nsa
            }
        }

        with(amb) {
            salvarBt.setOnClickListener {
                "Nome Completo: ${nomeEt.text} ${sobrenomeEt.text}".also {
                    Toast.makeText(
                        this@MainActivity,
                        it,
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }

    }
}