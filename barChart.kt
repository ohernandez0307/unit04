fun main() {

    println("Enter sales for store 1: ")
    var sales1 = readln().toDouble()

    println("Enter sales for store 2: ")
    var sales2 = readln().toDouble()

    println("Enter sales for store 3: ")
    var sales3 = readln().toDouble()

    println("Enter sales for store 4: ")
    var sales4 = readln().toDouble()

    println("Enter sales for store 5: ")
    var sales5 = readln().toDouble()

    println("Bar Chart")

    var bar = ""
    var numStar = (sales1 / 100).toInt()
    for (i in 0 until numStar) {
        bar += "*"
    }
    println("Store 1: $bar")

    bar = ""
    numStar = (sales2 / 100).toInt()
    for (i in 0 until numStar) {
        bar += "*"
    }
    println("Store 2: $bar")

    bar = ""
    numStar = (sales3 / 100).toInt()
    for (i in 0 until numStar) {
        bar += "*"
    }
    println("Store 3: $bar")

    bar = ""
    numStar = (sales4 / 100).toInt()
    for (i in 0 until numStar) {
        bar += "*"
    }
    println("Store 4: $bar")

    bar = ""
    numStar = (sales5 / 100).toInt()
    for (i in 0 until  numStar) {
        bar += "*"
    }
    println("Store 5: $bar")
}
