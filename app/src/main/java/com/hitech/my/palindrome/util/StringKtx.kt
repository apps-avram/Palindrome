package com.hitech.my.palindrome.util

/**
 * Checks whether string is palindrome or not.
 * it does not consider space and special symbols.
 */
fun String.isPalindrome() =
    this.lowercase().replace("[^a-zA-Z0-9]".toRegex(), "").let {
        it == it.reversed()
    }
