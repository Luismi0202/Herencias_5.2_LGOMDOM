abstract class Empleado(
    val nombre: String,
    val id: String
) {
    init{
        require(id.length == 4){"¡¡El id tiene que medir 4 caracteres!!"}
    }
    abstract fun calculaSalario():Double

}