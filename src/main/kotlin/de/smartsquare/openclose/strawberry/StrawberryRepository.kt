package de.smartsquare.openclose.strawberry

import de.smartsquare.openclose.flavor.IcecreamRepository

class StrawberryRepository : IcecreamRepository<StrawberryBall> {

    override fun scrapeBall(): StrawberryBall {
        return StrawberryBall(1.25F)
    }
}
