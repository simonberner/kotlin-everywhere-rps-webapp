package simonberner.com.kotlin_everywhere

class GameLogic {
    fun computerDraw(): Choice {
        val choices = Choice.values()
        val computerChoice = choices.random()
        return computerChoice
    }
}