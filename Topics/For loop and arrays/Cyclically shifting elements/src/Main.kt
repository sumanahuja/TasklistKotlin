fun main() {
    val list = MutableList(readln().toInt()) { readln().toInt() }
    val temp = list[list.size-1]
    for(i in list.size-1 downTo 1) {
        list[i] = list[i-1]
    }
    list[0] = temp
    for (i in list)
    {
        print("$i ")
    }
}