class When {
    fun bonus(cargo: String): Float {
        return if (cargo == "Gerente") {
            2000f
        } else if (cargo == "Coordenador") {
            1500f
        } else if (cargo == "Engenheiro de software") {
            1000f
        } else if (cargo == "Estágiario") {
            500f
        } else {
            0f
        }

    }

    fun bonusWhen(cargo: String): Float {

        return when (cargo) {
            "Gerente" -> 2000f
            "Coordenador" -> 1500f
            "Engenheiro de software" -> 1000f
            "Estágiario" -> 500f
            else -> 0f

        }
    }

    fun main() {
        bonusWhen("dsfsdgsdgsdg")
        val n = false
        when (n) {
            true -> println(1..10)
            false -> println(10..100)
        }
    }


}