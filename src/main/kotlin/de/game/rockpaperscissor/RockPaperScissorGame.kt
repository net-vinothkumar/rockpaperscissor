package de.game.rockpaperscissor

interface RockPaperScissorGame {
    fun whoIsTheWinner(playerOne: Player, playerTwo: Player): Winner
}