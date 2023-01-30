fun main() {
    print("Введите первое число неравное нулю: ")
    val a = readLine().toString().toDouble()
    print("Введите второе число неравное нулю: ")
    val b = readLine().toString().toDouble()
if (a==0.toDouble() || b==0.toDouble() ){
    println ("Одно из чисел равно нулю")
}
    else{
        val x = a / b
        println("Ответ: $x")
    }
}