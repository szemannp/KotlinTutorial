fun main() {

    val uglyTroll = Troll("Ugly Troll")

    println(uglyTroll)

    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = Vampire("Vlad")
    println(vlad)

    vlad.takeDamage(8)
    println(vlad)
}
