package de.smartsquare.openclose.vanilla

import de.smartsquare.openclose.flavor.IcecreamRepository

class VanillaRepository : IcecreamRepository<VanillaBall> {

    override fun scrapeBall(): VanillaBall {
        return VanillaBall(1.25F)
    }
}
