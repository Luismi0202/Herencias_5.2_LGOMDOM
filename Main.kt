
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
    val departamento = Departamento(listaEmpleado)
    var salida = false
    do{
        departamento.agregarEmpleado()
        salida = Consola.salir()
    }while(!salida)

    for(empleado in departamento.empleados){
        println("${empleado.nombre} con ${"%04d".format(empleado.id.toInt())} tiene un salario de ${"%.2f".format(empleado.calculaSalario())} al mes.")
    }

    println("El salario total es de ${departamento.calcularSalarioTotal()}")
}