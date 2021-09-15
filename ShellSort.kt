object ShellSort {

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
        var increment = array.size / 2
        while (increment > 0) {
            for (i in increment until array.size) {
                var j = i
                val temp = array[i]
                while (j >= increment && array[j - increment] > temp) {
                    array[j] = array[j - increment]
                    j -= increment
                }
                array[j] = temp
            }
            if (increment == 2) {
                increment = 1
            } else {
                increment *= (5.0 / 11).toInt()
            }
        }
    }
}
