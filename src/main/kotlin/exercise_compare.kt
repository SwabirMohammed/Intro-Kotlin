fun main(args: Array<String>) {

    println("Enter Code")
    var number:Int = readLine()!!.toInt()

    if (number == 0){
        print("Hot Deals")
    }
    else if (number == 1){
        print("No Expiry Bundles")
    }
    else if (number == 2){
        print("Daily Bundles")
    }
    else if (number == 3){
        print("Hourly Bundles")
    }
    else if (number == 4){
        print("Weekly Bundles")
    }
    else if (number == 5){
        print("More")
    } else{
        print("Exit")
    }




}