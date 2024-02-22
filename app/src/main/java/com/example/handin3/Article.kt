package com.example.handin3

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.util.Date

fun main() {
    val article1 = Article("John Doe", "How make String")
    val article2 = Article("Jane Doe", "How to make Boolean")
    val article3 = Article("Laura", "How to read a book")
    val article4 = Article("Andreas", "How to code in Kotlin")
    val article5 = Article("Simon", "How to be mad in real life")
    listOf(article1, article2, article3, article4, article5).forEach { println(it) }
    val car = Car()
    val car1 = Car()
    car.changeGear(12)
    car.speedUp(200)
    car.applyBrakes(20)
    car1.changeGear(8)
    car1.speedUp(150)
    car1.applyBrakes(5)


        val words = listOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana")


        val wordFrequencies = words.groupingBy { it }.eachCount()


        wordFrequencies.forEach { (word, frequency) ->
            println("$word: $frequency")
        }
    }



/// 1
class Article (val author: String, val title: String) {
override fun toString(): String {
    return  "Author: $author, Title: $title"
}
}
// 2

interface FastFood {
    fun order(): String
}

class Pizza: FastFood {
    override fun order(): String {
        return "One Pizza for you"
    }

}
class Sandwich: FastFood {
    override fun order(): String {
    return "One sandwich for you"
    }
}
class Burger: FastFood {
    override fun order(): String {
        return "One Burger for you"
    }
}
class Sushi: FastFood {
    override fun order(): String {
        return "One Sushi for you"
    }
}

// 3

internal interface Vehicle {
    fun changeGear(a: Int)
    fun speedUp(a: Int)
    fun applyBrakes(a: Int)
}

class Car: Vehicle {
    override fun changeGear(a: Int) {
        println("Changing gear level to $a")
    }
    override fun speedUp(a: Int) {
        println("Changing speed to $a")
    }
    override fun applyBrakes(a: Int) {
      println("Applying brakes with intensity $a")
    }
}

// 4

class RedditPost(private var _author:String, private var _title:String) {
   var author: String
       get() = _author
       set(value) {
           _author = value
       }
    var title: String
        get() = _title
        set(value) {
            _title=value
        }

    @RequiresApi(Build.VERSION_CODES.O)
    private val _date: LocalDate = LocalDate.now()
        val data: LocalDate
        @RequiresApi(Build.VERSION_CODES.O)
        get() = _date

    private var upVotes: Int = 1
        set(value) {
            if (value > 0) {
                field = value
            } else {
                field = 0
            }
        }
private var downVotes: Int =1
    set(value) {
        if (value > 0) {
            field=value
        }
        else {
            field=0
        }

}

    private val balance: Int
        get() {
            return upVotes-downVotes
        }

}

// 4.5

class RedditFrontPage ( ){
    private var list: MutableList<RedditPost> = mutableListOf()
    fun remove(index:Int){
        list.removeAt(index)
    }    }

// 5








