object Fibonacci {

    @JvmStatic
    fun main(args: Array<String>) {
        // print the n-th element of the Fibonacci sequence
        print("Index of Fibonacci sequence: ")
        val n = Integer.valueOf(readLine())
        println("Result: " + fibonacci(n))
    }

    private fun fibonacci(n: Int): Int {
        return if (n > 1) {
            fibonacci(n - 1) + fibonacci(n - 2)
        } else {
            n
        }
    }
}
