fun main(args: Array<String>) {
    println("Enter Code")
    var code:Int = readLine()!!.toInt()
    when(code){
        0 -> println("Hot Deals")
        1 -> println("No Expiry Bundles")
        2 -> println("Daily Bundles")
        3 -> println("Weekly Bundles")
        4 -> println("Hourly Bundles")
        5 -> println("More")

        else -> println("Cancel Operation")

    }




}