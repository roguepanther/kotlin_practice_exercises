fun main(args: Array<String>) {
//    val herName: String = "Lily"
//    val hisName: String? = null
//    println(herName)
//    println(hisName)

//    var catName: String? = "Chonkers"
//    catName = null
//
//    var dogName: String? = "Fluffy"
//    dogName = null

    // Kotlin requires the null definition if the variable will be assigned
    // Null value at some point.
    // Without the ? operator, there will be a NullPointerException error
//    var catName: String? = "Chonkers"
//    catName = null

//    val catName: String? = "Chonkers"
//    println(catName?.length)

//    val catName = "Chonkers"
//    println(catName.length)

//    var a: Int? = 10
//    println(a?.plus(3))
//    println(a?.minus(5))
//    println(a?.times(4))
//    println(a?.div(3))
//    println(a?.rem(9))

    /**
     * Declare a nullable variable of type String and give it a value
     * Print out a substring of it from position 3 to 6
     */

//    val check: String? = "Filip Napiorkowski"
//    println(check?.substring(3,6))

    /**
     * Declare nullable variable of type Double.
     * Multiply it by 6, convert it to a float and print it to a console
     */

//    val doubleTest: Double? = 56.78
//    val multipliedValue = doubleTest?.times(6)?.toFloat()
//    println("The value is $multipliedValue")
//    println(multipliedValue::class.java)

    /**
     * Receive the name of the user from the console
     * Print out the length of the name
     */

//    println("Please enter your name: ")
//    val userInput: String? = readLine()
//    println("The length of your name is ${userInput?.length}")

    /**
     * Read a number from the console and convert it to double
     * Multiply it by 7, convert the result into string
     * print length of the string to the console
     */

//    println("Please enter a number: ")
//    val userInput: String? = readln()
//    val convertedInput = userInput?.toDouble()
//    val multipliedNumber = convertedInput?.times(7)
//    val finalConversion = multipliedNumber?.toString()
//    println(multipliedNumber)
//    println("The resulting length of that is ${finalConversion?.length}")


    /**
     * Elvis Operator
     * Guarantees a result returned
     * Either the actual result for a non-null variable or a default value
     */

//    val catName = "Chonkers"
//    println(catName)
//
//    val dogName: String? = null
//    println(dogName?: "This dog has no name")
//    println(dogName?: "Fluffy".length)

//    val catName: String? = "Jason"
//    println(catName!!.length)


    /**
     * Read a message from the console
     * Print out either the message or default greeting
     */

//    println("Enter a message: ")
//    val message = readln()
//    println(message?: "Hi, How are you!")

    /**
     * Read number from console
     * Assume you know that the user has entered a value and the read variable is not null
     * Multiply that number by 5 and print the result
     */

//    println("Hello. Please enter a number: ")
//    val userInput = readln()
//    val modifiedInput = userInput?.toInt()?.times(5)
//    println("Your number multiplied by 5 is ${modifiedInput}")

    /**
     * A product costs 29.99
     * Ask user at console how many products they want to buy
     * If read value is null, use default one
     * Print total for purchase
     */

    println("Hello. How many rubbers you want to buy? ")
    val userInput = readln()
    val productCost = 29.99
    val convertedInput = userInput?.toInt()?:3
    val result = convertedInput.times(productCost)
    println("Your total purchase price is $result")


}
