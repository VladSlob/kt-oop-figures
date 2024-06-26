package mate.academy.model

class IsoscelesTrapezoid(
    color: Color,
    val base1: Double,
    val base2: Double,
    val height: Double
) : Figure(color) {
    companion object {
        private const val DEFAULT_BASE1 = 5.0
        private const val DEFAULT_BASE2 = 3.0
        private const val DEFAULT_HEIGHT = 2.0
    }

    override fun area(): Double {
        return (base1 + base2) * height / 2.0
    }

    override fun draw() {
        println("Drawing an isosceles trapezoid with bases $base1 and $base2, height $height, and color $color")
    }
}
