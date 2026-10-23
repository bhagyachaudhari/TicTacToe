package Factories;

import Models.BotDifficultyLevel;
import Strategies.BotPlayingStrategy;
import Strategies.EasyPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficultyLevel){
//        if(difficultyLevel == BotDifficultyLevel.EASY)
        return new EasyPlayingStrategy();
    }
}
