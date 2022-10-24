package com.kyrn.algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    private final int[] givenArr = {1, 5, 8, 12, 25, 36, 37, 58, 59, 63, 77, 85, 99};

    @Test
    void givenSortedArray_whenGivenItemExist_thenReturnGivenItem() {
        //given - precondition or setup
        int givenElement = 37;

        //when - action or the behaviour that we are going to test
        Integer result = BinarySearch.search(givenArr, givenElement);

        //then - verify the output
        assertThat(result).isEqualTo(givenElement);
    }

    @Test
    void givenSortedArray_whenGivenItemNotExist_thenReturnNull() {
        //given - precondition or setup
        int givenElement = 100;

        //when - action or the behaviour that we are going to test
        Integer result = BinarySearch.search(givenArr, givenElement);

        //then - verify the output
        assertThat(result).isNull();
    }
}
