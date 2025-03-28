package henimex.education.userbook.viewmodel
import androidx.lifecycle.ViewModel
import henimex.education.userbook.models.UserModel
import henimex.education.userbook.service.UserAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DetailViewModel : ViewModel() {
    private val BASE_URL = "https://raw.githubusercontent.com/"

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(UserAPI::class.java)

    suspend fun getSingleUser(id: Int): UserModel {
        val user = retrofit.getSingleUser()[id]
        println(user.name)
        return user
    }
}