import kotlin.random.Random

fun main() {
    val rand = Random
    val max = 10
    var guess: Int
    var randNum: Int
    var count = 0

    randNum = rand.nextInt(max)

    print("Guess a random number: ")
    guess = readln().toInt()

    count = 1

    while (guess != randNum) {
        if (guess < randNum) {
            println("That's too low")
        } else if (guess > randNum) {
            println("That's too high")
        }

        print("Guess again: ")
        guess = readln().toInt()

        count++
    }
}