package com.hitech.my.palindrome

import com.hitech.my.palindrome.util.isPalindrome
import org.junit.Assert
import org.junit.Test

class PalindromeTest {

    @Test
    fun `palindrome test success`() {
        Assert.assertEquals("taco cat".isPalindrome(), true)
        Assert.assertEquals("no lemon, no melon".isPalindrome(), true)
        Assert.assertEquals("   ".isPalindrome(), true)
    }

    @Test
    fun `not palindrome test success`() {
        Assert.assertEquals("taco at".isPalindrome(), false)
    }
}