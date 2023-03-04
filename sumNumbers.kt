fun main(args: Array<String>) {

    var num: Int
    var sum = 0

    println("Please enter a positive nonzero integer: ")
    var maxNum = readln().toInt()

    while (maxNum <= 0) {
        println("Error - please enter a positive nonzero integer: ")
        maxNum = readln().toInt()
    }
        num = 1
        while (num <= maxNum) {
            sum += num
                num++
        }
    println("The sum is: $sum")
}