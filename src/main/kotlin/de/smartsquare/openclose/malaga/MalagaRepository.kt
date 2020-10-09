package de.smartsquare.openclose.malaga

import de.smartsquare.openclose.flavor.IcecreamRepository

class MalagaRepository : IcecreamRepository<MalagaBall> {

    override fun scrapeBall(): MalagaBall {
        // definitely NO rainins!
        return MalagaBall(1.25F, false)
    }
}
