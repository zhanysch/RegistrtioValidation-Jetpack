package io.bravedevelopers.philippvalidationform.domain.use_case

import android.util.Patterns

class ValidateRepeatedPassword {

    fun execute(password:String, repeatedPassword: String):ValidateResult{
        if (password != repeatedPassword){  // предыдущ пароль не похож на нынешний пароль
            return ValidateResult(
                successful = false,
                errorMessage = "The password don't match"
            )
        }

        return ValidateResult(
            successful = true
        )
    }
}