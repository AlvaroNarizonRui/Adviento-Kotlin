fun main() {
    fun part1(input: List<String>){
        println(input[0])
        for(i in input){
            var cadena_input:String = ""
            cadena_input += i
            var lista_cadena_entrada = cadena_input.split(";")
            for(j in lista_cadena_entrada){

            }
        }



    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    //val testInput = readInput("Day02_test")
    //check(part1(testInput) == 1)

    val input = readInput("Day02")
    part1(input).println()
    //part2(input).println()
}
