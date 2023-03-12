class MyLinkedList {
    private var head: Node? = null
    private var size: Int = 0

    fun add(value: Int) {
        if (head == null) {
            this.head = Node(value)
        } else {
            var temp = head as Node

            while (temp.next != null) {
                temp = temp.next!!
            }
            temp.next = Node(value)
        }
        size++
    }

    fun get(index: Int): Int {
        var currentIndex = 0
        var temp = head

        while (temp != null) {
            if (currentIndex == index) {
                return temp.value
            } else {
                temp = temp.next
                currentIndex++
            }
        }
        throw java.lang.IllegalArgumentException()
    }

    fun remove(index: Int) {
        if(index == 0) {
            head = head?.next
            size--
            return
        }

        var currentIndex = 0
        var temp = head

        while (temp != null) {
            if (currentIndex == index - 1) {
                temp.next = temp.next?.next
                size--
                return
            } else {
                temp = temp.next
                currentIndex++
            }
        }
    }

    override fun toString(): String {
        val result = arrayOfNulls<Int>(size)
        var index = 0
        var temp = head

        while (temp != null) {
            result[index++] = temp.value
            temp = temp.next
        }

        return result.contentToString()
    }

    private class Node(val value: Int) {
        var next: Node? = null
    }
}