package ca.qc.mtl.mohaila.customlist

import android.app.ListActivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listAdapter = CustomAdapter(this, items)
    }

    companion object {
        val items = arrayOf(
            "I'm", "You're", "He's", "She's", "It's", "We're", "You're", "They are",
            "I'm", "You're", "He's", "She's", "It's", "We're", "You're", "They are",
            "I'm", "You're", "He's", "She's", "It's", "We're", "You're", "They are"
        )
    }
}
