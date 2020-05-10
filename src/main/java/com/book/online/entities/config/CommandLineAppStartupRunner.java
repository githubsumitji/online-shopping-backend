package com.book.online.entities.config;

import com.book.online.entities.Book;
import com.book.online.entities.BookCategory;
import com.book.online.repositories.BookCategoryRepository;
import com.book.online.repositories.BookRepository;
import com.google.common.collect.Sets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private static final String BOOKS = "Books";
    private static final String ELECTRONIC = "Electronics";
    private static final String HOME_AND_FURNITURE = "Home and Furniture";
    private static final String FASHION = "Fashion";

    private static final String NAME_1 = "C programming language";
    private static final String NAME_2 = "C# crash course";
    private static final String NAME_3 = "C++ Programming";
    private static final String NAME_4 = "Cracking coding interview";
    private static final String NAME_5 = "Data structure and algorithm";
    private static final String NAME_6 = "Java";
    private static final String NAME_7 = "Angular 8";
    private static final String NAME_8 = "Python programming";
    private static final String NAME_9 = "Design pattern";
    private static final String NAME_10 = "Learn Rubby and Rail";

    private static final String NAME_11 = "Top";
    private static final String NAME_12 = "Black Sandle";
    private static final String NAME_13 = "Blue Top";
    private static final String NAME_14 = "Lipstick";
    private static final String NAME_15 = "Saree";
    private static final String NAME_16 = "Kid Hairband";
    private static final String NAME_17 = "Purse";
    private static final String NAME_18 = "Kajal";
    private static final String NAME_19 = "Bangle";
    private static final String NAME_20 = "Jewels";

    private static final String NAME_21 = "Dining table";
    private static final String NAME_22 = "Sofa";
    private static final String NAME_23 = "Dressing Mirror";
    private static final String NAME_24 = "Washing machine";
    private static final String NAME_25 = "Refrigerator";
    private static final String NAME_26 = "Television";
    private static final String NAME_27 = "King Bed";
    private static final String NAME_28 = "Godrej Almira";

    private static final String NAME_29 = "Iron";
    private static final String NAME_30 = "Mixer";
    private static final String NAME_31 = "Mobile";
    private static final String NAME_32 = "Mobile Charger";
    private static final String NAME_33 = "Fan";
    private static final String NAME_34 = "Air conditioner";
    private static final String NAME_35 = "Symphony";
    private static final String NAME_36 = "Floor cleaner";


    private static final String SKU_1 = "text-100";
    private static final String SKU_2 = "text-101";
    private static final String SKU_3 = "text-102";
    private static final String SKU_4 = "text-103";
    private static final String SKU_5 = "text-104";
    private static final String SKU_6 = "text-105";
    private static final String SKU_7 = "text-106";
    private static final String SKU_8 = "text-107";
    private static final String SKU_9 = "text-108";
    private static final String SKU_10 = "text-109";


    private static final String SKU_11 = "text-110";
    private static final String SKU_12 = "text-111";
    private static final String SKU_13 = "text-112";
    private static final String SKU_14 = "text-113";
    private static final String SKU_15 = "text-114";
    private static final String SKU_16 = "text-115";
    private static final String SKU_17 = "text-116";
    private static final String SKU_18 = "text-117";
    private static final String SKU_19 = "text-118";
    private static final String SKU_20 = "text-119";

    private static final String SKU_21 = "text-120";
    private static final String SKU_22 = "text-121";
    private static final String SKU_23 = "text-122";
    private static final String SKU_24 = "text-123";
    private static final String SKU_25 = "text-124";
    private static final String SKU_26 = "text-125";
    private static final String SKU_27 = "text-126";
    private static final String SKU_28 = "text-127";

    private static final String SKU_29 = "text-128";
    private static final String SKU_30 = "text-129";
    private static final String SKU_31 = "text-130";
    private static final String SKU_32 = "text-131";
    private static final String SKU_33 = "text-132";
    private static final String SKU_34 = "text-133";
    private static final String SKU_35 = "text-134";
    private static final String SKU_36 = "text-135";

    private static final String DESC_1 = "Black top with comfort and luxory";
    private static final String DESC_2 = "Black sandle with high heel pose";
    private static final String DESC_3 = "Blue top with slip and comfort";
    private static final String DESC_4 = "Lipstick with a glow face and attractive";
    private static final String DESC_5 = "Silk tradition wear for weeding and party wear";
    private static final String DESC_6 = "Kid hair band for sticky cute baby";
    private static final String DESC_7 = "Purse with most attractive and easy carry light weight";
    private static final String DESC_8 = "Black kajal with attractive eye brow";
    private static final String DESC_9 = "Bangle with bangla hand wear sweet";
    private static final String DESC_10 = "Learn Rubby and Rail";

    private static final String DESC_11 = "Learn C programming language";
    private static final String DESC_12 = "Learn C# programming language";
    private static final String DESC_13 = "Learn C++ programming language";
    private static final String DESC_14 = "Learn cracking coding interview";
    private static final String DESC_15 = "Learn Data structure and algorithm";
    private static final String DESC_16 = "Learn Java";
    private static final String DESC_17 = "Learn Angular 8";
    private static final String DESC_18 = "Learn python programming";
    private static final String DESC_19 = "Learn design pattern";
    private static final String DESC_20 = "Learn Rubby and Rail";

    private static final String DESC_21 = "Dining table with six seatter";
    private static final String DESC_22 = "Sofa set with luxory and comfort";
    private static final String DESC_23 = "Dressing mirror with full frame";
    private static final String DESC_24 = "Washing machine fully automated with six sense";
    private static final String DESC_25 = "Refrigerator with cooling ice burg";
    private static final String DESC_26 = "Television with vivo HD siund and high picture quality";
    private static final String DESC_27 = "King size double bed with comfort";
    private static final String DESC_28 = "Godrej almira with hanger and many more boxes";

    private static final String DESC_29 = "Iron Bajaj with one year warranty";
    private static final String DESC_30 = "Mixer grinder with full automated";
    private static final String DESC_31 = "Mobile camera with frontend rare and slip side";
    private static final String DESC_32 = "Samsung mobile charger with 2 year warrenty";
    private static final String DESC_33 = "Cooling fan with with comfort table";
    private static final String DESC_34 = "Air conditioner with system cooling air";
    private static final String DESC_35 = "Symphony air cooler with comfort zone";
    private static final String DESC_36 = "Floor cleaner with 100 cleaning dust";

    private static final String IMAGE_URL_1 = "assets/images/books/text-100.jpg";
    private static final String IMAGE_URL_2 = "assets/images/books/text-101.jpg";
    private static final String IMAGE_URL_3 = "assets/images/books/text-102.jpg";
    private static final String IMAGE_URL_4 = "assets/images/books/text-103.jpg";
    private static final String IMAGE_URL_5 = "assets/images/books/text-104.jpg";
    private static final String IMAGE_URL_6 = "assets/images/books/text-105.jpg";
    private static final String IMAGE_URL_7 = "assets/images/books/text-106.jpg";
    private static final String IMAGE_URL_8 = "assets/images/books/text-107.jpg";
    private static final String IMAGE_URL_9 = "assets/images/books/text-108.jpg";
    private static final String IMAGE_URL_10 = "assets/images/books/text-109.jpg";

    private static final String IMAGE_URL_11 = "assets/images/fashion/fashion-109.jpg";
    private static final String IMAGE_URL_12 = "assets/images/fashion/fashion-110.jpg";
    private static final String IMAGE_URL_13 = "assets/images/fashion/fashion-111.jpg";
    private static final String IMAGE_URL_14 = "assets/images/fashion/fashion-112.jpg";
    private static final String IMAGE_URL_15 = "assets/images/fashion/fashion-113.jpg";
    private static final String IMAGE_URL_16 = "assets/images/fashion/fashion-114.jpg";
    private static final String IMAGE_URL_17 = "assets/images/fashion/fashion-115.jpg";
    private static final String IMAGE_URL_18 = "assets/images/fashion/fashion-116.jpg";
    private static final String IMAGE_URL_19 = "assets/images/fashion/fashion-117.jpg";
    private static final String IMAGE_URL_20 = "assets/images/fashion/fashion-118.jpg";

    private static final String IMAGE_URL_21 = "assets/images/home/home-100.jpg";
    private static final String IMAGE_URL_22 = "assets/images/home/home-101.jpg";
    private static final String IMAGE_URL_23 = "assets/images/home/home-102.jpg";
    private static final String IMAGE_URL_24 = "assets/images/home/home-103.jpg";
    private static final String IMAGE_URL_25 = "assets/images/home/home-104.jpg";
    private static final String IMAGE_URL_26 = "assets/images/home/home-105.jpg";
    private static final String IMAGE_URL_27 = "assets/images/home/home-106.jpg";
    private static final String IMAGE_URL_28 = "assets/images/home/home-107.jpeg";

    private static final String IMAGE_URL_29 = "assets/images/electronic/ec-100.jpg";
    private static final String IMAGE_URL_30 = "assets/images/electronic/ec-101.jpg";
    private static final String IMAGE_URL_31 = "assets/images/electronic/ec-102.jpg";
    private static final String IMAGE_URL_32 = "assets/images/electronic/ec-103.jpg";
    private static final String IMAGE_URL_33 = "assets/images/electronic/ec-104.jpg";
    private static final String IMAGE_URL_34 = "assets/images/electronic/ec-105.jpg";
    private static final String IMAGE_URL_35 = "assets/images/electronic/ec-106.jpg";
    private static final String IMAGE_URL_36 = "assets/images/electronic/ec-107.jpg";


    private static final int UNIT_IN_STOCK_1 = 100;
    private static final int UNIT_IN_STOCK_2 = 200;
    private static final int UNIT_IN_STOCK_3 = 900;
    private static final int UNIT_IN_STOCK_4 = 1000;
    private static final int UNIT_IN_STOCK_5 = 1100;
    private static final int UNIT_IN_STOCK_6 = 400;
    private static final int UNIT_IN_STOCK_7 = 500;
    private static final int UNIT_IN_STOCK_8 = 300;
    private static final int UNIT_IN_STOCK_9 = 600;
    private static final int UNIT_IN_STOCK_10 = 1800;

    private static final int UNIT_IN_STOCK_11 = 100;
    private static final int UNIT_IN_STOCK_12 = 200;
    private static final int UNIT_IN_STOCK_13 = 900;
    private static final int UNIT_IN_STOCK_14 = 1000;
    private static final int UNIT_IN_STOCK_15 = 1100;
    private static final int UNIT_IN_STOCK_16 = 400;
    private static final int UNIT_IN_STOCK_17 = 500;
    private static final int UNIT_IN_STOCK_18 = 300;
    private static final int UNIT_IN_STOCK_19 = 600;
    private static final int UNIT_IN_STOCK_20 = 1800;

    private static final int UNIT_IN_STOCK_21 = 1800;
    private static final int UNIT_IN_STOCK_22 = 1800;
    private static final int UNIT_IN_STOCK_23 = 1800;
    private static final int UNIT_IN_STOCK_24 = 1800;
    private static final int UNIT_IN_STOCK_25 = 1800;
    private static final int UNIT_IN_STOCK_26 = 1800;
    private static final int UNIT_IN_STOCK_27 = 1800;
    private static final int UNIT_IN_STOCK_28 = 1800;

    private static final int UNIT_IN_STOCK_29 = 1800;
    private static final int UNIT_IN_STOCK_30 = 1800;
    private static final int UNIT_IN_STOCK_31 = 1800;
    private static final int UNIT_IN_STOCK_32 = 1800;
    private static final int UNIT_IN_STOCK_33 = 1800;
    private static final int UNIT_IN_STOCK_34 = 1800;
    private static final int UNIT_IN_STOCK_35 = 1800;
    private static final int UNIT_IN_STOCK_36 = 1800;

    private static final BigDecimal UNIT_PRICE_1 = new BigDecimal(1900);
    private static final BigDecimal UNIT_PRICE_2 = new BigDecimal(800);
    private static final BigDecimal UNIT_PRICE_3 = new BigDecimal(600);
    private static final BigDecimal UNIT_PRICE_4 = new BigDecimal(2700);
    private static final BigDecimal UNIT_PRICE_5 = new BigDecimal(356);
    private static final BigDecimal UNIT_PRICE_6 = new BigDecimal(765);
    private static final BigDecimal UNIT_PRICE_7 = new BigDecimal(124);
    private static final BigDecimal UNIT_PRICE_8 = new BigDecimal(8765);
    private static final BigDecimal UNIT_PRICE_9 = new BigDecimal(1100);
    private static final BigDecimal UNIT_PRICE_10 = new BigDecimal(200);

    private static final BigDecimal UNIT_PRICE_11 = new BigDecimal(1900);
    private static final BigDecimal UNIT_PRICE_12 = new BigDecimal(800);
    private static final BigDecimal UNIT_PRICE_13 = new BigDecimal(600);
    private static final BigDecimal UNIT_PRICE_14 = new BigDecimal(2700);
    private static final BigDecimal UNIT_PRICE_15 = new BigDecimal(356);
    private static final BigDecimal UNIT_PRICE_16 = new BigDecimal(765);
    private static final BigDecimal UNIT_PRICE_17 = new BigDecimal(124);
    private static final BigDecimal UNIT_PRICE_18 = new BigDecimal(8765);
    private static final BigDecimal UNIT_PRICE_19 = new BigDecimal(1100);
    private static final BigDecimal UNIT_PRICE_20 = new BigDecimal(200);

    private static final BigDecimal UNIT_PRICE_21 = new BigDecimal(200);
    private static final BigDecimal UNIT_PRICE_22 = new BigDecimal(200);
    private static final BigDecimal UNIT_PRICE_23 = new BigDecimal(200);
    private static final BigDecimal UNIT_PRICE_24 = new BigDecimal(200);
    private static final BigDecimal UNIT_PRICE_25 = new BigDecimal(200);
    private static final BigDecimal UNIT_PRICE_26 = new BigDecimal(200);
    private static final BigDecimal UNIT_PRICE_27 = new BigDecimal(200);
    private static final BigDecimal UNIT_PRICE_28 = new BigDecimal(200);

    private static final BigDecimal UNIT_PRICE_29 = new BigDecimal(200);
    private static final BigDecimal UNIT_PRICE_30 = new BigDecimal(200);
    private static final BigDecimal UNIT_PRICE_31 = new BigDecimal(200);
    private static final BigDecimal UNIT_PRICE_32 = new BigDecimal(200);
    private static final BigDecimal UNIT_PRICE_33 = new BigDecimal(200);
    private static final BigDecimal UNIT_PRICE_34 = new BigDecimal(200);
    private static final BigDecimal UNIT_PRICE_35 = new BigDecimal(200);
    private static final BigDecimal UNIT_PRICE_36 = new BigDecimal(200);


    private BookCategoryRepository bookCategoryRepository;
    private BookRepository bookRepository;
    private static final Set<String> initialCategoryBookName;
    private static final Set<String> initialBookName;


    @Autowired
    public CommandLineAppStartupRunner(BookCategoryRepository bookCategoryRepository,
                                       BookRepository bookRepository){
        this.bookCategoryRepository = bookCategoryRepository;
        this.bookRepository = bookRepository;

    }
    static {
        initialCategoryBookName = new HashSet<>(Arrays.asList(BOOKS,ELECTRONIC,HOME_AND_FURNITURE,FASHION));
        initialBookName = new HashSet<>(Arrays.asList(NAME_1,NAME_2,NAME_3,NAME_4,NAME_5,NAME_6,NAME_7,NAME_8,NAME_9,NAME_10,NAME_11,NAME_12,NAME_13,NAME_14,NAME_15,NAME_16
                ,NAME_17,NAME_18,NAME_19,NAME_20,NAME_21,NAME_22,NAME_23,NAME_24,NAME_25,NAME_26,NAME_27,NAME_28,NAME_29,NAME_30,NAME_31,NAME_32,NAME_33,NAME_34,NAME_35,NAME_36));
    }

    @Override
    public void run(String... args) throws Exception {
        saveBookCategory();
        saveBook();
    }

    private void saveBookCategory(){
        Set<String> persistedBookName = bookCategoryRepository.findAllByCategoryNameIn(initialCategoryBookName).stream()
                .map(x -> x.getCategoryName()).collect(Collectors.toSet());
        Set<String> bookCategoryForCreation = Sets.difference(initialCategoryBookName,persistedBookName);

        for(String category : bookCategoryForCreation){
            BookCategory bookCategory = new BookCategory();
            bookCategory.setCategoryName(category);
            bookCategoryRepository.save(bookCategory);
        }
    }

    public void saveBook() {

        Set<String> persistedBookName = bookRepository.findAllByNameIn(initialBookName).stream()
                .map(x -> x.getName()).collect(Collectors.toSet());

        Set<String> bookForCreation = Sets.difference(initialBookName, persistedBookName);

        if (bookForCreation.size() == 36) {

            List<Book> bookList = new ArrayList<>();
            BookCategory bookCategory = new BookCategory();
            bookCategory.setId(4L);
            Book book1 = new Book(null, SKU_1, NAME_1, DESC_11, UNIT_PRICE_1, IMAGE_URL_1, true, UNIT_IN_STOCK_1, new Date(), new Date(), bookCategory);
            Book book2 = new Book(null, SKU_2, NAME_2, DESC_12, UNIT_PRICE_2, IMAGE_URL_2, true, UNIT_IN_STOCK_2, new Date(), new Date(), bookCategory);
            Book book3 = new Book(null, SKU_3, NAME_3, DESC_13, UNIT_PRICE_3, IMAGE_URL_3, true, UNIT_IN_STOCK_3, new Date(), new Date(), bookCategory);
            Book book4 = new Book(null, SKU_4, NAME_4, DESC_14, UNIT_PRICE_4, IMAGE_URL_4, true, UNIT_IN_STOCK_4, new Date(), new Date(), bookCategory);
            Book book5 = new Book(null, SKU_5, NAME_5, DESC_15, UNIT_PRICE_5, IMAGE_URL_5, true, UNIT_IN_STOCK_5, new Date(), new Date(), bookCategory);
            Book book6 = new Book(null, SKU_6, NAME_6, DESC_16, UNIT_PRICE_6, IMAGE_URL_6, true, UNIT_IN_STOCK_6, new Date(), new Date(), bookCategory);
            Book book7 = new Book(null, SKU_7, NAME_7, DESC_17, UNIT_PRICE_7, IMAGE_URL_7, true, UNIT_IN_STOCK_7, new Date(), new Date(), bookCategory);
            Book book8 = new Book(null, SKU_8, NAME_8, DESC_18, UNIT_PRICE_8, IMAGE_URL_8, true, UNIT_IN_STOCK_8, new Date(), new Date(), bookCategory);
            Book book9 = new Book(null, SKU_9, NAME_9, DESC_19, UNIT_PRICE_9, IMAGE_URL_9, true, UNIT_IN_STOCK_9, new Date(), new Date(), bookCategory);
            Book book10 = new Book(null, SKU_10, NAME_10, DESC_20, UNIT_PRICE_10, IMAGE_URL_10, true, UNIT_IN_STOCK_10, new Date(), new Date(), bookCategory);
            bookList.add(book1);
            bookList.add(book2);
            bookList.add(book3);
            bookList.add(book4);
            bookList.add(book5);
            bookList.add(book6);
            bookList.add(book7);
            bookList.add(book8);
            bookList.add(book9);
            bookList.add(book10);
            bookRepository.saveAll(bookList);

            List<Book> fashionList = new ArrayList<>();
            BookCategory fashionCategory = new BookCategory();
            fashionCategory.setId(2L);
            Book book11 = new Book(null, SKU_11, NAME_11, DESC_1, UNIT_PRICE_11, IMAGE_URL_11, true, UNIT_IN_STOCK_11, new Date(), new Date(), fashionCategory);
            Book book12 = new Book(null, SKU_12, NAME_12, DESC_2, UNIT_PRICE_12, IMAGE_URL_12, true, UNIT_IN_STOCK_12, new Date(), new Date(), fashionCategory);
            Book book13 = new Book(null, SKU_13, NAME_13, DESC_3, UNIT_PRICE_13, IMAGE_URL_13, true, UNIT_IN_STOCK_13, new Date(), new Date(), fashionCategory);
            Book book14 = new Book(null, SKU_14, NAME_14, DESC_4, UNIT_PRICE_14, IMAGE_URL_14, true, UNIT_IN_STOCK_14, new Date(), new Date(), fashionCategory);
            Book book15 = new Book(null, SKU_15, NAME_15, DESC_5, UNIT_PRICE_15, IMAGE_URL_15, true, UNIT_IN_STOCK_15, new Date(), new Date(), fashionCategory);
            Book book16 = new Book(null, SKU_16, NAME_16, DESC_6, UNIT_PRICE_16, IMAGE_URL_16, true, UNIT_IN_STOCK_16, new Date(), new Date(), fashionCategory);
            Book book17 = new Book(null, SKU_17, NAME_17, DESC_7, UNIT_PRICE_17, IMAGE_URL_17, true, UNIT_IN_STOCK_17, new Date(), new Date(), fashionCategory);
            Book book18 = new Book(null, SKU_18, NAME_18, DESC_8, UNIT_PRICE_18, IMAGE_URL_18, true, UNIT_IN_STOCK_18, new Date(), new Date(), fashionCategory);
            Book book19 = new Book(null, SKU_19, NAME_19, DESC_9, UNIT_PRICE_19, IMAGE_URL_19, true, UNIT_IN_STOCK_19, new Date(), new Date(), fashionCategory);
            Book book20 = new Book(null, SKU_20, NAME_20, DESC_10, UNIT_PRICE_20, IMAGE_URL_20, true, UNIT_IN_STOCK_20, new Date(), new Date(), fashionCategory);
            fashionList.add(book11);
            fashionList.add(book12);
            fashionList.add(book13);
            fashionList.add(book14);
            fashionList.add(book15);
            fashionList.add(book16);
            fashionList.add(book17);
            fashionList.add(book18);
            fashionList.add(book19);
            fashionList.add(book20);
            bookRepository.saveAll(fashionList);

            List<Book> homeList = new ArrayList<>();
            BookCategory homeCategory = new BookCategory();
            homeCategory.setId(1L);
            Book book21 = new Book(null, SKU_21, NAME_21, DESC_21, UNIT_PRICE_21, IMAGE_URL_21, true, UNIT_IN_STOCK_21, new Date(), new Date(), homeCategory);
            Book book22 = new Book(null, SKU_22, NAME_22, DESC_22, UNIT_PRICE_22, IMAGE_URL_22, true, UNIT_IN_STOCK_22, new Date(), new Date(), homeCategory);
            Book book23 = new Book(null, SKU_23, NAME_23, DESC_23, UNIT_PRICE_23, IMAGE_URL_23, true, UNIT_IN_STOCK_23, new Date(), new Date(), homeCategory);
            Book book24 = new Book(null, SKU_24, NAME_24, DESC_24, UNIT_PRICE_24, IMAGE_URL_24, true, UNIT_IN_STOCK_24, new Date(), new Date(), homeCategory);
            Book book25 = new Book(null, SKU_25, NAME_25, DESC_25, UNIT_PRICE_25, IMAGE_URL_25, true, UNIT_IN_STOCK_25, new Date(), new Date(), homeCategory);
            Book book26 = new Book(null, SKU_26, NAME_26, DESC_26, UNIT_PRICE_26, IMAGE_URL_26, true, UNIT_IN_STOCK_26, new Date(), new Date(), homeCategory);
            Book book27 = new Book(null, SKU_27, NAME_27, DESC_27, UNIT_PRICE_27, IMAGE_URL_27, true, UNIT_IN_STOCK_27, new Date(), new Date(), homeCategory);
            Book book28 = new Book(null, SKU_28, NAME_28, DESC_28, UNIT_PRICE_28, IMAGE_URL_28, true, UNIT_IN_STOCK_28, new Date(), new Date(), homeCategory);

            homeList.add(book21);
            homeList.add(book22);
            homeList.add(book23);
            homeList.add(book24);
            homeList.add(book25);
            homeList.add(book26);
            homeList.add(book27);
            homeList.add(book28);

            bookRepository.saveAll(homeList);

            List<Book> electronicList = new ArrayList<>();
            BookCategory electronicCategory = new BookCategory();
            electronicCategory.setId(3L);
            Book book29 = new Book(null, SKU_29, NAME_29, DESC_29, UNIT_PRICE_29, IMAGE_URL_29, true, UNIT_IN_STOCK_29, new Date(), new Date(), electronicCategory);
            Book book30 = new Book(null, SKU_30, NAME_30, DESC_30, UNIT_PRICE_30, IMAGE_URL_30, true, UNIT_IN_STOCK_30, new Date(), new Date(), electronicCategory);
            Book book31 = new Book(null, SKU_31, NAME_31, DESC_31, UNIT_PRICE_31, IMAGE_URL_31, true, UNIT_IN_STOCK_31, new Date(), new Date(), electronicCategory);
            Book book32 = new Book(null, SKU_32, NAME_32, DESC_32, UNIT_PRICE_32, IMAGE_URL_32, true, UNIT_IN_STOCK_32, new Date(), new Date(), electronicCategory);
            Book book33 = new Book(null, SKU_33, NAME_33, DESC_33, UNIT_PRICE_33, IMAGE_URL_33, true, UNIT_IN_STOCK_33, new Date(), new Date(), electronicCategory);
            Book book34 = new Book(null, SKU_34, NAME_34, DESC_34, UNIT_PRICE_34, IMAGE_URL_34, true, UNIT_IN_STOCK_34, new Date(), new Date(), electronicCategory);
            Book book35 = new Book(null, SKU_35, NAME_35, DESC_35, UNIT_PRICE_35, IMAGE_URL_35, true, UNIT_IN_STOCK_35, new Date(), new Date(), electronicCategory);
            Book book36 = new Book(null, SKU_36, NAME_36, DESC_36, UNIT_PRICE_36, IMAGE_URL_36, true, UNIT_IN_STOCK_36, new Date(), new Date(), electronicCategory);

            electronicList.add(book29);
            electronicList.add(book30);
            electronicList.add(book31);
            electronicList.add(book32);
            electronicList.add(book33);
            electronicList.add(book34);
            electronicList.add(book35);
            electronicList.add(book36);

            bookRepository.saveAll(electronicList);
        }
    }
}
