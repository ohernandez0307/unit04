fun main(args: Array<String>) {
    var str: String
    var strUpper: String
    var chara: String
    var charaUpper: String
    var letter: Char
    var count = 0

    print("Enter a string: ")
    str = readln()

    strUpper = str.uppercase()

    print("Enter a character: ")

    chara = readln()

    charaUpper = chara.uppercase()

    letter = charaUpper[0]

    for (i in strUpper.indices) {
        if (strUpper[i] == letter)
            count++
    }

    print("The character $chara appears in $str $count times.")

}