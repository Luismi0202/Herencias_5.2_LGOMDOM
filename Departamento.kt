class Departamento(
    val empleados: MutableList<Empleado>
) {
    fun agregarEmpleado(){
        val nombre = Consola.pedirDato("el nombre del empleado")
        val id = Consola.pedirDato("el id del empleado")
        val tipo = Consola.tipoEmpleado()
        var empleado:Empleado? = null
        if(tipo == "1"){
            empleado = EmpleadoFijo(nombre,id,Consola.pedirDecimal("el salario fijo del empleado"),Consola.pedirEntero("el numero de pagas"))
        }
        else{
            empleado = EmpleadoPorHora(nombre,id,Consola.pedirEntero("el numero de horas trabajadas del empleado"),Consola.pedirDecimal("la tarifa por hora del empleado"))
        }
        empleados.add(empleado)
    }





    fun calcularSalarioTotal(){
        var salarioTotal = 0.0
        for(empleado in empleados){
            salarioTotal+= empleado.calculaSalario()
        }
    }
}