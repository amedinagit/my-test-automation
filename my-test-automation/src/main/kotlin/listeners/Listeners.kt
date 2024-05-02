package listeners

import org.testng.ITestListener
import org.testng.ITestResult

class Listeners : ITestListener {

    override fun onTestStart(result: ITestResult?) {
        super.onTestStart(result)
        println("Begin Test!")
    }

    override fun onTestFailure(result: ITestResult?) {
        super.onTestFailure(result)
        // can implement retry here or use gradle retry functionality
    }

}