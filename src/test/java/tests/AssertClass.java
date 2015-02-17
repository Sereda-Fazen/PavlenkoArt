package tests;

import org.junit.Assert;

import static org.hamcrest.Matchers.is;

/**
 * Created by Dima on 17.02.2015.
 */
public class AssertClass extends BeforeClass {

    public void assertTitle() {
        Assert.assertThat(userInfo.getTitle(), is("Тест упал, товар небыл куплен"));
    }


}
