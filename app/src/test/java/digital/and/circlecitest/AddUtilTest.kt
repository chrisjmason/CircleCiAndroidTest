package digital.and.circlecitest

import com.nhaarman.mockito_kotlin.verify
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

/**
 * Created by cmason on 02/03/2018.
 */

@RunWith(MockitoJUnitRunner::class)
class AddUtilTest{
    @Test
    fun addsNumbersCorrectly(){
        var addUtil = AddUtil()
        assertEquals(addUtil.addNumbers(3, 8), 10)
    }
}