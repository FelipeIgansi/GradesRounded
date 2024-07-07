@file:Suppress("ReplaceUntilWithRangeUntil")
/*
* Complete the 'gradingStudents' function below.
*
* The function is expected to return an INTEGER_ARRAY.
* The function accepts INTEGER_ARRAY grades as parameter.
*/

fun gradingStudents(grades: Array<Int>): Array<Int> {
    for (i in grades.indices) {
        val grade = grades[i]
        if (grade >= 38) {
            val nextMultipleOfFive = ((grade / 5) + 1) * 5
            if (nextMultipleOfFive - grade < 3) {
                grades[i] = nextMultipleOfFive
            }
        }
    }
    return grades
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
