package mockito;


import mock.DoorPanel;
import mock.SecurityCenter;
import mock.mockDoorPanel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */
    SecurityCenter securityCenter;
    DoorPanel doorPanel;
    @BeforeEach
    public void setUp(){
        doorPanel = Mockito.mock(DoorPanel.class);
        securityCenter = new SecurityCenter(doorPanel);
    }
    @Test
    public void shouldVerifyDoorIsClosed(){
        securityCenter.switchOn();
    }
}
