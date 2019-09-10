package simonberner.com.kotlin_everywhere;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
public class RockPaperScissorsGame {
    @Id
    @GeneratedValue
    private Long id;
    private Choice userChoice;
    private Choice computerChoice;
    private Long userScore;
    private Long computerScore;

    public RockPaperScissorsGame() {
    }

    public RockPaperScissorsGame(
            @NotNull Long id,
            @NotNull Choice userChoice,
            @NotNull Choice computerChoice,
            @NotNull Long userScore,
            @NotNull Long computerScore) {
        this.id = id;
        this.userChoice = userChoice;
        this.computerChoice = computerChoice;
        this.userScore = userScore;
        this.computerScore = computerScore;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", userChoice='" + userChoice + '\'' +
                ", computerChoice='" + computerChoice + '\'' +
                ", userScore=" + userScore +
                ", computerScore=" + computerScore +
                '}';
    }

}
