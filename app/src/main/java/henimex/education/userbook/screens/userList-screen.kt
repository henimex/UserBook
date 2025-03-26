package henimex.education.userbook.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import henimex.education.userbook.cards.UserCardV2
import henimex.education.userbook.models.Address
import henimex.education.userbook.models.Company
import henimex.education.userbook.models.Geo
import henimex.education.userbook.models.UserModel
import henimex.education.userbook.ui.theme.UserBookTheme


@Composable
fun NewUserList(userList: List<UserModel>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primaryContainer)
    ) {
        items(userList) {
            UserCardV2(it)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UserListPreview() {
    UserBookTheme {
        //UserList()
        NewUserList(
            listOf(
                UserModel(
                    100,
                    "Joseph Henimex",
                    "henimex",
                    "henimex@gmail.com",
                    Address("ODUNPAZARI", "TEPEBASI", "ESKISEHIR", "26600",Geo("445", "555")),
                    "5556323","www.henimex.com", Company("Hendev","Pharse","BS")
                )
            )
        );
    }
}