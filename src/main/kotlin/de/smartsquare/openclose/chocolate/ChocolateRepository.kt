package de.smartsquare.openclose.chocolate

import de.smartsquare.openclose.flavor.IcecreamRepository

class ChocolateRepository: IcecreamRepository<ChocolateBall> {

    override fun scrapeBall(): ChocolateBall {
        return ChocolateBall(1.25F)
    }
}
