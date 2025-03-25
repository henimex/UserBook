package henimex.education.userbook.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import henimex.education.userbook.cards.UserCardV1
import henimex.education.userbook.utulities.getUsers

@Composable
fun UserList() {
    val users = remember { getUsers() }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(10.dp)
    ) {

        items(users.size) {
            UserCardV1(user = users[it])
        }
    }
}