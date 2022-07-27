import net.dv8tion.jda.api.EmbedBuilder

class NewEmbed(type: String, desc: String) : EmbedBuilder() {
    init {
        when (type) {
            "info" -> this.setTitle("📔 | Information")
            "success" -> this.setTitle("✅ | Success!")
            "error" -> this.setTitle("❌ | Error!")
        }
        this.setDescription(desc)
        this.setFooter("Hello!")
    }
}