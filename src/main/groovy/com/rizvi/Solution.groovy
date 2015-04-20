package com.rizvi

class Solution {
    def solution(def unOrderedList) {
        def orderedList = [unOrderedList[0]]

        unOrderedList.each {
            if (it != 0) orderedList[it] = it
            if (it == -1) orderedList[-1] = it
        }

        orderedList.size() - 1
    }

    def solutionTwo(def list) {
        def descendingList = list.sort(false) { a, b -> b <=> a }

        //Inefficient but working code
        //If we're off by more than 2 indeces that means we needed more than 2 swaps
        def nonMatchCount = 0
        descendingList.eachWithIndex { value, index ->
            if (value == list[index]) return

            def nextValue = list[index + 1]
            if (nextValue) {
                if (nextValue == value) return
            }

            def nextNextValue = list[index + 2]
            if (nextNextValue) {
                if (nextNextValue == value) return
            }

            nonMatchCount++
        }

        return nonMatchCount <= 2
    }
}
