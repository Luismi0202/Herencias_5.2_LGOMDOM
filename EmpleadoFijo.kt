class EmpleadoFijo(
    nombre: String,
    id: String,
    var salarioFijo: Double,
    var numPagas: Int
):Empleado(nombre,id) {

    override fun calculaSalario(): Double {
       return salarioFijo * numPagas.toDouble()
    }
}