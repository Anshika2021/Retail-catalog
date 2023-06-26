//package com.retailapp.catalog.Services;
//    import static org.junit.jupiter.api.Assertions.assertEquals;
//	import static org.junit.jupiter.api.Assertions.assertThrows;
//	import static org.mockito.ArgumentMatchers.any;
//	import static org.mockito.Mockito.when;
//
//	import java.util.Arrays;
//	import java.util.List;
//	import java.util.Optional;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//	import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//	import org.mockito.Mock;
//	import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
//import org.springframework.http.ResponseEntity;
//
//import com.retailapp.catalog.Dao.CategoryDao;
//import com.retailapp.catalog.POJO.Category;
//
//	@ExtendWith(MockitoExtension.class)
//	@TestInstance(TestInstance.Lifecycle.PER_METHOD)
//
//	public class CategoryServiceTest {
//		
//		
//		private static Category category;
//
//	    private CategoryServiceImpl categoryServiceImpl;
//
//	    @Mock
//	    private CategoryDao categoryDao;
////
////    @InjectMocks
////	    private CategoryServiceImpl categoryServiceImpl;
//
//	    @BeforeEach
//	   public void setUp() {
//	        MockitoAnnotations.initMocks(this);
//	        categoryServiceImpl = new CategoryServiceImpl(categoryDao);
//	    }
//	    
//	    @BeforeAll
//	    public static void init() {
//	    	
//	    	category = new Category(1L, "Dairy","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRH1iiB1Y7y-sEL_o1VNahJ8B6-Gt00-IBoBA&usqp=CAU");
//
//	    }
//
//	    @Test
//	    void getAllCategory() {
//        Category category1 = new Category( 1L, "Category 1","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRH1iiB1Y7y-sEL_o1VNahJ8B6-Gt00-IBoBA&usqp=CAU");
//        Category category2 = new Category( 2L, "Category 2","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKG-x72IkrMxIo4UZwIqkvU6AlntK5IlBghQ&usqp=CAU");
//
//        List<Category> categories = Arrays.asList(category1, category2);
////	        Optional<Category> categories = Optional.of(category);
//
//
//	        when(categoryDao.findAll()).thenReturn(categories);
//	        
//	        Category result = categoryServiceImpl.getAllCategory();
//
//	        ResponseEntity<List<Category>> result = categoryServiceImpl.getAllCategory();
//
//	        assertEquals(categories, result);
//	    }
//
////	    @Test
////	    void getCateogory() {
//////	        Category category = new Category(1L, "Category");
////	    	Category category = new Category((int) 1L);
////	    	
////
////	        when(categoryDao.findById((int) 1L)).thenReturn(Optional.of(category));
////
////	        Category result = categoryServiceImpl.getCateogory((int) 1L);
////
////	        assertEquals(category, result);
////	    }
////
////	    @Test
////	    void getCategoryProducts() {
////	        when(categoryDao.getCategoryProducts((int) 1L)).thenReturn(Optional.empty());
////
////	        assertThrows(NotFoundException.class, () -> categoryServiceImpl.getCategoryProducts((int) 1L));
////	    }
////
//////	    @Test
//////	    void testCreateCategory() {
//////	        Category category = new Category(1L, "Category");
//////
//////	        when(categoryDao.save(any())).thenReturn(category);
//////
//////	        Category result = categoryServiceImpl.createCategory(category);
//////
//////	        assertEquals(category, result);
//////	    }
//////
//////	    @Test
//////	    void testUpdateCategory() {
//////	        Category category = new Category(1L, "Category");
//////
//////	        when(categoryRepository.save(any())).thenReturn(category);
//////	        when(categoryRepository.findById(1L)).thenReturn(Optional.of(category));
//////
//////	        Category result = categoryService.updateCategory(1L, category);
//////
//////	        assertEquals(category, result);
//////	    }
//////
//////	    @Test
//////	    void testUpdateCategoryNotFound() {
//////	        Category category = new Category(1L, "Category");
//////
//////	        when(categoryRepository.findById(1L)).thenReturn(Optional.empty());
//////
//////	        assertThrows(NotFoundException.class, () -> categoryService.updateCategory(1L, category));
//////	    }
//////
//////	    @Test
//////	    void testDeleteCategory() {
//////	        Category category = new Category(1L, "Category");
//////
//////	        when(categoryDao.findById(1L)).thenReturn(Optional.of(category));
//////
//////	        categoryServiceImpl.deleteCategory(1L);
//////
//////	        // verify that the delete method was called with the correct ID
//////	        verify(categoryDao, times(1)).deleteById(1L);
//////	    }
//////
//////	    @Test
//////	    void testDeleteCategoryNotFound() {
//////	        when(categoryDao.findById(1L)).thenReturn(Optional.empty());
//////
//////	        assertThrows(NotFoundException.class, () -> categoryServiceImpl.deleteCategory(1L));
//////	    }
//
//	}
//
//
//




