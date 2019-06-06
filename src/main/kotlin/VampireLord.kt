import java.util.*

class VampireLord(name: String) : Vampire(name) {
    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }

    fun runAway(): Boolean {
        return lives < 2
    }

    fun dodges(): Boolean {
        val randomValue = Random()
        val chance = randomValue.nextInt(6)
        return if (chance > 4) {
            println("$name dodges this attack!")
            true
        } else {
            false
        }
    }
}