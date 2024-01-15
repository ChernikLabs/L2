import jdk.nashorn.internal.runtime.ScriptingFunctions.readLine
import java.sql.DriverManager
import java.sql.DriverManager.println

//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
    var zadanie1 = readLine().toString()
        if (zadanie1 == "1") {
            val time = readLine().toString().toInt()
            when {
                time < 60 -> println("Был в сети только что")
                time > 60 && time < 60 * 60 -> println("Был в сети " + time / 60 + " минут(ы) назад")
                time > 60 * 60 && time < 24 * 60 * 60 -> println("Был в сети " + time / 60 * 60 + " час(ов) назад")
                time > 24 * 60 * 60 && time < 2 * 24 * 60 * 60 -> println("Был в сети вчера назад")
                time > 2 * 24 * 60 * 60 && time < 3 * 24 * 60 * 60 -> println("Был в сети позовчера назад")
                time > 3 * 24 * 60 * 60 -> println("Был в сети давно")
            }
            if (zadanie1 == "2") {
                val karta = readLine().toString()
                val komissia = readLine().toString().toInt()
                if (karta == "VK Pay") {
                    print(0)
                }
                if (karta == "Mastercard") {
                    if (komissia < 75000){
                        print(0)
                    }
                    else{
                        print(komissia+komissia*0.06+20)
                    }
                }
                if (karta == "Visa") {

                        var x = komissia+komissia*0.0075
                    if (x<35)
                        print(35)
                    if (x>35)
                        print(x)
                }
            }
        }
}
