package de.smartsquare.openclose

import de.smartsquare.openclose.chocolate.ChocolateRepository
import de.smartsquare.openclose.cup.Cup
import de.smartsquare.openclose.cup.CupService
import de.smartsquare.openclose.malaga.MalagaRepository
import de.smartsquare.openclose.straciatella.StraciatellaRepository
import de.smartsquare.openclose.strawberry.StrawberryRepository
import de.smartsquare.openclose.topping.Cream
import de.smartsquare.openclose.vanilla.VanillaRepository

class CounterService(
    private val chocolateRepository: ChocolateRepository,
    private val malagaRepository: MalagaRepository,
    private val straciatellaRepository: StraciatellaRepository,
    private val strawberryRepository: StrawberryRepository,
    private val vanillaRepository: VanillaRepository,
    private val cupService: CupService
) {

    fun serveIcecream(): Cup {
        val chocolate = chocolateRepository.scrapeBall()
        val malaga = malagaRepository.scrapeBall()
        val straciatella = straciatellaRepository.scrapeBall()
        val strawberry = strawberryRepository.scrapeBall()
        val vanilla = vanillaRepository.scrapeBall()

        return cupService.fillCup(
            listOf(vanilla),
            listOf(chocolate),
            listOf(straciatella),
            listOf(malaga),
            listOf(strawberry),
            Cream(0.5F, true),
            null,
            null
        )
    }
}
