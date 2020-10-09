package de.smartsquare.openclose

import de.smartsquare.openclose.chocolate.ChocolateBall
import de.smartsquare.openclose.chocolate.ChocolateRepository
import de.smartsquare.openclose.cup.CupService
import de.smartsquare.openclose.malaga.MalagaBall
import de.smartsquare.openclose.malaga.MalagaRepository
import de.smartsquare.openclose.straciatella.StraciatellaBall
import de.smartsquare.openclose.straciatella.StraciatellaRepository
import de.smartsquare.openclose.strawberry.StrawberryBall
import de.smartsquare.openclose.strawberry.StrawberryRepository
import de.smartsquare.openclose.vanilla.VanillaBall
import de.smartsquare.openclose.vanilla.VanillaRepository
import org.amshove.kluent.`should contain any`
import org.amshove.kluent.shouldBeNull
import org.amshove.kluent.shouldNotBeNull
import org.junit.jupiter.api.Test

internal class CounterServiceTest {

    @Test
    internal fun `should serve a nice cup of icecream`() {
        val counterService = CounterService(
            listOf(
                ChocolateRepository(),
                MalagaRepository(),
                StraciatellaRepository(),
                StrawberryRepository(),
                VanillaRepository()
            ),
            CupService()
        )

        val cup = counterService.serveIcecream()

        cup.balls.`should contain any` { it is ChocolateBall }
        cup.balls.`should contain any` { it is MalagaBall }
        cup.balls.`should contain any` { it is StraciatellaBall }
        cup.balls.`should contain any` { it is StrawberryBall }
        cup.balls.`should contain any` { it is VanillaBall }
        cup.cream.shouldNotBeNull()
        cup.chocolateSprinkles.shouldBeNull()
        cup.rainbowSprinkles.shouldBeNull()
    }
}
