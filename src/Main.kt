/*/Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final
do ano. Os bônus são classificados por cargo.
a. Gerentes recebem R$ 2.000,00
b. Coordenadores recebem R$ 1.500,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00
1
Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.
a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00
b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00*/







fun ex2(cargo: String, experiencia: Int): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        if (experiencia < 2 ){
            bonus = 2000f
        } else {
            bonus = 3000f
        }
    }
    if (cargo == "Coordenador") {
        if (experiencia < 1 ){
            bonus = 1500f
        } else {
            bonus = 1800f
        }
    }
    if (cargo == "Engenheiro de software") {
        bonus = 1000f
    }
    if (cargo == "Estágiario") {
        bonus = 500f
    }
    return bonus
}
fun ex1(cargo: String): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        bonus = 2000f
    }
    if (cargo == "Coordenador") {
        bonus = 1500f
    }
    if (cargo == "Engenheiro de software") {
        bonus = 1000f
    }
    if (cargo == "Estágiario") {
        bonus = 500f
    }
    return bonus
}