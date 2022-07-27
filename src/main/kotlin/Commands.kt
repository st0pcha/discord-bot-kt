import Config.prefix
import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class Commands : ListenerAdapter() {
    override fun onMessageReceived(event: MessageReceivedEvent) {
        if (event.author.isBot) return

        val msg = event.message
        val cmd = msg.contentRaw

        if (cmd == prefix + "hello") {
            msg.reply("Hi!").queue()
        } else if (cmd == prefix + "embed") {
            val embed = EmbedBuilder()
                .setTitle("Embed works!")
                .setDescription("Hello!")
                .setThumbnail(msg.author.avatarUrl)
                .build()
            msg.replyEmbeds(embed).queue()
        }
    }
}