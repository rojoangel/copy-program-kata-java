package copy;

public class Copy
{

    private final Reader reader;
    private final Writer writer;

    public Copy(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void readCharsAndWrite() {
        if (reader.hasNext()) {
            String input = reader.get();
            writer.print(input);
        }
    }
}
