package com.example.ece558_w22_proj1_ayush

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.math.*
import android.text.TextUtils.isEmpty
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var op1: EditText
    private lateinit var op2: EditText
    private lateinit var result: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        op1 = findViewById(R.id.op1)
        op2 = findViewById(R.id.op2)
        result = findViewById(R.id.result)
    }

    // Function for root calculation
    fun btnRoot(view: View) {
        if( isEmpty(op1.text.toString()) ) {                                        // Error on Operand 1 empty
            Toast.makeText(this, "Operand 1 cannot be blank", Toast.LENGTH_SHORT).show()
            result.text = ""
        }
        else {
            var n1: Double = op1.text.toString().toDouble()

            var root: Double = sqrt(abs(n1.toDouble()))
            result.text = root.toString()
        }
    }

    // Function for Percent calculation
    fun btnPerc(view: android.view.View) {
        if( isEmpty(op1.text.toString()) ) {                                      // Error on Operand 1 empty
            Toast.makeText(this, "Operand 1 cannot be blank", Toast.LENGTH_SHORT).show()
            result.text = ""
        }
        else {
            var n1: Double = op1.text.toString().toDouble()
            var mod:Double =  (n1 / 100.00)
            result.text = mod.toString()
        }
    }

    // Function for Addition
    fun btnAdd(view: android.view.View) {
        if( (isEmpty(op1.text.toString())) || (isEmpty(op2.text.toString())) ) {  // Error if Operand field is empty
            Toast.makeText(this, "Operand/s cannot be blank", Toast.LENGTH_SHORT).show()
            result.text = ""
        }
        else {
            var n1: Double = op1.text.toString().toDouble()
            var n2: Double = op2.text.toString().toDouble()
            var add:Double =  n1 + n2;
            result.text = add.toString()
        }
    }

    // Function for Subtraction
    fun btnSub(view: android.view.View) {
        if ( (isEmpty(op1.text.toString())) || (isEmpty(op2.text.toString())) ) {   // Error if Operand field is empty
            Toast.makeText(this, "Operand/s cannot be blank", Toast.LENGTH_SHORT).show()
            result.text = ""
        } else {
            var n1: Double = op1.text.toString().toDouble()
            var n2: Double = op2.text.toString().toDouble()
            var sub: Double = n1 - n2;

            result.text = sub.toString()
        }
    }

    // Function for Division
    fun btnDiv(view: android.view.View) {

        if( (isEmpty(op1.text.toString())) || (isEmpty(op2.text.toString())) ) { // Error if Operand field is empty
            Toast.makeText(this, "Operand/s cannot be blank", Toast.LENGTH_SHORT).show()
            result.text = ""
        }
        else {
            if ((op2.text.toString().toDouble()) == 0.0) {                     // Error in case of Divide by 0
                Toast.makeText(this, "Divide by 0 Detected", Toast.LENGTH_SHORT).show()
                result.text = ""
            } else {
                var n1: Double = op1.text.toString().toDouble()
                var n2: Double = op2.text.toString().toDouble()
                var div: Double = n1.toDouble() / n2.toDouble();
                result.text = div.toString()
            }
        }
    }

    // Function for Multiplication
    fun btnMul(view: android.view.View) {
        if( (isEmpty(op1.text.toString())) || (isEmpty(op2.text.toString())) ) { // Error if Operand field is empty
            Toast.makeText(this, "Operand/s cannot be blank", Toast.LENGTH_SHORT).show()
            result.text = ""
        }
        else {
            var n1: Double = op1.text.toString().toDouble()
            var n2: Double = op2.text.toString().toDouble()
            var mul: Double = n1 * n2;

            result.text = mul.toString()
        }
    }
}