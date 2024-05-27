class `For&while` {
//}

}

fun ex1() {
    for (i in 1..50) {
        if (i % 2 == 0) {
            println(i)
        }

    }
    val listaConvidados = listOf("Ryan", "Antonio", "Thauany", "Maria", "valmir")
    listaConvidados.forEachIndexed { index, convidado ->
        println("${index + 1} - $convidado")
    }


}

fun ex2() {
    for (i in 50 downTo 1) {
        print("$i ")
    }
}

fun ex3() {
    for (i in 1..50) {
        if (i % 5 != 0) {
            print("$i ")
        }
    }

}

fun ex4() {
    var soma = 0
    for (i in 1..500) {
        soma += i
    }
    println(soma)

}


fun ex5(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}

fun main() {
    ex1()
}







