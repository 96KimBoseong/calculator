//class DivideOperation {
//    fun calculate(num1: Double, num2: Double): Double {
//        if (num2 != 0.0) {
//            return num1 / num2
//        } else {
//            throw ArithmeticException("Cannot divide by zero")
//        }
//    }
//}
class DivideOperation : AbstractOperation() {
    @Throws(ArithmeticException::class)
    override fun operate(num1: Int, num2: Int): Double {
        require(num2 != 0) {
            ArithmeticException( "Divide by Zero")
        }
        return (num1 / num2).toDouble()
    }
}