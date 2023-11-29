package introduce.myteam.domain.user.serviceimport introduce.myteam.domain.user.dto.UserJoinRequestimport introduce.myteam.domain.user.dto.UserResponseimport introduce.myteam.domain.user.repository.UserRepositoryimport jakarta.transaction.Transactionalimport org.springframework.data.repository.findByIdOrNullimport org.springframework.stereotype.Service@Service@Transactionalclass UserService(private val userRepository: UserRepository) {    fun save(request: UserJoinRequest) {        userRepository.save(request.toEntity())    }    fun findUser(userId: Long): UserResponse {        val user = userRepository.findByIdOrNull(userId)            ?: throw NoSuchElementException()        return UserResponse.from(user)    }    fun findAll(): List<UserResponse> {        val findAll = userRepository.findAll()        return findAll.map(UserResponse::from)    }//    fun change(userId: Long, name: String): User {//        val user = userRepository.findByIdOrNull(userId) ?: throw IllegalArgumentException()//        user.changeName(name)//        return user//    }    fun remove(userId: Long) {        val user = userRepository.findByIdOrNull(userId)            ?: throw NoSuchElementException()        userRepository.delete(user)    }}