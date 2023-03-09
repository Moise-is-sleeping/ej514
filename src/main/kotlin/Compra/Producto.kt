package Compra

abstract class Producto(nombre : String,precio : Double) {
    var  precio = precio
        set(value) {
            if(value < 0.0){
                print("Precio Invalido !! : ")
                precio = readln().toDouble()
            }else{
                field = value
            }
        }
    var nombre = nombre
        set(value) {
            if (value.isBlank()){
                println("Nombre Invalido !! : ")
                nombre = readln()
            }else{
                field = value
            }
        }
    init {
        this.nombre = nombre
        this.precio = precio
    }
    abstract fun info()

    open fun calcular(cantidad : Int):Double{
        return precio * cantidad
    }
}