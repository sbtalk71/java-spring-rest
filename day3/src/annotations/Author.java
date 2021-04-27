package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface Author {

	String firstName();
	String lastName();
}


class Book{
	
	
}

class Library{
	
	@Author(firstName = "Shantanu",lastName = "Banerjee")
	Book book= new Book();
}