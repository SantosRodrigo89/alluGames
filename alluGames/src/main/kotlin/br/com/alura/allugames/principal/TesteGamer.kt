import br.com.alura.allugames.modelo.Gamer

fun main () {
    val gamer1 = Gamer(
        "Jojo",
        "jojo@gmail.com")
    println(gamer1)

    val gamer2 = Gamer(
        "Rabit",
        " rabit@gmail.com",
        "26/09/1989",
        "pods89" )
    println(gamer2)

    gamer1.let {
        it.dataNascimento = "10/10/2000"
        it.usuario = "jackSkywalker"
    }.also {
        println(gamer1.idInterno)
    }
    println(gamer1)
}