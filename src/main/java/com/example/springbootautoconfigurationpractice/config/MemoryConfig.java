package com.example.springbootautoconfigurationpractice.config;

import com.example.memory.MemoryCondition;
import com.example.memory.MemoryController;
import com.example.memory.MemoryFinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@Conditional(MemoryCondition.class)
public class MemoryConfig {

    @Bean
    public MemoryController memoryController() {
        return new MemoryController(memoryFinder());
    }

    @Bean
    public MemoryFinder memoryFinder() {
        return new MemoryFinder();
    }
}
