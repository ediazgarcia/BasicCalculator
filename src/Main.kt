

fun main(){

    println("Ingrese el primer número: ")
    val numero1 = readLine()!!.toDouble()

    println("Ingrese el segundo número: ")
    val numero2 = readLine()!!.toDouble()

    println("Seleccione una operación (+, -, *, /, %):")
    val operacion = readLine()!!

    val result = when (operacion) {
        "+" -> numero1 + numero2
        "-" -> numero1 - numero2
        "*" -> numero1 * numero2
        "/" -> numero1 / numero2
        "%" -> numero1 % numero2
        else -> {
            println("Operación no válida")
            return
        }

    }

    println("El resultado de $numero1 $operacion $numero2 es $result")

}