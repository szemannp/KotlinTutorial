enum class LootType {
    POTION, RING, ARMOR
}

class Loot(val name: String, private val type: LootType, private val value: Double) {

    override fun toString(): String {
        return "$name is $type and is worth $value"
    }
}