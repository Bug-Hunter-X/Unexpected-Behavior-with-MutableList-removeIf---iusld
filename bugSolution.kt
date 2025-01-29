```kotlin
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val filteredList = list.filter { it % 2 != 0 }
    println(filteredList)
    // Alternative using iterator and remove
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    val iterator = list2.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println(list2)
}
```