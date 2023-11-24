package com.example.myapplication

import java.lang.IllegalArgumentException

class Calculater {
    open class CalculateBase(){
        fun plus(a: Double,b: Double): Double {
            return a + b
        }
        fun minus(a: Double,b: Double): Double {
            return a - b
        }
        fun times(a: Double,b: Double): Double {
            return a * b
        }
        fun divided(a: Double,b: Double): Double {
            return a / b
        }
        fun divide(a: Double,b: Double): Double {
            if(b != 0.0){
                return a / b
            } else {
                throw IllegalArgumentException("Cannot divide by zero")
            }
        }
    }
}

