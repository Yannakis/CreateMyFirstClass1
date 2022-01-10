fun main(args: Array<String>) {

    var user = User()
    user.firstName = "Done"
    user.lastName = "Felker"
    user.printFullName()
    user.updateName("Bob")
    user.printFullName()
    user.printWithPrefix("Mr.")

    var friend = User()
    friend.firstName = "Jane"
    friend.lastName = "Doe"
    friend.printFullName()
    friend.printWithPrefix("Ms.")
    friend.firstNameLength()

}



