package com.hitech.my.palindrome

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hitech.my.palindrome.constant.Message
import com.hitech.my.palindrome.util.isPalindrome

class MainViewModel: ViewModel() {

    val data = MutableLiveData<String>()

    private val _result = MutableLiveData<Message>()
    val result: LiveData<Message>
        get() = _result

    fun checkPalindrome() {
        val input = data.value?.trim()
        _result.value =
            when {
                input.isNullOrEmpty() -> Message.Error
                input.isPalindrome() -> Message.Palindrome
                else -> Message.NotPalindrome
            }
    }
}