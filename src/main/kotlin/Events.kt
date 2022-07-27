import net.dv8tion.jda.api.events.ReadyEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class Events : ListenerAdapter() {
    override fun onReady(event: ReadyEvent) {
        Logger().log("info", "Bot is ready!")
    }
}