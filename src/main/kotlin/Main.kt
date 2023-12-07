fun main() {
//    println("계산식입력")
//
//    println("계산할 연산을 선택하세요:")
//    println("덧셈 (+)")
//    println("뺄셈 (-)")
//    println("곱셈 (*)")
//    println("나눗셈 (/)")
//
//    val operator = readLine()
//
//    println("첫 번째 숫자를 입력하세요:")
//    val num1 = readLine()!!.toDouble()
//
//    println("두 번째 숫자를 입력하세요:")
//    val num2 = readLine()!!.toDouble()



//    val result = when (operator) {
//        "+" -> num1 + num2
//        "-" -> num1 - num2
//        "*" -> num1 * num2
//        "/" -> {
//            if (num2 != 0.0) {
//                num1 / num2
//            } else {
//                println("0으로 나눌 수 없습니다.")
//                return
//            }
//        }
//        "%" -> num1 % num2
//        else -> {
//            println("잘못된 연산자입니다.")
//            return
//        }
//    }



<<<<<<< HEAD
    val result = when (operator) {
        "+" -> AddOperation().calculate(num1, num2)
        "-" -> SubtractOperation().calculate(num1, num2)
        "*" -> MultiplyOperation().calculate(num1, num2)
        "/" -> DivideOperation().calculate(num1, num2)
        else -> {
            println("올바른 연산자를 선택하세요.")
            return
        }
    }

    println("결과: $result")
=======
//    val result = when (operator) {
//        "+" -> AddOperation().calculate(num1, num2)
//        "-" -> SubtractOperation().calculate(num1, num2)
//        "*" -> MultiplyOperation().calculate(num1, num2)
//        "/" -> DivideOperation().calculate(num1, num2)
//        else -> {
//            println("올바른 연산자를 선택하세요.")
//            return
//        }
//    }
//
//    println("결과: $result")
    // 더하기
    val addCalc = Calculator(AddOperation())
    println("10 더하기 20 결과는 : ${addCalc.operate(10, 20)} 입니다")
    // 빼기
    val subCalc = Calculator(SubstractOperation())
    println("10 빼기 20 결과는 : ${subCalc.operate(10, 20)} 입니다")
    // 곱하기
    val mulCalc = Calculator(MultiplyOperation())
    println("10 곱하기 20 결과는 : ${mulCalc.operate(10, 20)} 입니다")
    // 나누기
    val divCalc = Calculator(DivideOperation())
    println("10 나누기 20 결과는 : ${divCalc.operate(10, 20)} 입니다")
>>>>>>> b0e47e6 (Changes)
}
