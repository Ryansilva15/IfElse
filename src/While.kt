class While {
//}Considere uma caixa d’água de 2 mil litros. Rômulo gostaria de encher a caixa d’água com balões de água de
//7 litros. Quantos balões cabem na caixa d’água sem que o volume seja excedido?
//1
//2 FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
//a. Quando um número for divisível por 3, imprimir Buzz.
//b. Quando um número for divisível por 5, imprimir Fizz.
//c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz.
//3 Escreva um programa capaz de receber um texto e imprimi-lo invertido.
//Entrada: Meu nome é Julius. Saída: .suiluJ é emon ueM
//4 Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres ‘x’ e ‘o’ e
//retorna true ou false. Caso não exista nem ‘x’ nem ‘o’, retornar false.
//“xxooox” -> true “xxxxo” -> false “bdefghjij” -> false “ooooxzzzzz” -> false
//DESAFIO
//Ana e Paula são duas programadoras da empresa XDM. A empresa XDM possui um benefício para incentivar os funcionários a
//pouparem dinheiro para a aposentadoria que funciona da seguinte maneira:
//Se o funcionário destinar 5% do seu salário para o investimento, a empresa acrescenta o mesmo valor. Ou seja, caso o
//funcionário invista 100 reais, a empresa investe mais 100. Este fundo de investimento possui rendimento de 0,2% ao mês.
//Ana adorou a ideia e vai investir. No entanto, Paula decidiu que vai investir os mesmos 5% por conta própria já que conhece
//investimentos que rendem mais que 0,2% ao mês. Paula vai escolher investimentos que rendem 0,8% ao mês.
//Considere o salário de Ana e Paula iguais e no valor de 10 mil reais e que as duas estão começando com saldo 0 e que investirão
//5% do salário.
//Em quantos meses o patrimônio de Paula vai superar o patrimônio de Ana?

    fun main() {
    }

    fun while1() {
        val caixa = 2000
        val balao = 7

        var numBaloes = 0
        var preenchimento = 0
        while (preenchimento + balao <= caixa) {
            numBaloes++
            preenchimento += balao
        }
        println("Na caixa d'Ã¡gua cabem $numBaloes balÃµes.")
    }

    fun while2() {
        var i = 1
        while (i <= 50) {
            if (i % 15 == 0) {
                print(" FizzBuzz")
            } else if (i % 3 == 0) {
                print(" Buzz")
            } else if (i % 5 == 0) {
                print(" Fizz")
            } else {
                print(" $i")
            }
            i++
        }
    }

    fun while3(str: String) {
        var length: Int = str.length

        // Caso seja necessÃ¡rio retornar a string invertida
        // var inverso = "";
        while (length > 0) {
            print(str[length - 1])
            // inverso += str[length - 1]
            length--
        }
    }

    fun while4(str: String): Boolean {
        val strLower = str.lowercase()

        var i = 0
        var countX = 0
        var countO = 0
        while (i < strLower.length) {
            if (strLower[i] == 'x') {
                countX++
            } else if (strLower[i] == 'o') {
                countO++
            }
            i++
        }

        return countO == countX && countO != 0
    }
}