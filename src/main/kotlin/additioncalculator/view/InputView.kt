package additioncalculator.view

object InputView {
    fun promptForCalculation(): String? {
        println("계산할 문자열을 입력하세요.")
        return readlnOrNull()
    }
}
