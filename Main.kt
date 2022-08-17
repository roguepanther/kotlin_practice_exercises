import kotlin.math.roundToInt

fun main(args: Array<String>) {
//    val result = 5 + 2
////    println(5+2)
//    println("Hi" + " John")
//    println(5 * 2)
//    println(5 / 2)
//    println(5f / 2f)
//    println(5 % 2)
//    println(7 % 5)
//    var cats = 5
//    cats++
//    println(++cats)

//    val a: Short = 6
//    val b: Int = 32
//    val r = a * b
//    println(r::class.java)

//    val a: Long = 2864582635
//    val b: Float = 13.67F
//    val result = a / b
//    println(result)
//    println(result::class.java)

//    val a: Float = 234.45F
//    val b = 34587.453
//    val result = a * b
//    println(result::class.java)

//    val dozen = 12
//    val months = dozen
//    println(months)
//
//    val products = 3
//    val price = 9.99
//    println("Your total is ${products * price}")

//    var bikes = 5
//    bikes %= 2
//    println(bikes)
    /**
     * Practicing Operators Lecture
     */

//    var a = 76.254
//    var b = 3.867
//
//    println(a + b)
//    println(a - b)
//    println(a * b)
//    println(a / b)
//    println(a % b)

//    var kgOfMeatPrice = 29.99
//    var desiredAmount = 1f / 3f
//    var result = (kgOfMeatPrice * desiredAmount).roundToInt().toDouble()
//    println("Person must spend ${result} dollars for 1/3 of a kg of meat")

//    println("Please enter current amount in bank account: ($)")
//    val userInput = readLine()?:""
//    val intUserInput = userInput.toDouble()
//    var tripleAmount = intUserInput * 3
//    println("You won. You now have ${tripleAmount}")

    /**
     * Read from console amount on user bank account
     * Interest on account is 5.5% per year
     * How much would the user have in 5 years
     */

//    println("Please enter your current bank balance: (£)")
//    var userInput = readLine()?:""
//    var convertedUserInput = userInput.toDouble()
//    val interestRate = 0.055
//    var result = (convertedUserInput * interestRate) * 5
//    println("In 5 years, you will have ${convertedUserInput + result}")

//    println(3 > 2)
//    val a = 5
//    val b = 1
//    println(a > b)
//    println(a < b)
//    println(a >= b)
//    println(a <= b)
//    println(a == b)
//    println(a != b)
//
//    val result = a != b
//    println(result)

   val a = 5.374 * 9.5847
   val b = 3.237 * 15.3726
//   println(a)
//   println(b)
//    println("Is $a > $b ? ${a > b}")

//    val expr3 = ((true && false) || (true || false))
//    println(expr3)

//    val expr4 = !(( 3>= 3) && (false || (2 < 5)))
//    println(expr4)

//    val numberToys = 2
//    val brokenToys = 1
//    val willChildGetToy = ((numberToys < 5) && (brokenToys >= 1))
//    println("Will the child get new toy? $willChildGetToy")

    val numberOfCows = 3
    val cowsMilkProducing = 1
    val numberOfChildren = 2
    val willFarmerReceiveFunding = (((numberOfCows <= 5) && (cowsMilkProducing >= 1)) || numberOfChildren >= 3)
    println("Will the farmer receive funding: $willFarmerReceiveFunding")

}
