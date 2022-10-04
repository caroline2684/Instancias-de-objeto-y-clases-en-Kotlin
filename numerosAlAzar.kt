fun main() {
    //Establecer el rango
    val diceRange = 1..6
    //random(): generar y mostrar un número al azar perteneciente a un rango determinado
    val randomNumber = diceRange.random()
    //imprimir el resultado usando una plantilla string
    println("Número al azar: ${randomNumber}")
}
