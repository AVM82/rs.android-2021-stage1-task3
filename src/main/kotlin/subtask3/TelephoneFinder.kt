package subtask3

class TelephoneFinder {

    companion object {
        val neighborsList = mapOf(
            '1' to arrayOf('2', '4'),
            '2' to arrayOf('1', '3', '5'),
            '3' to arrayOf('2', '6'),
            '4' to arrayOf('1', '5', '7'),
            '5' to arrayOf('2', '6', '8', '4'),
            '6' to arrayOf('3', '5', '9'),
            '7' to arrayOf('4', '8'),
            '8' to arrayOf('7', '5', '9', '0'),
            '9' to arrayOf('6', '8'),
            '0' to arrayOf('8')

        )
    }

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if (!number.matches(Regex("[0-9]*"))) return null
        val result = mutableListOf<String>()
        number.forEachIndexed { index, char ->
            run {
                neighborsList[char]?.forEach {
                    result.add(number.replaceRange(index, index + 1, it.toString()))
                }
            }
        }
        return result.toTypedArray()
    }
}
