# MCP Client Settings

MCP client: **[Cursor IDE](https://docs.cursor.com/en/welcome).**

[Official list](https://docs.cursor.com/en/tools/mcp) of MCP Servers for Cursor IDE.

## CLI Server: STDIO Transport

### Using A Bash Script

```json
{
  "mcpServers": {
    "server-name": {
      "command": "/bin/bash",
      "args": [
        "path/to/script.sh"
      ]
    }
  }
}
```

### Using JAR-file

```json
{
  "mcpServers": {
    "server-name": {
      "command": "java",
      "args": [
        "-jar",
        "/path/to/jar-file.jar"
      ]
    }
  }
}
```

### For The Current Project

```json
{
  "mcpServers": {
    "tiy-mcp-server-1": {
      "command": "java",
      "args": [
        "-Dspring.profiles.active=stdio",
        "-jar",
        "/Users/tiy/IdeaProjects/ai-mcp-serveer/target/ai-mcp-serveer-0.0.1-SNAPSHOT.jar"
      ]
    }
  }
}
```

## Remote Server: HTTP/SSE Transport

### General Example

```json
{
  "mcpServers": {
    "tiy-mcp-server-web-sse": {
      "url": "http://url/endpoint",
      "headers": {
        "API_KEY": "value"
      }
    }
  }
}
```

### For The Current Project

```json
{
  "mcpServers": {
    "tiy-mcp-server-web-sse": {
      "url": "http://localhost:8080/sse"
    }
  }
}
```
