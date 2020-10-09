package de.smartsquare.openclose.flavor

interface IcecreamRepository<out T : IcecreamBall> {
    fun scrapeBall(): T
}
