package casea;

import com.zhoufy.service.IService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IDEA by ChouFy on 2019/7/30.
 *
 * @author Zhoufy
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/META-INF/applicationContext.xml")
public class TestCase {


    @Autowired
    private IService iService;


    @Test
    public void Test() {
        System.out.println(iService);
        iService.out();
    }
}
