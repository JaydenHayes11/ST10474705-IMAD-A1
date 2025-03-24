package vcmsa.ci.jaydenhayesimad_a1st10474705

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //creates text to show suggestions button has been clicked
        val ShowSuggestionsButton = findViewById<Button>(R.id.ShowSuggestionsButton)

        ShowSuggestionsButton?.setOnClickListener{
            Toast.makeText(this@MainActivity,
                "Button Clicked" , Toast.LENGTH_LONG).show()
        }

        //creates text to show user reset button was clicked
        val ResetPageButton = findViewById<Button>(R.id.ResetPageButton)

        ResetPageButton?.setOnClickListener{
            Toast.makeText(this@MainActivity,
                "Page Reset", Toast.LENGTH_LONG).show()
        }


        val TimeOfDayText = findViewById<EditText>(R.id.TimeOfDayText)

        ShowSuggestionsButton?.setOnClickListener{
            var greeting:String
            if (TimeOfDayText.text.toString() == "Morning"){
                greeting = "Avocado Toast," +
                        "Omelet," +
                        "Boiled Eggs"
            }

         else {greeting = "Make sure one of the options below were selected"}
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}