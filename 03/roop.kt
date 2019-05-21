fun main(args: Array<String>) {
    // 1から100の足し算をしてみよう！
    var sum: Int = 0
    sum = 1+2+3+4+5+6+7 //....やってられない！(((
    
    sum = 0
    for (i in 1..100) {
        sum += i
    }
    
    println(sum) // 5050
    
    // for(変数 in 回数(変数でも良いよ！)) {
    //     実行すること
    // }
}