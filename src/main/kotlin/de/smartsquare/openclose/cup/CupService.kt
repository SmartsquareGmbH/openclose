package de.smartsquare.openclose.cup

import de.smartsquare.openclose.flavor.IcecreamBall
import de.smartsquare.openclose.topping.ChocolateSprinkles
import de.smartsquare.openclose.topping.Cream
import de.smartsquare.openclose.topping.RainbowSprinkles

class CupService {

    fun fillCup(
        balls: List<IcecreamBall>,
        cream: Cream? = null,
        chocolateSprinkles: ChocolateSprinkles? = null,
        rainbowSprinkles: RainbowSprinkles? = null
    ): Cup {
        return Cup(
            balls,
            cream,
            chocolateSprinkles,
            rainbowSprinkles
        )
    }
}
