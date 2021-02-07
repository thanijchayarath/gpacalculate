package com.example.gpacalculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val erroradd = Toast.makeText(applicationContext,"Please input all text and press OK!!!", Toast.LENGTH_LONG)
        val errorpoi = Toast.makeText(applicationContext,"Please input point to collect!!!", Toast.LENGTH_LONG)
        val errorcre = Toast.makeText(applicationContext,"Please input credit to collect!!!", Toast.LENGTH_LONG)
        var grade = arrayListOf<Double>(0,1,1.5,2,2.5,3,3.5,4)
        var cre = arrayListOf<Int>(1,2,3)
        var tocre = 0
        var togpa = 0

        ok.setOnClickListener(){
            if (grade >= 0 && grade < 4.5 || cre > 0 && cre < 4 || subjects1.text.toString() != ""
                    || subjects2.text.toString() != "" || subjects3.text.toString() != ""
                    || subjects4.text.toString() != "" || subjects5.text.toString() != ""){
                tocre = creditsub1 + creditsub2 + creditsub3 + creditsub4 + creditsub5
                togpa = (pointsub1 + pointsub2 + pointsub3 + pointsub4 + pointsub5) / 5
                var totalcredits = findViewById<TextView>(R.id.totalcredits)
                totalcredits.setText("$tocre")
                var totalgpa = findViewById<TextView>(R.id.totalgpa)
                totalgpa.setText("$togpa")
            } else {
                if (grade < 0 && grade > 4){
                    errorpoi.show()
                } else if (cre < 1 && cre > 3){
                    errorcre.show()
                } else if (creditsub1.text.toDouble() == ""){
                    erroradd.show()
                } else if (creditsub2.text.toDouble() == ""){
                    erroradd.show()
                } else if (creditsub3.text.toDouble() == ""){
                    erroradd.show()
                } else if (creditsub4.text.toDouble() == ""){
                    erroradd.show()
                } else if (creditsub5.text.toDouble() == ""){
                    erroradd.show()
                } else if (pointsub1.text.toDouble() == ""){
                    erroradd.show()
                } else if (pointsub2.text.toDouble() == ""){
                    erroradd.show()
                } else if (pointsub3.text.toDouble() == ""){
                    erroradd.show()
                } else if (pointsub4.text.toDouble() == ""){
                    erroradd.show()
                } else if (pointsub5.text.toDouble() == ""){
                    erroradd.show()
                } else {
                    erroradd.show()
                }
            }
        }

        clear.setOnClickListener(){
            subjects1.setText(null)
            subjects2.setText(null)
            subjects3.setText(null)
            subjects4.setText(null)
            subjects5.setText(null)
            creditsub1.setText(null)
            creditsub2.setText(null)
            creditsub3.setText(null)
            creditsub4.setText(null)
            creditsub5.setText(null)
            pointsub1.setText(null)
            pointsub2.setText(null)
            pointsub3.setText(null)
            pointsub4.setText(null)
            pointsub5.setText(null)
            totalcredits.setText(null)
            totalgpa.setText(null)
        }
    }
}