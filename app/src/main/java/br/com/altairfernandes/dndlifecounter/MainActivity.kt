package br.com.altairfernandes.dndlifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.altairfernandes.dndlifecounter.Model.Character

class MainActivity : AppCompatActivity(), CharacterFragment.OnListFragmentInteractionListener {
    override fun onListFragmentInteraction(item: Character?) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}

