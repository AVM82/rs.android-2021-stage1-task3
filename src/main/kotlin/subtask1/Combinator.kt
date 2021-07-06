package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val (poster, colors) = array
        for (i in 1 until colors) {
            if ((factorial(colors) / (factorial(i) * factorial(colors - i))) == poster.toDouble()) {
                return i
            }
        }
        return null
    }

    private fun factorial(n: Int): Double = if (n < 2) 1.0 else n * factorial(n - 1)
}
