package com.rizvi

import spock.lang.Specification

class Spec extends Specification{
    def 'test for solution 1'(){
        expect:
        new Solution().solution([1,4,-1,3,2]) == 4
    }

    def 'test for solution 2 - truthy'(){
        expect:
        new Solution().solutionTwo([4,2,5,1])
    }

    def 'test for solution 2 - false'(){
        expect:
        !new Solution().solutionTwo([4,52,5,2,50,21])
    }
}
