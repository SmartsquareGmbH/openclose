package de.smartsquare.openclose

import de.smartsquare.openclose.chocolate.ChocolateRepository
import de.smartsquare.openclose.cup.CupService
import de.smartsquare.openclose.malaga.MalagaRepository
import de.smartsquare.openclose.straciatella.StraciatellaRepository
import de.smartsquare.openclose.strawberry.StrawberryRepository
import de.smartsquare.openclose.vanilla.VanillaRepository
import org.amshove.kluent.shouldBeNull
import org.amshove.kluent.shouldHaveSize
import org.amshove.kluent.shouldNotBeNull
import org.junit.jupiter.api.Test

internal class CounterServiceTest {

    @Test
    internal fun `should serve a nice cup of icecream`() {
        val counterService = CounterService(
            ChocolateRepository(),
            MalagaRepository(),
            StraciatellaRepository(),
            StrawberryRepository(),
            VanillaRepository(),
            CupService()
        )

        val cup = counterService.serveIcecream()

        cup.chocolateBalls.shouldHaveSize(1)
        cup.malagaBalls.shouldHaveSize(1)
        cup.straciatellaBalls.shouldHaveSize(1)
        cup.strawberryBalls.shouldHaveSize(1)
        cup.vanillaBalls.shouldHaveSize(1)
        cup.cream.shouldNotBeNull()
        cup.chocolateSprinkles.shouldBeNull()
        cup.rainbowSprinkles.shouldBeNull()
    }
}
