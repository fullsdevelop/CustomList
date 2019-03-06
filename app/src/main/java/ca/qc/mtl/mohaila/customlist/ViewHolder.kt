package ca.qc.mtl.mohaila.customlist

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ViewHolder(private val view: View){

    init {
        count++
        Log.i("ca.qc.mtl.mohaila", "ViewHolder constructor")
    }

    val icon by lazy {
        view.findViewById<ImageView>(R.id.icon)
    }

    val text2 by lazy {
        view.findViewById<TextView>(R.id.text2)
    }

    companion object {
        var count = 0
    }
}