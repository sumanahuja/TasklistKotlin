package tasklist

import java.util.*
import kotlin.system.exitProcess

fun main() {
    var taskList = mutableListOf<String>()
    //var input:String

    check(taskList)

//    while (true) {
//        val s = readln()
//        //println(s.length)
//        if (s.trim() == "")
//            break
//        taskList.add(s.trim())
//    }
//    if (taskList.size == 0)
//        println("No tasks have been input")
//    else {
//        for (i in 0 until taskList.size) {
//            if (i + 1 <= 9) {
//                space = "  "
//            } else space = " "
//            println("${i + 1}$space${taskList[i]}")
//        }
//    }


}

 fun check(taskList:MutableList<String>) {
     println("Input an action (add, print, end):")
     when (readln().trim().lowercase(Locale.getDefault())) {
         "add" -> {
             taskList.addAll( addFun())
             check(taskList)
         }
        "print" -> {
            printFun(taskList)
            check(taskList)
        }
        "end" -> {
            endFun()
        }
        else -> {
            println("The input action is invalid")
            check(taskList)
        }
    }
}


fun addFun(): MutableList<String> {
    val taskList = mutableListOf<String>()
    var count = 0
    var S:String = ""
    println("Input a new task (enter a blank line to end):")
    while (true) {
        val s = readln()

        if (s.trim() == "" && count == 0) {
            println("The task is blank")
            check(taskList)
        }else if(s.trim() == "" && count > 0) {
            break
        } else
            count++
        S = S + s.trim() +"\n"+"   "

        }
    taskList.add(S.trim())



//    for (i in taskList.indices) {
//        println("Added ${taskList[i]}")
//    }
        return taskList
    }

fun printFun(list:MutableList<String>) {
    var space = "  "
    if(list.isEmpty()) {
        println("No tasks have been input")
    }
    else {
            for (i in list.indices) {
                if(i<9) space = "  "
                else space = " "

                println("${i+1}$space${list[i]}\n")


        }
    }
}

fun endFun() {
    println("Tasklist exiting!")
    exitProcess(1)
}
