package digital.and.circlecitest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Fabric.with(this, Crashlytics())
        button.setOnClickListener({v -> addNumbers()})
    }

    fun addNumbers(){
        val addUtil = AddUtil()
        val numberOne:Int = editText.text.toString().toInt()
        val numberTwo:Int = editText2.text.toString().toInt()
        textView2.text = "= " + addUtil.addNumbers(numberOne, numberTwo)
    }
}
