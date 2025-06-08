package ac.za.tut.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-14T17:21:04")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, Date> creationTime;
    public static volatile SingularAttribute<Book, String> author;
    public static volatile SingularAttribute<Book, String> genre;
    public static volatile SingularAttribute<Book, Long> id;
    public static volatile SingularAttribute<Book, String> availability;
    public static volatile SingularAttribute<Book, String> title;
    public static volatile SingularAttribute<Book, Date> pubDate;

}