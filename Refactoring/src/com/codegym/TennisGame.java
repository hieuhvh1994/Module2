package com.codegym;

public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore=0;
        if (player1Score==player2Score)
        {
            score = draw(player1Score);
        }
        else if (player1Score>=4 || player2Score>=4)
        {
            score = scoreDifferent(player1Score, player2Score);
        }
        else
        {
            score = getResult(player1Score, player2Score, score);
        }
        return score;
    }

    private static String getResult(int player1Score, int player2Score, String score) {
        int tempScore;
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = player1Score;
            else { score +="-"; tempScore = player2Score;}
            switch(tempScore)
            {
                case 0:
                    score += LOVE;
                    break;
                case 1:
                    score += FIFTEEN;
                    break;
                case 2:
                    score += THIRTY;
                    break;
                case 3:
                    score += FORTY;
                    break;
            }
        }
        return score;
    }

    private static String scoreDifferent(int player1Score, int player2Score) {
        String score;
        int checkResult = player1Score - player2Score;
        if (checkResult==1) score = ADVANTAGE_PLAYER_1;
        else if (checkResult ==-1) score = ADVANTAGE_PLAYER_2;
        else if (checkResult>=2) score = WIN_FOR_PLAYER_1;
        else score = WIN_FOR_PLAYER_2;
        return score;
    }

    private static String draw(int player1Score) {
        String score;
        switch (player1Score)
        {
            case 0:
                score = LOVE_ALL;
                break;
            case 1:
                score = FIFTEEN_ALL;
                break;
            case 2:
                score = THIRTY_ALL;
                break;
            case 3:
                score = FORTY_ALL;
                break;
            default:
                score = DEUCE;
                break;

        }
        return score;
    }
}