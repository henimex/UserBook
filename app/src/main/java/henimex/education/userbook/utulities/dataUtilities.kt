package henimex.education.userbook.utulities

import henimex.education.userbook.models.User

fun getUsers(): List<User> {
    return listOf(
        //region Data Init
        User(
            name = "J.Henimex",
            email = "jhen@gmail.com",
            webPage = "www.henimex.dev",
            phone = "123456789"
        ),
        User(
            name = "Emily Carter",
            email = "emily.carter@example.com",
            webPage = "www.emilycarter.me",
            phone = "9876543210"
        ),
        User(
            name = "Michael Thompson",
            email = "michael.thompson@webmail.com",
            webPage = "www.thompsondesigns.net",
            phone = "1234567890"
        ),
        User(
            name = "Sophia Johnson",
            email = "sophia.johnson@mailservice.com",
            webPage = "www.sophiajohnson.org",
            phone = "7563829104"
        ),
        User(
            name = "Daniel Roberts",
            email = "daniel.roberts@domain.org",
            webPage = "www.danielroberts.co",
            phone = "8092736451"
        ),
        User(
            name = "Olivia White",
            email = "olivia.white@coolmail.com",
            webPage = "www.oliviawhite.com",
            phone = "9083726154"
        ),
        User(
            name = "James Anderson",
            email = "james.anderson@email.net",
            webPage = "www.andersonventures.io",
            phone = "6749301825"
        ),
        User(
            name = "Charlotte Lewis",
            email = "charlotte.lewis@example.com",
            webPage = "www.charlottelewis.info",
            phone = "3829104567"
        ),
        User(
            name = "Benjamin Martin",
            email = "benjamin.martin@web.org",
            webPage = "www.benjaminmartin.biz",
            phone = "1230984567"
        ),
        User(
            name = "Amelia Davis",
            email = "amelia.davis@live.com",
            webPage = "www.ameliadavis.com",
            phone = "8739012456"
        ),
        User(
            name = "William Taylor",
            email = "william.taylor@tech.net",
            webPage = "www.williamtaylor.dev",
            phone = "4398275630"
        )
        //endregion
    )
}