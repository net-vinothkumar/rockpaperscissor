package de.game.rockpaperscissor

class RockPaperScissorGameImpl : RockPaperScissorGame {


    override fun whoIsTheWinner(playerOne: Player, playerTwo: Player): Winner {

        return when {
            playerOne.moveType == playerTwo.moveType -> Winner.GAME_TIE
            playerOne.moveType == MoveType.ROCK && playerTwo.moveType == MoveType.SCISSOR -> Winner.PLAYER_ONE
            playerOne.moveType == (MoveType.SCISSOR) && playerTwo.moveType == (MoveType.PAPER) -> Winner.PLAYER_ONE
            playerOne.moveType == (MoveType.PAPER) && playerTwo.moveType == (MoveType.ROCK) -> Winner.PLAYER_ONE
            playerTwo.moveType == (MoveType.ROCK) && playerOne.moveType == (MoveType.SCISSOR) -> Winner.PLAYER_TWO
            playerTwo.moveType == (MoveType.SCISSOR) && playerOne.moveType == (MoveType.PAPER) -> Winner.PLAYER_TWO
            playerTwo.moveType == (MoveType.PAPER) && playerOne.moveType == (MoveType.ROCK) -> Winner.PLAYER_TWO
            else -> {
                //TODO once the way we get the player input directly from users
                println("Invalid game move type, please try again with valid movie types.")
                return Winner.NO_WINNER
            }
        }
    }
}