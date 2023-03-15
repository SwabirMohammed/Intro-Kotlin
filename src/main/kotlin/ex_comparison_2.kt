fun main(args: Array<String>) {
    println("Enter Marks")
    var marks:Int = readLine()!!.toInt()

    if (marks >= 80){
        println("Score = A ")
        println("Excellent!")
    }
    else if (marks > 70) {
        println("Score = A - ")
         println("Very Good!")
    }
       else if (marks > 60) {
        println("Score = B ")
        println("Good!")
    }
    else {
       print("Repeat the Examinations!")
    }








}