package Collections.level40.task4005;

import java.net.ServerSocket;
import java.net.Socket;

/*
Сокетный сервер и клиент

Есть сервер, он принимает входящие сообщения от клиентов и отвечает им echo.
Есть клиенты, они считывают сообщения с клавиатуры и отправляют их серверу.
Программа запускается, но не работает.
Разберись в чем проблема, внеси минимальные изменения в код, чтобы все заработало.

Требования:
•	Класс Client не изменяй.
•	Класс Server не изменяй.
•	Внеси необходимые изменения в класс Connection.
•	Поля в классе Connection не изменяй.
*/

class Server {

    public static void main(String[] args) {
        int port = 4444;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                Socket socket = serverSocket.accept();
                new Handler(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (Connection connection = new Connection(socket)) {
                while (true) {
                    String message = connection.receive();

                    if (message.equals("exit"))
                        break;

                    System.out.println(message);

                    connection.send("Echo: " + message);
                }
            } catch (Exception e) {
            }
        }

    }
}
