import wrapper.HttpWrapper

abstract class TestApiBase {
    lateinit var httpWrapper: HttpWrapper

    fun initializeApi() {
        httpWrapper = HttpWrapper()
    }
}