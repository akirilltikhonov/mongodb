package com.mongodb.mongodb.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserTest {

    @Test
    fun testUser() {
        val user1 = User("username", "password1", "email")
        val user2 = User("username", "password1", "email")
        val user3 = User("username", "password2", "email")

        assertThat(user1).isEqualTo(user2)
        assertThat(user1).isNotEqualTo(user3)
        assertThat(user2).isNotEqualTo(user3)

        assertThat(user1)
                .usingRecursiveComparison()
                .ignoringFields("password")
                .isEqualTo(user2)
                .isEqualTo(user3)
    }
}