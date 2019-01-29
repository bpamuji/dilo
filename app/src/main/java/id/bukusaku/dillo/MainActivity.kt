package id.bukusaku.dillo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_count.setOnClickListener { countScore() }
        btn_toast.setOnClickListener { showToast() }
    }

    private fun showToast() {
        Toast.makeText(this,"Your Score is $score",Toast.LENGTH_LONG).show()
    }

    private fun countScore() : Int {
        score = tv_score.text.toString().toInt()
        score += 1
        tv_score.text = score.toString()
        return score
    }
}
