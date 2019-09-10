package simonberner.com.kotlin_everywhere;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class RockPaperScissorsGame {
    @Id
    @GeneratedValue
    private Long id;
    private String userChoice;
    private String computerChoice;
    private Long userScore;
    private Long computerScore;

    public RockPaperScissorsGame() {
    }

    public RockPaperScissorsGame(
            @NotNull Long id,
            @NotNull String userChoice,
            @NotNull String computerChoice,
            @NotNull Long userScore,
            @NotNull Long computerScore) {
        this.id = id;
        this.userChoice = userChoice;
        this.computerChoice = computerChoice;
        this.userScore = userScore;
        this.computerScore = computerScore;
    }

    public Long getId() {
        return id;
    }

    public String getUserChoice() {
        return userChoice;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public Long getUserScore() {
        return userScore;
    }

    public Long getComputerScore() {
        return computerScore;
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
