package com.example.firestprojectinanderoidcamp

import java.net.IDN
import kotlin.contracts.contract

fun main() {
    var doto =Todo()
    var task1=Task(1,"Haya","stady ")
    var task2=Task(2,"faris","play")
    var task3 = Task(3,"Turky","work")
    var task4 = Task(4,"maha","slep")




    doto.add_task(task1)
    doto.add_task(task2)
    doto.add_task(task3)
    doto.add_task(task4)
    doto.show()
    doto.remove_task(task3)
    doto.show()
    doto.print_id(2)
    doto.change_task(task1)



}
data class Task(val id: Int,
                var name: String,
                var note : String,
                var isCompleted:Boolean =false)

class Todo{
    var taskes = arrayListOf<Task>()
        private set

    fun show (){
        for (i in taskes) {
            println("$i")
        }

    }
    fun print_id(id_number: Int){
        for (i in taskes){
            if (id_number == i.id) {
                println(i)
                return
            }

        }



            }

    fun add_task(task: Task){
        taskes.add(task)
    }
    fun remove_task(task: Task){
        taskes.remove(task)
    }
    fun change_task(task: Task){
        for (i in taskes) {
            task.isCompleted =! task.isCompleted
            println(task)
        break}


    }

    }








