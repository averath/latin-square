/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package latin.square

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class AppTest {

    private val classUnderTest = LatinSquare()

    @Test
    fun smallLatinSquare_shouldReturnTrue() {
        val square: Array<IntArray> = arrayOf(intArrayOf(1, 2), intArrayOf(2, 1))

        val result = classUnderTest.isValidLatinSquare(square)

        assertTrue(result)
    }

    @Test
    fun smallLatinSquare_shouldReturnTrue2() {
        val square: Array<IntArray> = arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 1, 2), intArrayOf(2, 3, 1))

        val result = classUnderTest.isValidLatinSquare(square)

        assertTrue(result)
    }

    @Test
    fun smallSquare_shouldReturnFalse() {
        val square: Array<IntArray> = arrayOf(intArrayOf(1, 2), intArrayOf(1, 2))

        val result = classUnderTest.isValidLatinSquare(square)

        assertFalse(result)
    }

    @Test
    fun smallSquare_shouldReturnFalse2() {
        val square: Array<IntArray> = arrayOf(intArrayOf(1, 2, 3), intArrayOf(2, 1, 3), intArrayOf(3, 2, 1))

        val result = classUnderTest.isValidLatinSquare(square)

        assertFalse(result)
    }
}
