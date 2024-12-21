


import com.example.composefeaturestructure.features.login.data.LoginRepository
import com.example.composefeaturestructure.features.login.domain.LoginResponse
import javax.inject.Inject

/**
 * A simple use case for handling user login.
 */
class LoginUseCase @Inject constructor(
    private val repository: LoginRepository
) {

    /**
     * Executes the login process.
     *
     * @param username The user's username.
     * @param password The user's password.
     * @return The result of the login operation as a [Result] containing [LoginResponse].
     */
    suspend fun login(username: String, password: String): Result<LoginResponse> {
        return try {
            repository.login(username, password) // Call the repository
        } catch (e: Exception) {
         //   Result.failure(e) // Handle and propagate errors
        } as Result<LoginResponse>
    }
}