
fun comprobarid(id:String):Boolean{
    var id_valido = true
    for(caracter in id){
        if(!caracter.isDigit()){
            id_valido = false
        }
    }
    return id_valido
}


fun main(){
    val listaEmpleado = mutableListOf<Empleado>()
    var salida = false
    var id = ""
    do{
        val nombre = Consola.pedirDato("el nombre del empleado")
        do {
            id = Consola.pedirDato("el id del empleado (debe medir 4 caracteres)")
            if (id.length != 4 || !comprobarid(id)){
                println("ERROR, VUELVE A INTRODUCIR, DEBE MEDIR 4 CARACTERES Y SER TODOS NUMÉRICOS")
            }
        }while(id.length != 4)

        val tipo = Consola.tipoEmpleado()
        var empleado:Empleado? = null

        if(tipo == "1"){
            empleado = EmpleadoFijo(nombre,id,Consola.pedirDecimal("el salario fijo del empleado"),Consola.pedirEntero("el numero de pagas"))
        }
        else{
            empleado = EmpleadoPorHora(nombre,id,Consola.pedirEntero("el numero de horas trabajadas del empleado"),Consola.pedirDecimal("la tarifa por hora del empleado"))
        }
        listaEmpleado.add(empleado)

        salida = Consola.salir()

    }while(!salida)

    val departamento = Departamento(listaEmpleado)

    for(empleado in departamento.empleados){
        println("${empleado.nombre} con ${"%04d".format(empleado.id.toInt())} tiene un salario de ${"%.2f".format(empleado.calculaSalario())} al mes.")
    }
}