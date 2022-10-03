fun main() {
    val myFirstDice = Dice()
    //implementamos la función roll
    val diceRoll = myFirstDice.roll()
    println("Tus dado de ${myFirstDice.sides} caras tiro ${diceRoll}!")
}

class Dice {
    //establecemos el número de dados
    var sides = 6
    //establecer que el valor que se retornara es un entero
    fun roll(): Int {
        val randomNumber = (1..6).random()
        //returna el valor obtenido
        return randomNumber
    }
}
