import java.util.*

fun main(){
        showMenu()
    }
    var todasLasRecetas: Array<String> = arrayOf<String>()
    fun showMenu(){
        loop@ do{
            println("Bienvenido a mi app:")
            println("Selecciona la opción deseada")
            println("        1. Hacer una receta")
            println("        2. Ver mis recetas")
            println("        3. Salir")
            val option = readLine()
            when (option) {
                "1" -> hacerUnaReceta()
                "2" -> verMisRecetas()
                "3" -> { println("Salir"); break@loop
                }
                else -> println("Ingrese un dato valido")
              }
        }while(true)
    }
    fun hacerUnaReceta(){
        println("Creación de recetas")
        val ingredientsList: String =
                """
               Selecciona ingrediente para tu receta:":
                1. Agua
                2. Leche
                3. Carne
                4. Verduras
                5. Frutas
                6. Cereal
                7. Huevo
                8. Aceite
                9. Fin
            """.trimIndent()
        println(ingredientsList)
        loop@ do{
            val option = readLine()
            var recetaNew = "holi "
            when (option) {

                "1" -> {recetaNew += "Agua"
                        println("Agua agregada")}

                "2" -> {recetaNew += "Leche"
                        println("Leche agregada")}

                "3" -> {recetaNew += "Carne"
                        println("Carne agregada")}

                "4" -> {recetaNew += "Verduras"
                        println("Verduras agregada")}

                "5" -> {recetaNew += "Frutas"
                        println("Frutas agregada")}

                "6" -> {recetaNew += "Cereal"
                        println("Cereal agregada")}

                "7" -> {recetaNew += "Huevo"
                        println("Huevo agregada")}

                "8" -> {recetaNew += "Aceite"
                        println("Aceite agregada")}

                "9" -> {
                        println("La receta: " + recetaNew)

                        println("Receta finalizada, añadida a la lista"); break@loop
                }
                else -> println("Ingrese un dato valido")
            }
        }while(true)
        showMenu()
    }

    fun verMisRecetas(){
        println("Mis recetas:")
        println(todasLasRecetas.toString())
        showMenu()
    }