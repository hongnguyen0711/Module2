package ss8_clean_code.exercise;

public class TennisGame {
    public static final char ZERO_POINT = 0;
    public static final char ONE_POINT = 1;
    public static final char TWO_POINT = 2;
    public static final char THREE_POINT = 3;
    public static final char MIN_OF_SCORE = 4;


    public static String showEqualsPoint(int player1Score) {
        String total = "";
        switch (player1Score) {
            case ZERO_POINT:
                total = "Love-All";
                break;
            case ONE_POINT:
                total = "Fifteen-All";
                break;
            case TWO_POINT:
                total = "Thirty-All";
                break;
            case THREE_POINT:
                total = "Forty-All";
                break;
            default:
                total = "Deuce";
                break;

        }
        return total;
    }

    public static String showAvantagePoint(int player1Score, int player2Score) {
        String total = " ";
        if (player1Score >= MIN_OF_SCORE || player2Score >= MIN_OF_SCORE) {

            int minusResultPoint = player1Score - player2Score;
            if (minusResultPoint == 1) {
                total = "Advantage player1";
            } else if (minusResultPoint == -1) {
                total = "Advantage player2";
            } else if (minusResultPoint >= 2) {
                total = "Win for player1";
            } else {
                total = "Win for player2";
            }
        }
        return total;
    }

    public static String showResult(int player1Score, int player2Score) {
        String total = " ";
        int tempScore = 0;
        if (player1Score == player2Score) {
            return showEqualsPoint(player1Score);
        } else if (player1Score >= MIN_OF_SCORE || player2Score >= MIN_OF_SCORE) {
            return showAvantagePoint(player1Score, player2Score);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = player1Score;
                } else {
                    total += "-";
                    tempScore = player2Score;
                }
                switch (tempScore) {
                    case ZERO_POINT:
                        total += "Love";
                        break;
                    case ONE_POINT:
                        total += "Fifteen";
                        break;
                    case TWO_POINT:
                        total += "Thirty";
                        break;
                    case THREE_POINT:
                        total += "Forty";
                        break;
                }

            }
        }
        return total;
    }

    public static String showAvantagePoint(String john, String bill, int mScore1, int mScore2) {
        return john + mScore1 + bill + mScore2 ;
    }
}
