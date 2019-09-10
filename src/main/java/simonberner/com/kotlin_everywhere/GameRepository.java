package simonberner.com.kotlin_everywhere;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GameRepository extends CrudRepository<RockPaperScissorsGame, Integer> {
    @Query("select sum(g.computerScore) from RockPaperScissorsGame g")
    Optional<Long> computerScoreTotal();

    @Query("select sum(g.userScore) from RockPaperScissorsGame g")
    Optional<Long> userScoreTotal();
}