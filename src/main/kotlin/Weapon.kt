class Weapon(private val type: String, var damageInflicted: Int) {

    override fun toString(): String {
        return "$type inflicts $damageInflicted"
    }
}