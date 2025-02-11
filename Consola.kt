object Consola {
    fun pedirDecimal(msj: String):Double{
        var opcionValida = false
        var decimal = 0.0
        do{
            try{
                println("Dame $msj")
                decimal = readln().toDouble()
                opcionValida = true
            }catch(e: IllegalArgumentException){
                println("Error, vuelve a introducir ${e.message}")
            }
        }while(!opcionValida)
        return decimal
    }

    fun pedirEntero(msj:String):Int{
        var opcionValida = false
        var entero = 0
        do{
            try{
                println("Dame $msj")
                entero = readln().toInt()
                opcionValida = true
            }catch(e: IllegalArgumentException){
                println("Error, vuelve a introducir ${e.message}")
            }
        }while(!opcionValida)
        return entero
    }

    fun pedirDato(msj:String):String{
        println("Dame $msj")
        return readln()
    }

    fun tipoEmpleado():String{
        var opcionValida = false
        var tipo = ""
        println("¿Que tipo de empleado?")
        println("1.- Fijo")
        println("2.- Por Hora")
        do {
            tipo = readln()
            if(tipo.trim() != "1" || tipo.trim() != "2"){
                opcionValida = true
            }
        }while(!opcionValida)
        return tipo
    }

    fun salir(): Boolean{
        println("Desea salir?")
        println("ENTER VACÍO/OTRA COSA--> SI")
        println("N/n--> NO")
        val salida = readln()

        return salida.trim().uppercase() != "N"
    }
}