package builder;

public class Runner {
    public static void main(String[] args) {
//        for creating complex objects in steps
//        with optional parameters in constructor
//        returned object can be made immutable
//        avoids use of constructor overloading


        URLBuilder.Builder  builder= new URLBuilder.Builder();
        builder.protocol("https://").hostname("somewebsite.com").port(3000);
        URLBuilder url=builder.build();
        System.out.println(url);

        URLBuilder.Builder  builder2= new URLBuilder.Builder();
        builder2.protocol("https://").hostname("somewebsite.com").pathParam("customers");
        URLBuilder url2=builder2.build();
        System.out.println(url2);
    }
}
