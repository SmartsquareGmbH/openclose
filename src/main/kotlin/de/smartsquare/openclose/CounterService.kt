package de.smartsquare.openclose

import de.smartsquare.openclose.cup.Cup
import de.smartsquare.openclose.cup.CupService
import de.smartsquare.openclose.flavor.IcecreamBall
import de.smartsquare.openclose.flavor.IcecreamRepository
import de.smartsquare.openclose.topping.Cream

class CounterService(
    private val icecreamRepositories: List<IcecreamRepository<IcecreamBall>>,
    private val cupService: CupService
) {

    fun serveIcecream(): Cup {
        val balls = icecreamRepositories.map { it.scrapeBall() }
        return cupService.fillCup(
            balls,
            Cream(0.5F, true),
            null,
            null
        )
    }
}
