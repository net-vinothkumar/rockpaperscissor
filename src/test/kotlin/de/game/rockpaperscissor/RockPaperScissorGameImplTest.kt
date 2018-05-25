package de.game.rockpaperscissor

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RockPaperScissorGameImplTest {
    private  var rockPaperScissorGameImpl: RockPaperScissorGameImpl = RockPaperScissorGameImpl()

    @Test
    fun `should return player one has won the game for the given inputs player1-rock, player2-scissor`() {
        assertThat(rockPaperScissorGameImpl.whoIsTheWinner(Player(MoveType.ROCK), Player(MoveType.SCISSOR))).isEqualTo(Winner.PLAYER_ONE)
    }

    @Test
    fun `should return player one has won the game for the given inputs player1-scissor, player2-paper`() {
        assertThat(rockPaperScissorGameImpl.whoIsTheWinner(Player(MoveType.SCISSOR), Player(MoveType.PAPER))).isEqualTo(Winner.PLAYER_ONE)
    }

    @Test
    fun `should return player one has won the game for the given inputs player1-paper, player2-rock`() {
        assertThat(rockPaperScissorGameImpl.whoIsTheWinner(Player(MoveType.PAPER), Player(MoveType.ROCK))).isEqualTo(Winner.PLAYER_ONE)
    }

    @Test
    fun `should return player two has won the game for the given inputs player1-scissor, player2-rock`() {
        assertThat(rockPaperScissorGameImpl.whoIsTheWinner(Player(MoveType.SCISSOR), Player(MoveType.ROCK))).isEqualTo(Winner.PLAYER_TWO)
    }

    @Test
    fun `should return player two has won the game for the given inputs player1-paper, player2-scissor`() {
        assertThat(rockPaperScissorGameImpl.whoIsTheWinner(Player(MoveType.PAPER), Player(MoveType.SCISSOR))).isEqualTo(Winner.PLAYER_TWO)
    }

    @Test
    fun `should return player two has won the game for the given inputs player1-rock, player2-paper`() {
        assertThat(rockPaperScissorGameImpl.whoIsTheWinner(Player(MoveType.ROCK), Player(MoveType.PAPER))).isEqualTo(Winner.PLAYER_TWO)
    }

    @Test
    fun `should return the result as game-tie for the given inputs player1-rock, player2-rock`() {
        assertThat(rockPaperScissorGameImpl.whoIsTheWinner(Player(MoveType.ROCK), Player(MoveType.ROCK))).isEqualTo(Winner.GAME_TIE)
    }

    @Test
    fun `should return the result as game-tie for the given inputs player1-scissor, player2-scissor`() {
        assertThat(rockPaperScissorGameImpl.whoIsTheWinner(Player(MoveType.SCISSOR), Player(MoveType.SCISSOR))).isEqualTo(Winner.GAME_TIE)
    }

    @Test
    fun `should return the result as game-tie for the given inputs player1-paper, player2-paper`() {
        assertThat(rockPaperScissorGameImpl.whoIsTheWinner(Player(MoveType.PAPER), Player(MoveType.PAPER))).isEqualTo(Winner.GAME_TIE)
    }
}