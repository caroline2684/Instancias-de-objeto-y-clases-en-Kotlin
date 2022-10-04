fun main() {
    //instancia de la clase Dice
    val myFirstDice = Dice()
    println(myFirstDice.sides)
    myFirstDice.roll()
}

//Agregamos una nueva clase
class Dice {
    //número de lados
    var sides = 6
    //fun: nueva funcion 
    fun roll() {
        //rango
        val randomNumber = (1..6).random()
        println(randomNumber)
    }
}
