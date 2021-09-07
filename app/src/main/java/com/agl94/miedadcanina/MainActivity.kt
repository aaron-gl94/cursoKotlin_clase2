package com.agl94.miedadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageEdit = findViewById<EditText>(R.id.ageEdit)
        val resultText = findViewById<TextView>(R.id.resultText)
        val button = findViewById<Button>(R.id.btnCalcular)

        // resultText.text = "Attr desde Main Activity!"

        Log.v("MainActivity", "Activity created Verbose!")
        Log.d("MainActivity", "Activity created Debug!")
        Log.i("MainActivity", "Activity created Info!")
        Log.w("MainActivity", "Activity created Warning!")
        Log.e("MainActivity", "Activity created Error!")

        button.setOnClickListener{
            val ageString = ageEdit.text.toString()
            if (ageString.isNotEmpty()) {
                val ageInt = ageString.toInt()
                val result = ageInt*7
                resultText.text = getString(R.string.resultText, result)
            } else {
                Log.d("MainActivity", "AgeString is empty!")
                resultText.text = getString(R.string.errorAge)
                Toast.makeText(this, R.string.insertAge, Toast.LENGTH_SHORT).show()
            }
        }
    }
}