package com.Taira.rest.api.taira

class CollectionSample {

    fun test() : List<User> {
        var user1 = User(Name("Taira"), Age(20))
        var user2 = User(Name("Taira2"), Age(21))
        var user3 = User(Name("Taira3"), Age(22))
        var userList = listOf(user1, user2, user3)

        return userList;
    }

    fun test2() : List<Name> {
        var userList = test();

        var nameList = userList.map { u -> u.name };
        return nameList;
    }

    fun test3() : List<Age> {
        val userList = test()

        val ageList = userList.map { it.age}
        return ageList
    }


    data class User(val name: Name, val age: Age)
    data class Name(val value: String)
    data class Age(val value: Int)

}
fun main() {
    var collectionSample = CollectionSample()
    var userList = collectionSample.test()

    for (user in userList) {
        println("name: ${user.name}, age: ${user.age}")
    }
}