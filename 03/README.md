# roop文
慣れてる方は[こちら](https://qiita.com/PinappleHunter/items/21f0b387454c85f5d813)でさらっとどうぞ(

```kotlin
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
```

## ちょっと解説
- 「for」: 繰り返し処理を行う。
- 「sum += i」: sum = sum + i と同じ。基本的にこうやって短縮して書かれるよ
- 1..100 : 1~100と同義。最近の言語では範囲を表す時にこうやって表記することが多いよ。
