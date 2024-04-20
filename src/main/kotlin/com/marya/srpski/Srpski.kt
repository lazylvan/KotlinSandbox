package com.marya.srpski

import java.nio.file.Files
import java.nio.file.Paths
import java.util.SortedMap

/******
 * File input.txt contain entries learning serbian language for students (format: "name session").
 * Find best student.
 * Print score table.
 * Print all sessions in descending order
 */

class Score(var name: String, var time: Int)

class Srpski {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val file = Files.readAllLines(Paths.get("src\\main\\kotlin\\com\\marya\\srpski\\Input.txt"))

            val table = HashMap<String, Int>()
            val listOfScores = mutableListOf<Score>()

            for(line in file) {
                val k: Int = line.lastIndexOf(" ")
                if (k==-1) continue
                val name = line.substring(0, k)
                val score = line.substring(k+1).toInt()
                val generalScore = table.get(name)?.plus(score) ?: score
                table.put(name, generalScore)
                listOfScores.add(Score(name, score))
            }

            // list of elements score : name & time
            // convert hash map to list
            // sort list by time

            val listOfSums = mutableListOf<Score>()
            for (m in table) {
                listOfSums.add(Score(m.key, m.value))
            }
            listOfSums.sortByDescending { it.time }
            listOfScores.sortByDescending { it.time }

            println("Congrats the winner: \n" + table.maxBy{it.value}.key)
            println("____________________")
            println("Total Rating:" )
            println(listOfSums)
            println("____________________")
            println("All sessions: ")
            println(listOfScores)
        }

        private fun println(listOfScores: List<Score>) {
            for(score in listOfScores){
                println("${score.name}: ${score.time} s.")
            }
        }
    }
}