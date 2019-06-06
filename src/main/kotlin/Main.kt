fun main() {

//    val uglyTroll = Troll("Ugly Troll")
//
//    println(uglyTroll)
//
//    uglyTroll.takeDamage(30)
//    println(uglyTroll)
//
//    val vlad = Vampire("Vlad")
//    println(vlad)
//
//    vlad.takeDamage(8)
//    println(vlad)
//
//    val dracula = VampireLord("Count Dracula")
//    println(dracula)
//    dracula.takeDamage(12)

//    while (dracula.lives > 0) {
//        if (dracula.dodges()) {
//            continue
//        }
//        if (dracula.runAway()) {
//            println("Dracula has escaped!")
//            break
//        } else {
//            dracula.takeDamage(12)
//        }
//    }

    val frisca = Player("Frisca")
    frisca.getLoot(Loot("Helmet", LootType.ARMOR, 40.0))
    frisca.getLoot(Loot("Boots", LootType.ARMOR, 40.0))
    frisca.getLoot(Loot("Ring of Speed", LootType.RING, 157.0))
    frisca.getLoot(Loot("Ring of Speed", LootType.RING, 157.0))
    frisca.getLoot(Loot("Ring of Speed", LootType.RING, 157.0))
    frisca.getLoot(Loot("Health Potion", LootType.POTION, 15.0))
    frisca.getLoot(Loot("Blessed Shield", LootType.ARMOR, 172.0))
    frisca.getLoot(Loot("Ring of Strength", LootType.RING, 317.0))
    frisca.getLoot(Loot("Ring of Strength", LootType.RING, 317.0))
    frisca.getLoot(Loot("Chain Mail", LootType.ARMOR, 212.0))
    frisca.getLoot(Loot("Iron Belt", LootType.ARMOR, 93.0))
    frisca.getLoot(Loot("Mana Potion", LootType.POTION, 15.0))
    frisca.getLoot(Loot("Invisibility Potion", LootType.POTION, 30.0))

    frisca.showInventory()
    frisca.dropLoot("Ring of Speed")
    frisca.showInventory()
    frisca.dropLoot("Ring of Strength")
    frisca.showInventory()

    if (frisca.dropLoot("Ring of Perception")) {
        println("Dropping Ring of Perception")
    } else {
        println("You don't have a Ring of Perception")
    }
}


