package de.game.rockpaperscissor

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RockPaperScissorAppTest {

    @Test
    fun `should return the rock paper scissor game results for 100 play times`() {
        val gameResultList = RockPaperScissorApp().startGame(RockPaperScissorGameImpl())
        assertThat(gameResultList.size).isEqualTo(100)
        gameResultList.forEach{gameResult -> assertThat(gameResult.playerOneInput).isEqualTo(MoveType.ROCK.value)}
        gameResultList.forEach{
            gameResult ->
            when {
                gameResult.playerTwoInput.equals(MoveType.ROCK) -> assertThat(gameResult.winner).isEqualTo(Winner.GAME_TIE)
                gameResult.playerTwoInput.equals(MoveType.PAPER) -> assertThat(gameResult.winner).isEqualTo(Winner.PLAYER_TWO)
                gameResult.playerTwoInput.equals(MoveType.SCISSOR) -> assertThat(gameResult.winner).isEqualTo(Winner.PLAYER_ONE)
            }
        }
    }

}