package com.example.testowo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            if(findViewById<Button>(R.id.button).text == "zaakceptuj"){
                var tekst = ""
                if(findViewById<RadioButton>(R.id.radioButton).isChecked){
                    tekst = "Kobieta, "
                }
                else if (findViewById<RadioButton>(R.id.radioButton2).isChecked){
                    tekst = "Mężczyzna, "
                }
                else {
                    val toast = Toast.makeText(applicationContext, "Wybierz płeć", Toast.LENGTH_LONG)
                    toast.show()
                    return@setOnClickListener
                }
                var wiek = findViewById<EditText>(R.id.editTextNumber).text.toString()
                if(wiek == ""){
                    val toast = Toast.makeText(applicationContext, "Podaj wiek", Toast.LENGTH_LONG)
                    toast.show()
                    return@setOnClickListener
                }
                else{
                    tekst += "lat " + wiek + ", "
                }
                tekst += "zainteresowania: "
                var chk1 = findViewById<CheckBox>(R.id.checkBox)
                var chk2 = findViewById<CheckBox>(R.id.checkBox2)
                var chk3 = findViewById<CheckBox>(R.id.checkBox3)
                var chk4 = findViewById<CheckBox>(R.id.checkBox4)
                if(chk1.isChecked == false && chk2.isChecked == false && chk3.isChecked == false && chk4.isChecked == false){
                    tekst += "brak"
                }
                if (chk1.isChecked){
                    tekst += "sport, "
                }
                if (chk2.isChecked){
                    tekst += "muzyka, "
                }
                if (chk3.isChecked){
                    tekst += "turystyka, "
                }
                if (chk4.isChecked){
                    tekst += "gry"
                }



                val toast = Toast.makeText(applicationContext, tekst, Toast.LENGTH_LONG)
                toast.show()

                findViewById<RadioButton>(R.id.radioButton).isEnabled = false
                findViewById<RadioButton>(R.id.radioButton2).isEnabled = false
                findViewById<EditText>(R.id.editTextNumber).isEnabled = false
                chk1.isEnabled = false
                chk2.isEnabled = false
                chk3.isEnabled = false
                chk4.isEnabled = false
                findViewById<Button>(R.id.button).text = "zmień"
            }
            else{
                var chk1 = findViewById<CheckBox>(R.id.checkBox)
                var chk2 = findViewById<CheckBox>(R.id.checkBox2)
                var chk3 = findViewById<CheckBox>(R.id.checkBox3)
                var chk4 = findViewById<CheckBox>(R.id.checkBox4)
                findViewById<RadioButton>(R.id.radioButton).isEnabled = true
                findViewById<RadioButton>(R.id.radioButton2).isEnabled = true
                findViewById<EditText>(R.id.editTextNumber).isEnabled = true
                chk1.isEnabled = true
                chk2.isEnabled = true
                chk3.isEnabled = true
                chk4.isEnabled = true
                findViewById<Button>(R.id.button).text = "zaakceptuj"
            }

        }
    }
}