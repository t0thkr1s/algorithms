object SelectionSort {

    private val randomArray = IntRange(1, 10).shuffled().toIntArray()

    @JvmStatic
    fun main(args: Array<String>) {
        println("Array before sorting:")
        println(randomArray.contentToString())
        println("Array after sorting:")
        sort(randomArray)
        println(randomArray.contentToString())
    }

    private fun swap(array: IntArray, x: Int, y: Int) {
        val helper = array[x]
        array[x] = array[y]
        array[y] = helper
    }

    private fun sort(array: IntArray) {
        for (i in 0 until array.size - 1) { 
            // assuming that the first element is the minimum
            var minimum = i
            // comparing the next element with the "minimum"
            for (j in i + 1 until array.size) {
                // if the next element is smaller than the previous, we set the new minimum
                if (array[j] < array[minimum]) {
                    minimum = j
                }
            }
            swap(array, minimum, i)
        }
    }
}
