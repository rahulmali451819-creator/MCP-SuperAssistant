package com.aistudio.mcpsuperassistant.core

data class Tool(
    val name: String,
    val description: String,
    val inputSchema: Map<String, Any>
)

class McpClient {
    // Porting MCP logic
    fun connect(url: String) {
        // Implementation
    }
}
