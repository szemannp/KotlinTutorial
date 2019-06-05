class Player(private val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist", 1)
    private val inventory = ArrayList<Loot>()

    fun showIsAlive() {
        if (lives > 0) {
            println("${name} is alive")
        } else {
            println("${name} is dead")
        }
    }

    override fun toString(): String {
        return """
            name: $name
            lives: $lives
            level: $level
            score: $score
            wields: $weapon
        """
    }

    fun getLoot(item: Loot) {
        inventory.add(item)
    }

    fun dropLoot(item: Loot): Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    fun dropLoot(name: String): Boolean {
        println("$name item will be dropped")
        return inventory.removeIf { it.name == name }
    }

    fun showInventory() {
        println("${name}'s inventory contains:")

        for (item in inventory) {
            println(item)
        }

        println()
        println("=============================")
    }
}