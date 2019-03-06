package ca.qc.mtl.mohaila.customlist

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class CustomAdapter(context: Context, private val items: Array<String>) : ArrayAdapter<String>(context, R.layout.row, R.id.text1, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = super.getView(position, convertView, parent)
        val holder = view.tag as ViewHolder? ?: ViewHolder(view); view.tag = holder

        if (position % 2 == 0)
            holder.icon.setImageResource(R.drawable.alarm)
        else
            holder.icon.setImageResource(R.drawable.money)

        holder.text2.text = items[position].reversed()

        return view
    }
}