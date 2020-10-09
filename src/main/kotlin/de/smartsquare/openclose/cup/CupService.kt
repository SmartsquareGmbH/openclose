package de.smartsquare.openclose.cup

import de.smartsquare.openclose.chocolate.ChocolateBall
import de.smartsquare.openclose.malaga.MalagaBall
import de.smartsquare.openclose.straciatella.StraciatellaBall
import de.smartsquare.openclose.strawberry.StrawberryBall
import de.smartsquare.openclose.topping.ChocolateSprinkles
import de.smartsquare.openclose.topping.Cream
import de.smartsquare.openclose.topping.RainbowSprinkles
import de.smartsquare.openclose.vanilla.VanillaBall

class CupService {

    // Darn! This function has too many parameters! Please refactor.
    fun fillCup(
        vanillaBalls: List<VanillaBall>,
        chocolateBalls: List<ChocolateBall>,
        straciatellaBalls: List<StraciatellaBall>,
        malagaBalls: List<MalagaBall>,
        strawberryBalls: List<StrawberryBall>,
        cream: Cream? = null,
        chocolateSprinkles: ChocolateSprinkles? = null,
        rainbowSprinkles: RainbowSprinkles? = null
    ): Cup {
        return Cup(
            vanillaBalls,
            chocolateBalls,
            straciatellaBalls,
            malagaBalls,
            strawberryBalls,
            cream,
            chocolateSprinkles,
            rainbowSprinkles
        )
    }
}
