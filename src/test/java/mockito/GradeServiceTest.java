package mockito;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import stub.GradeService;
import stub.GradeSystem;
import stub.GradeSystemStub;

import java.util.Arrays;

import static org.mockito.Mockito.when;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    GradeService gradeService;
    GradeSystem gradeSystem;
    @BeforeEach
    public void setUp(){
        gradeSystem= Mockito.mock(GradeSystem.class);
        gradeService = new GradeService(gradeSystem);
   }
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(gradeSystem.gradesFor(10L)).thenReturn(Arrays.asList(90.0, 90.0, 90.0));
       Double result = gradeService.calculateAverageGrades(10L);
       Assertions.assertEquals(90.0,result);
    }
}
