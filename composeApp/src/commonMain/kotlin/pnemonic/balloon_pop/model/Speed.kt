package pnemonic.balloon_pop.model

enum class Speed(val numerator: Int, val denominator: Int = 1) {
    Slow(1),
    Fast(3, 2),
    Faster(2);

    companion object {
        operator fun Int.times(other: Speed): Int {
            return (this * other.numerator) / other.denominator
        }

        operator fun Long.times(other: Speed): Long {
            return (this * other.numerator) / other.denominator
        }
    }
}