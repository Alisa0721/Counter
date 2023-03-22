package tw.edu.pu.gm.s1101705.counter20230322

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txv: TextView = findViewById(R.id.txv)
        txv.text = "0"
    }
    fun happy(v: View){
        var txv: TextView = findViewById(R.id.txv)
        txv.text = (1..100).random().toString()
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var txv:TextView = findViewById(R.id.txv)
        txv.text = "螢幕觸控"
        return true
    }
}