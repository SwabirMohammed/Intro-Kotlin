package OOP

class House(owner:String, location:String, area:String, color:String, floors:Int) {

    init {
      println("House is owned by $owner")
      println("House is located in $location")
      println("House is situated in the $area area")
      println("House is  $color")
      println("House is $floors floors in total")

    }

}

fun main(args: Array<String>) {
    var owner_1 = House("Adnan", "Kileleshwa", "Northern", "White", 4)
    println("-----END OF OWNER 1-----")
    var owner_2 = House("Alma", "Karen", "Western", "Grey", 3)
    println("-----END OF OWNER 2-----")
    var owner_3 = House("Abdi", "Parklands", "Southern", "Beige", 2)
    println("-----END OF OWNER 3-----")
    var owner_4 = House("Sam", "Thika", "Eastern", "Black", 4)
    println("-----END OF OWNER 4-----")


}