package com.soundcheck.config;

import com.soundcheck.player.Player;
import com.soundcheck.player.Sargam;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.soundcheck")
public class SoundCheckConfig {
//    @Bean
//    public Sargam getSargam(double basefrequency) {
//        return new Sargam(basefrequency);
//    }
//
//    @Bean
//    public Player getPlayer(double baseFrequency) {
//        return new Player(baseFrequency);
//    }
}
