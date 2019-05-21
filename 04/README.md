＃ if分
```kotlin
fun main(args: Array<String>) {
    val one: Int = 1
    val two: Int = 2
    val three: Int = 3
    // それぞれの変数が奇数か偶数かを判定したい...！

    // 条件を満たしていないからprintlnは実行されない
    if (one % 2 == 0) {
        println("oneは偶数！")
    }

    // 条件を満たさないときとしてelseをかける
    if (two % 2 == 0) {
        println("twoは偶数！")
    } else {
        println("twoは奇数！")
    }

    //elseに対しても条件指定はできるよ
    if (three % 2 == 0) {
        println("threeは偶数！")
    } else if(three % 2 != 0) {
        println("threeは奇数！")
    }
}
```

## ちょっと解説
- %: あまりを算出する演算子。
- if(): ()の中身がtrueを返せば実行される。(a > b)や(true)もtrue/falseで帰ってくるものであれば文法として成立する。