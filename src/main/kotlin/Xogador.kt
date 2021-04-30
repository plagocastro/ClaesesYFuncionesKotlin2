class Xogador{

    var id: Int = 62
    var nome: String = "Lionel"
    var apelido: String = "Messi"
    var edade: Int = 34
    var dorsal: Int = 10
    var demarcacion: String = "Delantero"

    constructor(id: Int, nome: String, apelido: String, edade: Int, dorsal: Int, demarcacion: String) {
        this.id = id
        this.nome = nome
        this.apelido = apelido
        this.edade = edade
        this.dorsal = dorsal
        this.demarcacion = demarcacion
    }

    fun concentrarse(tiempoConcentracion: Int) {

        println("Concentrase a seleccion e o tempo")
    }

    fun viaxar(tiempoDestino: Int): Int = tiempoDestino

    fun xogarPartido(): Unit {}

    fun entrenar(): Unit {}

    override fun toString(): String {
        return "Xogador(id=$id, nome='$nome', apelido='$apelido', edade=$edade, dorsal=$dorsal, demarcacion='$demarcacion')"
    }

}
