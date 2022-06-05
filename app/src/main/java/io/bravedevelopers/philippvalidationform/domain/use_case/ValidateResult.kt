package io.bravedevelopers.philippvalidationform.domain.use_case

data class ValidateResult(
    val successful: Boolean,
    val errorMessage: String? = null
)