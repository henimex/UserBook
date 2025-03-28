package henimex.education.userbook.service

import henimex.education.userbook.models.UserModel
import retrofit2.http.GET

interface UserAPI {
    @GET("atilsamancioglu/UsersJSONPlaceHolder/refs/heads/main/users.json")
    suspend fun getData() : List<UserModel>

    @GET("atilsamancioglu/UsersJSONPlaceHolder/refs/heads/main/users.json")
    suspend fun getSingleUser() : List<UserModel>
}