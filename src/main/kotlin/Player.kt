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
        var isDropped = false
        for (item in inventory) {
            if (item.name == name) {
                inventory.remove(item)
                isDropped = true
                println("The following item is dropped: $name")
                break
            }
        }
        return isDropped
    }

    fun showInventory() {
        var totalValue = 0.0
        println("${name}'s inventory contains:")

        for (item in inventory) {
            println(item)
            totalValue += item.value
        }

        println()
        println("=============================")
        println("Total value of inventory is: $totalValue")
        println("=============================")
    }
}