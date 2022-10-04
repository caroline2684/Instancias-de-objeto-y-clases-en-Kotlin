fun main() {
    //proporcionar la cantidad de caras como un argumento de la clase
    val myFirstDice = Dice(6)
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}!")

    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
}

// variable para que acepte un número entero
class Dice (val numSides: Int) {

    fun roll(): Int {
        val randomNumber = (1..numSides).random()
        return randomNumber
    }
}
