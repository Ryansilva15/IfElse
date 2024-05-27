/*Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura
geométrica. Informar se formam um quadrado (lados iguais).
1
2 Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar
se é um triângulo equilátero (todos os lados iguais).
3 Considere o código abaixo. Qual a saída do programa caso informado o valor 4?
fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
    a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
permitidos.”.
b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
destes. Mensagem: “Negado. Convite inválido.”.
c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.
d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”
}*/
fun quadrado() {
    print("Informe o lado 1: ")
    val lado1 = readLine()

    print("Informe o lado 2: ")
    val lado2 = readLine()

    if (lado1 != null && lado1.isNotEmpty() && lado2 != null && lado2.isNotEmpty()) {
        val x = lado1.toIntOrNull()
        val y = lado2.toIntOrNull()

        if (x != null && y != null) {
            if (x == y) {
                println("É um quadrado")
            } else {
                println("Não é um quadrado")
            }
        } else {
            println("Entradas inválidas. Certifique-se de digitar números inteiros.")
        }
    } else {
        println("Entradas inválidas. Certifique-se de não deixar os campos vazios.")
    }
}




fun triangulo() {
    print("Informe o lado 1: ")
    val lado1 = readLine()

    print("Informe o lado 2: ")
    val lado2 = readLine()

    print("Informe o lado 3: ")
    val lado3 = readLine()

    if (lado1 != null && lado1.isNotEmpty() &&
        lado2 != null && lado2.isNotEmpty() &&
        lado3 != null && lado3.isNotEmpty()) {

        val x = lado1.toIntOrNull()
        val y = lado2.toIntOrNull()
        val z = lado3.toIntOrNull()

        if (x != null && y != null && z != null) {
            if (x == y && y == z) {
                println("É um triângulo equilátero")
            } else {
                println("Não é um triângulo equilátero")
            }
        } else {
            println("Entradas inválidas. Certifique-se de digitar números inteiros.")
        }
    } else {
        println("Entradas inválidas. Certifique-se de não deixar os campos vazios.")
    }
}

fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0) {
            println("Primeira string")
        } else {
            println("Segunda string")
        }
    }
    println("Terceira string")

    fun main() {
        triangulo()
        qualASaida(0) // Exemplificando uma chamada para teste
    }
}



fun portaria() {
    print("Qual sua idade?")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos")
        }
    }

    print("Qual o tipo de convite?")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo") {

         print("Qual o código do convite?")
            val codigo = readLine()
            if(codigo != null && codigo != ""){
                if (tipoConvite == "comum" && codigo.startsWith("xt")){
                    println("Welcome :)")
                } else if ((tipoConvite == "premium") || tipoConvite == "luxo"&& codigo.startsWith("xl"))  {
                    println("Welcome :)")
                } else {
                    println("Negado. Convite inválido")
                }
            }

        } else {
            "negado. Convite inválido."
        }
    }
}