package introduce.myteam

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyTeamApplication

fun main(args: Array<String>) {
    runApplication<MyTeamApplication>(*args)
}
