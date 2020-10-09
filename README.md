# Open Close Principle
aka 
## The yummiest Coding Dojo ever! :icecream: :yum:

Imagine summer...:sunny: :sunglasses:

You feel hot, a cup of icecream would be awesome!
No problem! 
You're a software developer and you and your colleague have created a service that serves a nice cup of icecream.
But your colleague just added [detekt](https://github.com/detekt/detekt) and now your project doesn't build anymore!

In order to get a nice cup of icecream you need to refactor your codebase so that the detekt issue goes away.
`@Suppress` is not allowed, otherwise your boss will get mad! :rage:
  
## Are we open for extension and closed for modification?

The [open-close principle](https://wiki.c2.com/?OpenClosedPrinciple) states that a program should be open for extension but closed for modification.
What does that mean for our icecream shop?

Imagine we want to add a new icecream flavor (or remove one).
What classes are affected by this and what do we need to change?
Maybe there is a better way to model our icecream shop...
