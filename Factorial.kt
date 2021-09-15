object Factorial {

    @JvmStatic
    fun main(args: Array<String>) {
        print("Input number for calculation: ")
        val number = Integer.valueOf(readLine())
        val result = factorial(number)
        println("The factorial of $number is $result.")
    }

    private fun factorial(n: Int): Int {
        return if (n > 0) {
            n * factorial(n - 1)
        } else {
            1
        }
    }
}
