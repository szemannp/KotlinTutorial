fun main() {
    val enemy = Enemy("test enemy", 10, 3)

    enemy.takeDamage(4)
    println(enemy)

    enemy.takeDamage(11)
    println(enemy)

    val uglyTroll = Troll("Ugly Troll", 27, 1)

    println(uglyTroll)

    uglyTroll.takeDamage(8)
    println(uglyTroll)


}
