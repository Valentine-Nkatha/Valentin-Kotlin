//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello Nkatha")
    modulus(7,5)
    sum(3,7,13,17)
    println("I can code")


}
fun printHello(name: String){
    println(name)
}
fun modulus(num1:Int,num2:Int,):Int{
    var modulus = num1 % num2
    println(modulus)
    return (modulus)
}
fun sum(num1: Int,num2:Int,num3:Int,num4:Int):Int{
    var sum  = num1+num2+num3+num4
    println(sum)
    return (sum)
}
fun print(funnyfact: String){
    println(funnyfact)
}