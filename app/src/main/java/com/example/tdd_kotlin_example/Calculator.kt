package com.example.tdd_kotlin_example

class Calculator {
    fun parse(expression: String): Int {
        val values = expression.split(" ")

        if (values[1] == "+") {
            return values[0].toInt() + values[2].toInt()
        }
        if (values[1] == "-") {
            return values[0].toInt() - values[2].toInt()
        }
        if (values[1] == "*") {
            return values[0].toInt() * values[2].toInt()
        }
        if (values[1] == "/") {
            return values[0].toInt() / values[2].toInt()
        }

        return 0
    }
}