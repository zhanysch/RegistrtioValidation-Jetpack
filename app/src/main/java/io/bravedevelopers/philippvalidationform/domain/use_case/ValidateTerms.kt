package io.bravedevelopers.philippvalidationform.domain.use_case

import android.util.Patterns

class ValidateTerms {

    fun execute(acceptedTerms : Boolean):ValidateResult{
        if (!acceptedTerms){  //если условия не приняты accepted terms == false
            return ValidateResult(
                successful = false,
                errorMessage = "Please accept the terms"
            )
        }

        return ValidateResult(
            successful = true
        )
    }
}