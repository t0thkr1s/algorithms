object BubbleSort {

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
        for (i in array.indices) {
            for (j in 1 until array.size - i) {
                // if the previous element is greater -> swap
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j)
                }
            }
        }
    }
}
