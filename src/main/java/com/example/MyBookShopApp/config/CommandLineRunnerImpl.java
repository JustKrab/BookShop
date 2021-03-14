//package com.example.MyBookShopApp.config;
//
//import com.example.MyBookShopApp.data.BookRepository;
//import com.example.MyBookShopApp.data.TestEntity;
//import com.example.MyBookShopApp.data.TestEntityDao;
//import com.example.MyBookShopApp.data.TestEntityRepoCrud;
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//
//import javax.persistence.EntityManagerFactory;
//import java.util.logging.Logger;
//
//@Configuration
//public class CommandLineRunnerImpl implements CommandLineRunner {
//
//    TestEntityRepoCrud testEntityRepoCrud;
//    BookRepository bookRepository;
//
//
//    @Autowired
//    public CommandLineRunnerImpl(TestEntityRepoCrud testEntityRepoCrud,BookRepository bookRepository) {
//        this.testEntityRepoCrud = testEntityRepoCrud;
//        this.bookRepository=bookRepository;
//    }
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        for (int i = 0; i < 5; i++) {
//            createTestEntity(new TestEntity());
//        }
//
//        TestEntity readTestEntity = readTestEntityById(3L);
//        if (readTestEntity != null) {
//            Logger.getLogger(CommandLineRunnerImpl.class.getSimpleName()).info("read " + readTestEntity.toString());
//        } else {
//            throw new NullPointerException();
//        }
//
//        TestEntity update = updateTestEntityById(5L);
//        if (readTestEntity != null) {
//            Logger.getLogger(CommandLineRunnerImpl.class.getSimpleName()).info("update " + update.toString());
//        } else {
//            throw new NullPointerException();
//        }
//
//        deleteTestEntityById(4L);
//
//        Logger.getLogger(CommandLineRunnerImpl.class.getSimpleName()).info(bookRepository.findBooksByAuthor_Author("Rochelle Lembcke").toString());
//        Logger.getLogger(CommandLineRunnerImpl.class.getSimpleName()).info(bookRepository.customFindAllBooks().toString());
//    }
//
//    private void deleteTestEntityById(Long id) {
//        testEntityRepoCrud.deleteById(id);
//    }
//
//    private TestEntity updateTestEntityById(Long id) {
//        TestEntity testEntity = testEntityRepoCrud.findById(id).get();
//        testEntity.setData("NEW DATA");
//        testEntityRepoCrud.save(testEntity);
//        return testEntity;
//    }
//
//    private TestEntity readTestEntityById(Long id) {
//        return testEntityRepoCrud.findById(id).get();
//    }
//
//    private void createTestEntity(TestEntity testEntity) {
//        testEntityRepoCrud.save(testEntity);
//    }
//}
