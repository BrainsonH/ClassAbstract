
/*
Abstract class cannot be instantiated (You cannot created objects of an abstract class)
However, you can inherit subclasses from them
*/

abstract class Toiletries(type: String) {                //---> abstract is used to declare abstract class
    init {
        println("$type is toiletries")
    }

    fun brand(name: String) {
        println("My favourite soap is $name")
    }

    abstract fun scentName(scent: String)
}

class TypeOfToiletries(type: String): Toiletries(type) {  //---> This class derives from class Toiletries
    override fun scentName(scent: String) {
        println("$scent scent is really fresh")
    }
}

fun main() {
    val bodySoap = TypeOfToiletries("Soap")   //--->bodySoap is object of class TypeOfToiletries (Instantiated here)
    bodySoap.brand("Lux")                     //--->brand() method is called using bodySoap object
    bodySoap.scentName("Lavender")            //--->scentName() method is called using bodySoap object
}