//package com.retailapp.signupservice.service;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.anyInt;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.Optional;
//
//import org.hamcrest.Matcher;
//import org.junit.Test;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.TestInstance;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import com.retailapp.signupservice.POJO.User;
//import com.retailapp.signupservice.dao.UserDao;
//
//@ExtendWith(MockitoExtension.class)
//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
//
//public class UserServiceImplTest {
//	
//	
//	
//	    
//            private static User user;
//	        private UserServiceImpl userServiceImpl;
//	        @Mock
//	        private UserDao userDao;
//	        
//	        @BeforeEach
//	        public void setup(){
//            MockitoAnnotations.initMocks(this);
//	            userServiceImpl = new UserServiceImpl(userDao);
//	        }
//	        
//	        @BeforeAll
//	        public static void init() {
//
//	            user = new User((int) 1L,"ans","12345678","ans@gmail.com","ans");
//
//	        }
//	        
//	        @Test
//	        void findById() {
//	        	User user = new User();
//	        user.setId((int) 1L);
//	        Optional<User> userOptional = Optional.of(user);
//	        when(userDao.findById(anyInt())).thenReturn(userOptional);
//
//	        User userReturned = userServiceImpl.findById((int) 1L);
//	        assertEquals(userOptional.get(), userReturned);
//               
//         //      assertThat(user, hasSize((int)1L));
//
//               
////	         assertThat(userOptional, is(Optional.of(userReturned)));
//	         verify(userDao, times(1)).findById((int) 1L);
//
//	        }
//
//			
//
//	}
//
//
//	
//
//
//
//
//

//package com.retailapp.catalog.Services;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.anyInt;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import com.retailapp.catalog.POJO.Category;
//
//
//@ExtendWith(MockitoExtension.class)
//public class CategoryServiceImplTest {
//
//    @Mock
//    private CategoryServiceImpl categoryServiceImpl;
//    
//    @Test
//    public void getCategory() {
//        Integer categoryId = 1;
//        Category expectedCategory = new Category();
//        expectedCategory.setCategoryId(1);
//        expectedCategory.setTitle("Dairy");
//        expectedCategory.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRH1iiB1Y7y-sEL_o1VNahJ8B6-Gt00-IBoBA&usqp=CAU");
//
//        
////        expectedCategory.setPassword("john");
//
//        when(categoryServiceImpl.findById(anyInt())).thenReturn(expectedCategory);
//        
//        Category actualCategory = categoryServiceImpl.getCategory(categoryId);
//        
//        assertEquals(expectedCategory, actualCategory, "User should be found by email");
//    }
//}
//

package com.retailapp.catalog.Services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.junit.Assert;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.retailapp.catalog.Dao.CategoryDao;
import com.retailapp.catalog.POJO.Category;
import com.retailapp.catalog.Products.Products;



@RunWith(MockitoJUnitRunner.class)
public class CategoryServiceImplTest {

    @InjectMocks
    private CategoryServiceImpl categoryService;

    @Mock
    private CategoryDao categoryDao;
    
 
    
    @Mock
    private RestTemplate restTemplate;

    @Test
    public void testGetCategory() {
        Integer categoryId = 1;

        Category category = new Category();
        category.setCategoryId(categoryId);
        category.setTitle("Test Category");

        Optional<Category> optionalCategory = Optional.of(category);

        when(categoryDao.findById(categoryId)).thenReturn(optionalCategory);

        ResponseEntity<Optional<Category>> responseEntity = categoryService.getCategory(categoryId);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(optionalCategory, responseEntity.getBody());
    }


   @Test
    public void testGetAllCategory() {
        Category category1 = new Category();
        category1.setCategoryId(1);
        category1.setTitle("Category 1");

        Category category2 = new Category();
        category2.setCategoryId(2);
        category2.setTitle("Category 2");

        List<Category> categories = Arrays.asList(category1, category2);

        when(categoryDao.findAll()).thenReturn(categories);

        ResponseEntity<List<Category>> responseEntity = categoryService.getAllCategory();

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(categories, responseEntity.getBody());
    }
   
   


}