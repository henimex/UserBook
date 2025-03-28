package henimex.education.userbook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.gson.Gson
import henimex.education.userbook.models.Address
import henimex.education.userbook.models.Company
import henimex.education.userbook.models.Geo
import henimex.education.userbook.models.UserModel
import henimex.education.userbook.screens.DetailScreen
import henimex.education.userbook.screens.NewUserList
import henimex.education.userbook.screens.UserList

import henimex.education.userbook.ui.theme.UserBookTheme
import henimex.education.userbook.viewmodel.DetailViewModel
import henimex.education.userbook.viewmodel.UserViewModel

class MainActivity : ComponentActivity() {

    private val viewModel: UserViewModel by viewModels<UserViewModel>()
    private val detailViewModel: DetailViewModel by viewModels<DetailViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            UserBookTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        NavHost(navController = navController, startDestination = "list_screen") {
                            composable("list_screen") {
                                viewModel.getUsersData()
                                NewUserList(userList = viewModel.userList.value, navController);
                            }

                            composable(
                                "userdetail-screen/{selectedUser}", arguments = listOf(
                                    navArgument("selectedUser") {
                                        type = NavType.IntType
                                    }
                                )) {
                                //val userString = remember {
                                //it.arguments?.getInt("selectedUser")
                                //}
                                //val selectedUser = Gson().fromJson(userString, UserModel::class.java)
                                //DetailScreen(user = selectedUser)

                                val userIndex = remember {
                                    it.arguments?.getInt("selectedUser")
                                }

                                val selectedUser = produceState(initialValue = UserModel(
                                    0,"","","",
                                    Address("","","","",
                                        Geo("","")),"","",
                                    Company("","",""),
                                )) {
                                    value = detailViewModel.getSingleUser(userIndex?:0)
                                }

                                DetailScreen(user = selectedUser.value)
                            }
                        }
                        //UserList();
                    }
                }
            }
        }
    }
}