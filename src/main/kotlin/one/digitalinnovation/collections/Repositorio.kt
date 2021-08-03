package one.digitalinnovation.collections

class Repositorio<T> { //"T" é o objeto quando for referenciado
    private val map = mutableMapOf<String, T>()

    fun create(id:String, value:T) {
        map[id] = value //put
    }

    fun remove(id:String) = map.remove(id)

    fun findById(id: String) = map[id] //get

    fun findAll() = map.values //encontra a coleção de elementos registrados

}