import com.google.gson.Gson
import models.CatFact
import org.junit.jupiter.api.*
import org.testng.Assert

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
@Tag("smoke")

class TestApi : TestApiBase() {

    //If I needed to initialize something before the test begins
    @BeforeAll
    @Throws(Exception::class)
    fun initAll() {
        this.initializeApi()
    }

    private val catUrl = "https://catfact.ninja/fact"


    @Test
    @Order(1)
    fun getRandomCatFact() {
        val responseBody = httpWrapper.getResponseBody(catUrl)
        //print("cat fact" + responseBody)
        val catFactObject: CatFact = Gson().fromJson(responseBody, CatFact::class.java)
        //println("cat fact object" + catFactObject)

        Assert.assertTrue(catFactObject.fact.isNotEmpty(), "Cat Fact fact object is empty")
        Assertions.assertTrue(catFactObject.length > 0, "Cat Fact length is less than 0")
    }
}
