package de.game.rockpaperscissor

import java.util.*

class RockPaperScissorApp {
    private val playerOne = Player(MoveType.ROCK)
    private val ONE_TO_HUNDERED = 1..100

    fun startGame(rockPaperScissorGame: RockPaperScissorGame): MutableList<GameResult> {

        val gameResults = mutableListOf<GameResult>()

        ONE_TO_HUNDERED.forEach {
            val randomMoveType = getRandomMoveType()
            val playerTwo = Player(randomMoveType)
            val winner = rockPaperScissorGame.whoIsTheWinner(playerOne, playerTwo)

            gameResults.add(GameResult(playerOne.moveType.value, playerTwo.moveType.value, winner.value))
        }
        return gameResults
    }

    private fun getRandomMoveType(): MoveType {
        return MoveType.values()[Random().nextInt(MoveType.values().size)]
    }
}

fun main(args: Array<String>) {
    RockPaperScissorApp()
            .startGame(RockPaperScissorGameImpl())
            .forEach { gameResult ->
                println("Player one shows : ${gameResult.playerOneInput}")
                println("Player two shows : ${gameResult.playerTwoInput}")
                println("The game winner is : ${gameResult.winner}")
            }
}