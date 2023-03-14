/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package latin.square

class LatinSquare {
    fun isValidLatinSquare(square: Array<IntArray>): Boolean {
        printSquare(square)
        return false
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

fun main() {
    println(LatinSquare().isValidLatinSquare(arrayOf(intArrayOf(1,2))))
}
