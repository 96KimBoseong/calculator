//class AddOperation {
//    fun calculate(num1: Double, num2: Double): Double {
//        return num1 + num2
//    }
//}
class AddOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double = (num1 + num2).toDouble()
}