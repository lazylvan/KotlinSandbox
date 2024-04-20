package com.marya.japan

import java.nio.file.Files
import java.nio.file.Paths

class JapanName {

    /****
     *     задача на статический словать, массив, файл или хеш таблицу
     *     и как работает рандом
     *     катакана - использовать японские слоги
     *
     *     сгенерировать имена и фамилии, чтобы они были похожи на японские
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            println("How many names you want to get?")
            val size: Int = readlnOrNull()!!.toInt()
            println("Please type some fun fact:")
            val randomizer = readlnOrNull().toString()

            var names = mutableListOf<String>()
            for(i in 0 until size)
                names.add(generateName(size, randomizer))

            println("Grab your names:")
            for(name in names)
                println(name)
        }

        private fun generateName(size: Int, randomizer: String): String {
            val file = Files.readAllLines(Paths.get("src\\main\\kotlin\\com\\marya\\japan\\dictionary"))

            for(line in file) {
                val delimiter: Int = line.lastIndexOf(" ")
                if (delimiter==-1) continue
                //one list for line
                //another list for lists of line
            }

            var name = "Кивамо Кадаши"
            return name
        }
    }
}