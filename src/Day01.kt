fun main() {
    // test if implementation meets criteria from the description, like:
    //PARTE 1:
    var input: List<String> = readInput("day1")
    var suma_numeros = parte_1(input)
    println(suma_numeros)

    //PARTE 2:
    var traduccion_numeros = mapOf("one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9)
    var input_parte2: List<String> = readInput("input1part2")
    var suma_numeros2 = parte_2(input_parte2,traduccion_numeros)
    print(suma_numeros2)




}

fun parte_1(input:List<String>):Int{
    var listanumeros = mutableListOf<Int>()

    for (linea in input){
        var numeros_linea = ""
        for (letra in linea){
            if (letra.isDigit()){
                numeros_linea += letra
            }
        }
        var primerNumero = numeros_linea.first()
        var segundoNumero = numeros_linea.last()
        var digito_total = ("$primerNumero" + "$segundoNumero").toInt()
        listanumeros.add(digito_total)
    }
    return listanumeros.sum()
}

fun parte_2(input_parte2:List<String>,traduccion_numeros:Map<String,Int>):Int {
    for (linea in input_parte2){
        var lista_numeros_en_cadena = mutableListOf<String>()
        var contenedor_numeros = ""
        for (letra in linea){
            if (!letra.isDigit()){
                contenedor_numeros += letra
                if (contenedor_numeros in traduccion_numeros.keys){
                    lista_numeros_en_cadena.add(contenedor_numeros)
                    contenedor_numeros = ""
                    for (letra in linea.reversed()){
                        if (!letra.isDigit()){
                            contenedor_numeros += letra
                            if (contenedor_numeros in traduccion_numeros.keys){
                                lista_numeros_en_cadena.add(contenedor_numeros.reversed())
                                contenedor_numeros = ""
                            }
                        }
                    }
                }
            }
        }
    }
    return 0
}





