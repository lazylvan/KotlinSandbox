package com.marya.chess

import kotlin.math.abs

class Cell {
    var x: Int = 0
    var y: Int = 0
}

class Chess {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            println("Whats start position?")
            val from = readLine()
            println("Whats you're move?")
            val to = readLine()

            findFigureType(from.toString(), to.toString())
        }

        private fun findFigureType(to: String, from: String) {
            val c1 = parseCell(to)
            val c2 = parseCell(from)

            val diffX = abs(c2.x - c1.x)
            val diffY = abs(c2.y - c1.y)

            //check for horse
            if ((diffX != 0) && (diffY != 0) && (diffX + diffY == 3)) {
                println("You're a horse!")
                return
            }

            //check for pawn
            if ((diffX == 0) && ((c2.y - c1.y) == 2)) {
                println("You're a a pawn!")
                return
            }

            if ((diffX == 1) && ((c2.y - c1.y) == 1)) {
                println("You're a a pawn who ate somebody!")
                return
            }

            println("Ne znam ovu figuru. Moze to je kravica?")
        }

        private fun parseCell(s: String): Cell {
            val cell = Cell()
            cell.x = s.toCharArray().get(0) - 'A'
            cell.y = s.get(1).digitToInt()

            return cell
        }
    }
}