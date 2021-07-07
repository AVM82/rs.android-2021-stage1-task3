package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        return findSquareSequence(number = number, square = number.toLong() * number.toLong())
    }

    private fun findSquareSequence(number: Int, square: Long): Array<Int>? {
        if(square in 2..3) return null
        var supposed = number - 1
        while (supposed > 0) {
            val squareDiff = square - supposed.toLong() * supposed.toLong()
            if (squareDiff == 0L) return arrayOf(supposed)
            if (squareDiff > 0) {
                val findSquareSum = findSquareSequence(supposed, squareDiff)
                if (findSquareSum != null) return findSquareSum.plus(supposed)
            }
            supposed--
        }
        return null
    }
}
