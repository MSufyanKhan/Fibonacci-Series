import java.util.*

fun main(args: Array<String>)
{
    print("How many number do you have to find fibonacci series : ")
    var sc = Scanner(System.`in`)
    var num = sc.nextInt()

    var a =0
    var b =1
    println("$a\n$b" )
   for (i in 2..num ) {
       var c = a+b
       println("$c")
       a=b
       b=c
      }

}