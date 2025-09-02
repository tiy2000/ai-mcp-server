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
