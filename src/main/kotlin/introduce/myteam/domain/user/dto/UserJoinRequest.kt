package introduce.myteam.domain.user.dtoimport introduce.myteam.domain.user.Userdata class UserJoinRequest(    var name: String,    var description: String,    var githubUrl: String,    var blogUrl: String,    var profileImg: String = "",) {    fun toEntity(): User {        return User(            name = name,            description = description,            githubUrl = githubUrl,            blogUrl = blogUrl,            profileImg = profileImg        )    }}