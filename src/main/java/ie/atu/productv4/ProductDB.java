package ie.atu.productv4;

public class ProductDB {
    public static Product getProduct(String productCode) {

        Product myProduct = null;
        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }

        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct = myBook;
        }

        if (productCode.equalsIgnoreCase("Pink")){
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(8.00);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Columbia Group");
            myProduct = myMusic;
        }
        else if (productCode.equalsIgnoreCase("Thriller")){
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Thriller");
            myMusic.setPrice(10.00);
            myMusic.setArtist("Michael Jackson");
            myMusic.setLabel("Epic Records");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("Avicii")){
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("The Nights");
            myMusic.setPrice(9.00);
            myMusic.setArtist("Avicii");
            myMusic.setLabel("Ultra Records");
            myProduct = myMusic;
        }

        if (productCode.equalsIgnoreCase("kdl43")){
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            myTV.setPrice(819.00);
            myTV.setManufacture("Sony");
            myTV.setSize("55");
            myProduct = myTV;
        } else if (productCode.equalsIgnoreCase("qled")){
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Samsung QLED Smart TV");
            myTV.setPrice(999.00);
            myTV.setManufacture("Samsung");
            myTV.setSize("65");
            myProduct = myTV;
        } else if (productCode.equalsIgnoreCase("lg")){
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("LG OLED TV");
            myTV.setPrice(1100.00);
            myTV.setManufacture("LG");
            myTV.setSize("65");
            myProduct = myTV;
        }

        return myProduct;

    }
}
