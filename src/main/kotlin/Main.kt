import AutocompletePrediction.MatchedSubstring

data class Person(var age: Int, val greeting: Greeting)
data class Greeting(val default: String)
class GreetingBuilder {
    private val default = ""
    fun build() : Greeting = Greeting(default)
}
class PersonBuilder {
    var age = 0
    private val greetingBuilder = GreetingBuilder()
    fun greeting(init: GreetingBuilder.() -> Unit) {
        greetingBuilder.init()
    }

    fun build(): Person { return Person(this.age, this.greetingBuilder.build())}
}

fun buildPerson(init: PersonBuilder.() -> Unit) : Person {
    val builder = PersonBuilder()
    builder.init()
    return builder.build()
}
fun main(args: Array<String>) {
    val sam = Generator.withEmptyArray();
    val substrings = sam.matchedSubstrings.map { MatchedSubstring(it.offset, it.length) }
    println(substrings.size)
    substrings.forEach {
        println(it)
    }
//    val names = arrayOf(1,"d", 5, 6, null, "sam")
//    names.forEach {
//        if (it is String) {
//            println(it)
//        }
//    }
//    call { name: String ,count  ->
//        run {
//            for (i in 1..count) {
//                println("$name")
//            }
//        }
//    }
//
//    println("mohar".shout())

//    data class Person(val age:Int, val greeting: Greeting)
//
//    data class Greeting(val specific: Map<String, String>, val default: String)
//    val person = buildPerson {
//        age = 42
//        greeting {
//            "hello" to "father"
//            "hi" to "mother"
//            default = "What's up"
//        }
//    }
//    println(person)



}




fun String.shout() = this.plus(" Kanha hoooo")


fun call(greet: (String, Int) -> Unit) {
    greet("Sam", 2)
}

fun sum(vararg numbers: Int) : Int {
    numbers.forEach { println(it) }
    return numbers.sum()
}

fun stringFunc(s : String, sam : String = someText()) {
    println("Name: $s and sam: $sam")
}


fun someText() = "Sams Text"

fun printSum(a: Int, b:Int) : Int {
    println("sum is ${a + b}")
    return a + b
}

fun whentest(a: Int) : String {
    return when (a) {
        35, 45 -> "greater than 10"
        5 -> "greater than 5"
        else -> "less than 5"
    }
}