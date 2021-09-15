object LinearSearch {

    private val randomArray = IntRange(1, 10).shuffled().toIntArray()

    @JvmStatic
    fun main(args: Array<String>) {
        println("Let's consider the following array:")
        println(randomArray.contentToString())
        val randomNumber = (1..10).random()
        println("Looking for number $randomNumber ... ")
        val result = search(randomArray, randomNumber)
        if (result != -1) {
            println("Found number at index: $result")
        } else {
            println("$randomNumber is not in the array!")
        }
    }

    private fun search(array: IntArray, x: Int): Int {
        for (index in randomArray.indices) {
            // if the element is found, return the index
            if (array[index] == x) {
                return index
            }
        }
        return -1
    }
}
