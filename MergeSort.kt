object MergeSort {

    private val randomArray = IntRange(1, 10).shuffled().toIntArray()
    private val temporaryArray = IntArray(randomArray.size)

    @JvmStatic
    fun main(args: Array<String>) {
        println("Array before sorting:")
        println(randomArray.contentToString())
        println("Array after sorting:")
        recursiveSort(0, randomArray.size - 1)
        println(randomArray.contentToString())
    }

    private fun recursiveSort(lowerIndex: Int, higherIndex: Int) {
        if (lowerIndex < higherIndex) {
            val middle = lowerIndex + (higherIndex - lowerIndex) / 2
            // below step sorts the left side of the array
            recursiveSort(lowerIndex, middle)
            // below step sorts the right side of the array
            recursiveSort(middle + 1, higherIndex)
            mergeParts(lowerIndex, middle, higherIndex)
        }
    }

    private fun mergeParts(
        lowerIndex: Int,
        middle: Int,
        higherIndex: Int
    ) {
        System.arraycopy(
            randomArray,
            lowerIndex,
            temporaryArray,
            lowerIndex,
            higherIndex + 1 - lowerIndex
        )
        var i = lowerIndex
        var j = middle + 1
        var k = lowerIndex
        while (i <= middle && j <= higherIndex) {
            if (temporaryArray[i] <= temporaryArray[j]) {
                randomArray[k] = temporaryArray[i]
                i++
            } else {
                randomArray[k] = temporaryArray[j]
                j++
            }
            k++
        }
        while (i <= middle) {
            randomArray[k] = temporaryArray[i]
            k++
            i++
        }
    }
}
