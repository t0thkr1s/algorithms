object QuickSort {

    private val randomArray = IntRange(1, 10).shuffled().toIntArray()

    @JvmStatic
    fun main(args: Array<String>) {
        println("Array before sorting: ")
        println(randomArray.contentToString())
        println("Array after sorting: ")
        sort(randomArray, 0, randomArray.size - 1)
        println(randomArray.contentToString())
    }

    private fun swap(array: IntArray, x: Int, y: Int) {
        val helper = array[x]
        array[x] = array[y]
        array[y] = helper
    }

    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot. */
    private fun partition(array: IntArray, low: Int, high: Int): Int {
        val pivot = array[high]
        // index of smaller element
        var i = low - 1
        for (j in low until high) {
            if (array[j] <= pivot) {
                i++
                // swap array[i] and array[j]
                swap(array, i, j)
            }
        }
        // swap array[i + 1] and array[high] (or pivot)
        swap(array, i + 1, high)
        return i + 1
    }

    private fun sort(array: IntArray, low: Int, high: Int) {
        if (low < high) {
            // n is the partitioning index
            val n = partition(array, low, high)
            // recursively sort elements before partition
            sort(array, low, n - 1)
            // recursively sort elements after partition
            sort(array, n + 1, high)
        }
    }
}
