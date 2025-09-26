import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.callbackQuery
import com.github.kotlintelegrambot.dispatcher.command
import com.github.kotlintelegrambot.dispatcher.message
import com.github.kotlintelegrambot.dispatcher.text
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.InlineKeyboardMarkup
import com.github.kotlintelegrambot.entities.keyboard.InlineKeyboardButton
import java.io.File
fun main() {
    val bot = bot {
        token = "..."
        dispatch {
            command("start") {
             val mainkeyboard = InlineKeyboardMarkup.create(
                 listOf(
                     InlineKeyboardButton.CallbackData("\uD83D\uDCAA\uD83C\uDFFCТренировка на турничках", "turniki")
                 ),
                 listOf(
                     InlineKeyboardButton.CallbackData("\uD83D\uDCAA\uD83C\uDFFCБодибилдинг", "body"),
                     InlineKeyboardButton.CallbackData("\uD83D\uDCAA\uD83C\uDFFCПауэрлифтинг", "payer")
                 ),
                 listOf(
                     InlineKeyboardButton.CallbackData("\uD83D\uDC69\uD83C\uDFFB\u200D\uD83D\uDCBBАвторы", "avtors"),
                     InlineKeyboardButton.CallbackData("\uD83D\uDCDAГайды", "gudies")
                 )
             )
                bot.sendMessage(
                    chatId = ChatId.fromId(message.chat.id),
                    text = "⚡\uFE0F Добро пожаловать в бота, в котором вы можете получить тренировку для себя и не платить ни копейки!",
                    replyMarkup = mainkeyboard
                )
            }
            callbackQuery("body"){
                val ChatId112 = callbackQuery.message?.chat?.id ?: return@callbackQuery
                val bodykeyboard = InlineKeyboardMarkup.create(
                    listOf(
                        InlineKeyboardButton.CallbackData("4 дневный сплит", "4split"),
                        InlineKeyboardButton.CallbackData("3 дневный сплит", "3sp1")
                    )
                )
                bot.sendMessage(
                    chatId = ChatId.fromId(ChatId112),
                    text = "⚡Ты выбрал бодибилдинг вот варианты",
                    replyMarkup = bodykeyboard

                )
            }
            callbackQuery("4split"){
                val chatId113 = callbackQuery.message?.chat?.id ?: return@callbackQuery
                bot.sendDocument(
                    chatId = ChatId.fromId(chatId113),
                    document = File("4split.pdf"),
                    caption = "⚡Вот твоя программа приятной тренировки!"
                )
            }
            callbackQuery("3sp1"){
                val chatid114 = callbackQuery.message?.chat?.id ?: return@callbackQuery
                bot.sendDocument(
                    chatId = ChatId.fromId(chatid114),
                    document = File("3slpit.pdf"),
                    caption = "⚡Вот твоя программа тренировок удачной тренировки!"
                )
            }
            callbackQuery("payer"){
                val chatid111 = callbackQuery.message?.chat?.id ?: return@callbackQuery
                val payerkeyboard = InlineKeyboardMarkup.create(
                    listOf(
                        InlineKeyboardButton.CallbackData("4 дневный сплит пауэрлифтинг", "split4payr"),
                        InlineKeyboardButton.CallbackData("3 дневный сплит пауэрлифтинг", "3splitry")
                    )
                )
                bot.sendMessage(
                    chatId = ChatId.fromId(chatid111),
                    text = "⚡Ты выбрал пауэрлифтинг вот варианты",
                    replyMarkup = payerkeyboard
                )
            }
            callbackQuery("split4payr"){
                val chatid11132 = callbackQuery.message?.chat?.id ?: return@callbackQuery
                bot.sendDocument(
                    chatId = ChatId.fromId(chatid11132),
                    document = File("power4split.pdf"),
                    caption = "⚡Держи программу тренировок сплит 4 дня в неделю. С ней ты пожмешь 200 кг! Приятной тренировки"               )
            }
            callbackQuery("3splitry"){
                val chatidas = callbackQuery.message?.chat?.id ?: return@callbackQuery
                bot.sendDocument(
                    chatId = ChatId.fromId(chatidas),
                    document = File("power3split.pdf"),
                    caption = "⚡Держи программу тренировок сплит 3 дня в неделю. С ней ты пожмешь 200 кг! Приятной тренировки"
                )
            }
            callbackQuery("turniki"){
                val chatidd = callbackQuery.message?.chat?.id ?: return@callbackQuery
                bot.sendDocument(
                    chatId = ChatId.fromId(chatidd),
                    document = File("turnikiprog.pdf"),
                    caption = "⚡Держи программу тренировок на турничке. Приятной тренировки!"
                )
            }
            callbackQuery("gudies"){
                val chattw = callbackQuery.message?.chat?.id ?: return@callbackQuery
                val gudieskeyboard = InlineKeyboardMarkup.create(
                     listOf(
                         InlineKeyboardButton.Url("\uD83D\uDCD4Гайд на рекомпозицию", "https://telegra.ph/Gajd-na-rekompoziciyu-09-25"),
                     ),
                    listOf(
                        InlineKeyboardButton.Url("\uD83D\uDCD8Гайд на набор массы", "https://telegra.ph/Gajd-na-nabor-massy-09-25"),
                    ),
                    listOf(
                        InlineKeyboardButton.Url("\uD83D\uDCD9Гайд на разминку", "https://telegra.ph/Gajd-na-razminku-09-25"),
                    ),listOf(
                    InlineKeyboardButton.Url("\uD83D\uDCD7Гайд чтобы не травмироваться", "https://telegra.ph/Gajd-chtoby-ne-travmirovatsya-09-25"),
                    ),
                    listOf(
                        InlineKeyboardButton.Url("\uD83D\uDCD5Гайд на сушку", "https://telegra.ph/Gajd-na-sushku-09-25"),
                    )
                )
                bot.sendMessage(
                    chatId = ChatId.fromId(chattw),
                    text = "\uD83D\uDCDAВот все гайды",
                    replyMarkup = gudieskeyboard
                )
            }
            callbackQuery("avtors"){
                val da = callbackQuery.message?.chat?.id ?: return@callbackQuery
                val avtorskeyboard = InlineKeyboardMarkup.create(
                    listOf(
                        InlineKeyboardButton.Url("Автор бота @VizoraX", "https://t.me/+fL84kurozLk5MWY0")
                    )
                )
                bot.sendMessage(
                    chatId = ChatId.fromId(da),
                    text = "У этого бота всего лишь 1 автор(",
                    replyMarkup = avtorskeyboard
                )
            }
        }
    }
    bot.startPolling()
    println("Бот работает")
}
