fun main() {
    val myLinkedList = MyLinkedList()

    myLinkedList.add(1)
    myLinkedList.add(2)
    myLinkedList.add(3)
    myLinkedList.add(4)
    myLinkedList.add(5)

    println(myLinkedList)

    println(myLinkedList.get(0))
    println(myLinkedList.get(1))
    println(myLinkedList.get(2))

    myLinkedList.remove(0)
    myLinkedList.remove(0)

    println(myLinkedList)
}