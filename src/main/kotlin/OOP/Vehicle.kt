package OOP

class Vehicle(owner:String, color:String, wheels:Int, model:String) {
    init {

        println("Owned by $owner")
        println("Color is $color")
        println("Has $wheels in wheels in total")
        println("Model is $model")

    }

}

fun main(args: Array<String>) {
    var owner_1 = Vehicle("Sharon", "Red", 4, "Toyota" )
    var owner_2 = Vehicle("Jim", "White", 4, "BMW" )
    var owner_3 = Vehicle("Amos", "Black", 4, "Mercedes" )
}