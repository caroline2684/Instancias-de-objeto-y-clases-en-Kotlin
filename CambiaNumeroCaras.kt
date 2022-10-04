fun main() {

    val myFirstDice = Dice()
    val diceRoll = myFirstDice.roll()
    println("Tus dado de ${myFirstDice.sides} caras tiro ${diceRoll}!")
    //número de caras
    myFirstDice.sides = 20
    println("Tus dado de ${myFirstDice.sides} caras tiro ${myFirstDice.roll()}!")
}

class Dice {
    var sides = 6

    fun roll(): Int {
        //asegurar que el número obtenido al azar sea adecuado para la cantidad de caras
        val randomNumber = (1..sides).random()
        return randomNumber
    }
}
