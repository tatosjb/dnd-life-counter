package br.com.altairfernandes.dndlifecounter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


import br.com.altairfernandes.dndlifecounter.CharacterFragment.OnListFragmentInteractionListener
import br.com.altairfernandes.dndlifecounter.Model.Character
import br.com.altairfernandes.dndlifecounter.dummy.DummyContent

import kotlinx.android.synthetic.main.fragment_character.view.*

/**
 * [RecyclerView.Adapter] that can display a [DummyItem] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class MyCharacterRecyclerViewAdapter(
        private val mValues: List<Character>,
        private val mListener: OnListFragmentInteractionListener?)
    : RecyclerView.Adapter<MyCharacterRecyclerViewAdapter.ViewHolder>() {

    private val mOnClickListener: View.OnClickListener

    init {
        mOnClickListener = View.OnClickListener { v ->
            val item = v.tag as Character
            // Notify the active callbacks interface (the activity, if the fragment is attached to
            // one) that an item has been selected.
            mListener?.onListFragmentInteraction(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_character, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        holder.nameView.text = item.name
        holder.totalPVView.text = "PV Total:" + item.totalPV.toString()
        holder.actualPVView.text = item.actualPV.toString()

        with(holder.mView) {
            tag = item
            setOnClickListener(mOnClickListener)
        }
    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val nameView: TextView = mView.character_name
        val totalPVView: TextView = mView.character_total_pv
        val actualPVView: TextView = mView.character_actual_pv

        override fun toString(): String {
            return super.toString() + " '" + nameView.text + "'"
        }
    }
}
