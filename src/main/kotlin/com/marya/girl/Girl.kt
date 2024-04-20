package com.marya.girl

/****
 * If the number of distinct characters in the username is odd,
 * then the user is male; otherwise, the user is female.
 * Help our hero determine the user's gender
 *
 * https://codeforces.com/contest/236/problem/A
 *
 */

class Girl {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val name = readlnOrNull().toString()

            detectGender(name)
        }

        private fun detectGender(name: String) {
            var list = mutableListOf<Char>()

            for (n in name) {
                if (!list.contains(n)) list.add(n)
            }

            if ((list.size % 2) == 0) println("CHAT WITH HER!")
            else println("IGNORE HIM!")
        }
    }
}