import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.js.JsExport


@OptIn(ExperimentalJsExport::class)
@JsExport
object Lib2 {

    fun runInBackground() {
        println("Starting lib2 coroutine")
        GlobalScope.launch {
            println("Output of lib2")
        }
    }
}