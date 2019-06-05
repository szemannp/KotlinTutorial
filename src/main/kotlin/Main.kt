fun main() {
    val frisca = Player("Frisca")
    val evanlie = Player("Evanlie", 5)

    val axe = Weapon("Axe", 12)


    frisca.weapon = axe

    axe.damageInflicted = 17

    frisca.showIsAlive()
    evanlie.showIsAlive()

    val healthPotion = Loot("Healing Potion", LootType.POTION, 7.50)
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)


    frisca.getLoot(healthPotion)
    frisca.getLoot(chestArmor)
    frisca.showInventory()

    frisca.getLoot(Loot("Ring of Protection +2", LootType.RING, 40.25))
    frisca.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))

    frisca.showInventory()

    if (frisca.dropLoot(healthPotion)) {
        frisca.showInventory()
    } else {
        println("You don't have a ${healthPotion.name}")
    }

    val manaPotion = Loot("Mana Potion", LootType.POTION, 6.00)

    if (frisca.dropLoot(manaPotion)) {
        frisca.showInventory()
    } else {
        println("You don't have a ${manaPotion.name}")
    }

    if (frisca.dropLoot("Invisibility Potion")) {
        frisca.showInventory()
    } else {
        println("You don't have an Invisibility Potion")
    }

//    println(frisca)
}
