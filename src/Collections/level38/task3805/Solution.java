package Collections.level38.task3805;

/*
Улучшения в Java 7 (multiple exceptions)

Перепиши реализации методов класса Solution.
Используй нововведения (multiple exceptions), касающиеся обработки исключений, которые были добавлены в Java 7.

Требования:
•	В конструкторе класса Solution в одном catch блоке должны быть обработаны исключения WrongDataException и ConnectionException.
•	В методе write в одном catch блоке должны быть обработаны исключения WrongDataException и ConnectionException.
•	В методе read в одном catch блоке должны быть обработаны исключения WrongDataException и ConnectionException.
•	В методе disconnect в одном catch блоке должны быть обработаны исключения WrongDataException и ConnectionException.
*/

public class Solution {
    private final Connection connection;

    public Solution() throws SolutionException {
        try {
            connection = new ConnectionMock();
            connection.connect();
        }
        catch (WrongDataException e) {
            throw new SolutionException("WrongDataException: " + e.getMessage());
        }
        catch (ConnectionException e) {
            throw new SolutionException("ConnectionException: " + e.getMessage());
        }
    }

    public void write(Object data) throws SolutionException {
        try {
            connection.write(data);
        }
        catch (WrongDataException e) {
            throw new SolutionException("WrongDataException: " + e.getMessage());
        }
        catch (ConnectionException e) {
            throw new SolutionException("ConnectionException: " + e.getMessage());
        }
    }

    public Object read() throws SolutionException {
        try {
            return connection.read();
        }
        catch (WrongDataException e) {
            throw new SolutionException("WrongDataException: " + e.getMessage());
        }
        catch (ConnectionException e) {
            throw new SolutionException("ConnectionException: " + e.getMessage());
        }
    }

    public void disconnect() throws SolutionException {
        try {
            connection.disconnect();
        }
        catch (WrongDataException e) {
            throw new SolutionException("WrongDataException: " + e.getMessage());
        }
        catch (ConnectionException e) {
            throw new SolutionException("ConnectionException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

    }
}
