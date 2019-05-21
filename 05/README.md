# func

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


    // 作った関数で判定していこう！
    if(isOdd(one)){
        println("oneは偶数！")
    }else{
        println("oneは奇数！")
    }

    // 目的に応じて関数を作る
    println(OddEven(one))
    println(OddEven(two))
    println(OddEven(three))
}


//関数はこうやって定義!
fun isOdd(x: Int): Boolean{
    if(x % 2 == 0){
        return true
    }else{
        return false
    }
}

fun OddEven(x: Int): String{
    if(x % 2 == 0){
        return "偶数！"
    }else{
        return "奇数！"
    }
}
```

## ちょっと解説

- fun: 関数。
```kotlin
fun 関数名(引数: 型): 返り値{ 
    やること
}
```
で定義する。定義後は関数名で呼び出しが可能
