package henimex.education.userbook.service

import henimex.education.userbook.models.UserModel
import retrofit2.http.GET

interface UserAPI {

    //val API_URL: String = "https://raw.githubusercontent.com/"

    @GET("atilsamancioglu/UsersJSONPlaceHolder/blob/main/users.json")
    suspend fun getData() : List<UserModel>

}