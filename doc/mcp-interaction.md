# MCP Client-Server Interaction

Official MCP [specification](https://modelcontextprotocol.io/docs/getting-started/intro)

Based on [JSON-RPC](https://ru.wikipedia.org/wiki/JSON-RPC)

List of MCP [SDKs](https://github.com/modelcontextprotocol/servers?tab=readme-ov-file)

## Phase 1: Initialization

### Client -> Server

```json
{
  "jsonrpc": "2.0",
  "id": 1,
  "method": "initialize",
  "params": {
    "clientInfo": {
      "name": "client-name",
      "version": "1.0.0"
    },
    "protocolVersion": "2024-11-05"
  }
}
```

### Server -> Client

```json

{
  "jsonrpc": "2.0",
  "id": 1,
  "result": {
    "protocolVersion": "2024-11-05",
    "capabilities": {
      "tools": {},
      "resources": {},
      "prompts": {}
    },
    "serverInfo": {
      "name": "server-name",
      "version": "1.0.0"
    }
  }
}
```

## Phase 2: Request list of tools

### Client -> Server

```json
{
  "jsonrpc": "2.0",
  "id": 2,
  "method": "tools/list",
  "params": {}
}
```

### Server -> Client

```json
{
  "jsonrpc": "2.0",
  "id": 2,
  "result": {
    "tools": [
      {
        "name": "search_web",
        "description": "Search the web",
        "inputSchema": {
          "type": "object",
          "properties": {
            "query": {
              "type": "string"
            }
          }
        }
      }
    ]
  }
}
```

## Phase 3: Tool calling

### Client -> Server

```json
{
  "jsonrpc": "2.0",
  "id": 3,
  "method": "tools/call",
  "params": {
    "name": "search_web",
    "arguments": {
      "query": "MCP protocol"
    }
  }
}
```

### Server -> Client

```json
{
  "jsonrpc": "2.0",
  "id": 3,
  "result": {
    "content": [
      {
        "type": "text",
        "text": "Search results for MCP protocol..."
      }
    ]
  }
}
```
