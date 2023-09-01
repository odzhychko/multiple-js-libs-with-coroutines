import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.js.JsExport

@OptIn(ExperimentalJsExport::class)
@JsExport
object Lib1 {
    fun runInBackground() {
        println("Starting lib1 coroutine")
        GlobalScope.launch {
            println("Output of lib1")
        }
    }
}