fun main(args: Array<String>) {

    var population = 0
    var increaseRate = 0.0
    var days = 0

    println("Please enter the starting population: ")
    population = readln().toInt()
    while (population < 2) {
        println("Error. Enter a population size of at least 2.")
        population = readln().toInt()
    }

    println("Enter the percentage rate of increase: ")
    increaseRate = readln().toDouble()
    while (increaseRate < 0) {
        println("Error. Please enter a positive value for the increase rate: ")
        increaseRate = readln().toDouble()
    }

    println("Enter the number of days to multiply: ")
    days = readln().toInt()
    while (days < 1) {
        println("Error. Please enter a value greater than 0: ")
        days = readln().toInt()
    }

    var day = 1
    println("Day 1: $population")
    while (day <= days) {
        population += (population * increaseRate / 100).toInt()
        day++
        println("Day $day: $population")
    }
}