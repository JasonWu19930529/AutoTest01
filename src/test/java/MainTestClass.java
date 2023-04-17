import com.example.autotest01.AutoTest01Application;
import com.example.autotest01.commonTool.CommonToolClass;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.annotation.Resource;

@SpringBootTest(classes = AutoTest01Application.class)
public class MainTestClass extends AbstractTestNGSpringContextTests {

    @Resource
    CommonToolClass commonToolClass;

    @Test(testName = "第一个自动化测试用例")
    public void testMethod0q(){
        assert 10 == commonToolClass.returnNum();
    }


}
