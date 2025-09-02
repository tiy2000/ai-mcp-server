package tiy.ai.aimcpserveer;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tiy.ai.aimcpserveer.service.McpService;

@SpringBootApplication
public class AiMcpServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiMcpServerApplication.class, args);
    }

    @Bean
    public ToolCallbackProvider toolCallbackProvider(McpService mcpService) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(mcpService)
                .build();
    }
}
