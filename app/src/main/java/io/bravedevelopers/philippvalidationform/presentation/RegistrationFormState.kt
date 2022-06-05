package io.bravedevelopers.philippvalidationform.presentation

data class RegistrationFormState(
    val email : String = "",
    val emailError : String? = null,
    val password : String ="",
    val repeatedPassword : String ="",
    val passwordError : String? = null,
    val repeatedPasswordError : String? = null,
    val acceptedTerms : Boolean = false,
    val termsError : String? = null
)
