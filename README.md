# Simple MCP Server

This is just an example of a dummy MCP Server implementation that can be used for education only.

The server is written in Java and uses Spring Boot.

It has two transports:

- STDIO
- HTTP/SSE

## Prerequisites

- Java 17+
- MCP client (for example, Cursor IDE)

## Getting the project

```
cd <your-projects-root>
git clone https://github.com/tiy2000/ai-mcp-server
cd ai-mcp-server
```

## Using CLI MCP Server via STDIO Transport

### Building the project

```
mvn clean package
```

### Customize The MCP Client

```json
{
  "mcpServers": {
    "mcp-server-stdio": {
      "command": "java",
      "args": [
        "-Dspring.profiles.active=stdio",
        "-jar",
        "<your-projects-root>/ai-mcp-serveer/target/ai-mcp-serveer-0.0.1-SNAPSHOT.jar"
      ]
    }
  }
}
```

## Using Remote MCP Server via HTTP/SSE Transport

### Running MCP Server

```
mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Dspring.profiles.active=sse"
```

### Customize The MCP Client

```json
{
  "mcpServers": {
    "mcp-server-http-sse": {
      "url": "http://localhost:8080/sse"
    }
  }
}
```
## Additional Information

- [MCP client-server interaction](doc/mcp-interaction.md)
- [MCP client settings](doc/mcp-client-settings.md)