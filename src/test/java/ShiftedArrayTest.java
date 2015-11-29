import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by backtodeath on 29.11.2015.
 **/
@RunWith(MockitoJUnitRunner.class)
public class ShiftedArrayTest {
    private static final String INPUT_ARRAY_SIZE = "Please enter the size of array: ";
    private static final String INPUT_SHIFTING_NUMBER = "Please enter the number for shifting: ";

    @Spy
    ShiftedArray shiftedArray;

    @Test
    public void getShiftedArrayWithAllWrongCases(){
        Mockito.when(shiftedArray.getEnteredNumber(INPUT_ARRAY_SIZE)).thenReturn(-5);
        Mockito.when(shiftedArray.getEnteredNumber(INPUT_SHIFTING_NUMBER)).thenReturn(-3);
        int result[] = shiftedArray.getShiftedArray();
        Assertions.assertThat(result).contains(2);
    }
}