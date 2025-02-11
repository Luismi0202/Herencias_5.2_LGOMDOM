class EmpleadoPorHora(
    nombre:String,
    id:String,
    var horasTrabajadas: Int,
    var tarifaPorHora: Double
):Empleado(nombre,id) {

    override fun calculaSalario(): Double {
        return horasTrabajadas.toDouble() * tarifaPorHora
    }
}