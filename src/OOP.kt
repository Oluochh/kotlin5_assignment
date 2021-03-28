fun main() {
    var student= Human("Gilly",20,84.3f)
    println(student.eat(64))
    println(student.speak("i am a girl"))
    student.birthday()
    var person=user("Gilly","Oluoch","gillyoluochh@gmail.com","879432","giftislikethat")
    println(person.email)
    println(person.phoneNumber)
}

class Human(var name:String,var age:Int,var weight:Float ) {
    fun eat(foodWeight: Int) {
        println("i am eating $foodWeight kgs of food")
        weight = foodWeight + weight
        println(weight)
    }
    fun speak(speech:String):String{
        return speech
    }
    fun birthday(){
        age+=1
        println(age)
    }
}

data class user(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String,)
