package com.joydeep.data.login.repositoryImpl

import com.joydeep.data.login.di.scope.LoggedInScope
import com.joydeep.domain.login.repository.UserDataRepository
import javax.inject.Inject
import kotlin.random.Random

@LoggedInScope
class UserDataRepositoryImpl @Inject constructor() : UserDataRepository {
    override var unreadNotification: Int = 0

    init {
        unreadNotification = refreshNotification()
    }

    override fun refreshNotification(): Int {
        val newNotification = Random.nextInt(until = 200)
        unreadNotification = newNotification
        return newNotification
    }
}