package com.example.bodymassindex

class BodyMass {
    fun calculate(mass: Double, height: Double): String {
        val bmi = mass / Math.pow(height,2.0)
        var result = "${String.format("%.2f", bmi)} - "
        if (bmi < 16.0){
            result += "Underweight (Severe thinness)"
        } else if (bmi < 17.0){
            result += "Underweight (Moderate thinness)"
        } else if (bmi < 18.5){
            result += "Underweight (Mild thinness)"
        } else if (bmi < 25.0){
            result += "Normal range"
        } else if (bmi < 30.0){
            result += "Overweight (Pre-obese)"
        } else if (bmi < 35.0){
            result += "Obese (Class I)"
        } else if (bmi < 40.0){
            result += "Obese (Class II)"
        }else {
            result += "Obese (Class III)"
        }
        return result
    }
}
