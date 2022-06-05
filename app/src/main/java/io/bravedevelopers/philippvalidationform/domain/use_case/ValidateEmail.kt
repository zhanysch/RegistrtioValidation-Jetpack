package io.bravedevelopers.philippvalidationform.domain.use_case

import android.util.Patterns

class ValidateEmail {

    fun execute(email:String):ValidateResult{
        if (email.isBlank()){
            return ValidateResult(
                successful = false,
                errorMessage = "The email can't be blank"
            )
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            return ValidateResult(
                successful = false,
                errorMessage = "isn't valid Email"
            )
        }
        return ValidateResult(
            successful = true
        )
    }
}