fun main(args: Array<String>) {
    for(i in 1..100){
        when{
            i % 15 == 0 -> println("$i : fizzbuzz")
            i % 5 == 0 -> println("$i : buzz")
            i % 3 == 0 -> println("$i : fizz")
            else -> println("$i : ")
        }
    }
    // fizzbuzz(1..100)
}

// fun fizzbuzz(range: IntRange) {
//         for(i in range){
//         when{
//             i % 15 == 0 -> println("$i : fizzbuzz")
//             i % 5 == 0 -> println("$i : buzz")
//             i % 3 == 0 -> println("$i : fizz")
//             else -> println("$i : ")
//         }
//     }
// }