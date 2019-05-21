# Kotlinの文法
*プログラミング初学者でなければ[「３０分で覚えるKotlin文法
」](https://qiita.com/k5n/items/cc0377b75d8537ef8a85)を見た方が早いと思います。

```kotlin
fun main(args: Array<String>){
    // 変数に要素を入れるにはこう！
    // 変数: 任意の要素を入れるもの
    // また、a: String のようにして型を指定できる
    // 型: 変数に入る要素の情報　文字ならString,数字ならIntegerなど...
    val a: String = "Hello"

    // 変数を渡してあげることで変数を介して"Hello"を表示します。
    println(a)

    // kotlinは型を判断してくれるよ(型推論)
    val b = "Hello"
    println(b)  

    // varにすると変数の上書きが可能
    var one = 1
    one = 2
    one = 1
    val two = 2

    val three = one + two 
    println(three)

    // 色々やってみよう！
}
```