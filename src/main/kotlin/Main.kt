import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.requests.GatewayIntent

fun main() {
    Logger().log("info", "Running bot..")
    JDABuilder.createLight(Config.token)
        .setActivity(Activity.watching("for you :)"))
        .enableIntents(GatewayIntent.MESSAGE_CONTENT)
        .addEventListeners(Events(), Commands())
        .build()
}