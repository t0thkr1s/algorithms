object InsertionSort {

    private val randomArray = IntRange(1, 10).shuffled().toIntArray()
    
    @JvmStatic
    fun main(args: Array<String>) {
        println("Array before sorting:")
        println(randomArray.contentToString())
        println("Array after sorting:")
        sort(randomArray)
        println(randomArray.contentToString())
    }

    private fun sort(array: IntArray) {
        for (i in 1 until array.size) {
            // key is the current limit
            val key = array[i]
            var j = i - 1
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]
                j--
            }
            array[j + 1] = key
        }
    }
}
