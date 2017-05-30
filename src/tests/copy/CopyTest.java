package copy;

import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

public class CopyTest
{
    
    @Test
    public void testReadsInputWhenAvailable()
    {
        Reader reader = Mockito.mock(Reader.class);
        Writer writer = Mockito.mock(Writer.class);

        BDDMockito.given(reader.hasNext()).willReturn(true);

        Copy copy = new Copy(reader, writer);
        copy.readCharsAndWrite();

        Mockito.verify(reader, Mockito.times(1)).get();
    }

    @Test
    public void testCopiesInput()
    {
        Reader reader = Mockito.mock(Reader.class);
        Writer writer = Mockito.mock(Writer.class);

        BDDMockito.given(reader.hasNext()).willReturn(true);
        BDDMockito.given(reader.get()).willReturn("H");

        Copy copy = new Copy(reader, writer);
        copy.readCharsAndWrite();

        Mockito.verify(writer, Mockito.times(1)).print("H");
    }
}