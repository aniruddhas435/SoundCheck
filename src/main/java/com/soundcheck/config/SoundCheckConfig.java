package com.soundcheck.config;

import com.soundcheck.player.Player;
import com.soundcheck.player.Sargam;
import com.soundcheck.player.transformers.comb2seq.CombinatorToSequence;
import com.soundcheck.player.transformers.comb2seq.StrategicSequencer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.soundcheck")
public class SoundCheckConfig {
//    @Bean
//    public CombinatorToSequence getCombinatorToSequence() {
//        return new StrategicSequencer();
//    }
}
