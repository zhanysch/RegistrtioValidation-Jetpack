package io.bravedevelopers.philippvalidationform.domain.use_case

import android.util.Patterns

class ValidatePassword {

    fun execute(password:String):ValidateResult{
        if (password.length < 8){
            return ValidateResult(
                successful = false,
                errorMessage = "The password have to consist at least 8 characters"
            )
        }

        val containsLetterAndDigits = password.any { it.isDigit() } &&
                password.any { it.isLetter() }

        if (!containsLetterAndDigits){
            return ValidateResult(
                successful = false,
                errorMessage = "The password have to consist letters a digit"
            )
        }
        return ValidateResult(
            successful = true
        )
    }
}