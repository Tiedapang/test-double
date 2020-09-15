package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    GradeService gradeService;
    @BeforeEach
    public void setUp(){
    GradeSystemStub gradeSystemStub= new GradeSystemStub();
    gradeService = new GradeService(gradeSystemStub);
   }
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {

       Double result = gradeService.calculateAverageGrades(10L);
       Assertions.assertEquals(90.0,result);
    }
}
