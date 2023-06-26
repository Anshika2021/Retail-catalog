//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import com.retailapp.catalog.POJO.Category;
//
//@DataJpaTest
//public class CategoryDaoTest {
//
//    @Autowired
//    private CategoryDao categoryDao;
//
//    @Test
//    public void testSaveCategory() {
//    	
//        Category category = new Category();
//        category.setTitle("Electronics");
////        category.setDescription("Electronic products");
//        categoryDao.save(category);
//        
//
//        assertThat(category.getTitle()).isNotNull();
//              assertThat(categoryDao.findById(category.getTitle())).isPresent();
//    }
//
//}
