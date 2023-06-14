package ss8_clean_code.exercise;

public class TennisGame {
    public static final char ZERO_POINT = 0;
    public static final char ONE_POINT = 1;
    public static final char TWO_POINT = 2;
    public static final char THREE_POINT = 3;
    public static final char MIN_OF_SCORE = 4;

    public static String getScore(String player1Name, String player2Name, int playScore1, int playScore2) {
        String score = "";
        int tempScore = 0;
        if (playScore1 == playScore2) {
            switch (playScore1) {
                case ZERO_POINT:
                    score = "Love-All";
                    break;
                case ONE_POINT:
                    score = "Fifteen-All";
                    break;
                case TWO_POINT:
                    score = "Thirty-All";
                    break;
                case THREE_POINT:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (playScore1 >= MIN_OF_SCORE || playScore2 >= MIN_OF_SCORE) {
            int minusResult = playScore1 - playScore2;
            if (minusResult == 1) {
                score = "Advantage player1";
            } else if (minusResult == -1) {
                score = "Advantage player2";
            } else if (minusResult >= 2) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = playScore1;
                else {
                    score += "-";
                    tempScore = playScore2;
                }
                switch (tempScore) {
                    case ZERO_POINT:
                        score += "Love";
                        break;
                    case ONE_POINT:
                        score += "Fifteen";
                        break;
                    case TWO_POINT:
                        score += "Thirty";
                        break;
                    case THREE_POINT:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
