fun main(args: Array<String>) {
    addnumbers(num1 = 400, num2 = 400)
    multiplynumbers(num1 = 500, num2 = 4)
    dividenumbers(num1 = 100, num2 = 5)
}


fun addnumbers(num1:Int, num2:Int){
    var result = num1 + num2
    println(result)
}

fun multiplynumbers(num1: Int, num2: Int){
    var result = num1 * num2
    println(result)
}


fun dividenumbers(num1: Int, num2: Int){
    var result = num1 / num2
    println(result)
}