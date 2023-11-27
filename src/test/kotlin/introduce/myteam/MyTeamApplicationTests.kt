package introduce.myteam

import introduce.myteam.domain.User
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MyTeamApplicationTests(@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun `유저가 생성된다`() {
        var constructor = User::class.java.getConstructor()
        var user = constructor.newInstance() as User
        println(user)
    }
}
