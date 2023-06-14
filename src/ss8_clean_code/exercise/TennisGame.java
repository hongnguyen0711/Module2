package ss8_clean_code.exercise;

public class TennisGame {
    public static final char ZEROPOINT = 0;
    public static final char ONEPOINT = 1;
    public static final char TWOPOINT = 2;
    public static final char THREEPOINT = 3;
    public static final char MIN_OF_SCORE = 4;

    public static String getScore(String player1Name, String player2Name, int playScore1, int playScore2) {
        String score = "";
        int tempScore = 0;
        if (playScore1 == playScore2) {
            switch (playScore1) {
                case ZEROPOINT:
                    score = "Love-All";
                    break;
                case ONEPOINT:
                    score = "Fifteen-All";
                    break;
                case TWOPOINT:
                    score = "Thirty-All";
                    break;
                case THREEPOINT:
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
                    case ZEROPOINT:
                        score += "Love";
                        break;
                    case ONEPOINT:
                        score += "Fifteen";
                        break;
                    case TWOPOINT:
                        score += "Thirty";
                        break;
                    case THREEPOINT:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
