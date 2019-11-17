package Collections.c33.task3309;

/*
Комментарий внутри xml

Реализовать метод toXmlWithComment, который должен возвращать строку - xml представление объекта obj.
В строке перед каждым тегом tagName должен быть вставлен комментарий comment.
Сериализация obj в xml может содержать CDATA с искомым тегом. Перед ним вставлять комментарий не нужно.

Пример вызова:
toXmlWithComment(firstSecondObject, "second", "it's a comment")

Пример результата:
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<first>
<!--it's a comment-->
<second>some string</second>
<!--it's a comment-->
<second>some string</second>
<!--it's a comment-->
<second><![CDATA[need CDATA because of < and >]]></second>
<!--it's a comment-->
<second/>
</first>

Требования:
•	Метод toXmlWithComment должен быть статическим.
•	Метод toXmlWithComment должен быть публичным.
•	Если во входящем xml отсутствует искомый тег, то добавлять комментарии не нужно.
•	Количество комментариев вставленных в xml должно быть равно количеству тегов tagName.
•	Метод toXmlWithComment должен возвращать xml в виде строки преобразованной в соответствии с условием задачи.
*/

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.StringWriter;

public class Solution {
    public static String toXmlWithComment(Object obj, String tagName, String comment) {
        String result = null;
        try(StringWriter writer = new StringWriter()) {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
            marshaller.marshal(obj,writer);
            String str = writer.toString();

            if (str.contains(tagName))
                result = str.replace("<" + tagName + ">", "<!--" + comment + "-->\n" + "<" + tagName + ">");
            else
                result = str;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
