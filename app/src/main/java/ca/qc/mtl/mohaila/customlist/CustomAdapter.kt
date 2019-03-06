package ca.qc.mtl.mohaila.customlist

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(context: Context, private val items: Array<String>) : ArrayAdapter<String>(context, R.layout.row, R.id.text1, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = super.getView(position, convertView, parent)
        val icon = view.findViewById<ImageView>(R.id.icon)
        val text1 = view.findViewById<TextView>(R.id.text1)
        val text2 = view.findViewById<TextView>(R.id.text2)

        if (position % 2 == 0)
            icon.setImageResource(R.drawable.alarm)
        else
            icon.setImageResource(R.drawable.money)
        text1.text = items[position]
        text2.text = items[position].reversed()

        return view
    }
}