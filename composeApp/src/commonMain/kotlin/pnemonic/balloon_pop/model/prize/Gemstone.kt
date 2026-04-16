package pnemonic.balloon_pop.model.prize

import pnemonic.balloon_pop.sound.SoundType

class Gemstone(val gem: Gem) : Prize(sound = SoundType.Clink) {
    override val description = "💎"

    override fun toString(): String {
        return "${this::class.simpleName}@${hashCode()}($description, l:$left, t:$top, w:$width, h:$height, r:$rotation, o:$opacity, g:$gem)"
    }
}