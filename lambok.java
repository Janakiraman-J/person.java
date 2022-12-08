import lombok.*;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
class BookUsingLombok {
private int bookid;
private String bookname;
private String author;
private long price; }
import java.util.HashSet;
class BookHashSetWithLombok{
public static void main(String arg[]){
HashSet<BookUsingLombok> hs=new HashSet<BookUsingLombok>();
BookUsingLombok b1=new BookUsingLombok(11,"Java","Joju",600);
BookUsingLombok b2=new BookUsingLombok(22,"Python","Raju",400);
BookUsingLombok b3=new BookUsingLombok(33,"DevOps","Anita",270);
hs.add(b1); hs.add(b2); hs.add(b3);
//System.out.println(hs);
hs.forEach(System.out::println);}}