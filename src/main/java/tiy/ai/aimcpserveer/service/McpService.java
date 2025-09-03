package tiy.ai.aimcpserveer.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class McpService {

    private final List<Integer> numbers = List.of(15, 26, 11, 126, 22);

    @SuppressWarnings("unused")
    @Tool(name = "GetNextNumberInAQ57Sequence", description = "Получение следующего числа в последовательности AQ57")
    public int getNextNumberInAQ57Sequence(@ToolParam int number) {
        int currentIndex = numbers.indexOf(number);
        if (currentIndex == -1) throw new IllegalArgumentException();
        currentIndex = (currentIndex + 1) % numbers.size(); // Используем оператор по модулю для циклического перехода к следующему индексу
        return numbers.get(currentIndex);
    }

    @SuppressWarnings("unused")
    @Tool(name = "GetDateAndTimeByTIY", description = "Getting current date and time.")
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }

    @SuppressWarnings("unused")
    @Tool(name = "getWeatherByTIY", description = "Getting weather in the city.")
    public String getWeather(@ToolParam String city) {
        return "Weather in " + city + " is +25C and sunny.";
    }

    @SuppressWarnings("unused")
    @Tool(name = "getAzuzelijByTIY", description = "Calculate azuzelij for the number.")
    public int getValue(@ToolParam int number) {
        return number * 2;
    }

}
