object TowersOfHanoi {

    @JvmStatic
    fun main(args: Array<String>) {
        // we're moving the disks from rod 1 to rod 3, while the second rod is the helper
        hanoi(3, "1. rod", "3. rod", "2. rod")
    }

    private fun hanoi(n: Int, source: String, destination: String, helper: String) {
        if (n > 0) {
            hanoi(n - 1, source, helper, destination)
            println("$n. moving disk $source -> $destination")
            hanoi(n - 1, helper, destination, source)
        }
    }
}
