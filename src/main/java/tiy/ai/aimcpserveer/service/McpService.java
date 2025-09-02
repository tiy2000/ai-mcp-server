package tiy.ai.aimcpserveer.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class McpService {

    @Tool(name = "GetDateAndTimeByTIY", description = "Getting current date and time.")
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }

    @Tool(name = "getWeatherByTIY", description = "Getting weather in the city.")
    public String getWeather(@ToolParam String city) {
        return "Weather in " + city + " is +25C and sunny.";
    }

    @Tool(name = "getAzuzelijByTIY", description = "Calculate azuzelij for the number.")
    public int getValue(@ToolParam int number) {
        return number * 2;
    }

}
