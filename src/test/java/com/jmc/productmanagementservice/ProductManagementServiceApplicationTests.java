package com.jmc.productmanagementservice;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProductManagementServiceApplication.class)
@SpringBootTest
class ProductManagementServiceApplicationTests {

	@Test
	public void testProductManagementServiceApplication() {
		ProductManagementServiceApplication.main(new String[] {});
		assertThat(1).isEqualTo(1);
	}

}
