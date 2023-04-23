fun main() {
    // val N = readln().toInt()
    // val array = IntArray(N)
    // var result = "NO"

    // for (i in 0 until N) {
    //     array[i] = readln().toInt()
    // }
    // val M = readln().toInt()
    // for (i in 0 until N) {
    //     if (array[i] == M) {
    //         result = "YES"
    //     }
    // }
    // println(result)
    val list = List(readln().toInt()) { readln().toInt() }
    println(if (readln().toInt() in list) "YES" else "NO")
}
