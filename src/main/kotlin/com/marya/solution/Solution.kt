package com.marya.solution

class Solution {
    fun twoSum(nums: IntArray, target: Int) {


        var indicies: IntArray = intArrayOf()

        for(i in nums.indices) {
           // indicies.add()
            if (indicies.size == 2) {
                if (indicies.sum() == target) {
                    print(indicies)
                }
            } // else indicies.clear()
        }
    }
}