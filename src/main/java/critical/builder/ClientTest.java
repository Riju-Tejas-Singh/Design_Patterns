package critical.builder;

public class ClientTest {

    public static void main(String[] args) {

        User user = new User.Builder("Riju", "riju@gmail.com")
                .age(24)
                .profession("Software Engineer")
                .salary(500000)
                .build();

        user.display();
    }
    //    Very less salary
    //    Name       : Riju
    //    Email      : riju@gmail.com
    //    Age        : 24
    //    Phone      : Not Provided
    //    Profession : Software Engineer
    //    Married    : false
    //    Salary     : 500000.0
}
