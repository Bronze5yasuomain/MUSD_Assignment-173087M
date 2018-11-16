package com.example.a173087m.musd_assignment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.telephony.RadioAccessSpecifier
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBox.setOnCheckedChangeListener{view , isChecked->

            var cb2 = findViewById<CheckBox>(R.id.checkBox2)
            var cb3 = findViewById<CheckBox>(R.id.checkBox3)

                if (isChecked) {
                    cb2.visibility = View.VISIBLE;
                    cb3.visibility = View.VISIBLE;
                } else {
                    cb2.visibility = View.INVISIBLE;
                    cb3.visibility = View.INVISIBLE;
                }

        }


        buttonAddMovie.setOnClickListener({
            var etName = findViewById<EditText>(R.id.editTextName).text.toString()
            var etDesc = findViewById<EditText>(R.id.editTextDescription).text.toString()
            var etRDate = findViewById<EditText>(R.id.editTextReleaseDate).text.toString()
            var radioSelected = findViewById<RadioButton>(radioGroupLang.checkedRadioButtonId).text.toString()
            var suitableChecked = findViewById<CheckBox>(R.id.checkBox).isChecked
            var violenceChecked = findViewById<CheckBox>(R.id.checkBox2).isChecked
            var languageChecked = findViewById<CheckBox>(R.id.checkBox3).isChecked
            var checkboxString = ""
            if(suitableChecked){
                checkboxString = "Suitable for all ages: false \nReasons:"
                if(violenceChecked){
                    checkboxString += "\nViolence"
                }
                if(languageChecked){
                    checkboxString += "\nLanguage"
                }
            }
            else{
                checkboxString = "Suitable for all ages: true"
            }
            if (etName.isBlank()) {
                editTextName.setError("Field Empty");
            }
            if (etDesc.isBlank()) {
                editTextDescription.setError("Field Empty");
            }
            if (etRDate.isBlank()) {
                editTextReleaseDate.setError("Field Empty");
            }
            else{
                Toast.makeText(this, "title: " + etName + "\nOverview: " + etDesc + "\nRelease Date: " + etRDate + "\nLanguage; " + radioSelected + "\n" + checkboxString, Toast.LENGTH_LONG).show()
            }

        })




    }



}
