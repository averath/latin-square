package latin.square

class LatinSquare {
    //    TIME COMPLEXITY O(N*N)
    fun isLatinSquare(square: Array<IntArray>): Boolean {
        printSquare(square)

        if (square.isEmpty()) return false

        val seenNumbers = mutableSetOf<Int>()

        // rows
        for (i in square.indices) {
            if (square[i].isEmpty() || square[i].size != square.size) return false
            for (j in square.indices) {
                val number = square[i][j]
                if(!isCellValid(seenNumbers, number, square.size)) return false
            }
            seenNumbers.clear()
        }

        // columns
        for (i in square.indices) {
            for (j in square.indices) {
                val number = square[j][i]
                if(!isCellValid(seenNumbers, number, square.size)) return false
            }
            // reset possible numbers
            seenNumbers.clear()
        }
        return true
    }

    private fun isCellValid(numbers: MutableSet<Int>, number: Int, size: Int): Boolean {
        if (numbers.contains(number)) {
            return false
        } else if (number <= 0 || number > size) {
            return false
        } else {
            numbers.add(number)
        }
        return true
    }

    private fun printSquare(square: Array<IntArray>) {
        square.forEach { row ->
            run {
                row.forEach { print(it) }
                println()
            }
        }
    }
}

fun main(args: Array<String>) {
    val square = args.map { it.split(",").map { it2 -> it2.toInt() }.toIntArray() }.toTypedArray()
    println(LatinSquare().isLatinSquare(square))
}
