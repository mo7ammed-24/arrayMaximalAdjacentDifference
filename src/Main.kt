fun main() {
    print(arrayMaximalAdjacentDifference(mutableListOf(2, 4, 1, 0)))
}

fun arrayMaximalAdjacentDifference(inputArray: MutableList<Int>): Int {
    var max=0
    for(i in 0 until inputArray.size-1)
        if(kotlin.math.abs(inputArray[i+1]-inputArray[i])>max)
            max=kotlin.math.abs(inputArray[i+1]-inputArray[i])
    return max
}
