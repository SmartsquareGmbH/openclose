package de.smartsquare.openclose.straciatella

import de.smartsquare.openclose.flavor.IcecreamRepository

class StraciatellaRepository : IcecreamRepository<StraciatellaBall> {

    override fun scrapeBall(): StraciatellaBall {
        return StraciatellaBall(1.25F)
    }
}
